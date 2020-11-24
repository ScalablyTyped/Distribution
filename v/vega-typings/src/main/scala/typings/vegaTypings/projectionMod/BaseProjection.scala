package typings.vegaTypings.projectionMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProjection extends js.Object {
  
  /**
    * The projection's center, a two-element array of longitude and latitude in degrees.
    *
    * __Default value:__ `[0, 0]`
    */
  var center: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  /**
    * The projection's clipping circle radius to the specified angle in degrees. If `null`, switches to [antimeridian](http://bl.ocks.org/mbostock/3788999) cutting rather than small-circle clipping.
    */
  var clipAngle: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The projection's viewport clip extent to the specified bounds in pixels. The extent bounds are specified as an array `[[x0, y0], [x1, y1]]`, where `x0` is the left-side of the viewport, `y0` is the top, `x1` is the right and `y1` is the bottom. If `null`, no viewport clipping is performed.
    */
  var clipExtent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.native
  
  // TODO: use a union tagged by the projection type to determine which of the following is applicable
  /* The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection */
  var coefficient: js.UndefOr[Double | SignalRef] = js.native
  
  var distance: js.UndefOr[Double | SignalRef] = js.native
  
  /*
    * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
    */
  var extent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.native
  
  /*
    * GeoJSON data to which the projection should attempt to automatically fit the `translate` and `scale` parameters. If object-valued, this parameter should be a GeoJSON Feature or FeatureCollection. If array-valued, each array member may be a GeoJSON Feature, FeatureCollection, or a sub-array of GeoJSON Features.
    */
  var fit: js.UndefOr[Fit | js.Array[Fit] | SignalRef] = js.native
  
  var fraction: js.UndefOr[Double | SignalRef] = js.native
  
  var lobes: js.UndefOr[Double | SignalRef] = js.native
  
  var parallel: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * For conic projections, the [two standard parallels](https://en.wikipedia.org/wiki/Map_projection#Conic) that define the map layout. The default depends on the specific conic projection used.
    */
  var parallels: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  
  /**
    * The default radius (in pixels) to use when drawing GeoJSON `Point` and `MultiPoint` geometries. This parameter sets a constant default value. To modify the point radius in response to data, see the corresponding parameter of the GeoPath and GeoShape transforms.
    *
    * __Default value:__ `4.5`
    */
  var pointRadius: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The threshold for the projection's [adaptive resampling](http://bl.ocks.org/mbostock/3795544) to the specified value in pixels. This value corresponds to the [Douglas–Peucker distance](http://en.wikipedia.org/wiki/Ramer%E2%80%93Douglas%E2%80%93Peucker_algorithm). If precision is not specified, returns the projection's current resampling precision which defaults to `√0.5 ≅ 0.70710…`.
    */
  var precision: js.UndefOr[Double | SignalRef] = js.native
  
  var radius: js.UndefOr[Double | SignalRef] = js.native
  
  var ratio: js.UndefOr[Double | SignalRef] = js.native
  
  /*
    * Sets whether or not the x-dimension is reflected (negated) in the output.
    */
  var reflectX: js.UndefOr[Boolean | SignalRef] = js.native
  
  /*
    * Sets whether or not the y-dimension is reflected (negated) in the output.
    */
  var reflectY: js.UndefOr[Boolean | SignalRef] = js.native
  
  /**
    * The projection's three-axis rotation to the specified angles, which must be a two- or three-element array of numbers [`lambda`, `phi`, `gamma`] specifying the rotation angles in degrees about each spherical axis. (These correspond to yaw, pitch and roll.)
    *
    * __Default value:__ `[0, 0, 0]`
    */
  var rotate: js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef] = js.native
  
  /**
    * The projection’s scale factor. The default scale is projection-specific. The scale factor corresponds linearly to the distance between projected points; however, scale factor values are not equivalent across projections.
    */
  var scale: js.UndefOr[Double | SignalRef] = js.native
  
  /*
    * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
    */
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var spacing: js.UndefOr[Double | SignalRef] = js.native
  
  var tilt: js.UndefOr[Double | SignalRef] = js.native
  
  /*
    * The projection's translation offset as a two-element array `[tx, ty]`, defaults to `[480, 250]`. The translation offset determines the pixel coordinates of the projection's center. The default translation offset places (0°,0°) at the center of a 960×500 area.
    */
  var translate: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  /*
    * The cartographic projection to use. This value is case-insensitive, for example `"albers"` and `"Albers"` indicate the same projection type.
    *
    * __Default value:__ `mercator`
    */
  var `type`: js.UndefOr[ProjectionType | SignalRef] = js.native
}
object BaseProjection {
  
  @scala.inline
  def apply(): BaseProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProjection]
  }
  
  @scala.inline
  implicit class BaseProjectionOps[Self <: BaseProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCenter(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClipAngle(value: Double | SignalRef): Self = this.set("clipAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipAngle: Self = this.set("clipAngle", js.undefined)
    
    @scala.inline
    def setClipExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = this.set("clipExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipExtent: Self = this.set("clipExtent", js.undefined)
    
    @scala.inline
    def setCoefficient(value: Double | SignalRef): Self = this.set("coefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoefficient: Self = this.set("coefficient", js.undefined)
    
    @scala.inline
    def setDistance(value: Double | SignalRef): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setFitVarargs(value: (Fit | GeoJsonFeature)*): Self = this.set("fit", js.Array(value :_*))
    
    @scala.inline
    def setFit(value: Fit | js.Array[Fit] | SignalRef): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setFraction(value: Double | SignalRef): Self = this.set("fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFraction: Self = this.set("fraction", js.undefined)
    
    @scala.inline
    def setLobes(value: Double | SignalRef): Self = this.set("lobes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLobes: Self = this.set("lobes", js.undefined)
    
    @scala.inline
    def setParallel(value: Double | SignalRef): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setParallelsVarargs(value: (Double | SignalRef)*): Self = this.set("parallels", js.Array(value :_*))
    
    @scala.inline
    def setParallels(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("parallels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallels: Self = this.set("parallels", js.undefined)
    
    @scala.inline
    def setPointRadius(value: Double | SignalRef): Self = this.set("pointRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRadius: Self = this.set("pointRadius", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double | SignalRef): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | SignalRef): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRatio(value: Double | SignalRef): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setReflectX(value: Boolean | SignalRef): Self = this.set("reflectX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflectX: Self = this.set("reflectX", js.undefined)
    
    @scala.inline
    def setReflectY(value: Boolean | SignalRef): Self = this.set("reflectY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflectY: Self = this.set("reflectY", js.undefined)
    
    @scala.inline
    def setRotate(value: (Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setScale(value: Double | SignalRef): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double | SignalRef): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setTilt(value: Double | SignalRef): Self = this.set("tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    
    @scala.inline
    def setTranslate(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setType(value: ProjectionType | SignalRef): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

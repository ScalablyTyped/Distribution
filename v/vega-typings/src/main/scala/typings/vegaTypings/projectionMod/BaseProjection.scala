package typings.vegaTypings.projectionMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProjection extends js.Object {
  /**
    * The projection's center, a two-element array of longitude and latitude in degrees.
    *
    * __Default value:__ `[0, 0]`
    */
  var center: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  /**
    * The projection's clipping circle radius to the specified angle in degrees. If `null`, switches to [antimeridian](http://bl.ocks.org/mbostock/3788999) cutting rather than small-circle clipping.
    */
  var clipAngle: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The projection's viewport clip extent to the specified bounds in pixels. The extent bounds are specified as an array `[[x0, y0], [x1, y1]]`, where `x0` is the left-side of the viewport, `y0` is the top, `x1` is the right and `y1` is the bottom. If `null`, no viewport clipping is performed.
    */
  var clipExtent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.undefined
  // TODO: use a union tagged by the projection type to determine which of the following is applicable
  /* The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection */
  var coefficient: js.UndefOr[Double | SignalRef] = js.undefined
  var distance: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
    */
  var extent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.undefined
  /*
    * GeoJSON data to which the projection should attempt to automatically fit the `translate` and `scale` parameters. If object-valued, this parameter should be a GeoJSON Feature or FeatureCollection. If array-valued, each array member may be a GeoJSON Feature, FeatureCollection, or a sub-array of GeoJSON Features.
    */
  var fit: js.UndefOr[Fit | js.Array[Fit] | SignalRef] = js.undefined
  var fraction: js.UndefOr[Double | SignalRef] = js.undefined
  var lobes: js.UndefOr[Double | SignalRef] = js.undefined
  var parallel: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * For conic projections, the [two standard parallels](https://en.wikipedia.org/wiki/Map_projection#Conic) that define the map layout. The default depends on the specific conic projection used.
    */
  var parallels: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  /**
    * The default radius (in pixels) to use when drawing GeoJSON `Point` and `MultiPoint` geometries. This parameter sets a constant default value. To modify the point radius in response to data, see the corresponding parameter of the GeoPath and GeoShape transforms.
    *
    * __Default value:__ `4.5`
    */
  var pointRadius: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The threshold for the projection's [adaptive resampling](http://bl.ocks.org/mbostock/3795544) to the specified value in pixels. This value corresponds to the [Douglas–Peucker distance](http://en.wikipedia.org/wiki/Ramer%E2%80%93Douglas%E2%80%93Peucker_algorithm). If precision is not specified, returns the projection's current resampling precision which defaults to `√0.5 ≅ 0.70710…`.
    */
  var precision: js.UndefOr[Double | SignalRef] = js.undefined
  var radius: js.UndefOr[Double | SignalRef] = js.undefined
  var ratio: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * Sets whether or not the x-dimension is reflected (negated) in the output.
    */
  var reflectX: js.UndefOr[Boolean | SignalRef] = js.undefined
  /*
    * Sets whether or not the y-dimension is reflected (negated) in the output.
    */
  var reflectY: js.UndefOr[Boolean | SignalRef] = js.undefined
  /**
    * The projection's three-axis rotation to the specified angles, which must be a two- or three-element array of numbers [`lambda`, `phi`, `gamma`] specifying the rotation angles in degrees about each spherical axis. (These correspond to yaw, pitch and roll.)
    *
    * __Default value:__ `[0, 0, 0]`
    */
  var rotate: js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef] = js.undefined
  /**
    * The projection’s scale factor. The default scale is projection-specific. The scale factor corresponds linearly to the distance between projected points; however, scale factor values are not equivalent across projections.
    */
  var scale: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
    */
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var spacing: js.UndefOr[Double | SignalRef] = js.undefined
  var tilt: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * The projection's translation offset as a two-element array `[tx, ty]`, defaults to `[480, 250]`. The translation offset determines the pixel coordinates of the projection's center. The default translation offset places (0°,0°) at the center of a 960×500 area.
    */
  var translate: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  /*
    * The cartographic projection to use. This value is case-insensitive, for example `"albers"` and `"Albers"` indicate the same projection type.
    *
    * __Default value:__ `mercator`
    */
  var `type`: js.UndefOr[ProjectionType | SignalRef] = js.undefined
}

object BaseProjection {
  @scala.inline
  def apply(
    center: (Vector2[Double | SignalRef]) | SignalRef = null,
    clipAngle: Double | SignalRef = null,
    clipExtent: (Vector2[Vector2[Double | SignalRef]]) | SignalRef = null,
    coefficient: Double | SignalRef = null,
    distance: Double | SignalRef = null,
    extent: (Vector2[Vector2[Double | SignalRef]]) | SignalRef = null,
    fit: Fit | js.Array[Fit] | SignalRef = null,
    fraction: Double | SignalRef = null,
    lobes: Double | SignalRef = null,
    parallel: Double | SignalRef = null,
    parallels: (js.Array[Double | SignalRef]) | SignalRef = null,
    pointRadius: Double | SignalRef = null,
    precision: Double | SignalRef = null,
    radius: Double | SignalRef = null,
    ratio: Double | SignalRef = null,
    reflectX: Boolean | SignalRef = null,
    reflectY: Boolean | SignalRef = null,
    rotate: (Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef = null,
    scale: Double | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    spacing: Double | SignalRef = null,
    tilt: Double | SignalRef = null,
    translate: (Vector2[Double | SignalRef]) | SignalRef = null,
    `type`: ProjectionType | SignalRef = null
  ): BaseProjection = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (clipAngle != null) __obj.updateDynamic("clipAngle")(clipAngle.asInstanceOf[js.Any])
    if (clipExtent != null) __obj.updateDynamic("clipExtent")(clipExtent.asInstanceOf[js.Any])
    if (coefficient != null) __obj.updateDynamic("coefficient")(coefficient.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (lobes != null) __obj.updateDynamic("lobes")(lobes.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (parallels != null) __obj.updateDynamic("parallels")(parallels.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (reflectX != null) __obj.updateDynamic("reflectX")(reflectX.asInstanceOf[js.Any])
    if (reflectY != null) __obj.updateDynamic("reflectY")(reflectY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProjection]
  }
}


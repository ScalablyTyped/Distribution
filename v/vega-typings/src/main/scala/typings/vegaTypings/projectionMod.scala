package typings.vegaTypings

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  trait BaseProjection extends StObject {
    
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
    // The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection.
    /**
      * The coefficient parameter for the `hammer` projection.
      *
      * __Default value:__ `2`
      */
    var coefficient: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * For the `satellite` projection, the distance from the center of the
      * sphere to the point of view, as a proportion of the sphere’s radius.
      * The recommended maximum clip angle for a given `distance` is
      * acos(1 / distance) converted to degrees. If tilt is also
      * applied, then more conservative clipping may be necessary.
      *
      * __Default value:__ `2.0`
      */
    var distance: js.UndefOr[Double | SignalRef] = js.undefined
    
    /*
      * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
      */
    var extent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.undefined
    
    /*
      * GeoJSON data to which the projection should attempt to automatically fit the `translate` and `scale` parameters. If object-valued, this parameter should be a GeoJSON Feature or FeatureCollection. If array-valued, each array member may be a GeoJSON Feature, FeatureCollection, or a sub-array of GeoJSON Features.
      */
    var fit: js.UndefOr[Fit | js.Array[Fit] | SignalRef] = js.undefined
    
    /**
      * The fraction parameter for the `bottomley` projection.
      *
      * __Default value:__ `0.5`, corresponding to a sin(ψ) where ψ = π/6.
      */
    var fraction: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The number of lobes in projections that support multi-lobe views:
      * `berghaus`, `gingery`, or `healpix`.
      * The default value varies based on the projection type.
      */
    var lobes: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The parallel parameter for projections that support it:
      * `armadillo`, `bonne`, `craig`, `cylindricalEqualArea`,
      * `cylindricalStereographic`, `hammerRetroazimuthal`, `loximuthal`,
      * or `rectangularPolyconic`.
      * The default value varies based on the projection type.
      */
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
    
    /**
      * The radius parameter for the `airy` or `gingery` projection.
      * The default value varies based on the projection type.
      */
    var radius: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The ratio parameter for the `hill`, `hufnagel`, or `wagner` projections.
      * The default value varies based on the projection type.
      */
    var ratio: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Sets whether or not the x-dimension is reflected (negated) in the output.
      */
    var reflectX: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    /**
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
    
    /**
      * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
      */
    var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
    
    /**
      * The spacing parameter for the `lagrange` projection.
      *
      * __Default value:__ `0.5`
      */
    var spacing: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The tilt angle (in degrees) for the `satellite` projection.
      *
      * __Default value:__ `0`.
      */
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
    
    inline def apply(): BaseProjection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProjection]
    }
    
    extension [Self <: BaseProjection](x: Self) {
      
      inline def setCenter(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setClipAngle(value: Double | SignalRef): Self = StObject.set(x, "clipAngle", value.asInstanceOf[js.Any])
      
      inline def setClipAngleUndefined: Self = StObject.set(x, "clipAngle", js.undefined)
      
      inline def setClipExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = StObject.set(x, "clipExtent", value.asInstanceOf[js.Any])
      
      inline def setClipExtentUndefined: Self = StObject.set(x, "clipExtent", js.undefined)
      
      inline def setCoefficient(value: Double | SignalRef): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
      
      inline def setDistance(value: Double | SignalRef): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFit(value: Fit | js.Array[Fit] | SignalRef): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setFitVarargs(value: (Fit | GeoJsonFeature)*): Self = StObject.set(x, "fit", js.Array(value*))
      
      inline def setFraction(value: Double | SignalRef): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setLobes(value: Double | SignalRef): Self = StObject.set(x, "lobes", value.asInstanceOf[js.Any])
      
      inline def setLobesUndefined: Self = StObject.set(x, "lobes", js.undefined)
      
      inline def setParallel(value: Double | SignalRef): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setParallels(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
      
      inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
      
      inline def setParallelsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "parallels", js.Array(value*))
      
      inline def setPointRadius(value: Double | SignalRef): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
      
      inline def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
      
      inline def setPrecision(value: Double | SignalRef): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRadius(value: Double | SignalRef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRatio(value: Double | SignalRef): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setReflectX(value: Boolean | SignalRef): Self = StObject.set(x, "reflectX", value.asInstanceOf[js.Any])
      
      inline def setReflectXUndefined: Self = StObject.set(x, "reflectX", js.undefined)
      
      inline def setReflectY(value: Boolean | SignalRef): Self = StObject.set(x, "reflectY", value.asInstanceOf[js.Any])
      
      inline def setReflectYUndefined: Self = StObject.set(x, "reflectY", js.undefined)
      
      inline def setRotate(value: (Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double | SignalRef): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpacing(value: Double | SignalRef): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTilt(value: Double | SignalRef): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      inline def setTranslate(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: ProjectionType | SignalRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Fit = GeoJsonFeature | GeoJsonFeatureCollection | js.Array[GeoJsonFeature]
  
  type GeoJsonFeature = Any
  
  type GeoJsonFeatureCollection = Any
  
  trait Projection
    extends StObject
       with BaseProjection {
    
    /*
      * The name of the projection.
      */
    var name: String
  }
  object Projection {
    
    inline def apply(name: String): Projection = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Projection]
    }
    
    extension [Self <: Projection](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.albers
    - typings.vegaTypings.vegaTypingsStrings.albersUsa
    - typings.vegaTypings.vegaTypingsStrings.azimuthalEqualArea
    - typings.vegaTypings.vegaTypingsStrings.azimuthalEquidistant
    - typings.vegaTypings.vegaTypingsStrings.conicConformal
    - typings.vegaTypings.vegaTypingsStrings.conicEqualArea
    - typings.vegaTypings.vegaTypingsStrings.conicEquidistant
    - typings.vegaTypings.vegaTypingsStrings.equalEarth
    - typings.vegaTypings.vegaTypingsStrings.equirectangular
    - typings.vegaTypings.vegaTypingsStrings.gnomonic
    - typings.vegaTypings.vegaTypingsStrings.identity
    - typings.vegaTypings.vegaTypingsStrings.mercator
    - typings.vegaTypings.vegaTypingsStrings.naturalEarth1
    - typings.vegaTypings.vegaTypingsStrings.orthographic
    - typings.vegaTypings.vegaTypingsStrings.stereographic
    - typings.vegaTypings.vegaTypingsStrings.transverseMercator
  */
  trait ProjectionType extends StObject
  object ProjectionType {
    
    inline def albers: typings.vegaTypings.vegaTypingsStrings.albers = "albers".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.albers]
    
    inline def albersUsa: typings.vegaTypings.vegaTypingsStrings.albersUsa = "albersUsa".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.albersUsa]
    
    inline def azimuthalEqualArea: typings.vegaTypings.vegaTypingsStrings.azimuthalEqualArea = "azimuthalEqualArea".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.azimuthalEqualArea]
    
    inline def azimuthalEquidistant: typings.vegaTypings.vegaTypingsStrings.azimuthalEquidistant = "azimuthalEquidistant".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.azimuthalEquidistant]
    
    inline def conicConformal: typings.vegaTypings.vegaTypingsStrings.conicConformal = "conicConformal".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.conicConformal]
    
    inline def conicEqualArea: typings.vegaTypings.vegaTypingsStrings.conicEqualArea = "conicEqualArea".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.conicEqualArea]
    
    inline def conicEquidistant: typings.vegaTypings.vegaTypingsStrings.conicEquidistant = "conicEquidistant".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.conicEquidistant]
    
    inline def equalEarth: typings.vegaTypings.vegaTypingsStrings.equalEarth = "equalEarth".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.equalEarth]
    
    inline def equirectangular: typings.vegaTypings.vegaTypingsStrings.equirectangular = "equirectangular".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.equirectangular]
    
    inline def gnomonic: typings.vegaTypings.vegaTypingsStrings.gnomonic = "gnomonic".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gnomonic]
    
    inline def identity: typings.vegaTypings.vegaTypingsStrings.identity = "identity".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.identity]
    
    inline def mercator: typings.vegaTypings.vegaTypingsStrings.mercator = "mercator".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mercator]
    
    inline def naturalEarth1: typings.vegaTypings.vegaTypingsStrings.naturalEarth1 = "naturalEarth1".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.naturalEarth1]
    
    inline def orthographic: typings.vegaTypings.vegaTypingsStrings.orthographic = "orthographic".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orthographic]
    
    inline def stereographic: typings.vegaTypings.vegaTypingsStrings.stereographic = "stereographic".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.stereographic]
    
    inline def transverseMercator: typings.vegaTypings.vegaTypingsStrings.transverseMercator = "transverseMercator".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.transverseMercator]
  }
}

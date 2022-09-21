package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.`type`
import typings.vegaLite.vegaLiteStrings.center
import typings.vegaLite.vegaLiteStrings.clipAngle
import typings.vegaLite.vegaLiteStrings.clipExtent
import typings.vegaLite.vegaLiteStrings.coefficient
import typings.vegaLite.vegaLiteStrings.distance
import typings.vegaLite.vegaLiteStrings.extent
import typings.vegaLite.vegaLiteStrings.fit
import typings.vegaLite.vegaLiteStrings.fraction
import typings.vegaLite.vegaLiteStrings.lobes
import typings.vegaLite.vegaLiteStrings.parallel
import typings.vegaLite.vegaLiteStrings.parallels
import typings.vegaLite.vegaLiteStrings.pointRadius
import typings.vegaLite.vegaLiteStrings.precision
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.ratio
import typings.vegaLite.vegaLiteStrings.reflectX
import typings.vegaLite.vegaLiteStrings.reflectY
import typings.vegaLite.vegaLiteStrings.rotate
import typings.vegaLite.vegaLiteStrings.scale
import typings.vegaLite.vegaLiteStrings.size
import typings.vegaLite.vegaLiteStrings.spacing
import typings.vegaLite.vegaLiteStrings.tilt
import typings.vegaLite.vegaLiteStrings.translate
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.projectionMod.Fit
import typings.vegaTypings.projectionMod.GeoJsonFeature
import typings.vegaTypings.projectionMod.ProjectionType
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  @JSImport("vega-lite/build/src/projection", "PROJECTION_PROPERTIES")
  @js.native
  val PROJECTION_PROPERTIES: js.Array[
    /* keyof vega-lite.vega-lite/build/src/projection.Projection<vega-lite.vega-lite/build/src/expr.ExprRef> */ `type` | scale | translate | extent | size | clipAngle | parallels | fraction | ratio | clipExtent | coefficient | radius | spacing | reflectX | distance | fit | precision | tilt | parallel | pointRadius | rotate | center | reflectY | lobes
  ] = js.native
  
  /* Inlined parent vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<vega.vega.BaseProjection, ES> */
  trait Projection[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var center: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var clipAngle: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var clipExtent: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var coefficient: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var distance: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var extent: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var fit: js.UndefOr[
        (Exclude[
          js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var fraction: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var lobes: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var parallel: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var parallels: js.UndefOr[
        (Exclude[
          js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var pointRadius: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var precision: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var radius: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var ratio: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var reflectX: js.UndefOr[
        (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var reflectY: js.UndefOr[
        (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var rotate: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The projection’s scale (zoom) factor, overriding automatic fitting. The default scale is projection-specific. The scale factor corresponds linearly to the distance between projected points; however, scale factor values are not equivalent across projections.
      */
    var scale: js.UndefOr[Double | ES] = js.undefined
    
    var size: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var spacing: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var tilt: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The projection’s translation offset as a two-element array `[tx, ty]`.
      */
    var translate: js.UndefOr[Vector2[Double] | ES] = js.undefined
    
    /**
      * The cartographic projection to use. This value is case-insensitive, for example `"albers"` and `"Albers"` indicate the same projection type. You can find all valid projection types [in the documentation](https://vega.github.io/vega-lite/docs/projection.html#projection-types).
      *
      * __Default value:__ `equalEarth`
      */
    var `type`: js.UndefOr[ProjectionType | ES] = js.undefined
  }
  object Projection {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): Projection[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection[ES]]
    }
    
    extension [Self <: Projection[?], ES /* <: ExprRef | SignalRef */](x: Self & Projection[ES]) {
      
      inline def setCenter(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setClipAngle(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "clipAngle", value.asInstanceOf[js.Any])
      
      inline def setClipAngleUndefined: Self = StObject.set(x, "clipAngle", js.undefined)
      
      inline def setClipExtent(
        value: (Exclude[
              js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "clipExtent", value.asInstanceOf[js.Any])
      
      inline def setClipExtentUndefined: Self = StObject.set(x, "clipExtent", js.undefined)
      
      inline def setCoefficient(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
      
      inline def setDistance(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setExtent(
        value: (Exclude[
              js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFit(
        value: (Exclude[
              js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setFitVarargs(value: (Fit | GeoJsonFeature)*): Self = StObject.set(x, "fit", js.Array(value*))
      
      inline def setFraction(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setLobes(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "lobes", value.asInstanceOf[js.Any])
      
      inline def setLobesUndefined: Self = StObject.set(x, "lobes", js.undefined)
      
      inline def setParallel(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setParallels(
        value: (Exclude[
              js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
      
      inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
      
      inline def setParallelsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "parallels", js.Array(value*))
      
      inline def setPointRadius(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
      
      inline def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
      
      inline def setPrecision(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRadius(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRatio(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setReflectX(
        value: (Exclude[
              js.UndefOr[Boolean | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "reflectX", value.asInstanceOf[js.Any])
      
      inline def setReflectXUndefined: Self = StObject.set(x, "reflectX", js.undefined)
      
      inline def setReflectY(
        value: (Exclude[
              js.UndefOr[Boolean | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "reflectY", value.asInstanceOf[js.Any])
      
      inline def setReflectYUndefined: Self = StObject.set(x, "reflectY", js.undefined)
      
      inline def setRotate(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double | ES): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpacing(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTilt(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      inline def setTranslate(value: Vector2[Double] | ES): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: ProjectionType | ES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ProjectionConfig = Projection[ExprRef]
}

package typings.vegaTypings.typesSpecConfigMod

import typings.std.Exclude
import typings.vegaTypings.typesSpecEncodeMod.ColorValueRef
import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import typings.vegaTypings.typesSpecProjectionMod.Fit
import typings.vegaTypings.typesSpecProjectionMod.ProjectionType
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.typesSpecUtilMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/projection.BaseProjection> */
trait ProjectionConfig extends StObject {
  
  var center: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  ] = js.undefined
  
  var clipAngle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var clipExtent: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
  ] = js.undefined
  
  var coefficient: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var distance: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var extent: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
  ] = js.undefined
  
  var fit: js.UndefOr[
    (Exclude[
      js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
  ] = js.undefined
  
  var fraction: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var lobes: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var parallel: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var parallels: js.UndefOr[
    (Exclude[
      js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
  ] = js.undefined
  
  var pointRadius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var precision: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var radius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var ratio: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var reflectX: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
  ] = js.undefined
  
  var reflectY: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
  ] = js.undefined
  
  var rotate: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[
      js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
    ])
  ] = js.undefined
  
  var scale: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var size: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  ] = js.undefined
  
  var spacing: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var tilt: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var translate: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  ] = js.undefined
  
  var `type`: js.UndefOr[
    (Exclude[
      js.UndefOr[ProjectionType | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
  ] = js.undefined
}
object ProjectionConfig {
  
  inline def apply(): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionConfig]
  }
  
  extension [Self <: ProjectionConfig](x: Self) {
    
    inline def setCenter(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
    ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClipAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "clipAngle", value.asInstanceOf[js.Any])
    
    inline def setClipAngleUndefined: Self = StObject.set(x, "clipAngle", js.undefined)
    
    inline def setClipExtent(
      value: (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
    ): Self = StObject.set(x, "clipExtent", value.asInstanceOf[js.Any])
    
    inline def setClipExtentUndefined: Self = StObject.set(x, "clipExtent", js.undefined)
    
    inline def setCoefficient(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
    
    inline def setDistance(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setExtent(
      value: (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
    ): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFit(
      value: (Exclude[
          js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
    ): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setFraction(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
    
    inline def setLobes(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "lobes", value.asInstanceOf[js.Any])
    
    inline def setLobesUndefined: Self = StObject.set(x, "lobes", js.undefined)
    
    inline def setParallel(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setParallels(
      value: (Exclude[
          js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
    ): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
    
    inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
    
    inline def setPointRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
    
    inline def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
    
    inline def setPrecision(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRatio(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setReflectX(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
    ): Self = StObject.set(x, "reflectX", value.asInstanceOf[js.Any])
    
    inline def setReflectXUndefined: Self = StObject.set(x, "reflectX", js.undefined)
    
    inline def setReflectY(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
    ): Self = StObject.set(x, "reflectY", value.asInstanceOf[js.Any])
    
    inline def setReflectYUndefined: Self = StObject.set(x, "reflectY", js.undefined)
    
    inline def setRotate(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
        ])
    ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setScale(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSize(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpacing(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setTilt(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setTranslate(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
    ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setType(
      value: (Exclude[
          js.UndefOr[ProjectionType | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

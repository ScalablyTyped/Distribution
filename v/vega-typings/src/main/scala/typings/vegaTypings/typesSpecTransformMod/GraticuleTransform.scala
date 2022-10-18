package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.graticule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraticuleTransform
  extends StObject
     with Transforms {
  
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  
  var extentMajor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  
  var extentMinor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  
  var precision: js.UndefOr[Double | SignalRef] = js.undefined
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var step: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var stepMajor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var stepMinor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var `type`: graticule
}
object GraticuleTransform {
  
  inline def apply(): GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graticule")
    __obj.asInstanceOf[GraticuleTransform]
  }
  
  extension [Self <: GraticuleTransform](x: Self) {
    
    inline def setExtent(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentMajor(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extentMajor", value.asInstanceOf[js.Any])
    
    inline def setExtentMajorUndefined: Self = StObject.set(x, "extentMajor", js.undefined)
    
    inline def setExtentMinor(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extentMinor", value.asInstanceOf[js.Any])
    
    inline def setExtentMinorUndefined: Self = StObject.set(x, "extentMinor", js.undefined)
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setPrecision(value: Double | SignalRef): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStep(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepMajor(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "stepMajor", value.asInstanceOf[js.Any])
    
    inline def setStepMajorUndefined: Self = StObject.set(x, "stepMajor", js.undefined)
    
    inline def setStepMinor(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "stepMinor", value.asInstanceOf[js.Any])
    
    inline def setStepMinorUndefined: Self = StObject.set(x, "stepMinor", js.undefined)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: graticule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

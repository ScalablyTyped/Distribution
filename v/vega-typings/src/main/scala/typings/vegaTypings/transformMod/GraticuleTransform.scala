package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.graticule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraticuleTransform extends _Transforms {
  
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  
  var extentMajor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  
  var extentMinor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  
  var precision: js.UndefOr[Double | SignalRef] = js.native
  
  var signal: js.UndefOr[SignalName] = js.native
  
  var step: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var stepMajor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var stepMinor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var `type`: graticule = js.native
}
object GraticuleTransform {
  
  @scala.inline
  def apply(`type`: graticule): GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleTransform]
  }
  
  @scala.inline
  implicit class GraticuleTransformMutableBuilder[Self <: GraticuleTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtent(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentMajor(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extentMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentMajorUndefined: Self = StObject.set(x, "extentMajor", js.undefined)
    
    @scala.inline
    def setExtentMinor(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extentMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentMinorUndefined: Self = StObject.set(x, "extentMinor", js.undefined)
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double | SignalRef): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setStep(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMajor(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "stepMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMajorUndefined: Self = StObject.set(x, "stepMajor", js.undefined)
    
    @scala.inline
    def setStepMinor(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "stepMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMinorUndefined: Self = StObject.set(x, "stepMinor", js.undefined)
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: graticule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.bin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinTransform
  extends StObject
     with BaseBin
     with _Transforms {
  
  var anchor: js.UndefOr[Double | SignalRef] = js.undefined
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var extent: (Vector2[Double | SignalRef]) | SignalRef
  
  var field: FieldRef
  
  var interval: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var name: js.UndefOr[String | SignalRef] = js.undefined
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var span: js.UndefOr[Double | SignalRef] = js.undefined
  
  var `type`: bin
}
object BinTransform {
  
  @scala.inline
  def apply(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef): BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin")
    __obj.asInstanceOf[BinTransform]
  }
  
  @scala.inline
  implicit class BinTransformMutableBuilder[Self <: BinTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Double | SignalRef): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Boolean | SignalRef): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setName(value: String | SignalRef): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSpan(value: Double | SignalRef): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    @scala.inline
    def setType(value: bin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

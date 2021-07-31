package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/vega.schema.VgValueRef & {  test :string | undefined} */
trait VgValueRefteststringundef extends StObject {
  
  var band: js.UndefOr[Boolean | Double | VgValueRef] = js.undefined
  
  var field: js.UndefOr[String | Datum] = js.undefined
  
  var mult: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double | VgValueRef] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  var signal: js.UndefOr[String] = js.undefined
  
  var test: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[typings.vegaLite.channeldefMod.Value[Null]] = js.undefined
}
object VgValueRefteststringundef {
  
  @scala.inline
  def apply(): VgValueRefteststringundef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgValueRefteststringundef]
  }
  
  @scala.inline
  implicit class VgValueRefteststringundefMutableBuilder[Self <: VgValueRefteststringundef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Boolean | Double | VgValueRef): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setField(value: String | Datum): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMult(value: Double): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultUndefined: Self = StObject.set(x, "mult", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setValue(value: typings.vegaLite.channeldefMod.Value[Null]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.anon.Datum
import typings.vegaLite.buildSrcChanneldefMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgValueRef extends StObject {
  
  var band: js.UndefOr[Boolean | Double | VgValueRef] = js.undefined
  
  var field: js.UndefOr[String | Datum] = js.undefined
  
  var mult: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double | VgValueRef] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  var signal: js.UndefOr[String] = js.undefined
  
  var test: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Value[scala.Nothing]] = js.undefined
}
object VgValueRef {
  
  inline def apply(): VgValueRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgValueRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VgValueRef] (val x: Self) extends AnyVal {
    
    inline def setBand(value: Boolean | Double | VgValueRef): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    inline def setField(value: String | Datum): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMult(value: Double): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
    
    inline def setMultUndefined: Self = StObject.set(x, "mult", js.undefined)
    
    inline def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setValue(value: Value[scala.Nothing]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}

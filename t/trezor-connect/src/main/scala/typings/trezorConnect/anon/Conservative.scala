package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conservative extends StObject {
  
  var conservative: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var txsize: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object Conservative {
  
  inline def apply(): Conservative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conservative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conservative] (val x: Self) extends AnyVal {
    
    inline def setConservative(value: Boolean): Self = StObject.set(x, "conservative", value.asInstanceOf[js.Any])
    
    inline def setConservativeUndefined: Self = StObject.set(x, "conservative", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setTxsize(value: Double): Self = StObject.set(x, "txsize", value.asInstanceOf[js.Any])
    
    inline def setTxsizeUndefined: Self = StObject.set(x, "txsize", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

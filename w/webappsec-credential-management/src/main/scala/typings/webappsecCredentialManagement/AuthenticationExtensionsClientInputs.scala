package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsClientInputs extends StObject {
  
  var appid: js.UndefOr[String] = js.undefined
  
  var authnSel: js.UndefOr[js.Array[js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer]] = js.undefined
  
  var exts: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[Boolean] = js.undefined
  
  var txAuthGeneric: js.UndefOr[txAuthGenericArg] = js.undefined
  
  var txAuthSimple: js.UndefOr[String] = js.undefined
  
  var uvi: js.UndefOr[Boolean] = js.undefined
  
  var uvm: js.UndefOr[Boolean] = js.undefined
}
object AuthenticationExtensionsClientInputs {
  
  inline def apply(): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
  
  extension [Self <: AuthenticationExtensionsClientInputs](x: Self) {
    
    inline def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setAuthnSel(value: js.Array[js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer]): Self = StObject.set(x, "authnSel", value.asInstanceOf[js.Any])
    
    inline def setAuthnSelUndefined: Self = StObject.set(x, "authnSel", js.undefined)
    
    inline def setAuthnSelVarargs(value: (js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer)*): Self = StObject.set(x, "authnSel", js.Array(value*))
    
    inline def setExts(value: Boolean): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
    
    inline def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
    
    inline def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setTxAuthGeneric(value: txAuthGenericArg): Self = StObject.set(x, "txAuthGeneric", value.asInstanceOf[js.Any])
    
    inline def setTxAuthGenericUndefined: Self = StObject.set(x, "txAuthGeneric", js.undefined)
    
    inline def setTxAuthSimple(value: String): Self = StObject.set(x, "txAuthSimple", value.asInstanceOf[js.Any])
    
    inline def setTxAuthSimpleUndefined: Self = StObject.set(x, "txAuthSimple", js.undefined)
    
    inline def setUvi(value: Boolean): Self = StObject.set(x, "uvi", value.asInstanceOf[js.Any])
    
    inline def setUviUndefined: Self = StObject.set(x, "uvi", js.undefined)
    
    inline def setUvm(value: Boolean): Self = StObject.set(x, "uvm", value.asInstanceOf[js.Any])
    
    inline def setUvmUndefined: Self = StObject.set(x, "uvm", js.undefined)
  }
}

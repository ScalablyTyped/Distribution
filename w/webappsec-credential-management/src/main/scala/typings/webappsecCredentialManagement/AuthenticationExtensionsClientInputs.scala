package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationExtensionsClientInputs extends StObject {
  
  var appid: js.UndefOr[String] = js.native
  
  var authnSel: js.UndefOr[js.Array[ArrayBufferView | ArrayBuffer]] = js.native
  
  var exts: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[Boolean] = js.native
  
  var txAuthGeneric: js.UndefOr[txAuthGenericArg] = js.native
  
  var txAuthSimple: js.UndefOr[String] = js.native
  
  var uvi: js.UndefOr[Boolean] = js.native
  
  var uvm: js.UndefOr[Boolean] = js.native
}
object AuthenticationExtensionsClientInputs {
  
  @scala.inline
  def apply(): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
  
  @scala.inline
  implicit class AuthenticationExtensionsClientInputsMutableBuilder[Self <: AuthenticationExtensionsClientInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    @scala.inline
    def setAuthnSel(value: js.Array[ArrayBufferView | ArrayBuffer]): Self = StObject.set(x, "authnSel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthnSelUndefined: Self = StObject.set(x, "authnSel", js.undefined)
    
    @scala.inline
    def setAuthnSelVarargs(value: (ArrayBufferView | ArrayBuffer)*): Self = StObject.set(x, "authnSel", js.Array(value :_*))
    
    @scala.inline
    def setExts(value: Boolean): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
    
    @scala.inline
    def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setTxAuthGeneric(value: txAuthGenericArg): Self = StObject.set(x, "txAuthGeneric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxAuthGenericUndefined: Self = StObject.set(x, "txAuthGeneric", js.undefined)
    
    @scala.inline
    def setTxAuthSimple(value: String): Self = StObject.set(x, "txAuthSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxAuthSimpleUndefined: Self = StObject.set(x, "txAuthSimple", js.undefined)
    
    @scala.inline
    def setUvi(value: Boolean): Self = StObject.set(x, "uvi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUviUndefined: Self = StObject.set(x, "uvi", js.undefined)
    
    @scala.inline
    def setUvm(value: Boolean): Self = StObject.set(x, "uvm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvmUndefined: Self = StObject.set(x, "uvm", js.undefined)
  }
}

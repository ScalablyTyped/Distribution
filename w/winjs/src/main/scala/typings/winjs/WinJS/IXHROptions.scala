package typings.winjs.WinJS

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Functions
//#region Interfaces
@js.native
trait IXHROptions extends StObject {
  
  var customRequestInitializer: js.UndefOr[js.Function1[/* request */ XMLHttpRequest, Unit]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: String = js.native
  
  var user: js.UndefOr[String] = js.native
}
object IXHROptions {
  
  @scala.inline
  def apply(url: String): IXHROptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXHROptions]
  }
  
  @scala.inline
  implicit class IXHROptionsMutableBuilder[Self <: IXHROptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomRequestInitializer(value: /* request */ XMLHttpRequest => Unit): Self = StObject.set(x, "customRequestInitializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomRequestInitializerUndefined: Self = StObject.set(x, "customRequestInitializer", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

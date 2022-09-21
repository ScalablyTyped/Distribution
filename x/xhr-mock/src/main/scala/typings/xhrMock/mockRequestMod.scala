package typings.xhrMock

import typings.xhrMock.mockHeadersMod.MockHeaders
import typings.xhrMock.mockURLMod.MockURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockRequestMod {
  
  @JSImport("xhr-mock/lib/MockRequest", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MockRequest
  
  @js.native
  trait MockRequest extends StObject {
    
    /* private */ var _body: Any = js.native
    
    /* private */ var _headers: Any = js.native
    
    /* private */ var _method: Any = js.native
    
    /* private */ var _url: Any = js.native
    
    def body(): Any = js.native
    def body(body: Any): MockRequest = js.native
    
    def header(name: String): Null | String = js.native
    def header(name: String, value: String): MockRequest = js.native
    
    def headers(): MockHeaders = js.native
    def headers(headers: MockHeaders): MockRequest = js.native
    
    def method(): String = js.native
    def method(method: String): MockRequest = js.native
    
    def url(): MockURL = js.native
    def url(url: String): MockRequest = js.native
  }
}

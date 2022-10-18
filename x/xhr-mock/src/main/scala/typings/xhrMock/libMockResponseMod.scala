package typings.xhrMock

import typings.xhrMock.libMockHeadersMod.MockHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockResponseMod {
  
  @JSImport("xhr-mock/lib/MockResponse", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MockResponse
  
  @js.native
  trait MockResponse extends StObject {
    
    /* private */ var _body: Any = js.native
    
    /* private */ var _headers: Any = js.native
    
    /* private */ var _reason: Any = js.native
    
    /* private */ var _status: Any = js.native
    
    def body(): Any = js.native
    def body(body: Any): MockResponse = js.native
    
    def header(name: String): Null | String = js.native
    def header(name: String, value: String): MockResponse = js.native
    
    def headers(): MockHeaders = js.native
    def headers(headers: MockHeaders): MockResponse = js.native
    
    def reason(): String = js.native
    def reason(reason: String): MockResponse = js.native
    
    def status(): Double = js.native
    def status(status: Double): MockResponse = js.native
    
    def statusText(): Null | String = js.native
    def statusText(reason: String): MockResponse = js.native
  }
}

package typings.webdriver

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import typings.webdriver.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("webdriver/build/request", JSImport.Default)
  @js.native
  class default protected () extends WebDriverRequest {
    def this(method: String, endpoint: String) = this()
    def this(method: String, endpoint: String, body: Record[String, js.Any]) = this()
    def this(method: String, endpoint: String, body: Unit, isHubCommand: Boolean) = this()
    def this(method: String, endpoint: String, body: Record[String, js.Any], isHubCommand: Boolean) = this()
  }
  
  @js.native
  trait WebDriverRequest extends EventEmitter {
    
    var _createOptions: js.Any = js.native
    
    var _request: js.Any = js.native
    
    var body: js.UndefOr[Record[String, js.Any]] = js.native
    
    var defaultOptions: Options = js.native
    
    var endpoint: String = js.native
    
    var isHubCommand: Boolean = js.native
    
    def makeRequest(options: Options): js.Promise[WebDriverResponse] = js.native
    def makeRequest(options: Options, sessionId: String): js.Promise[WebDriverResponse] = js.native
    
    var method: String = js.native
    
    var requiresSessionId: Boolean = js.native
  }
  
  trait WebDriverResponse extends StObject {
    
    var sessionId: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var value: js.Any
  }
  object WebDriverResponse {
    
    @scala.inline
    def apply(value: js.Any): WebDriverResponse = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebDriverResponse]
    }
    
    @scala.inline
    implicit class WebDriverResponseMutableBuilder[Self <: WebDriverResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

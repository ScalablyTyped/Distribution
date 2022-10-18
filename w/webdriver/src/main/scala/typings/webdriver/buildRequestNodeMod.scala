package typings.webdriver

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRequestNodeMod {
  
  @JSImport("webdriver/build/request/node", JSImport.Default)
  @js.native
  open class default protected () extends NodeJSRequest {
    def this(method: String, endpoint: String) = this()
    def this(method: String, endpoint: String, body: Record[String, Any]) = this()
    def this(method: String, endpoint: String, body: Unit, isHubCommand: Boolean) = this()
    def this(method: String, endpoint: String, body: Record[String, Any], isHubCommand: Boolean) = this()
  }
  
  @js.native
  trait NodeJSRequest
    extends typings.webdriver.buildRequestMod.default
}

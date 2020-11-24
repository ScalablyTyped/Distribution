package typings.webPush.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-push", "WebPushError")
@js.native
class WebPushError protected () extends Error {
  def this(message: String, statusCode: Double, headers: Headers, body: String, endpoint: String) = this()
  
  val body: String = js.native
  
  val endpoint: String = js.native
  
  val headers: Headers = js.native
  
  val statusCode: Double = js.native
}

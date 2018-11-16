package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "WebPushError")
@js.native
class WebPushError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String, statusCode: scala.Double, headers: Headers, body: java.lang.String, endpoint: java.lang.String) = this()
  val body: java.lang.String = js.native
  val endpoint: java.lang.String = js.native
  val headers: Headers = js.native
  val message: java.lang.String = js.native
  val statusCode: scala.Double = js.native
}


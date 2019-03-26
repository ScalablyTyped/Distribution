package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Response")
@js.native
class Response () extends Body {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  var headers: Headers = js.native
  var ok: scala.Boolean = js.native
  var status: scala.Double = js.native
  var statusText: java.lang.String = js.native
  var `type`: ResponseType = js.native
  var url: java.lang.String = js.native
  def error(): Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): Response = js.native
}


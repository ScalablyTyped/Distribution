package typings.whatwgDashMimetype.whatwgDashMimetypeMod

import typings.std.Map
import typings.whatwgDashMimetype.Anon_AllowParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIMEType extends js.Object {
  val essence: String = js.native
  val parameters: Map[String, String] = js.native
  var subtype: String = js.native
  var `type`: String = js.native
  def isHTML(): Boolean = js.native
  def isJavaScript(): Boolean = js.native
  def isJavaScript(opts: Anon_AllowParameters): Boolean = js.native
  def isXML(): Boolean = js.native
}


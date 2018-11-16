package typings
package whatwgDashMimetypeLib.whatwgDashMimetypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIMEType extends js.Object {
  val essence: java.lang.String = js.native
  val parameters: stdLib.Map[java.lang.String, java.lang.String] = js.native
  var subtype: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def isHTML(): scala.Boolean = js.native
  def isJavaScript(): scala.Boolean = js.native
  def isJavaScript(opts: whatwgDashMimetypeLib.Anon_AllowParameters): scala.Boolean = js.native
  def isXML(): scala.Boolean = js.native
}


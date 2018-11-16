package typings
package urlsafeDashBase64Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urlsafe-base64", JSImport.Namespace)
@js.native
object urlsafeDashBase64Mod extends js.Object {
  var version: java.lang.String = js.native
  def decode(base64: java.lang.String): nodeLib.Buffer = js.native
  def encode(buffer: nodeLib.Buffer): java.lang.String = js.native
  def validate(base64: java.lang.String): scala.Boolean = js.native
}


package typings
package tokenizrLib.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token[T] extends js.Object {
  var column: js.UndefOr[scala.Double] = js.native
  var line: js.UndefOr[scala.Double] = js.native
  var pos: js.UndefOr[scala.Double] = js.native
  var text: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var value: T = js.native
  def isA(`type`: java.lang.String): scala.Boolean = js.native
  def isA(`type`: java.lang.String, value: js.Any): scala.Boolean = js.native
}


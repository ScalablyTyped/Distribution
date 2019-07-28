package typings.tokenizr.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token[T] extends js.Object {
  var column: js.UndefOr[Double] = js.native
  var line: js.UndefOr[Double] = js.native
  var pos: js.UndefOr[Double] = js.native
  var text: String = js.native
  var `type`: String = js.native
  var value: T = js.native
  def isA(`type`: String): Boolean = js.native
  def isA(`type`: String, value: js.Any): Boolean = js.native
}


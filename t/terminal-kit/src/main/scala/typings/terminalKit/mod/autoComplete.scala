package typings.terminalKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "autoComplete")
@js.native
object autoComplete extends js.Object {
  def apply(array: js.Array[String], startString: String): String = js.native
  def apply(array: js.Array[String], startString: String, returnAlternatives: Boolean): String = js.native
  def apply(array: js.Array[String], startString: String, returnAlternatives: Boolean, prefix: String): String = js.native
  def apply(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: String,
    postfix: String
  ): String = js.native
}


package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indenter extends js.Object {
  var indentAmt: Double
  def decreaseIndent(): Unit
  def getIndent(): String
  def increaseIndent(): Unit
}

object Indenter {
  @scala.inline
  def apply(decreaseIndent: () => Unit, getIndent: () => String, increaseIndent: () => Unit, indentAmt: Double): Indenter = {
    val __obj = js.Dynamic.literal(decreaseIndent = js.Any.fromFunction0(decreaseIndent), getIndent = js.Any.fromFunction0(getIndent), increaseIndent = js.Any.fromFunction0(increaseIndent), indentAmt = indentAmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indenter]
  }
}


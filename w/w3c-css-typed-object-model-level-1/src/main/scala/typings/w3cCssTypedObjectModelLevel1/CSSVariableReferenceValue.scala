package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSVariableReferenceValue")
@js.native
class CSSVariableReferenceValue protected () extends js.Object {
  def this(variable: String) = this()
  def this(variable: String, fallback: CSSUnparsedValue) = this()
  val fallback: js.UndefOr[CSSUnparsedValue] = js.native
  var variable: String = js.native
}


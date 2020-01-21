package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Identifier")
@js.native
class Identifier protected () extends IASTToken {
  def this(_text: String) = this()
  var _text: js.Any = js.native
  var _valueText: js.Any = js.native
  def structuralEquals(ast: Identifier, includingPosition: Boolean): Boolean = js.native
}


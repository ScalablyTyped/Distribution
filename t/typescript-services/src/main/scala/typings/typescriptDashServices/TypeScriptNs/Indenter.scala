package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Indenter")
@js.native
class Indenter () extends js.Object {
  var indentAmt: Double = js.native
  def decreaseIndent(): Unit = js.native
  def getIndent(): String = js.native
  def increaseIndent(): Unit = js.native
}

/* static members */
@JSGlobal("TypeScript.Indenter")
@js.native
object Indenter extends js.Object {
  var indentStep: Double = js.native
  var indentStepString: String = js.native
  var indentStrings: js.Array[String] = js.native
}


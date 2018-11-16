package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Indenter")
@js.native
class Indenter () extends js.Object {
  var indentAmt: scala.Double = js.native
  def decreaseIndent(): scala.Unit = js.native
  def getIndent(): java.lang.String = js.native
  def increaseIndent(): scala.Unit = js.native
}

@JSGlobal("TypeScript.Indenter")
@js.native
object Indenter extends js.Object {
  var indentStep: scala.Double = js.native
  var indentStepString: java.lang.String = js.native
  var indentStrings: js.Array[java.lang.String] = js.native
}


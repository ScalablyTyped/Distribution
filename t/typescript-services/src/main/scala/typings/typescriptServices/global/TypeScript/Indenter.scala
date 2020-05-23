package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Indenter")
@js.native
class Indenter ()
  extends typings.typescriptServices.TypeScript.Indenter {
  /* CompleteClass */
  override var indentAmt: Double = js.native
  /* CompleteClass */
  override def decreaseIndent(): Unit = js.native
  /* CompleteClass */
  override def getIndent(): String = js.native
  /* CompleteClass */
  override def increaseIndent(): Unit = js.native
}

/* static members */
@JSGlobal("TypeScript.Indenter")
@js.native
object Indenter extends js.Object {
  var indentStep: Double = js.native
  var indentStepString: String = js.native
  var indentStrings: js.Array[String] = js.native
}


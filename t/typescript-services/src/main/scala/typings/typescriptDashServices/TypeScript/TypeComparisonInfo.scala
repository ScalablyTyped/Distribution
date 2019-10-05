package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeComparisonInfo")
@js.native
class TypeComparisonInfo () extends js.Object {
  def this(sourceComparisonInfo: TypeComparisonInfo) = this()
  def this(sourceComparisonInfo: TypeComparisonInfo, useSameIndent: Boolean) = this()
  var flags: TypeRelationshipFlags = js.native
  var indent: js.Any = js.native
  var message: String = js.native
  var onlyCaptureFirstError: Boolean = js.native
  var stringConstantVal: AST = js.native
  def addMessage(message: String): Unit = js.native
  /* private */ def indentString(): js.Any = js.native
}


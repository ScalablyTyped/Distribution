package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeComparisonInfo")
@js.native
class TypeComparisonInfo () extends js.Object {
  def this(sourceComparisonInfo: TypeComparisonInfo) = this()
  def this(sourceComparisonInfo: TypeComparisonInfo, useSameIndent: scala.Boolean) = this()
  var flags: TypeRelationshipFlags = js.native
  var indent: js.Any = js.native
  var message: java.lang.String = js.native
  var onlyCaptureFirstError: scala.Boolean = js.native
  var stringConstantVal: AST = js.native
  def addMessage(message: java.lang.String): scala.Unit = js.native
  /* private */ def indentString(): js.Any = js.native
}


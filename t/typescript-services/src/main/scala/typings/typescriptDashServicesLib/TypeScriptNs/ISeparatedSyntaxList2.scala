package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ISeparatedSyntaxList2")
@js.native
class ISeparatedSyntaxList2 protected () extends AST {
  def this(_fileName: java.lang.String, members: js.Array[AST], _separatorCount: scala.Double) = this()
  var _fileName: js.Any = js.native
  var _separatorCount: js.Any = js.native
  var members: js.Any = js.native
  def nonSeparatorAt(index: scala.Double): AST = js.native
  def nonSeparatorCount(): scala.Double = js.native
  def nonSeparatorIndexOf(ast: AST): scala.Double = js.native
  def separatorCount(): scala.Double = js.native
  def structuralEquals(ast: ISeparatedSyntaxList2, includingPosition: scala.Boolean): scala.Boolean = js.native
}


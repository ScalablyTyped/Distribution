package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SourceUnit")
@js.native
class SourceUnit protected () extends AST {
  def this(moduleElements: ISyntaxList2, endOfFileTokenLeadingComments: js.Array[Comment], _fileName: String) = this()
  var _fileName: js.Any = js.native
  var endOfFileTokenLeadingComments: js.Array[Comment] = js.native
  var moduleElements: ISyntaxList2 = js.native
  def structuralEquals(ast: SourceUnit, includingPosition: Boolean): Boolean = js.native
}


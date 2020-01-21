package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.HeritageClause")
@js.native
class HeritageClause protected () extends AST {
  def this(_nodeType: SyntaxKind, typeNames: ISeparatedSyntaxList2) = this()
  var _nodeType: js.Any = js.native
  var typeNames: ISeparatedSyntaxList2 = js.native
  def structuralEquals(ast: HeritageClause, includingPosition: Boolean): Boolean = js.native
}


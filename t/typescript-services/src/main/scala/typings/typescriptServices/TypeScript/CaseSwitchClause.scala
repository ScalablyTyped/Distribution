package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CaseSwitchClause")
@js.native
class CaseSwitchClause protected () extends AST {
  def this(expression: AST, statements: ISyntaxList2) = this()
  var expression: AST = js.native
  var statements: ISyntaxList2 = js.native
  def structuralEquals(ast: CaseSwitchClause, includingPosition: Boolean): Boolean = js.native
}


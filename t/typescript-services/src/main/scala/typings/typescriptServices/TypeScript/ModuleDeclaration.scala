package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ModuleDeclaration")
@js.native
class ModuleDeclaration protected () extends AST {
  def this(
    modifiers: js.Array[PullElementFlags],
    name: AST,
    stringLiteral: StringLiteral,
    moduleElements: ISyntaxList2,
    endingToken: ASTSpan
  ) = this()
  var endingToken: ASTSpan = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var moduleElements: ISyntaxList2 = js.native
  var name: AST = js.native
  var stringLiteral: StringLiteral = js.native
  def structuralEquals(ast: ModuleDeclaration, includingPosition: Boolean): Boolean = js.native
}


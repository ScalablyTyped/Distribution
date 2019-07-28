package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FinallyClauseSyntax")
@js.native
class FinallyClauseSyntax protected () extends SyntaxNode {
  def this(finallyKeyword: ISyntaxToken, block: BlockSyntax, parsedInStrictMode: Boolean) = this()
  var block: BlockSyntax = js.native
  var finallyKeyword: ISyntaxToken = js.native
  def update(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax = js.native
  def withBlock(block: BlockSyntax): FinallyClauseSyntax = js.native
  def withFinallyKeyword(finallyKeyword: ISyntaxToken): FinallyClauseSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.FinallyClauseSyntax")
@js.native
object FinallyClauseSyntax extends js.Object {
  def create1(): FinallyClauseSyntax = js.native
}


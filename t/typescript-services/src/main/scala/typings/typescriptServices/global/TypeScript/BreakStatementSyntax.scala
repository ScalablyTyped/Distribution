package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BreakStatementSyntax")
@js.native
class BreakStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.BreakStatementSyntax {
  def this(
    breakKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.BreakStatementSyntax")
@js.native
object BreakStatementSyntax extends js.Object {
  def create(breakKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
}


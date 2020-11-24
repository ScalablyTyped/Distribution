package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.ThrowStatementSyntax {
  def this(
    throwKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ThrowStatementSyntax")
@js.native
object ThrowStatementSyntax extends js.Object {
  
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
}

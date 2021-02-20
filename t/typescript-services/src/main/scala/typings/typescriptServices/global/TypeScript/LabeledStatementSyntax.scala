package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
class LabeledStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.LabeledStatementSyntax {
  def this(
    identifier: ISyntaxToken,
    colonToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object LabeledStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.LabeledStatementSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken, statement: IStatementSyntax): typings.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
}

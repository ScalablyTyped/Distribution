package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
class SimplePropertyAssignmentSyntax protected ()
  extends typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax {
  def this(
    propertyName: ISyntaxToken,
    colonToken: ISyntaxToken,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object SimplePropertyAssignmentSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.SimplePropertyAssignmentSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken, expression: IExpressionSyntax): typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
}

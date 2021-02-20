package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SimplePropertyAssignmentSyntax")
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
  @JSImport("typescript-services", "SimplePropertyAssignmentSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken, expression: IExpressionSyntax): typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
}

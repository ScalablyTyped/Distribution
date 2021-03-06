package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ParameterSyntax")
@js.native
class ParameterSyntax protected ()
  extends typings.typescriptServices.TypeScript.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object ParameterSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ParameterSyntax.create")
  @js.native
  def create(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ParameterSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterSyntax = js.native
}

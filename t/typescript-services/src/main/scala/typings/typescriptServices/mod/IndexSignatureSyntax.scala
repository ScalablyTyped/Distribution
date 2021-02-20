package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected ()
  extends typings.typescriptServices.TypeScript.IndexSignatureSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object IndexSignatureSyntax {
  
  /* static member */
  @JSImport("typescript-services", "IndexSignatureSyntax.create")
  @js.native
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "IndexSignatureSyntax.create1")
  @js.native
  def create1(parameter: typings.typescriptServices.TypeScript.ParameterSyntax): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
}

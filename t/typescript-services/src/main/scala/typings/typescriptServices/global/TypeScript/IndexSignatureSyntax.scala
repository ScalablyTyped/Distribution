package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.IndexSignatureSyntax")
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
  @JSGlobal("TypeScript.IndexSignatureSyntax.create")
  @js.native
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.IndexSignatureSyntax.create1")
  @js.native
  def create1(parameter: typings.typescriptServices.TypeScript.ParameterSyntax): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
}

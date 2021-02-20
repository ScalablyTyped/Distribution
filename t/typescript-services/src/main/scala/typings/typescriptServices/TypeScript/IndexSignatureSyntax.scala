package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSignatureSyntax extends SyntaxNode {
  
  var closeBracketToken: ISyntaxToken = js.native
  
  var openBracketToken: ISyntaxToken = js.native
  
  var parameter: ParameterSyntax = js.native
  
  var typeAnnotation: TypeAnnotationSyntax = js.native
  
  def update(
    openBracketToken: ISyntaxToken,
    parameter: ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax
  ): IndexSignatureSyntax = js.native
  
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): IndexSignatureSyntax = js.native
  
  def withOpenBracketToken(openBracketToken: ISyntaxToken): IndexSignatureSyntax = js.native
  
  def withParameter(parameter: ParameterSyntax): IndexSignatureSyntax = js.native
  
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): IndexSignatureSyntax = js.native
}

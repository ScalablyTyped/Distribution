package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySignatureSyntax
  extends StObject
     with SyntaxNode {
  
  var propertyName: ISyntaxToken = js.native
  
  var questionToken: ISyntaxToken = js.native
  
  var typeAnnotation: TypeAnnotationSyntax = js.native
  
  def update(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
  
  def withPropertyName(propertyName: ISyntaxToken): PropertySignatureSyntax = js.native
  
  def withQuestionToken(questionToken: ISyntaxToken): PropertySignatureSyntax = js.native
  
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
}

package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallSignatureSyntax
  extends StObject
     with SyntaxNode {
  
  var parameterList: ParameterListSyntax = js.native
  
  var typeAnnotation: TypeAnnotationSyntax = js.native
  
  var typeParameterList: TypeParameterListSyntax = js.native
  
  def update(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax
  ): CallSignatureSyntax = js.native
  
  def withParameterList(parameterList: ParameterListSyntax): CallSignatureSyntax = js.native
  
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): CallSignatureSyntax = js.native
  
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): CallSignatureSyntax = js.native
}

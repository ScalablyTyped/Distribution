package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallSignatureSyntax extends SyntaxNode {
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


package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CallSignatureSyntax")
@js.native
class CallSignatureSyntax protected () extends SyntaxNode {
  def this(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
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

/* static members */
@JSGlobal("TypeScript.CallSignatureSyntax")
@js.native
object CallSignatureSyntax extends js.Object {
  def create(parameterList: ParameterListSyntax): CallSignatureSyntax = js.native
  def create1(): CallSignatureSyntax = js.native
}


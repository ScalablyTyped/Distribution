package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScript.ISyntaxElement because Already inherited
- typings.typescriptDashServices.TypeScript.ITypeMemberSyntax because Already inherited */ @JSGlobal("TypeScript.CallSignatureSyntax")
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


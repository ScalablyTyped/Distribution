package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    block: BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var block: BlockSyntax = js.native
  var getKeyword: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var parameterList: ParameterListSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def isMemberDeclaration(): Boolean = js.native
  def isPropertyAssignment(): Boolean = js.native
  def update(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    block: BlockSyntax
  ): GetAccessorSyntax = js.native
  def withBlock(block: BlockSyntax): GetAccessorSyntax = js.native
  def withGetKeyword(getKeyword: ISyntaxToken): GetAccessorSyntax = js.native
  def withModifier(modifier: ISyntaxToken): GetAccessorSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): GetAccessorSyntax = js.native
  def withParameterList(parameterList: ParameterListSyntax): GetAccessorSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): GetAccessorSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): GetAccessorSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.GetAccessorSyntax")
@js.native
object GetAccessorSyntax extends js.Object {
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): GetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): GetAccessorSyntax = js.native
}


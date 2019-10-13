package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var block: BlockSyntax = js.native
  var modifiers: ISyntaxList = js.native
  var parameterList: ParameterListSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  var setKeyword: ISyntaxToken = js.native
  def isMemberDeclaration(): Boolean = js.native
  def isPropertyAssignment(): Boolean = js.native
  def update(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): SetAccessorSyntax = js.native
  def withBlock(block: BlockSyntax): SetAccessorSyntax = js.native
  def withModifier(modifier: ISyntaxToken): SetAccessorSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): SetAccessorSyntax = js.native
  def withParameterList(parameterList: ParameterListSyntax): SetAccessorSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): SetAccessorSyntax = js.native
  def withSetKeyword(setKeyword: ISyntaxToken): SetAccessorSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.SetAccessorSyntax")
@js.native
object SetAccessorSyntax extends js.Object {
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): SetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): SetAccessorSyntax = js.native
}


package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IPropertyAssignmentSyntax because Already inherited- typescriptDashServicesLib.TypeScriptNs.IMemberDeclarationSyntax because Already inherited */ @JSGlobal("TypeScript.GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, getKeyword: ISyntaxToken, propertyName: ISyntaxToken, parameterList: ParameterListSyntax, typeAnnotation: TypeAnnotationSyntax, block: BlockSyntax, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var getKeyword: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var parameterList: ParameterListSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def isMemberDeclaration(): scala.Boolean = js.native
  def isPropertyAssignment(): scala.Boolean = js.native
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
    getKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.GetAccessorSyntax = js.native
  def create1(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.GetAccessorSyntax = js.native
}


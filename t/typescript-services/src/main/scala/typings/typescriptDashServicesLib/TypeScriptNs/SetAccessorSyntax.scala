package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IPropertyAssignmentSyntax because Already inherited- typescriptDashServicesLib.TypeScriptNs.IMemberDeclarationSyntax because Already inherited */ @JSGlobal("TypeScript.SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, setKeyword: ISyntaxToken, propertyName: ISyntaxToken, parameterList: ParameterListSyntax, block: BlockSyntax, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var modifiers: ISyntaxList = js.native
  var parameterList: ParameterListSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  var setKeyword: ISyntaxToken = js.native
  def isMemberDeclaration(): scala.Boolean = js.native
  def isPropertyAssignment(): scala.Boolean = js.native
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
    setKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SetAccessorSyntax = js.native
  def create1(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.SetAccessorSyntax = js.native
}


package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.ITypeSyntax because Already inherited */ @JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected () extends SyntaxNode {
  def this(typeParameterList: TypeParameterListSyntax, parameterList: ParameterListSyntax, equalsGreaterThanToken: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: scala.Boolean) = this()
  var equalsGreaterThanToken: ISyntaxToken = js.native
  var parameterList: ParameterListSyntax = js.native
  var `type`: ITypeSyntax = js.native
  var typeParameterList: TypeParameterListSyntax = js.native
  def isType(): scala.Boolean = js.native
  def update(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): FunctionTypeSyntax = js.native
  def withParameterList(parameterList: ParameterListSyntax): FunctionTypeSyntax = js.native
  def withType(`type`: ITypeSyntax): FunctionTypeSyntax = js.native
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): FunctionTypeSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  def create(
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionTypeSyntax = js.native
  def create1(`type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax): typescriptDashServicesLib.TypeScriptNs.FunctionTypeSyntax = js.native
}


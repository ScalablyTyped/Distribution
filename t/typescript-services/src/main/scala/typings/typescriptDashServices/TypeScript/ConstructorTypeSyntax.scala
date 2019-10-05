package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScript.ISyntaxElement because Already inherited
- typings.typescriptDashServices.TypeScript.ITypeSyntax because Already inherited */ @JSGlobal("TypeScript.ConstructorTypeSyntax")
@js.native
class ConstructorTypeSyntax protected () extends SyntaxNode {
  def this(
    newKeyword: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var equalsGreaterThanToken: ISyntaxToken = js.native
  var newKeyword: ISyntaxToken = js.native
  var parameterList: ParameterListSyntax = js.native
  var `type`: ITypeSyntax = js.native
  var typeParameterList: TypeParameterListSyntax = js.native
  def isType(): Boolean = js.native
  def update(
    newKeyword: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): ConstructorTypeSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): ConstructorTypeSyntax = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ConstructorTypeSyntax = js.native
  def withParameterList(parameterList: ParameterListSyntax): ConstructorTypeSyntax = js.native
  def withType(`type`: ITypeSyntax): ConstructorTypeSyntax = js.native
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): ConstructorTypeSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ConstructorTypeSyntax")
@js.native
object ConstructorTypeSyntax extends js.Object {
  def create(
    newKeyword: ISyntaxToken,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): ConstructorTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): ConstructorTypeSyntax = js.native
}


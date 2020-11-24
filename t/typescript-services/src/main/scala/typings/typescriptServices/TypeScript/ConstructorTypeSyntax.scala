package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorTypeSyntax extends SyntaxNode {
  
  var equalsGreaterThanToken: ISyntaxToken = js.native
  
  def isType(): Boolean = js.native
  
  var newKeyword: ISyntaxToken = js.native
  
  var parameterList: ParameterListSyntax = js.native
  
  var `type`: ITypeSyntax = js.native
  
  var typeParameterList: TypeParameterListSyntax = js.native
  
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

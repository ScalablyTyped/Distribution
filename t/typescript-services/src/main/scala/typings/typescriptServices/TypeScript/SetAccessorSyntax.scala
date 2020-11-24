package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAccessorSyntax extends SyntaxNode {
  
  var block: BlockSyntax = js.native
  
  def isMemberDeclaration(): Boolean = js.native
  
  def isPropertyAssignment(): Boolean = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var parameterList: ParameterListSyntax = js.native
  
  var propertyName: ISyntaxToken = js.native
  
  var setKeyword: ISyntaxToken = js.native
  
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

package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterListSyntax extends SyntaxNode {
  
  var closeParenToken: ISyntaxToken = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var parameters: ISeparatedSyntaxList = js.native
  
  def update(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): ParameterListSyntax = js.native
  
  def withParameter(parameter: ParameterSyntax): ParameterListSyntax = js.native
  
  def withParameters(parameters: ISeparatedSyntaxList): ParameterListSyntax = js.native
}

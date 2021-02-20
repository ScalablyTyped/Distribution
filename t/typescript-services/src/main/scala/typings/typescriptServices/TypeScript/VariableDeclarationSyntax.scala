package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarationSyntax extends SyntaxNode {
  
  def update(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
  
  var varKeyword: ISyntaxToken = js.native
  
  var variableDeclarators: ISeparatedSyntaxList = js.native
  
  def withVarKeyword(varKeyword: ISyntaxToken): VariableDeclarationSyntax = js.native
  
  def withVariableDeclarator(variableDeclarator: VariableDeclaratorSyntax): VariableDeclarationSyntax = js.native
  
  def withVariableDeclarators(variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
}

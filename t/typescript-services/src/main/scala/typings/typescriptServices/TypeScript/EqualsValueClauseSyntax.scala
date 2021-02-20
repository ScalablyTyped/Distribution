package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqualsValueClauseSyntax extends SyntaxNode {
  
  var equalsToken: ISyntaxToken = js.native
  
  def update(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
  
  var value: IExpressionSyntax = js.native
  
  def withEqualsToken(equalsToken: ISyntaxToken): EqualsValueClauseSyntax = js.native
  
  def withValue(value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
}

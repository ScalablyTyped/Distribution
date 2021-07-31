package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTypeSyntax
  extends StObject
     with SyntaxNode {
  
  var closeBracketToken: ISyntaxToken = js.native
  
  def isType(): Boolean = js.native
  
  var openBracketToken: ISyntaxToken = js.native
  
  var `type`: ITypeSyntax = js.native
  
  def update(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  
  def withType(`type`: ITypeSyntax): ArrayTypeSyntax = js.native
}

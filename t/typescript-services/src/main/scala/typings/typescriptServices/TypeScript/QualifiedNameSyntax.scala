package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualifiedNameSyntax extends SyntaxNode {
  
  var dotToken: ISyntaxToken = js.native
  
  def isName(): Boolean = js.native
  
  def isType(): Boolean = js.native
  
  var left: INameSyntax = js.native
  
  var right: ISyntaxToken = js.native
  
  def update(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax = js.native
  
  def withDotToken(dotToken: ISyntaxToken): QualifiedNameSyntax = js.native
  
  def withLeft(left: INameSyntax): QualifiedNameSyntax = js.native
  
  def withRight(right: ISyntaxToken): QualifiedNameSyntax = js.native
}

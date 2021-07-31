package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterListSyntax
  extends StObject
     with SyntaxNode {
  
  var greaterThanToken: ISyntaxToken = js.native
  
  var lessThanToken: ISyntaxToken = js.native
  
  var typeParameters: ISeparatedSyntaxList = js.native
  
  def update(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  
  def withLessThanToken(lessThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  
  def withTypeParameter(typeParameter: TypeParameterSyntax): TypeParameterListSyntax = js.native
  
  def withTypeParameters(typeParameters: ISeparatedSyntaxList): TypeParameterListSyntax = js.native
}

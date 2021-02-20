package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTypeSyntax extends SyntaxNode {
  
  def isType(): Boolean = js.native
  
  var name: INameSyntax = js.native
  
  var typeArgumentList: TypeArgumentListSyntax = js.native
  
  def update(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
  
  def withName(name: INameSyntax): GenericTypeSyntax = js.native
  
  def withTypeArgumentList(typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
}

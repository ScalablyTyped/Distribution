package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeQuerySyntax extends SyntaxNode {
  
  def isType(): Boolean = js.native
  
  var name: INameSyntax = js.native
  
  var typeOfKeyword: ISyntaxToken = js.native
  
  def update(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
  
  def withName(name: INameSyntax): TypeQuerySyntax = js.native
  
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeQuerySyntax = js.native
}

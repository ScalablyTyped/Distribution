package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstraintSyntax extends SyntaxNode {
  
  var extendsKeyword: ISyntaxToken = js.native
  
  var `type`: ITypeSyntax = js.native
  
  def update(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax = js.native
  
  def withExtendsKeyword(extendsKeyword: ISyntaxToken): ConstraintSyntax = js.native
  
  def withType(`type`: ITypeSyntax): ConstraintSyntax = js.native
}

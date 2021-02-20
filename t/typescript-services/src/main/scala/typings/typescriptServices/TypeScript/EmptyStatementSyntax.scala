package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
}

package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabeledStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  var colonToken: ISyntaxToken = js.native
  
  var identifier: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var statement: IStatementSyntax = js.native
  
  def update(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
  
  def withColonToken(colonToken: ISyntaxToken): LabeledStatementSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): LabeledStatementSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): LabeledStatementSyntax = js.native
}

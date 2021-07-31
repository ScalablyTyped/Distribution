package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultSwitchClauseSyntax
  extends StObject
     with SyntaxNode
     with ISwitchClauseSyntax {
  
  var colonToken: ISyntaxToken = js.native
  
  var defaultKeyword: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isSwitchClause(): Boolean = js.native
  
  def update(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
  
  def withColonToken(colonToken: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  
  def withDefaultKeyword(defaultKeyword: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): DefaultSwitchClauseSyntax = js.native
  
  def withStatements(statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
}

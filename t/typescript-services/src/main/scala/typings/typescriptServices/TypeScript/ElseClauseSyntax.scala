package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElseClauseSyntax extends SyntaxNode {
  
  var elseKeyword: ISyntaxToken = js.native
  
  var statement: IStatementSyntax = js.native
  
  def update(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax = js.native
  
  def withElseKeyword(elseKeyword: ISyntaxToken): ElseClauseSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): ElseClauseSyntax = js.native
}

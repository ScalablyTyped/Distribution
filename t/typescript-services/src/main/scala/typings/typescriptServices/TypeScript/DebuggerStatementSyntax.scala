package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  var debuggerKeyword: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
  
  def withDebuggerKeyword(debuggerKeyword: ISyntaxToken): DebuggerStatementSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
}

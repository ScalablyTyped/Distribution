package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedToken extends PositionedNodeOrToken {
  
  def nextToken(): PositionedToken = js.native
  def nextToken(includeSkippedTokens: Boolean): PositionedToken = js.native
  
  def previousToken(): PositionedToken = js.native
  def previousToken(includeSkippedTokens: Boolean): PositionedToken = js.native
  
  def token(): ISyntaxToken = js.native
}

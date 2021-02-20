package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.BraceMatcher")
@js.native
class BraceMatcher ()
  extends typings.typescriptServices.TypeScript.Services.BraceMatcher
object BraceMatcher {
  
  /* static member */
  @JSGlobal("TypeScript.Services.BraceMatcher.getMatchSpans")
  @js.native
  def getMatchSpans(syntaxTree: SyntaxTree, position: Double): js.Array[TextSpan] = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.BraceMatcher.getMatchingCloseBrace")
  @js.native
  def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.BraceMatcher.getMatchingCloseBraceTokenKind")
  @js.native
  def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.BraceMatcher.getMatchingOpenBrace")
  @js.native
  def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.BraceMatcher.getMatchingOpenBraceTokenKind")
  @js.native
  def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = js.native
}

package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.BraceMatcher")
@js.native
class BraceMatcher ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.BraceMatcher
object BraceMatcher {
  
  @JSImport("typescript-services", "Services.BraceMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getMatchSpans(syntaxTree: SyntaxTree, position: Double): js.Array[TextSpan] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchSpans")(syntaxTree.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextSpan]]
  
  /* static member */
  @scala.inline
  def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingCloseBrace")(currentToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingCloseBraceTokenKind")(positionedElement.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOpenBrace")(currentToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOpenBraceTokenKind")(positionedElement.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}

package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.SyntaxTree
import typings.typescriptDashServices.TypeScriptNs.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.BraceMatcher")
@js.native
class BraceMatcher () extends js.Object

/* static members */
@JSGlobal("TypeScript.Services.BraceMatcher")
@js.native
object BraceMatcher extends js.Object {
  def getMatchSpans(syntaxTree: SyntaxTree, position: Double): js.Array[TextSpan] = js.native
  /* private */ def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = js.native
  /* private */ def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = js.native
}


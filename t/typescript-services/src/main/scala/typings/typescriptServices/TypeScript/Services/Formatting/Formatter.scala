package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends MultipleTokenIndenter {
  var formattingContext: js.Any = js.native
  var formattingRequestKind: js.Any = js.native
  var previousTokenParent: js.Any = js.native
  var previousTokenSpan: js.Any = js.native
  var rulesProvider: js.Any = js.native
  var scriptHasErrors: js.Any = js.native
  /* private */ def RecordRuleEdits(rule: js.Any, t1: js.Any, t2: js.Any): js.Any = js.native
  /* private */ def findCommonParents(parent1: js.Any, parent2: js.Any): js.Any = js.native
  /* private */ def formatPair(t1: js.Any, t1Parent: js.Any, t2: js.Any, t2Parent: js.Any): js.Any = js.native
  /* private */ def getLineNumber(span: js.Any): js.Any = js.native
  /* private */ def processToken(token: js.Any): js.Any = js.native
  /* private */ def processTrivia(triviaList: js.Any, fullStart: js.Any): js.Any = js.native
  /* private */ def trimWhitespace(line: js.Any): js.Any = js.native
  /* private */ def trimWhitespace(line: js.Any, token: js.Any): js.Any = js.native
  /* private */ def trimWhitespaceInLineRange(startLine: js.Any, endLine: js.Any): js.Any = js.native
  /* private */ def trimWhitespaceInLineRange(startLine: js.Any, endLine: js.Any, token: js.Any): js.Any = js.native
}


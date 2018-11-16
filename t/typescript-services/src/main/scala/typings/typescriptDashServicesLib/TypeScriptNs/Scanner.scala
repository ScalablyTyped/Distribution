package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Scanner")
@js.native
class Scanner protected () extends ISlidingWindowSource {
  def this(fileName: java.lang.String, text: ISimpleText, languageVersion: LanguageVersion) = this()
  def this(fileName: java.lang.String, text: ISimpleText, languageVersion: LanguageVersion, window: js.Array[scala.Double]) = this()
  var _languageVersion: js.Any = js.native
  var fileName: js.Any = js.native
  var slidingWindow: js.Any = js.native
  var text: js.Any = js.native
  def absoluteIndex(): scala.Double = js.native
  /* private */ def advanceAndSetTokenKind(kind: js.Any): js.Any = js.native
  /* private */ def createIllegalEscapeDiagnostic(start: js.Any, end: js.Any): js.Any = js.native
  /* private */ def createToken(
    fullStart: js.Any,
    leadingTriviaInfo: js.Any,
    start: js.Any,
    kind: js.Any,
    end: js.Any,
    fullEnd: js.Any,
    trailingTriviaInfo: js.Any,
    isVariableWidthKeyword: js.Any
  ): js.Any = js.native
  /* private */ def currentCharCode(): js.Any = js.native
  /* CompleteClass */
  override def fetchMoreItems(
    argument: js.Any,
    sourceIndex: scala.Double,
    window: js.Array[_],
    destinationIndex: scala.Double,
    spaceAvailable: scala.Double
  ): scala.Double = js.native
  /* private */ def getErrorMessageText(text: js.Any): js.Any = js.native
  /* private */ def isDotPrefixedNumericLiteral(): js.Any = js.native
  /* private */ def isHexNumericLiteral(): js.Any = js.native
  /* private */ def isIdentifierPart(interpretedChar: js.Any): js.Any = js.native
  /* private */ def isIdentifierStart(interpretedChar: js.Any): js.Any = js.native
  /* private */ def isNewLineCharacter(ch: js.Any): js.Any = js.native
  /* private */ def isOctalNumericLiteral(): js.Any = js.native
  /* private */ def isUnicodeEscape(character: js.Any): js.Any = js.native
  def languageVersion(): LanguageVersion = js.native
  /* private */ def peekCharOrUnicodeEscape(): js.Any = js.native
  /* private */ def peekUnicodeOrHexEscape(): js.Any = js.native
  def scan(diagnostics: js.Array[Diagnostic], allowRegularExpression: scala.Boolean): ISyntaxToken = js.native
  /* private */ def scanAmpersandToken(): js.Any = js.native
  /* private */ def scanAsteriskToken(): js.Any = js.native
  /* private */ def scanBarToken(): js.Any = js.native
  /* private */ def scanCaretToken(): js.Any = js.native
  /* private */ def scanCharOrUnicodeEscape(errors: js.Any): js.Any = js.native
  /* private */ def scanDecimalDigits(): js.Any = js.native
  /* private */ def scanDecimalNumericLiteral(): js.Any = js.native
  /* private */ def scanDefaultCharacter(character: js.Any, diagnostics: js.Any): js.Any = js.native
  /* private */ def scanDotToken(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanEqualsToken(): js.Any = js.native
  /* private */ def scanExclamationToken(): js.Any = js.native
  /* private */ def scanHexNumericLiteral(): js.Any = js.native
  /* private */ def scanLessThanToken(): js.Any = js.native
  /* private */ def scanLineTerminatorSequenceLength(ch: js.Any): js.Any = js.native
  /* private */ def scanLineTerminatorSequenceTrivia(ch: js.Any): js.Any = js.native
  /* private */ def scanMinusToken(): js.Any = js.native
  /* private */ def scanMultiLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* private */ def scanMultiLineCommentTriviaLength(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanNumericLiteral(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanOctalNumericLiteral(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanPercentToken(): js.Any = js.native
  /* private */ def scanPlusToken(): js.Any = js.native
  /* private */ def scanSingleLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* private */ def scanSingleLineCommentTriviaLength(): js.Any = js.native
  /* private */ def scanSlashToken(allowRegularExpression: js.Any): js.Any = js.native
  /* private */ def scanStringLiteral(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanSyntaxToken(diagnostics: js.Any, allowRegularExpression: js.Any): js.Any = js.native
  /* private */ def scanTrivia(underlyingText: js.Any, underlyingTextStart: js.Any, isTrailing: js.Any): js.Any = js.native
  /* private */ def scanTriviaInfo(diagnostics: js.Any, isTrailing: js.Any): js.Any = js.native
  /* private */ def scanUnicodeOrHexEscape(errors: js.Any): js.Any = js.native
  /* private */ def scanWhitespaceTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  def setAbsoluteIndex(index: scala.Double): scala.Unit = js.native
  /* private */ def skipEscapeSequence(diagnostics: js.Any): js.Any = js.native
  /* private */ def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any = js.native
  def substring(start: scala.Double, end: scala.Double, intern: scala.Boolean): java.lang.String = js.native
  /* private */ def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any = js.native
  /* private */ def tryScanRegularExpressionToken(): js.Any = js.native
}

@JSGlobal("TypeScript.Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(
    text: typescriptDashServicesLib.TypeScriptNs.ISimpleText,
    languageVersion: typescriptDashServicesLib.TypeScriptNs.LanguageVersion
  ): scala.Boolean = js.native
  def scanTrivia(
    text: typescriptDashServicesLib.TypeScriptNs.ISimpleText,
    start: scala.Double,
    length: scala.Double,
    isTrailing: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
}


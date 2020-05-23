package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Scanner")
@js.native
class Scanner protected ()
  extends typings.typescriptServices.TypeScript.Scanner {
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typings.typescriptServices.TypeScript.LanguageVersion
  ) = this()
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typings.typescriptServices.TypeScript.LanguageVersion,
    window: js.Array[Double]
  ) = this()
  /* CompleteClass */
  override var _languageVersion: js.Any = js.native
  /* CompleteClass */
  override var fileName: js.Any = js.native
  /* CompleteClass */
  override var slidingWindow: js.Any = js.native
  /* CompleteClass */
  override var text: js.Any = js.native
  /* CompleteClass */
  override def absoluteIndex(): Double = js.native
  /* CompleteClass */
  /* private */ override def advanceAndSetTokenKind(kind: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def createIllegalEscapeDiagnostic(start: js.Any, end: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def createToken(
    fullStart: js.Any,
    leadingTriviaInfo: js.Any,
    start: js.Any,
    kind: js.Any,
    end: js.Any,
    fullEnd: js.Any,
    trailingTriviaInfo: js.Any,
    isVariableWidthKeyword: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  /* private */ override def currentCharCode(): js.Any = js.native
  /* CompleteClass */
  override def fetchMoreItems(
    argument: js.Any,
    sourceIndex: Double,
    window: js.Array[_],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double = js.native
  /* CompleteClass */
  /* private */ override def getErrorMessageText(text: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isDotPrefixedNumericLiteral(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isHexNumericLiteral(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isIdentifierPart(interpretedChar: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isIdentifierStart(interpretedChar: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isNewLineCharacter(ch: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isOctalNumericLiteral(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def isUnicodeEscape(character: js.Any): js.Any = js.native
  /* CompleteClass */
  override def languageVersion(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  /* CompleteClass */
  /* private */ override def peekCharOrUnicodeEscape(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def peekUnicodeOrHexEscape(): js.Any = js.native
  /* CompleteClass */
  override def scan(
    diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic],
    allowRegularExpression: Boolean
  ): ISyntaxToken = js.native
  /* CompleteClass */
  /* private */ override def scanAmpersandToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanAsteriskToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanBarToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanCaretToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanCharOrUnicodeEscape(errors: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanDecimalDigits(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanDecimalNumericLiteral(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanDefaultCharacter(character: js.Any, diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanDotToken(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanEqualsToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanExclamationToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanHexNumericLiteral(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanLessThanToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanLineTerminatorSequenceLength(ch: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanLineTerminatorSequenceTrivia(ch: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanMinusToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanMultiLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanMultiLineCommentTriviaLength(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanNumericLiteral(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanOctalNumericLiteral(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanPercentToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanPlusToken(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanSingleLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanSingleLineCommentTriviaLength(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanSlashToken(allowRegularExpression: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanStringLiteral(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanSyntaxToken(diagnostics: js.Any, allowRegularExpression: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanTrivia(underlyingText: js.Any, underlyingTextStart: js.Any, isTrailing: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanTriviaInfo(diagnostics: js.Any, isTrailing: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanUnicodeOrHexEscape(errors: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def scanWhitespaceTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* CompleteClass */
  override def setAbsoluteIndex(index: Double): Unit = js.native
  /* CompleteClass */
  /* private */ override def skipEscapeSequence(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any = js.native
  /* CompleteClass */
  override def substring(start: Double, end: Double, intern: Boolean): String = js.native
  /* CompleteClass */
  /* private */ override def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def tryScanRegularExpressionToken(): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(text: ISimpleText, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
}


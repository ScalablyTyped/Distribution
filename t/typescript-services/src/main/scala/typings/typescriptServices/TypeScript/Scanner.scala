package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scanner extends ISlidingWindowSource {
  var _languageVersion: js.Any
  var fileName: js.Any
  var slidingWindow: js.Any
  var text: js.Any
  def absoluteIndex(): Double
  /* private */ def advanceAndSetTokenKind(kind: js.Any): js.Any
  /* private */ def createIllegalEscapeDiagnostic(start: js.Any, end: js.Any): js.Any
  /* private */ def createToken(
    fullStart: js.Any,
    leadingTriviaInfo: js.Any,
    start: js.Any,
    kind: js.Any,
    end: js.Any,
    fullEnd: js.Any,
    trailingTriviaInfo: js.Any,
    isVariableWidthKeyword: js.Any
  ): js.Any
  /* private */ def currentCharCode(): js.Any
  /* private */ def getErrorMessageText(text: js.Any): js.Any
  /* private */ def isDotPrefixedNumericLiteral(): js.Any
  /* private */ def isHexNumericLiteral(): js.Any
  /* private */ def isIdentifierPart(interpretedChar: js.Any): js.Any
  /* private */ def isIdentifierStart(interpretedChar: js.Any): js.Any
  /* private */ def isNewLineCharacter(ch: js.Any): js.Any
  /* private */ def isOctalNumericLiteral(): js.Any
  /* private */ def isUnicodeEscape(character: js.Any): js.Any
  def languageVersion(): LanguageVersion
  /* private */ def peekCharOrUnicodeEscape(): js.Any
  /* private */ def peekUnicodeOrHexEscape(): js.Any
  def scan(diagnostics: js.Array[Diagnostic], allowRegularExpression: Boolean): ISyntaxToken
  /* private */ def scanAmpersandToken(): js.Any
  /* private */ def scanAsteriskToken(): js.Any
  /* private */ def scanBarToken(): js.Any
  /* private */ def scanCaretToken(): js.Any
  /* private */ def scanCharOrUnicodeEscape(errors: js.Any): js.Any
  /* private */ def scanDecimalDigits(): js.Any
  /* private */ def scanDecimalNumericLiteral(): js.Any
  /* private */ def scanDefaultCharacter(character: js.Any, diagnostics: js.Any): js.Any
  /* private */ def scanDotToken(diagnostics: js.Any): js.Any
  /* private */ def scanEqualsToken(): js.Any
  /* private */ def scanExclamationToken(): js.Any
  /* private */ def scanHexNumericLiteral(): js.Any
  /* private */ def scanLessThanToken(): js.Any
  /* private */ def scanLineTerminatorSequenceLength(ch: js.Any): js.Any
  /* private */ def scanLineTerminatorSequenceTrivia(ch: js.Any): js.Any
  /* private */ def scanMinusToken(): js.Any
  /* private */ def scanMultiLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any
  /* private */ def scanMultiLineCommentTriviaLength(diagnostics: js.Any): js.Any
  /* private */ def scanNumericLiteral(diagnostics: js.Any): js.Any
  /* private */ def scanOctalNumericLiteral(diagnostics: js.Any): js.Any
  /* private */ def scanPercentToken(): js.Any
  /* private */ def scanPlusToken(): js.Any
  /* private */ def scanSingleLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any
  /* private */ def scanSingleLineCommentTriviaLength(): js.Any
  /* private */ def scanSlashToken(allowRegularExpression: js.Any): js.Any
  /* private */ def scanStringLiteral(diagnostics: js.Any): js.Any
  /* private */ def scanSyntaxToken(diagnostics: js.Any, allowRegularExpression: js.Any): js.Any
  /* private */ def scanTrivia(underlyingText: js.Any, underlyingTextStart: js.Any, isTrailing: js.Any): js.Any
  /* private */ def scanTriviaInfo(diagnostics: js.Any, isTrailing: js.Any): js.Any
  /* private */ def scanUnicodeOrHexEscape(errors: js.Any): js.Any
  /* private */ def scanWhitespaceTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any
  def setAbsoluteIndex(index: Double): Unit
  /* private */ def skipEscapeSequence(diagnostics: js.Any): js.Any
  /* private */ def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any
  def substring(start: Double, end: Double, intern: Boolean): String
  /* private */ def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any
  /* private */ def tryScanRegularExpressionToken(): js.Any
}

object Scanner {
  @scala.inline
  def apply(
    _languageVersion: js.Any,
    absoluteIndex: () => Double,
    advanceAndSetTokenKind: js.Any => js.Any,
    createIllegalEscapeDiagnostic: (js.Any, js.Any) => js.Any,
    createToken: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    currentCharCode: () => js.Any,
    fetchMoreItems: (js.Any, Double, js.Array[_], Double, Double) => Double,
    fileName: js.Any,
    getErrorMessageText: js.Any => js.Any,
    isDotPrefixedNumericLiteral: () => js.Any,
    isHexNumericLiteral: () => js.Any,
    isIdentifierPart: js.Any => js.Any,
    isIdentifierStart: js.Any => js.Any,
    isNewLineCharacter: js.Any => js.Any,
    isOctalNumericLiteral: () => js.Any,
    isUnicodeEscape: js.Any => js.Any,
    languageVersion: () => LanguageVersion,
    peekCharOrUnicodeEscape: () => js.Any,
    peekUnicodeOrHexEscape: () => js.Any,
    scan: (js.Array[Diagnostic], Boolean) => ISyntaxToken,
    scanAmpersandToken: () => js.Any,
    scanAsteriskToken: () => js.Any,
    scanBarToken: () => js.Any,
    scanCaretToken: () => js.Any,
    scanCharOrUnicodeEscape: js.Any => js.Any,
    scanDecimalDigits: () => js.Any,
    scanDecimalNumericLiteral: () => js.Any,
    scanDefaultCharacter: (js.Any, js.Any) => js.Any,
    scanDotToken: js.Any => js.Any,
    scanEqualsToken: () => js.Any,
    scanExclamationToken: () => js.Any,
    scanHexNumericLiteral: () => js.Any,
    scanLessThanToken: () => js.Any,
    scanLineTerminatorSequenceLength: js.Any => js.Any,
    scanLineTerminatorSequenceTrivia: js.Any => js.Any,
    scanMinusToken: () => js.Any,
    scanMultiLineCommentTrivia: (js.Any, js.Any) => js.Any,
    scanMultiLineCommentTriviaLength: js.Any => js.Any,
    scanNumericLiteral: js.Any => js.Any,
    scanOctalNumericLiteral: js.Any => js.Any,
    scanPercentToken: () => js.Any,
    scanPlusToken: () => js.Any,
    scanSingleLineCommentTrivia: (js.Any, js.Any) => js.Any,
    scanSingleLineCommentTriviaLength: () => js.Any,
    scanSlashToken: js.Any => js.Any,
    scanStringLiteral: js.Any => js.Any,
    scanSyntaxToken: (js.Any, js.Any) => js.Any,
    scanTrivia: (js.Any, js.Any, js.Any) => js.Any,
    scanTriviaInfo: (js.Any, js.Any) => js.Any,
    scanUnicodeOrHexEscape: js.Any => js.Any,
    scanWhitespaceTrivia: (js.Any, js.Any) => js.Any,
    setAbsoluteIndex: Double => Unit,
    skipEscapeSequence: js.Any => js.Any,
    slidingWindow: js.Any,
    slowScanIdentifierOrKeyword: js.Any => js.Any,
    substring: (Double, Double, Boolean) => String,
    text: js.Any,
    tryFastScanIdentifierOrKeyword: js.Any => js.Any,
    tryScanRegularExpressionToken: () => js.Any
  ): Scanner = {
    val __obj = js.Dynamic.literal(_languageVersion = _languageVersion.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), advanceAndSetTokenKind = js.Any.fromFunction1(advanceAndSetTokenKind), createIllegalEscapeDiagnostic = js.Any.fromFunction2(createIllegalEscapeDiagnostic), createToken = js.Any.fromFunction8(createToken), currentCharCode = js.Any.fromFunction0(currentCharCode), fetchMoreItems = js.Any.fromFunction5(fetchMoreItems), fileName = fileName.asInstanceOf[js.Any], getErrorMessageText = js.Any.fromFunction1(getErrorMessageText), isDotPrefixedNumericLiteral = js.Any.fromFunction0(isDotPrefixedNumericLiteral), isHexNumericLiteral = js.Any.fromFunction0(isHexNumericLiteral), isIdentifierPart = js.Any.fromFunction1(isIdentifierPart), isIdentifierStart = js.Any.fromFunction1(isIdentifierStart), isNewLineCharacter = js.Any.fromFunction1(isNewLineCharacter), isOctalNumericLiteral = js.Any.fromFunction0(isOctalNumericLiteral), isUnicodeEscape = js.Any.fromFunction1(isUnicodeEscape), languageVersion = js.Any.fromFunction0(languageVersion), peekCharOrUnicodeEscape = js.Any.fromFunction0(peekCharOrUnicodeEscape), peekUnicodeOrHexEscape = js.Any.fromFunction0(peekUnicodeOrHexEscape), scan = js.Any.fromFunction2(scan), scanAmpersandToken = js.Any.fromFunction0(scanAmpersandToken), scanAsteriskToken = js.Any.fromFunction0(scanAsteriskToken), scanBarToken = js.Any.fromFunction0(scanBarToken), scanCaretToken = js.Any.fromFunction0(scanCaretToken), scanCharOrUnicodeEscape = js.Any.fromFunction1(scanCharOrUnicodeEscape), scanDecimalDigits = js.Any.fromFunction0(scanDecimalDigits), scanDecimalNumericLiteral = js.Any.fromFunction0(scanDecimalNumericLiteral), scanDefaultCharacter = js.Any.fromFunction2(scanDefaultCharacter), scanDotToken = js.Any.fromFunction1(scanDotToken), scanEqualsToken = js.Any.fromFunction0(scanEqualsToken), scanExclamationToken = js.Any.fromFunction0(scanExclamationToken), scanHexNumericLiteral = js.Any.fromFunction0(scanHexNumericLiteral), scanLessThanToken = js.Any.fromFunction0(scanLessThanToken), scanLineTerminatorSequenceLength = js.Any.fromFunction1(scanLineTerminatorSequenceLength), scanLineTerminatorSequenceTrivia = js.Any.fromFunction1(scanLineTerminatorSequenceTrivia), scanMinusToken = js.Any.fromFunction0(scanMinusToken), scanMultiLineCommentTrivia = js.Any.fromFunction2(scanMultiLineCommentTrivia), scanMultiLineCommentTriviaLength = js.Any.fromFunction1(scanMultiLineCommentTriviaLength), scanNumericLiteral = js.Any.fromFunction1(scanNumericLiteral), scanOctalNumericLiteral = js.Any.fromFunction1(scanOctalNumericLiteral), scanPercentToken = js.Any.fromFunction0(scanPercentToken), scanPlusToken = js.Any.fromFunction0(scanPlusToken), scanSingleLineCommentTrivia = js.Any.fromFunction2(scanSingleLineCommentTrivia), scanSingleLineCommentTriviaLength = js.Any.fromFunction0(scanSingleLineCommentTriviaLength), scanSlashToken = js.Any.fromFunction1(scanSlashToken), scanStringLiteral = js.Any.fromFunction1(scanStringLiteral), scanSyntaxToken = js.Any.fromFunction2(scanSyntaxToken), scanTrivia = js.Any.fromFunction3(scanTrivia), scanTriviaInfo = js.Any.fromFunction2(scanTriviaInfo), scanUnicodeOrHexEscape = js.Any.fromFunction1(scanUnicodeOrHexEscape), scanWhitespaceTrivia = js.Any.fromFunction2(scanWhitespaceTrivia), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), skipEscapeSequence = js.Any.fromFunction1(skipEscapeSequence), slidingWindow = slidingWindow.asInstanceOf[js.Any], slowScanIdentifierOrKeyword = js.Any.fromFunction1(slowScanIdentifierOrKeyword), substring = js.Any.fromFunction3(substring), text = text.asInstanceOf[js.Any], tryFastScanIdentifierOrKeyword = js.Any.fromFunction1(tryFastScanIdentifierOrKeyword), tryScanRegularExpressionToken = js.Any.fromFunction0(tryScanRegularExpressionToken))
    __obj.asInstanceOf[Scanner]
  }
}


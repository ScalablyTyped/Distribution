package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scanner extends ISlidingWindowSource {
  
  var _languageVersion: js.Any = js.native
  
  def absoluteIndex(): Double = js.native
  
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
  
  var fileName: js.Any = js.native
  
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
  
  def scan(diagnostics: js.Array[Diagnostic], allowRegularExpression: Boolean): ISyntaxToken = js.native
  
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
  
  def setAbsoluteIndex(index: Double): Unit = js.native
  
  /* private */ def skipEscapeSequence(diagnostics: js.Any): js.Any = js.native
  
  var slidingWindow: js.Any = js.native
  
  /* private */ def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any = js.native
  
  def substring(start: Double, end: Double, intern: Boolean): String = js.native
  
  var text: js.Any = js.native
  
  /* private */ def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any = js.native
  
  /* private */ def tryScanRegularExpressionToken(): js.Any = js.native
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
  
  @scala.inline
  implicit class ScannerMutableBuilder[Self <: Scanner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteIndex(value: () => Double): Self = StObject.set(x, "absoluteIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdvanceAndSetTokenKind(value: js.Any => js.Any): Self = StObject.set(x, "advanceAndSetTokenKind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateIllegalEscapeDiagnostic(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "createIllegalEscapeDiagnostic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateToken(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "createToken", js.Any.fromFunction8(value))
    
    @scala.inline
    def setCurrentCharCode(value: () => js.Any): Self = StObject.set(x, "currentCharCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileName(value: js.Any): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetErrorMessageText(value: js.Any => js.Any): Self = StObject.set(x, "getErrorMessageText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDotPrefixedNumericLiteral(value: () => js.Any): Self = StObject.set(x, "isDotPrefixedNumericLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHexNumericLiteral(value: () => js.Any): Self = StObject.set(x, "isHexNumericLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIdentifierPart(value: js.Any => js.Any): Self = StObject.set(x, "isIdentifierPart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIdentifierStart(value: js.Any => js.Any): Self = StObject.set(x, "isIdentifierStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNewLineCharacter(value: js.Any => js.Any): Self = StObject.set(x, "isNewLineCharacter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsOctalNumericLiteral(value: () => js.Any): Self = StObject.set(x, "isOctalNumericLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnicodeEscape(value: js.Any => js.Any): Self = StObject.set(x, "isUnicodeEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguageVersion(value: () => LanguageVersion): Self = StObject.set(x, "languageVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeekCharOrUnicodeEscape(value: () => js.Any): Self = StObject.set(x, "peekCharOrUnicodeEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeekUnicodeOrHexEscape(value: () => js.Any): Self = StObject.set(x, "peekUnicodeOrHexEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScan(value: (js.Array[Diagnostic], Boolean) => ISyntaxToken): Self = StObject.set(x, "scan", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScanAmpersandToken(value: () => js.Any): Self = StObject.set(x, "scanAmpersandToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanAsteriskToken(value: () => js.Any): Self = StObject.set(x, "scanAsteriskToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanBarToken(value: () => js.Any): Self = StObject.set(x, "scanBarToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanCaretToken(value: () => js.Any): Self = StObject.set(x, "scanCaretToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanCharOrUnicodeEscape(value: js.Any => js.Any): Self = StObject.set(x, "scanCharOrUnicodeEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanDecimalDigits(value: () => js.Any): Self = StObject.set(x, "scanDecimalDigits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanDecimalNumericLiteral(value: () => js.Any): Self = StObject.set(x, "scanDecimalNumericLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanDefaultCharacter(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanDefaultCharacter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScanDotToken(value: js.Any => js.Any): Self = StObject.set(x, "scanDotToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanEqualsToken(value: () => js.Any): Self = StObject.set(x, "scanEqualsToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanExclamationToken(value: () => js.Any): Self = StObject.set(x, "scanExclamationToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanHexNumericLiteral(value: () => js.Any): Self = StObject.set(x, "scanHexNumericLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanLessThanToken(value: () => js.Any): Self = StObject.set(x, "scanLessThanToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanLineTerminatorSequenceLength(value: js.Any => js.Any): Self = StObject.set(x, "scanLineTerminatorSequenceLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanLineTerminatorSequenceTrivia(value: js.Any => js.Any): Self = StObject.set(x, "scanLineTerminatorSequenceTrivia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanMinusToken(value: () => js.Any): Self = StObject.set(x, "scanMinusToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanMultiLineCommentTrivia(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanMultiLineCommentTrivia", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScanMultiLineCommentTriviaLength(value: js.Any => js.Any): Self = StObject.set(x, "scanMultiLineCommentTriviaLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanNumericLiteral(value: js.Any => js.Any): Self = StObject.set(x, "scanNumericLiteral", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanOctalNumericLiteral(value: js.Any => js.Any): Self = StObject.set(x, "scanOctalNumericLiteral", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanPercentToken(value: () => js.Any): Self = StObject.set(x, "scanPercentToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanPlusToken(value: () => js.Any): Self = StObject.set(x, "scanPlusToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanSingleLineCommentTrivia(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanSingleLineCommentTrivia", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScanSingleLineCommentTriviaLength(value: () => js.Any): Self = StObject.set(x, "scanSingleLineCommentTriviaLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanSlashToken(value: js.Any => js.Any): Self = StObject.set(x, "scanSlashToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanStringLiteral(value: js.Any => js.Any): Self = StObject.set(x, "scanStringLiteral", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanSyntaxToken(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanSyntaxToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScanTrivia(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanTrivia", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScanTriviaInfo(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanTriviaInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScanUnicodeOrHexEscape(value: js.Any => js.Any): Self = StObject.set(x, "scanUnicodeOrHexEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanWhitespaceTrivia(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "scanWhitespaceTrivia", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipEscapeSequence(value: js.Any => js.Any): Self = StObject.set(x, "skipEscapeSequence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlidingWindow(value: js.Any): Self = StObject.set(x, "slidingWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowScanIdentifierOrKeyword(value: js.Any => js.Any): Self = StObject.set(x, "slowScanIdentifierOrKeyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubstring(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "substring", js.Any.fromFunction3(value))
    
    @scala.inline
    def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryFastScanIdentifierOrKeyword(value: js.Any => js.Any): Self = StObject.set(x, "tryFastScanIdentifierOrKeyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryScanRegularExpressionToken(value: () => js.Any): Self = StObject.set(x, "tryScanRegularExpressionToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_languageVersion(value: js.Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}

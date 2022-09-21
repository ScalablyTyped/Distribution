package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scanner
  extends StObject
     with ISlidingWindowSource {
  
  /* private */ var _languageVersion: Any
  
  def absoluteIndex(): Double
  
  /* private */ def advanceAndSetTokenKind(kind: Any): Any
  
  /* private */ def createIllegalEscapeDiagnostic(start: Any, end: Any): Any
  
  /* private */ def createToken(
    fullStart: Any,
    leadingTriviaInfo: Any,
    start: Any,
    kind: Any,
    end: Any,
    fullEnd: Any,
    trailingTriviaInfo: Any,
    isVariableWidthKeyword: Any
  ): Any
  
  /* private */ def currentCharCode(): Any
  
  /* private */ var fileName: Any
  
  /* private */ def getErrorMessageText(text: Any): Any
  
  /* private */ def isDotPrefixedNumericLiteral(): Any
  
  /* private */ def isHexNumericLiteral(): Any
  
  /* private */ def isIdentifierPart(interpretedChar: Any): Any
  
  /* private */ def isIdentifierStart(interpretedChar: Any): Any
  
  /* private */ def isNewLineCharacter(ch: Any): Any
  
  /* private */ def isOctalNumericLiteral(): Any
  
  /* private */ def isUnicodeEscape(character: Any): Any
  
  def languageVersion(): LanguageVersion
  
  /* private */ def peekCharOrUnicodeEscape(): Any
  
  /* private */ def peekUnicodeOrHexEscape(): Any
  
  def scan(diagnostics: js.Array[Diagnostic], allowRegularExpression: Boolean): ISyntaxToken
  
  /* private */ def scanAmpersandToken(): Any
  
  /* private */ def scanAsteriskToken(): Any
  
  /* private */ def scanBarToken(): Any
  
  /* private */ def scanCaretToken(): Any
  
  /* private */ def scanCharOrUnicodeEscape(errors: Any): Any
  
  /* private */ def scanDecimalDigits(): Any
  
  /* private */ def scanDecimalNumericLiteral(): Any
  
  /* private */ def scanDefaultCharacter(character: Any, diagnostics: Any): Any
  
  /* private */ def scanDotToken(diagnostics: Any): Any
  
  /* private */ def scanEqualsToken(): Any
  
  /* private */ def scanExclamationToken(): Any
  
  /* private */ def scanHexNumericLiteral(): Any
  
  /* private */ def scanLessThanToken(): Any
  
  /* private */ def scanLineTerminatorSequenceLength(ch: Any): Any
  
  /* private */ def scanLineTerminatorSequenceTrivia(ch: Any): Any
  
  /* private */ def scanMinusToken(): Any
  
  /* private */ def scanMultiLineCommentTrivia(underlyingText: Any, underlyingTextStart: Any): Any
  
  /* private */ def scanMultiLineCommentTriviaLength(diagnostics: Any): Any
  
  /* private */ def scanNumericLiteral(diagnostics: Any): Any
  
  /* private */ def scanOctalNumericLiteral(diagnostics: Any): Any
  
  /* private */ def scanPercentToken(): Any
  
  /* private */ def scanPlusToken(): Any
  
  /* private */ def scanSingleLineCommentTrivia(underlyingText: Any, underlyingTextStart: Any): Any
  
  /* private */ def scanSingleLineCommentTriviaLength(): Any
  
  /* private */ def scanSlashToken(allowRegularExpression: Any): Any
  
  /* private */ def scanStringLiteral(diagnostics: Any): Any
  
  /* private */ def scanSyntaxToken(diagnostics: Any, allowRegularExpression: Any): Any
  
  /* private */ def scanTrivia(underlyingText: Any, underlyingTextStart: Any, isTrailing: Any): Any
  
  /* private */ def scanTriviaInfo(diagnostics: Any, isTrailing: Any): Any
  
  /* private */ def scanUnicodeOrHexEscape(errors: Any): Any
  
  /* private */ def scanWhitespaceTrivia(underlyingText: Any, underlyingTextStart: Any): Any
  
  def setAbsoluteIndex(index: Double): Unit
  
  /* private */ def skipEscapeSequence(diagnostics: Any): Any
  
  /* private */ var slidingWindow: Any
  
  /* private */ def slowScanIdentifierOrKeyword(diagnostics: Any): Any
  
  def substring(start: Double, end: Double, intern: Boolean): String
  
  /* private */ var text: Any
  
  /* private */ def tryFastScanIdentifierOrKeyword(firstCharacter: Any): Any
  
  /* private */ def tryScanRegularExpressionToken(): Any
}
object Scanner {
  
  inline def apply(
    _languageVersion: Any,
    absoluteIndex: () => Double,
    advanceAndSetTokenKind: Any => Any,
    createIllegalEscapeDiagnostic: (Any, Any) => Any,
    createToken: (Any, Any, Any, Any, Any, Any, Any, Any) => Any,
    currentCharCode: () => Any,
    fetchMoreItems: (Any, Double, js.Array[Any], Double, Double) => Double,
    fileName: Any,
    getErrorMessageText: Any => Any,
    isDotPrefixedNumericLiteral: () => Any,
    isHexNumericLiteral: () => Any,
    isIdentifierPart: Any => Any,
    isIdentifierStart: Any => Any,
    isNewLineCharacter: Any => Any,
    isOctalNumericLiteral: () => Any,
    isUnicodeEscape: Any => Any,
    languageVersion: () => LanguageVersion,
    peekCharOrUnicodeEscape: () => Any,
    peekUnicodeOrHexEscape: () => Any,
    scan: (js.Array[Diagnostic], Boolean) => ISyntaxToken,
    scanAmpersandToken: () => Any,
    scanAsteriskToken: () => Any,
    scanBarToken: () => Any,
    scanCaretToken: () => Any,
    scanCharOrUnicodeEscape: Any => Any,
    scanDecimalDigits: () => Any,
    scanDecimalNumericLiteral: () => Any,
    scanDefaultCharacter: (Any, Any) => Any,
    scanDotToken: Any => Any,
    scanEqualsToken: () => Any,
    scanExclamationToken: () => Any,
    scanHexNumericLiteral: () => Any,
    scanLessThanToken: () => Any,
    scanLineTerminatorSequenceLength: Any => Any,
    scanLineTerminatorSequenceTrivia: Any => Any,
    scanMinusToken: () => Any,
    scanMultiLineCommentTrivia: (Any, Any) => Any,
    scanMultiLineCommentTriviaLength: Any => Any,
    scanNumericLiteral: Any => Any,
    scanOctalNumericLiteral: Any => Any,
    scanPercentToken: () => Any,
    scanPlusToken: () => Any,
    scanSingleLineCommentTrivia: (Any, Any) => Any,
    scanSingleLineCommentTriviaLength: () => Any,
    scanSlashToken: Any => Any,
    scanStringLiteral: Any => Any,
    scanSyntaxToken: (Any, Any) => Any,
    scanTrivia: (Any, Any, Any) => Any,
    scanTriviaInfo: (Any, Any) => Any,
    scanUnicodeOrHexEscape: Any => Any,
    scanWhitespaceTrivia: (Any, Any) => Any,
    setAbsoluteIndex: Double => Unit,
    skipEscapeSequence: Any => Any,
    slidingWindow: Any,
    slowScanIdentifierOrKeyword: Any => Any,
    substring: (Double, Double, Boolean) => String,
    text: Any,
    tryFastScanIdentifierOrKeyword: Any => Any,
    tryScanRegularExpressionToken: () => Any
  ): Scanner = {
    val __obj = js.Dynamic.literal(_languageVersion = _languageVersion.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), advanceAndSetTokenKind = js.Any.fromFunction1(advanceAndSetTokenKind), createIllegalEscapeDiagnostic = js.Any.fromFunction2(createIllegalEscapeDiagnostic), createToken = js.Any.fromFunction8(createToken), currentCharCode = js.Any.fromFunction0(currentCharCode), fetchMoreItems = js.Any.fromFunction5(fetchMoreItems), fileName = fileName.asInstanceOf[js.Any], getErrorMessageText = js.Any.fromFunction1(getErrorMessageText), isDotPrefixedNumericLiteral = js.Any.fromFunction0(isDotPrefixedNumericLiteral), isHexNumericLiteral = js.Any.fromFunction0(isHexNumericLiteral), isIdentifierPart = js.Any.fromFunction1(isIdentifierPart), isIdentifierStart = js.Any.fromFunction1(isIdentifierStart), isNewLineCharacter = js.Any.fromFunction1(isNewLineCharacter), isOctalNumericLiteral = js.Any.fromFunction0(isOctalNumericLiteral), isUnicodeEscape = js.Any.fromFunction1(isUnicodeEscape), languageVersion = js.Any.fromFunction0(languageVersion), peekCharOrUnicodeEscape = js.Any.fromFunction0(peekCharOrUnicodeEscape), peekUnicodeOrHexEscape = js.Any.fromFunction0(peekUnicodeOrHexEscape), scan = js.Any.fromFunction2(scan), scanAmpersandToken = js.Any.fromFunction0(scanAmpersandToken), scanAsteriskToken = js.Any.fromFunction0(scanAsteriskToken), scanBarToken = js.Any.fromFunction0(scanBarToken), scanCaretToken = js.Any.fromFunction0(scanCaretToken), scanCharOrUnicodeEscape = js.Any.fromFunction1(scanCharOrUnicodeEscape), scanDecimalDigits = js.Any.fromFunction0(scanDecimalDigits), scanDecimalNumericLiteral = js.Any.fromFunction0(scanDecimalNumericLiteral), scanDefaultCharacter = js.Any.fromFunction2(scanDefaultCharacter), scanDotToken = js.Any.fromFunction1(scanDotToken), scanEqualsToken = js.Any.fromFunction0(scanEqualsToken), scanExclamationToken = js.Any.fromFunction0(scanExclamationToken), scanHexNumericLiteral = js.Any.fromFunction0(scanHexNumericLiteral), scanLessThanToken = js.Any.fromFunction0(scanLessThanToken), scanLineTerminatorSequenceLength = js.Any.fromFunction1(scanLineTerminatorSequenceLength), scanLineTerminatorSequenceTrivia = js.Any.fromFunction1(scanLineTerminatorSequenceTrivia), scanMinusToken = js.Any.fromFunction0(scanMinusToken), scanMultiLineCommentTrivia = js.Any.fromFunction2(scanMultiLineCommentTrivia), scanMultiLineCommentTriviaLength = js.Any.fromFunction1(scanMultiLineCommentTriviaLength), scanNumericLiteral = js.Any.fromFunction1(scanNumericLiteral), scanOctalNumericLiteral = js.Any.fromFunction1(scanOctalNumericLiteral), scanPercentToken = js.Any.fromFunction0(scanPercentToken), scanPlusToken = js.Any.fromFunction0(scanPlusToken), scanSingleLineCommentTrivia = js.Any.fromFunction2(scanSingleLineCommentTrivia), scanSingleLineCommentTriviaLength = js.Any.fromFunction0(scanSingleLineCommentTriviaLength), scanSlashToken = js.Any.fromFunction1(scanSlashToken), scanStringLiteral = js.Any.fromFunction1(scanStringLiteral), scanSyntaxToken = js.Any.fromFunction2(scanSyntaxToken), scanTrivia = js.Any.fromFunction3(scanTrivia), scanTriviaInfo = js.Any.fromFunction2(scanTriviaInfo), scanUnicodeOrHexEscape = js.Any.fromFunction1(scanUnicodeOrHexEscape), scanWhitespaceTrivia = js.Any.fromFunction2(scanWhitespaceTrivia), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), skipEscapeSequence = js.Any.fromFunction1(skipEscapeSequence), slidingWindow = slidingWindow.asInstanceOf[js.Any], slowScanIdentifierOrKeyword = js.Any.fromFunction1(slowScanIdentifierOrKeyword), substring = js.Any.fromFunction3(substring), text = text.asInstanceOf[js.Any], tryFastScanIdentifierOrKeyword = js.Any.fromFunction1(tryFastScanIdentifierOrKeyword), tryScanRegularExpressionToken = js.Any.fromFunction0(tryScanRegularExpressionToken))
    __obj.asInstanceOf[Scanner]
  }
  
  extension [Self <: Scanner](x: Self) {
    
    inline def setAbsoluteIndex(value: () => Double): Self = StObject.set(x, "absoluteIndex", js.Any.fromFunction0(value))
    
    inline def setAdvanceAndSetTokenKind(value: Any => Any): Self = StObject.set(x, "advanceAndSetTokenKind", js.Any.fromFunction1(value))
    
    inline def setCreateIllegalEscapeDiagnostic(value: (Any, Any) => Any): Self = StObject.set(x, "createIllegalEscapeDiagnostic", js.Any.fromFunction2(value))
    
    inline def setCreateToken(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "createToken", js.Any.fromFunction8(value))
    
    inline def setCurrentCharCode(value: () => Any): Self = StObject.set(x, "currentCharCode", js.Any.fromFunction0(value))
    
    inline def setFileName(value: Any): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setGetErrorMessageText(value: Any => Any): Self = StObject.set(x, "getErrorMessageText", js.Any.fromFunction1(value))
    
    inline def setIsDotPrefixedNumericLiteral(value: () => Any): Self = StObject.set(x, "isDotPrefixedNumericLiteral", js.Any.fromFunction0(value))
    
    inline def setIsHexNumericLiteral(value: () => Any): Self = StObject.set(x, "isHexNumericLiteral", js.Any.fromFunction0(value))
    
    inline def setIsIdentifierPart(value: Any => Any): Self = StObject.set(x, "isIdentifierPart", js.Any.fromFunction1(value))
    
    inline def setIsIdentifierStart(value: Any => Any): Self = StObject.set(x, "isIdentifierStart", js.Any.fromFunction1(value))
    
    inline def setIsNewLineCharacter(value: Any => Any): Self = StObject.set(x, "isNewLineCharacter", js.Any.fromFunction1(value))
    
    inline def setIsOctalNumericLiteral(value: () => Any): Self = StObject.set(x, "isOctalNumericLiteral", js.Any.fromFunction0(value))
    
    inline def setIsUnicodeEscape(value: Any => Any): Self = StObject.set(x, "isUnicodeEscape", js.Any.fromFunction1(value))
    
    inline def setLanguageVersion(value: () => LanguageVersion): Self = StObject.set(x, "languageVersion", js.Any.fromFunction0(value))
    
    inline def setPeekCharOrUnicodeEscape(value: () => Any): Self = StObject.set(x, "peekCharOrUnicodeEscape", js.Any.fromFunction0(value))
    
    inline def setPeekUnicodeOrHexEscape(value: () => Any): Self = StObject.set(x, "peekUnicodeOrHexEscape", js.Any.fromFunction0(value))
    
    inline def setScan(value: (js.Array[Diagnostic], Boolean) => ISyntaxToken): Self = StObject.set(x, "scan", js.Any.fromFunction2(value))
    
    inline def setScanAmpersandToken(value: () => Any): Self = StObject.set(x, "scanAmpersandToken", js.Any.fromFunction0(value))
    
    inline def setScanAsteriskToken(value: () => Any): Self = StObject.set(x, "scanAsteriskToken", js.Any.fromFunction0(value))
    
    inline def setScanBarToken(value: () => Any): Self = StObject.set(x, "scanBarToken", js.Any.fromFunction0(value))
    
    inline def setScanCaretToken(value: () => Any): Self = StObject.set(x, "scanCaretToken", js.Any.fromFunction0(value))
    
    inline def setScanCharOrUnicodeEscape(value: Any => Any): Self = StObject.set(x, "scanCharOrUnicodeEscape", js.Any.fromFunction1(value))
    
    inline def setScanDecimalDigits(value: () => Any): Self = StObject.set(x, "scanDecimalDigits", js.Any.fromFunction0(value))
    
    inline def setScanDecimalNumericLiteral(value: () => Any): Self = StObject.set(x, "scanDecimalNumericLiteral", js.Any.fromFunction0(value))
    
    inline def setScanDefaultCharacter(value: (Any, Any) => Any): Self = StObject.set(x, "scanDefaultCharacter", js.Any.fromFunction2(value))
    
    inline def setScanDotToken(value: Any => Any): Self = StObject.set(x, "scanDotToken", js.Any.fromFunction1(value))
    
    inline def setScanEqualsToken(value: () => Any): Self = StObject.set(x, "scanEqualsToken", js.Any.fromFunction0(value))
    
    inline def setScanExclamationToken(value: () => Any): Self = StObject.set(x, "scanExclamationToken", js.Any.fromFunction0(value))
    
    inline def setScanHexNumericLiteral(value: () => Any): Self = StObject.set(x, "scanHexNumericLiteral", js.Any.fromFunction0(value))
    
    inline def setScanLessThanToken(value: () => Any): Self = StObject.set(x, "scanLessThanToken", js.Any.fromFunction0(value))
    
    inline def setScanLineTerminatorSequenceLength(value: Any => Any): Self = StObject.set(x, "scanLineTerminatorSequenceLength", js.Any.fromFunction1(value))
    
    inline def setScanLineTerminatorSequenceTrivia(value: Any => Any): Self = StObject.set(x, "scanLineTerminatorSequenceTrivia", js.Any.fromFunction1(value))
    
    inline def setScanMinusToken(value: () => Any): Self = StObject.set(x, "scanMinusToken", js.Any.fromFunction0(value))
    
    inline def setScanMultiLineCommentTrivia(value: (Any, Any) => Any): Self = StObject.set(x, "scanMultiLineCommentTrivia", js.Any.fromFunction2(value))
    
    inline def setScanMultiLineCommentTriviaLength(value: Any => Any): Self = StObject.set(x, "scanMultiLineCommentTriviaLength", js.Any.fromFunction1(value))
    
    inline def setScanNumericLiteral(value: Any => Any): Self = StObject.set(x, "scanNumericLiteral", js.Any.fromFunction1(value))
    
    inline def setScanOctalNumericLiteral(value: Any => Any): Self = StObject.set(x, "scanOctalNumericLiteral", js.Any.fromFunction1(value))
    
    inline def setScanPercentToken(value: () => Any): Self = StObject.set(x, "scanPercentToken", js.Any.fromFunction0(value))
    
    inline def setScanPlusToken(value: () => Any): Self = StObject.set(x, "scanPlusToken", js.Any.fromFunction0(value))
    
    inline def setScanSingleLineCommentTrivia(value: (Any, Any) => Any): Self = StObject.set(x, "scanSingleLineCommentTrivia", js.Any.fromFunction2(value))
    
    inline def setScanSingleLineCommentTriviaLength(value: () => Any): Self = StObject.set(x, "scanSingleLineCommentTriviaLength", js.Any.fromFunction0(value))
    
    inline def setScanSlashToken(value: Any => Any): Self = StObject.set(x, "scanSlashToken", js.Any.fromFunction1(value))
    
    inline def setScanStringLiteral(value: Any => Any): Self = StObject.set(x, "scanStringLiteral", js.Any.fromFunction1(value))
    
    inline def setScanSyntaxToken(value: (Any, Any) => Any): Self = StObject.set(x, "scanSyntaxToken", js.Any.fromFunction2(value))
    
    inline def setScanTrivia(value: (Any, Any, Any) => Any): Self = StObject.set(x, "scanTrivia", js.Any.fromFunction3(value))
    
    inline def setScanTriviaInfo(value: (Any, Any) => Any): Self = StObject.set(x, "scanTriviaInfo", js.Any.fromFunction2(value))
    
    inline def setScanUnicodeOrHexEscape(value: Any => Any): Self = StObject.set(x, "scanUnicodeOrHexEscape", js.Any.fromFunction1(value))
    
    inline def setScanWhitespaceTrivia(value: (Any, Any) => Any): Self = StObject.set(x, "scanWhitespaceTrivia", js.Any.fromFunction2(value))
    
    inline def setSetAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1(value))
    
    inline def setSkipEscapeSequence(value: Any => Any): Self = StObject.set(x, "skipEscapeSequence", js.Any.fromFunction1(value))
    
    inline def setSlidingWindow(value: Any): Self = StObject.set(x, "slidingWindow", value.asInstanceOf[js.Any])
    
    inline def setSlowScanIdentifierOrKeyword(value: Any => Any): Self = StObject.set(x, "slowScanIdentifierOrKeyword", js.Any.fromFunction1(value))
    
    inline def setSubstring(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "substring", js.Any.fromFunction3(value))
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTryFastScanIdentifierOrKeyword(value: Any => Any): Self = StObject.set(x, "tryFastScanIdentifierOrKeyword", js.Any.fromFunction1(value))
    
    inline def setTryScanRegularExpressionToken(value: () => Any): Self = StObject.set(x, "tryScanRegularExpressionToken", js.Any.fromFunction0(value))
    
    inline def set_languageVersion(value: Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}

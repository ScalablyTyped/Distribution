package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Scanner")
@js.native
open class Scanner protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Scanner {
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
  
  /* private */ /* CompleteClass */
  var _languageVersion: Any = js.native
  
  /* CompleteClass */
  override def absoluteIndex(): Double = js.native
  
  /* private */ /* CompleteClass */
  override def advanceAndSetTokenKind(kind: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def createIllegalEscapeDiagnostic(start: Any, end: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def createToken(
    fullStart: Any,
    leadingTriviaInfo: Any,
    start: Any,
    kind: Any,
    end: Any,
    fullEnd: Any,
    trailingTriviaInfo: Any,
    isVariableWidthKeyword: Any
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  override def currentCharCode(): Any = js.native
  
  /* CompleteClass */
  override def fetchMoreItems(
    argument: Any,
    sourceIndex: Double,
    window: js.Array[Any],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double = js.native
  
  /* private */ /* CompleteClass */
  var fileName: Any = js.native
  
  /* private */ /* CompleteClass */
  override def getErrorMessageText(text: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isDotPrefixedNumericLiteral(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isHexNumericLiteral(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isIdentifierPart(interpretedChar: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isIdentifierStart(interpretedChar: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isNewLineCharacter(ch: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isOctalNumericLiteral(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isUnicodeEscape(character: Any): Any = js.native
  
  /* CompleteClass */
  override def languageVersion(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  
  /* private */ /* CompleteClass */
  override def peekCharOrUnicodeEscape(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def peekUnicodeOrHexEscape(): Any = js.native
  
  /* CompleteClass */
  override def scan(
    diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic],
    allowRegularExpression: Boolean
  ): ISyntaxToken = js.native
  
  /* private */ /* CompleteClass */
  override def scanAmpersandToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanAsteriskToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanBarToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanCaretToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanCharOrUnicodeEscape(errors: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDecimalDigits(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDecimalNumericLiteral(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDefaultCharacter(character: Any, diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDotToken(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanEqualsToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanExclamationToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanHexNumericLiteral(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanLessThanToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanLineTerminatorSequenceLength(ch: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanLineTerminatorSequenceTrivia(ch: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanMinusToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanMultiLineCommentTrivia(underlyingText: Any, underlyingTextStart: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanMultiLineCommentTriviaLength(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanNumericLiteral(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanOctalNumericLiteral(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanPercentToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanPlusToken(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSingleLineCommentTrivia(underlyingText: Any, underlyingTextStart: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSingleLineCommentTriviaLength(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSlashToken(allowRegularExpression: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanStringLiteral(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSyntaxToken(diagnostics: Any, allowRegularExpression: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanTrivia(underlyingText: Any, underlyingTextStart: Any, isTrailing: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanTriviaInfo(diagnostics: Any, isTrailing: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanUnicodeOrHexEscape(errors: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanWhitespaceTrivia(underlyingText: Any, underlyingTextStart: Any): Any = js.native
  
  /* CompleteClass */
  override def setAbsoluteIndex(index: Double): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def skipEscapeSequence(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var slidingWindow: Any = js.native
  
  /* private */ /* CompleteClass */
  override def slowScanIdentifierOrKeyword(diagnostics: Any): Any = js.native
  
  /* CompleteClass */
  override def substring(start: Double, end: Double, intern: Boolean): String = js.native
  
  /* private */ /* CompleteClass */
  var text: Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryFastScanIdentifierOrKeyword(firstCharacter: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryScanRegularExpressionToken(): Any = js.native
}
object Scanner {
  
  @JSImport("typescript-services", "Scanner")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isValidIdentifier(text: ISimpleText, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = (^.asInstanceOf[js.Dynamic].applyDynamic("scanTrivia")(text.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any], isTrailing.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTriviaList]
  
  /* static member */
  @JSImport("typescript-services", "Scanner.triviaWindow")
  @js.native
  def triviaWindow: Any = js.native
  inline def triviaWindow_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triviaWindow")(x.asInstanceOf[js.Any])
}

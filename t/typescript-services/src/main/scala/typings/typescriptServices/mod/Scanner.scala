package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Scanner")
@js.native
class Scanner protected ()
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
  var _languageVersion: js.Any = js.native
  
  /* CompleteClass */
  override def absoluteIndex(): Double = js.native
  
  /* private */ /* CompleteClass */
  override def advanceAndSetTokenKind(kind: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def createIllegalEscapeDiagnostic(start: js.Any, end: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def createToken(
    fullStart: js.Any,
    leadingTriviaInfo: js.Any,
    start: js.Any,
    kind: js.Any,
    end: js.Any,
    fullEnd: js.Any,
    trailingTriviaInfo: js.Any,
    isVariableWidthKeyword: js.Any
  ): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def currentCharCode(): js.Any = js.native
  
  /* CompleteClass */
  override def fetchMoreItems(
    argument: js.Any,
    sourceIndex: Double,
    window: js.Array[js.Any],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double = js.native
  
  /* private */ /* CompleteClass */
  var fileName: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getErrorMessageText(text: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isDotPrefixedNumericLiteral(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isHexNumericLiteral(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isIdentifierPart(interpretedChar: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isIdentifierStart(interpretedChar: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isNewLineCharacter(ch: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isOctalNumericLiteral(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isUnicodeEscape(character: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def languageVersion(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  
  /* private */ /* CompleteClass */
  override def peekCharOrUnicodeEscape(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def peekUnicodeOrHexEscape(): js.Any = js.native
  
  /* CompleteClass */
  override def scan(
    diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic],
    allowRegularExpression: Boolean
  ): ISyntaxToken = js.native
  
  /* private */ /* CompleteClass */
  override def scanAmpersandToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanAsteriskToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanBarToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanCaretToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanCharOrUnicodeEscape(errors: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDecimalDigits(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDecimalNumericLiteral(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDefaultCharacter(character: js.Any, diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanDotToken(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanEqualsToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanExclamationToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanHexNumericLiteral(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanLessThanToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanLineTerminatorSequenceLength(ch: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanLineTerminatorSequenceTrivia(ch: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanMinusToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanMultiLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanMultiLineCommentTriviaLength(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanNumericLiteral(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanOctalNumericLiteral(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanPercentToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanPlusToken(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSingleLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSingleLineCommentTriviaLength(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSlashToken(allowRegularExpression: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanStringLiteral(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanSyntaxToken(diagnostics: js.Any, allowRegularExpression: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanTrivia(underlyingText: js.Any, underlyingTextStart: js.Any, isTrailing: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanTriviaInfo(diagnostics: js.Any, isTrailing: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanUnicodeOrHexEscape(errors: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def scanWhitespaceTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def setAbsoluteIndex(index: Double): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def skipEscapeSequence(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var slidingWindow: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def substring(start: Double, end: Double, intern: Boolean): String = js.native
  
  /* private */ /* CompleteClass */
  var text: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryScanRegularExpressionToken(): js.Any = js.native
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
  def triviaWindow: js.Any = js.native
  inline def triviaWindow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triviaWindow")(x.asInstanceOf[js.Any])
}

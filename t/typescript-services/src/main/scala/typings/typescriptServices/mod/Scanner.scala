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
  
  /* CompleteClass */
  var _languageVersion: js.Any = js.native
  
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
    window: js.Array[js.Any],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double = js.native
  
  /* CompleteClass */
  var fileName: js.Any = js.native
  
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
  var slidingWindow: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def substring(start: Double, end: Double, intern: Boolean): String = js.native
  
  /* CompleteClass */
  var text: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def tryScanRegularExpressionToken(): js.Any = js.native
}
object Scanner {
  
  @JSImport("typescript-services", "Scanner")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def isValidIdentifier(text: ISimpleText, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = (^.asInstanceOf[js.Dynamic].applyDynamic("scanTrivia")(text.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any], isTrailing.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTriviaList]
  
  /* static member */
  @JSImport("typescript-services", "Scanner.triviaWindow")
  @js.native
  def triviaWindow: js.Any = js.native
  @scala.inline
  def triviaWindow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triviaWindow")(x.asInstanceOf[js.Any])
}

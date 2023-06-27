package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scanner extends StObject {
  
  /** @deprecated use {@link getTokenFullStart} */
  def getStartPos(): Double = js.native
  
  def getText(): java.lang.String = js.native
  
  /** @deprecated use {@link getTokenEnd} */
  def getTextPos(): Double = js.native
  
  def getToken(): SyntaxKind = js.native
  
  def getTokenEnd(): Double = js.native
  
  def getTokenFullStart(): Double = js.native
  
  /** @deprecated use {@link getTokenStart} */
  def getTokenPos(): Double = js.native
  
  def getTokenStart(): Double = js.native
  
  def getTokenText(): java.lang.String = js.native
  
  def getTokenValue(): java.lang.String = js.native
  
  def hasExtendedUnicodeEscape(): Boolean = js.native
  
  def hasPrecedingLineBreak(): Boolean = js.native
  
  def hasUnicodeEscape(): Boolean = js.native
  
  def isIdentifier(): Boolean = js.native
  
  def isReservedWord(): Boolean = js.native
  
  def isUnterminated(): Boolean = js.native
  
  def lookAhead[T](callback: js.Function0[T]): T = js.native
  
  def reScanAsteriskEqualsToken(): SyntaxKind = js.native
  
  def reScanGreaterToken(): SyntaxKind = js.native
  
  def reScanHashToken(): SyntaxKind = js.native
  
  def reScanInvalidIdentifier(): SyntaxKind = js.native
  
  def reScanJsxAttributeValue(): SyntaxKind = js.native
  
  def reScanJsxToken(): JsxTokenSyntaxKind = js.native
  def reScanJsxToken(allowMultilineJsxText: Boolean): JsxTokenSyntaxKind = js.native
  
  def reScanLessThanToken(): SyntaxKind = js.native
  
  def reScanQuestionToken(): SyntaxKind = js.native
  
  def reScanSlashToken(): SyntaxKind = js.native
  
  /** @deprecated use {@link reScanTemplateToken}(false) */
  def reScanTemplateHeadOrNoSubstitutionTemplate(): SyntaxKind = js.native
  
  def reScanTemplateToken(isTaggedTemplate: Boolean): SyntaxKind = js.native
  
  def resetTokenState(pos: Double): Unit = js.native
  
  def scan(): SyntaxKind = js.native
  
  def scanJsDocToken(): JSDocSyntaxKind = js.native
  
  def scanJsxAttributeValue(): SyntaxKind = js.native
  
  def scanJsxIdentifier(): SyntaxKind = js.native
  
  def scanJsxToken(): JsxTokenSyntaxKind = js.native
  
  def scanRange[T](start: Double, length: Double, callback: js.Function0[T]): T = js.native
  
  def setLanguageVariant(variant: LanguageVariant): Unit = js.native
  
  def setOnError(): Unit = js.native
  def setOnError(onError: ErrorCallback): Unit = js.native
  
  def setScriptTarget(scriptTarget: ScriptTarget): Unit = js.native
  
  def setText(): Unit = js.native
  def setText(text: java.lang.String): Unit = js.native
  def setText(text: java.lang.String, start: Double): Unit = js.native
  def setText(text: java.lang.String, start: Double, length: Double): Unit = js.native
  def setText(text: java.lang.String, start: Unit, length: Double): Unit = js.native
  def setText(text: Unit, start: Double): Unit = js.native
  def setText(text: Unit, start: Double, length: Double): Unit = js.native
  def setText(text: Unit, start: Unit, length: Double): Unit = js.native
  
  /** @deprecated use {@link resetTokenState} */
  def setTextPos(textPos: Double): Unit = js.native
  
  def tryScan[T](callback: js.Function0[T]): T = js.native
}

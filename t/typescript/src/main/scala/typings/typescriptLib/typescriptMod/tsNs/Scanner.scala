package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scanner extends js.Object {
  def getStartPos(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def getTextPos(): scala.Double = js.native
  def getToken(): SyntaxKind = js.native
  def getTokenPos(): scala.Double = js.native
  def getTokenText(): java.lang.String = js.native
  def getTokenValue(): java.lang.String = js.native
  def hasExtendedUnicodeEscape(): scala.Boolean = js.native
  def hasPrecedingLineBreak(): scala.Boolean = js.native
  def isIdentifier(): scala.Boolean = js.native
  def isReservedWord(): scala.Boolean = js.native
  def isUnterminated(): scala.Boolean = js.native
  def lookAhead[T](callback: js.Function0[T]): T = js.native
  def reScanGreaterToken(): SyntaxKind = js.native
  def reScanJsxToken(): JsxTokenSyntaxKind = js.native
  def reScanSlashToken(): SyntaxKind = js.native
  def reScanTemplateToken(): SyntaxKind = js.native
  def scan(): SyntaxKind = js.native
  def scanJSDocToken(): JsDocSyntaxKind = js.native
  def scanJsxAttributeValue(): SyntaxKind = js.native
  def scanJsxIdentifier(): SyntaxKind = js.native
  def scanJsxToken(): JsxTokenSyntaxKind = js.native
  def scanRange[T](start: scala.Double, length: scala.Double, callback: js.Function0[T]): T = js.native
  def setLanguageVariant(variant: LanguageVariant): scala.Unit = js.native
  def setOnError(): scala.Unit = js.native
  def setOnError(onError: ErrorCallback): scala.Unit = js.native
  def setScriptTarget(scriptTarget: ScriptTarget): scala.Unit = js.native
  def setText(): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setText(text: java.lang.String, start: scala.Double): scala.Unit = js.native
  def setText(text: java.lang.String, start: scala.Double, length: scala.Double): scala.Unit = js.native
  def setText(text: js.UndefOr[scala.Nothing], start: scala.Double): scala.Unit = js.native
  def setText(text: js.UndefOr[scala.Nothing], start: scala.Double, length: scala.Double): scala.Unit = js.native
  def setTextPos(textPos: scala.Double): scala.Unit = js.native
  def tryScan[T](callback: js.Function0[T]): T = js.native
}


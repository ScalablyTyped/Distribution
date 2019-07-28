package typings.typescriptDashServices.TypeScriptNs

import typings.typescriptDashServices.FormattingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Indentation")
@js.native
object IndentationNs extends js.Object {
  def columnForEndOfToken(token: ISyntaxToken, syntaxInformationMap: SyntaxInformationMap, options: FormattingOptions): Double = js.native
  def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = js.native
  def columnForStartOfFirstTokenInLineContainingToken(token: ISyntaxToken, syntaxInformationMap: SyntaxInformationMap, options: FormattingOptions): Double = js.native
  def columnForStartOfToken(token: ISyntaxToken, syntaxInformationMap: SyntaxInformationMap, options: FormattingOptions): Double = js.native
  def firstNonWhitespacePosition(value: String): Double = js.native
  def indentationString(column: Double, options: FormattingOptions): String = js.native
  def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = js.native
}


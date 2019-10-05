package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.ISyntaxTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Indentation")
@js.native
object Indentation extends js.Object {
  def columnForEndOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptDashServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = js.native
  def columnForStartOfFirstTokenInLineContainingToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptDashServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  def columnForStartOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptDashServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  def firstNonWhitespacePosition(value: String): Double = js.native
  def indentationString(column: Double, options: FormattingOptions): String = js.native
  def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = js.native
}


package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Indentation")
@js.native
object IndentationNs extends js.Object {
  def columnForEndOfToken(
    token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    syntaxInformationMap: typescriptDashServicesLib.TypeScriptNs.SyntaxInformationMap,
    options: typescriptDashServicesLib.FormattingOptions
  ): scala.Double = js.native
  def columnForPositionInString(
    input: java.lang.String,
    position: scala.Double,
    options: typescriptDashServicesLib.FormattingOptions
  ): scala.Double = js.native
  def columnForStartOfFirstTokenInLineContainingToken(
    token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    syntaxInformationMap: typescriptDashServicesLib.TypeScriptNs.SyntaxInformationMap,
    options: typescriptDashServicesLib.FormattingOptions
  ): scala.Double = js.native
  def columnForStartOfToken(
    token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    syntaxInformationMap: typescriptDashServicesLib.TypeScriptNs.SyntaxInformationMap,
    options: typescriptDashServicesLib.FormattingOptions
  ): scala.Double = js.native
  def firstNonWhitespacePosition(value: java.lang.String): scala.Double = js.native
  def indentationString(column: scala.Double, options: typescriptDashServicesLib.FormattingOptions): java.lang.String = js.native
  def indentationTrivia(column: scala.Double, options: typescriptDashServicesLib.FormattingOptions): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
}


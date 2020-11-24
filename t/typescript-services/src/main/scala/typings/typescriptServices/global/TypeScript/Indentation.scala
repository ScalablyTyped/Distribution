package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Indentation")
@js.native
object Indentation extends js.Object {
  
  def columnForEndOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = js.native
  
  def columnForStartOfFirstTokenInLineContainingToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  def columnForStartOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  def firstNonWhitespacePosition(value: String): Double = js.native
  
  def indentationString(column: Double, options: FormattingOptions): String = js.native
  
  def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = js.native
}

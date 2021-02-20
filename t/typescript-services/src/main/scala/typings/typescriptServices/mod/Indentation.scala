package typings.typescriptServices.mod

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTrivia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Indentation {
  
  @JSImport("typescript-services", "Indentation.columnForEndOfToken")
  @js.native
  def columnForEndOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  @JSImport("typescript-services", "Indentation.columnForPositionInString")
  @js.native
  def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = js.native
  
  @JSImport("typescript-services", "Indentation.columnForStartOfFirstTokenInLineContainingToken")
  @js.native
  def columnForStartOfFirstTokenInLineContainingToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  @JSImport("typescript-services", "Indentation.columnForStartOfToken")
  @js.native
  def columnForStartOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  @JSImport("typescript-services", "Indentation.firstNonWhitespacePosition")
  @js.native
  def firstNonWhitespacePosition(value: String): Double = js.native
  
  @JSImport("typescript-services", "Indentation.indentationString")
  @js.native
  def indentationString(column: Double, options: FormattingOptions): String = js.native
  
  @JSImport("typescript-services", "Indentation.indentationTrivia")
  @js.native
  def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = js.native
}

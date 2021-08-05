package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTrivia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Indentation {
  
  @JSGlobal("TypeScript.Indentation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def columnForEndOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("columnForEndOfToken")(token.asInstanceOf[js.Any], syntaxInformationMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("columnForPositionInString")(input.asInstanceOf[js.Any], position.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def columnForStartOfFirstTokenInLineContainingToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("columnForStartOfFirstTokenInLineContainingToken")(token.asInstanceOf[js.Any], syntaxInformationMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def columnForStartOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typings.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("columnForStartOfToken")(token.asInstanceOf[js.Any], syntaxInformationMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def firstNonWhitespacePosition(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("firstNonWhitespacePosition")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def indentationString(column: Double, options: FormattingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentationString")(column.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = (^.asInstanceOf[js.Dynamic].applyDynamic("indentationTrivia")(column.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTrivia]
}

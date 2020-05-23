package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCodeOptions extends EditorOptions {
  var InsertSpaceAfterCommaDelimiter: Boolean
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean
  var InsertSpaceAfterKeywordsInControlFlowStatements: Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean
  var InsertSpaceAfterSemicolonInForStatements: Boolean
  var InsertSpaceBeforeAndAfterBinaryOperators: Boolean
  var PlaceOpenBraceOnNewLineForControlBlocks: Boolean
  var PlaceOpenBraceOnNewLineForFunctions: Boolean
}

object FormatCodeOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    InsertSpaceAfterCommaDelimiter: Boolean,
    InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean,
    InsertSpaceAfterKeywordsInControlFlowStatements: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean,
    InsertSpaceAfterSemicolonInForStatements: Boolean,
    InsertSpaceBeforeAndAfterBinaryOperators: Boolean,
    NewLineCharacter: String,
    PlaceOpenBraceOnNewLineForControlBlocks: Boolean,
    PlaceOpenBraceOnNewLineForFunctions: Boolean,
    TabSize: Double
  ): FormatCodeOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], InsertSpaceAfterCommaDelimiter = InsertSpaceAfterCommaDelimiter.asInstanceOf[js.Any], InsertSpaceAfterFunctionKeywordForAnonymousFunctions = InsertSpaceAfterFunctionKeywordForAnonymousFunctions.asInstanceOf[js.Any], InsertSpaceAfterKeywordsInControlFlowStatements = InsertSpaceAfterKeywordsInControlFlowStatements.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis.asInstanceOf[js.Any], InsertSpaceAfterSemicolonInForStatements = InsertSpaceAfterSemicolonInForStatements.asInstanceOf[js.Any], InsertSpaceBeforeAndAfterBinaryOperators = InsertSpaceBeforeAndAfterBinaryOperators.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForControlBlocks = PlaceOpenBraceOnNewLineForControlBlocks.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForFunctions = PlaceOpenBraceOnNewLineForFunctions.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCodeOptions]
  }
}


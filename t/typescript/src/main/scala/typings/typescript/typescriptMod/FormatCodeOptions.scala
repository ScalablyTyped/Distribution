package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCodeOptions extends EditorOptions {
  var InsertSpaceAfterCommaDelimiter: Boolean
  var InsertSpaceAfterConstructor: js.UndefOr[Boolean] = js.undefined
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean
  var InsertSpaceAfterKeywordsInControlFlowStatements: Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.undefined
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.undefined
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Boolean
  var InsertSpaceAfterSemicolonInForStatements: Boolean
  var InsertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.undefined
  var InsertSpaceBeforeAndAfterBinaryOperators: Boolean
  var InsertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.undefined
  var PlaceOpenBraceOnNewLineForControlBlocks: Boolean
  var PlaceOpenBraceOnNewLineForFunctions: Boolean
  var insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.undefined
}

object FormatCodeOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    IndentStyle: IndentStyle,
    InsertSpaceAfterCommaDelimiter: Boolean,
    InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean,
    InsertSpaceAfterKeywordsInControlFlowStatements: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Boolean,
    InsertSpaceAfterSemicolonInForStatements: Boolean,
    InsertSpaceBeforeAndAfterBinaryOperators: Boolean,
    NewLineCharacter: String,
    PlaceOpenBraceOnNewLineForControlBlocks: Boolean,
    PlaceOpenBraceOnNewLineForFunctions: Boolean,
    TabSize: Double,
    BaseIndentSize: Int | Double = null,
    InsertSpaceAfterConstructor: js.UndefOr[Boolean] = js.undefined,
    InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.undefined,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.undefined,
    InsertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.undefined,
    InsertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.undefined,
    insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.undefined
  ): FormatCodeOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], InsertSpaceAfterCommaDelimiter = InsertSpaceAfterCommaDelimiter.asInstanceOf[js.Any], InsertSpaceAfterFunctionKeywordForAnonymousFunctions = InsertSpaceAfterFunctionKeywordForAnonymousFunctions.asInstanceOf[js.Any], InsertSpaceAfterKeywordsInControlFlowStatements = InsertSpaceAfterKeywordsInControlFlowStatements.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces = InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces.asInstanceOf[js.Any], InsertSpaceAfterSemicolonInForStatements = InsertSpaceAfterSemicolonInForStatements.asInstanceOf[js.Any], InsertSpaceBeforeAndAfterBinaryOperators = InsertSpaceBeforeAndAfterBinaryOperators.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForControlBlocks = PlaceOpenBraceOnNewLineForControlBlocks.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForFunctions = PlaceOpenBraceOnNewLineForFunctions.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    if (BaseIndentSize != null) __obj.updateDynamic("BaseIndentSize")(BaseIndentSize.asInstanceOf[js.Any])
    if (!js.isUndefined(InsertSpaceAfterConstructor)) __obj.updateDynamic("InsertSpaceAfterConstructor")(InsertSpaceAfterConstructor.asInstanceOf[js.Any])
    if (!js.isUndefined(InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces)) __obj.updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces.asInstanceOf[js.Any])
    if (!js.isUndefined(InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces)) __obj.updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces.asInstanceOf[js.Any])
    if (!js.isUndefined(InsertSpaceAfterTypeAssertion)) __obj.updateDynamic("InsertSpaceAfterTypeAssertion")(InsertSpaceAfterTypeAssertion.asInstanceOf[js.Any])
    if (!js.isUndefined(InsertSpaceBeforeFunctionParenthesis)) __obj.updateDynamic("InsertSpaceBeforeFunctionParenthesis")(InsertSpaceBeforeFunctionParenthesis.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceBeforeTypeAnnotation)) __obj.updateDynamic("insertSpaceBeforeTypeAnnotation")(insertSpaceBeforeTypeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCodeOptions]
  }
}


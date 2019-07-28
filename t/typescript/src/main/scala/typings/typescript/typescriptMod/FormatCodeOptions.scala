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
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces, IndentSize = IndentSize, IndentStyle = IndentStyle, InsertSpaceAfterCommaDelimiter = InsertSpaceAfterCommaDelimiter, InsertSpaceAfterFunctionKeywordForAnonymousFunctions = InsertSpaceAfterFunctionKeywordForAnonymousFunctions, InsertSpaceAfterKeywordsInControlFlowStatements = InsertSpaceAfterKeywordsInControlFlowStatements, InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces = InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces, InsertSpaceAfterSemicolonInForStatements = InsertSpaceAfterSemicolonInForStatements, InsertSpaceBeforeAndAfterBinaryOperators = InsertSpaceBeforeAndAfterBinaryOperators, NewLineCharacter = NewLineCharacter, PlaceOpenBraceOnNewLineForControlBlocks = PlaceOpenBraceOnNewLineForControlBlocks, PlaceOpenBraceOnNewLineForFunctions = PlaceOpenBraceOnNewLineForFunctions, TabSize = TabSize)
    if (BaseIndentSize != null) __obj.updateDynamic("BaseIndentSize")(BaseIndentSize.asInstanceOf[js.Any])
    if (!js.isUndefined(InsertSpaceAfterConstructor)) __obj.updateDynamic("InsertSpaceAfterConstructor")(InsertSpaceAfterConstructor)
    if (!js.isUndefined(InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces)) __obj.updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces)
    if (!js.isUndefined(InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces)) __obj.updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces)
    if (!js.isUndefined(InsertSpaceAfterTypeAssertion)) __obj.updateDynamic("InsertSpaceAfterTypeAssertion")(InsertSpaceAfterTypeAssertion)
    if (!js.isUndefined(InsertSpaceBeforeFunctionParenthesis)) __obj.updateDynamic("InsertSpaceBeforeFunctionParenthesis")(InsertSpaceBeforeFunctionParenthesis)
    if (!js.isUndefined(insertSpaceBeforeTypeAnnotation)) __obj.updateDynamic("insertSpaceBeforeTypeAnnotation")(insertSpaceBeforeTypeAnnotation)
    __obj.asInstanceOf[FormatCodeOptions]
  }
}


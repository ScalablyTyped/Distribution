package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCodeOptions extends EditorOptions {
  var InsertSpaceAfterCommaDelimiter: scala.Boolean
  var InsertSpaceAfterConstructor: js.UndefOr[scala.Boolean] = js.undefined
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: scala.Boolean
  var InsertSpaceAfterKeywordsInControlFlowStatements: scala.Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[scala.Boolean] = js.undefined
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[scala.Boolean] = js.undefined
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: scala.Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: scala.Boolean
  var InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: scala.Boolean
  var InsertSpaceAfterSemicolonInForStatements: scala.Boolean
  var InsertSpaceAfterTypeAssertion: js.UndefOr[scala.Boolean] = js.undefined
  var InsertSpaceBeforeAndAfterBinaryOperators: scala.Boolean
  var InsertSpaceBeforeFunctionParenthesis: js.UndefOr[scala.Boolean] = js.undefined
  var PlaceOpenBraceOnNewLineForControlBlocks: scala.Boolean
  var PlaceOpenBraceOnNewLineForFunctions: scala.Boolean
  var insertSpaceBeforeTypeAnnotation: js.UndefOr[scala.Boolean] = js.undefined
}

object FormatCodeOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: scala.Boolean,
    IndentSize: scala.Double,
    IndentStyle: IndentStyle,
    InsertSpaceAfterCommaDelimiter: scala.Boolean,
    InsertSpaceAfterFunctionKeywordForAnonymousFunctions: scala.Boolean,
    InsertSpaceAfterKeywordsInControlFlowStatements: scala.Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: scala.Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: scala.Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: scala.Boolean,
    InsertSpaceAfterSemicolonInForStatements: scala.Boolean,
    InsertSpaceBeforeAndAfterBinaryOperators: scala.Boolean,
    NewLineCharacter: java.lang.String,
    PlaceOpenBraceOnNewLineForControlBlocks: scala.Boolean,
    PlaceOpenBraceOnNewLineForFunctions: scala.Boolean,
    TabSize: scala.Double,
    BaseIndentSize: scala.Int | scala.Double = null,
    InsertSpaceAfterConstructor: js.UndefOr[scala.Boolean] = js.undefined,
    InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[scala.Boolean] = js.undefined,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[scala.Boolean] = js.undefined,
    InsertSpaceAfterTypeAssertion: js.UndefOr[scala.Boolean] = js.undefined,
    InsertSpaceBeforeFunctionParenthesis: js.UndefOr[scala.Boolean] = js.undefined,
    insertSpaceBeforeTypeAnnotation: js.UndefOr[scala.Boolean] = js.undefined
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


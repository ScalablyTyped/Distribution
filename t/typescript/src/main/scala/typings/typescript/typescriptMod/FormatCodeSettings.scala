package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCodeSettings extends EditorSettings {
  val indentMultiLineObjectLiteralBeginningOnBlankLine: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterCommaDelimiter: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterConstructor: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterFunctionKeywordForAnonymousFunctions: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterKeywordsInControlFlowStatements: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterSemicolonInForStatements: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.undefined
  val insertSpaceBeforeAndAfterBinaryOperators: js.UndefOr[Boolean] = js.undefined
  val insertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.undefined
  val insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.undefined
  val placeOpenBraceOnNewLineForControlBlocks: js.UndefOr[Boolean] = js.undefined
  val placeOpenBraceOnNewLineForFunctions: js.UndefOr[Boolean] = js.undefined
}

object FormatCodeSettings {
  @scala.inline
  def apply(
    baseIndentSize: Int | Double = null,
    convertTabsToSpaces: js.UndefOr[Boolean] = js.undefined,
    indentMultiLineObjectLiteralBeginningOnBlankLine: js.UndefOr[Boolean] = js.undefined,
    indentSize: Int | Double = null,
    indentStyle: IndentStyle = null,
    insertSpaceAfterCommaDelimiter: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterConstructor: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterFunctionKeywordForAnonymousFunctions: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterKeywordsInControlFlowStatements: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterSemicolonInForStatements: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.undefined,
    insertSpaceBeforeAndAfterBinaryOperators: js.UndefOr[Boolean] = js.undefined,
    insertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.undefined,
    insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.undefined,
    newLineCharacter: String = null,
    placeOpenBraceOnNewLineForControlBlocks: js.UndefOr[Boolean] = js.undefined,
    placeOpenBraceOnNewLineForFunctions: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null
  ): FormatCodeSettings = {
    val __obj = js.Dynamic.literal()
    if (baseIndentSize != null) __obj.updateDynamic("baseIndentSize")(baseIndentSize.asInstanceOf[js.Any])
    if (!js.isUndefined(convertTabsToSpaces)) __obj.updateDynamic("convertTabsToSpaces")(convertTabsToSpaces)
    if (!js.isUndefined(indentMultiLineObjectLiteralBeginningOnBlankLine)) __obj.updateDynamic("indentMultiLineObjectLiteralBeginningOnBlankLine")(indentMultiLineObjectLiteralBeginningOnBlankLine)
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (indentStyle != null) __obj.updateDynamic("indentStyle")(indentStyle)
    if (!js.isUndefined(insertSpaceAfterCommaDelimiter)) __obj.updateDynamic("insertSpaceAfterCommaDelimiter")(insertSpaceAfterCommaDelimiter)
    if (!js.isUndefined(insertSpaceAfterConstructor)) __obj.updateDynamic("insertSpaceAfterConstructor")(insertSpaceAfterConstructor)
    if (!js.isUndefined(insertSpaceAfterFunctionKeywordForAnonymousFunctions)) __obj.updateDynamic("insertSpaceAfterFunctionKeywordForAnonymousFunctions")(insertSpaceAfterFunctionKeywordForAnonymousFunctions)
    if (!js.isUndefined(insertSpaceAfterKeywordsInControlFlowStatements)) __obj.updateDynamic("insertSpaceAfterKeywordsInControlFlowStatements")(insertSpaceAfterKeywordsInControlFlowStatements)
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces)
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces)
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets")(insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets)
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")(insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis)
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces")(insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces)
    if (!js.isUndefined(insertSpaceAfterSemicolonInForStatements)) __obj.updateDynamic("insertSpaceAfterSemicolonInForStatements")(insertSpaceAfterSemicolonInForStatements)
    if (!js.isUndefined(insertSpaceAfterTypeAssertion)) __obj.updateDynamic("insertSpaceAfterTypeAssertion")(insertSpaceAfterTypeAssertion)
    if (!js.isUndefined(insertSpaceBeforeAndAfterBinaryOperators)) __obj.updateDynamic("insertSpaceBeforeAndAfterBinaryOperators")(insertSpaceBeforeAndAfterBinaryOperators)
    if (!js.isUndefined(insertSpaceBeforeFunctionParenthesis)) __obj.updateDynamic("insertSpaceBeforeFunctionParenthesis")(insertSpaceBeforeFunctionParenthesis)
    if (!js.isUndefined(insertSpaceBeforeTypeAnnotation)) __obj.updateDynamic("insertSpaceBeforeTypeAnnotation")(insertSpaceBeforeTypeAnnotation)
    if (newLineCharacter != null) __obj.updateDynamic("newLineCharacter")(newLineCharacter)
    if (!js.isUndefined(placeOpenBraceOnNewLineForControlBlocks)) __obj.updateDynamic("placeOpenBraceOnNewLineForControlBlocks")(placeOpenBraceOnNewLineForControlBlocks)
    if (!js.isUndefined(placeOpenBraceOnNewLineForFunctions)) __obj.updateDynamic("placeOpenBraceOnNewLineForFunctions")(placeOpenBraceOnNewLineForFunctions)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCodeSettings]
  }
}


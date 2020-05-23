package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCodeSettings extends EditorSettings {
  val indentMultiLineObjectLiteralBeginningOnBlankLine: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterCommaDelimiter: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterConstructor: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterFunctionKeywordForAnonymousFunctions: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterKeywordsInControlFlowStatements: js.UndefOr[Boolean] = js.undefined
  val insertSpaceAfterOpeningAndBeforeClosingEmptyBraces: js.UndefOr[Boolean] = js.undefined
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
  val semicolons: js.UndefOr[SemicolonPreference] = js.undefined
}

object FormatCodeSettings {
  @scala.inline
  def apply(
    baseIndentSize: js.UndefOr[Double] = js.undefined,
    convertTabsToSpaces: js.UndefOr[Boolean] = js.undefined,
    indentMultiLineObjectLiteralBeginningOnBlankLine: js.UndefOr[Boolean] = js.undefined,
    indentSize: js.UndefOr[Double] = js.undefined,
    indentStyle: IndentStyle = null,
    insertSpaceAfterCommaDelimiter: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterConstructor: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterFunctionKeywordForAnonymousFunctions: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterKeywordsInControlFlowStatements: js.UndefOr[Boolean] = js.undefined,
    insertSpaceAfterOpeningAndBeforeClosingEmptyBraces: js.UndefOr[Boolean] = js.undefined,
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
    newLineCharacter: java.lang.String = null,
    placeOpenBraceOnNewLineForControlBlocks: js.UndefOr[Boolean] = js.undefined,
    placeOpenBraceOnNewLineForFunctions: js.UndefOr[Boolean] = js.undefined,
    semicolons: SemicolonPreference = null,
    tabSize: js.UndefOr[Double] = js.undefined,
    trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
  ): FormatCodeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseIndentSize)) __obj.updateDynamic("baseIndentSize")(baseIndentSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(convertTabsToSpaces)) __obj.updateDynamic("convertTabsToSpaces")(convertTabsToSpaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentMultiLineObjectLiteralBeginningOnBlankLine)) __obj.updateDynamic("indentMultiLineObjectLiteralBeginningOnBlankLine")(indentMultiLineObjectLiteralBeginningOnBlankLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentSize)) __obj.updateDynamic("indentSize")(indentSize.get.asInstanceOf[js.Any])
    if (indentStyle != null) __obj.updateDynamic("indentStyle")(indentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterCommaDelimiter)) __obj.updateDynamic("insertSpaceAfterCommaDelimiter")(insertSpaceAfterCommaDelimiter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterConstructor)) __obj.updateDynamic("insertSpaceAfterConstructor")(insertSpaceAfterConstructor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterFunctionKeywordForAnonymousFunctions)) __obj.updateDynamic("insertSpaceAfterFunctionKeywordForAnonymousFunctions")(insertSpaceAfterFunctionKeywordForAnonymousFunctions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterKeywordsInControlFlowStatements)) __obj.updateDynamic("insertSpaceAfterKeywordsInControlFlowStatements")(insertSpaceAfterKeywordsInControlFlowStatements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingEmptyBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingEmptyBraces")(insertSpaceAfterOpeningAndBeforeClosingEmptyBraces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets")(insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")(insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces)) __obj.updateDynamic("insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces")(insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterSemicolonInForStatements)) __obj.updateDynamic("insertSpaceAfterSemicolonInForStatements")(insertSpaceAfterSemicolonInForStatements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceAfterTypeAssertion)) __obj.updateDynamic("insertSpaceAfterTypeAssertion")(insertSpaceAfterTypeAssertion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceBeforeAndAfterBinaryOperators)) __obj.updateDynamic("insertSpaceBeforeAndAfterBinaryOperators")(insertSpaceBeforeAndAfterBinaryOperators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceBeforeFunctionParenthesis)) __obj.updateDynamic("insertSpaceBeforeFunctionParenthesis")(insertSpaceBeforeFunctionParenthesis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaceBeforeTypeAnnotation)) __obj.updateDynamic("insertSpaceBeforeTypeAnnotation")(insertSpaceBeforeTypeAnnotation.get.asInstanceOf[js.Any])
    if (newLineCharacter != null) __obj.updateDynamic("newLineCharacter")(newLineCharacter.asInstanceOf[js.Any])
    if (!js.isUndefined(placeOpenBraceOnNewLineForControlBlocks)) __obj.updateDynamic("placeOpenBraceOnNewLineForControlBlocks")(placeOpenBraceOnNewLineForControlBlocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(placeOpenBraceOnNewLineForFunctions)) __obj.updateDynamic("placeOpenBraceOnNewLineForFunctions")(placeOpenBraceOnNewLineForFunctions.get.asInstanceOf[js.Any])
    if (semicolons != null) __obj.updateDynamic("semicolons")(semicolons.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimTrailingWhitespace)) __obj.updateDynamic("trimTrailingWhitespace")(trimTrailingWhitespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCodeSettings]
  }
}


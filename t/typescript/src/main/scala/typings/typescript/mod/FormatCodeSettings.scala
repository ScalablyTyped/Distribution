package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCodeSettings extends EditorSettings {
  
  val indentMultiLineObjectLiteralBeginningOnBlankLine: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterCommaDelimiter: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterConstructor: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterFunctionKeywordForAnonymousFunctions: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterKeywordsInControlFlowStatements: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterOpeningAndBeforeClosingEmptyBraces: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterSemicolonInForStatements: js.UndefOr[Boolean] = js.native
  
  val insertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.native
  
  val insertSpaceBeforeAndAfterBinaryOperators: js.UndefOr[Boolean] = js.native
  
  val insertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.native
  
  val insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.native
  
  val placeOpenBraceOnNewLineForControlBlocks: js.UndefOr[Boolean] = js.native
  
  val placeOpenBraceOnNewLineForFunctions: js.UndefOr[Boolean] = js.native
  
  val semicolons: js.UndefOr[SemicolonPreference] = js.native
}
object FormatCodeSettings {
  
  @scala.inline
  def apply(): FormatCodeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatCodeSettings]
  }
  
  @scala.inline
  implicit class FormatCodeSettingsOps[Self <: FormatCodeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndentMultiLineObjectLiteralBeginningOnBlankLine(value: Boolean): Self = this.set("indentMultiLineObjectLiteralBeginningOnBlankLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentMultiLineObjectLiteralBeginningOnBlankLine: Self = this.set("indentMultiLineObjectLiteralBeginningOnBlankLine", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterCommaDelimiter(value: Boolean): Self = this.set("insertSpaceAfterCommaDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterCommaDelimiter: Self = this.set("insertSpaceAfterCommaDelimiter", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterConstructor(value: Boolean): Self = this.set("insertSpaceAfterConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterConstructor: Self = this.set("insertSpaceAfterConstructor", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = this.set("insertSpaceAfterFunctionKeywordForAnonymousFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterFunctionKeywordForAnonymousFunctions: Self = this.set("insertSpaceAfterFunctionKeywordForAnonymousFunctions", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = this.set("insertSpaceAfterKeywordsInControlFlowStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterKeywordsInControlFlowStatements: Self = this.set("insertSpaceAfterKeywordsInControlFlowStatements", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingEmptyBraces(value: Boolean): Self = this.set("insertSpaceAfterOpeningAndBeforeClosingEmptyBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingEmptyBraces: Self = this.set("insertSpaceAfterOpeningAndBeforeClosingEmptyBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces(value: Boolean): Self = this.set("insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: Self = this.set("insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces(value: Boolean): Self = this.set("insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: Self = this.set("insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(value: Boolean): Self = this.set("insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Self = this.set("insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = this.set("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Self = this.set("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces(value: Boolean): Self = this.set("insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Self = this.set("insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = this.set("insertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterSemicolonInForStatements: Self = this.set("insertSpaceAfterSemicolonInForStatements", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterTypeAssertion(value: Boolean): Self = this.set("insertSpaceAfterTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterTypeAssertion: Self = this.set("insertSpaceAfterTypeAssertion", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = this.set("insertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceBeforeAndAfterBinaryOperators: Self = this.set("insertSpaceBeforeAndAfterBinaryOperators", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeFunctionParenthesis(value: Boolean): Self = this.set("insertSpaceBeforeFunctionParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceBeforeFunctionParenthesis: Self = this.set("insertSpaceBeforeFunctionParenthesis", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeTypeAnnotation(value: Boolean): Self = this.set("insertSpaceBeforeTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceBeforeTypeAnnotation: Self = this.set("insertSpaceBeforeTypeAnnotation", js.undefined)
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = this.set("placeOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceOpenBraceOnNewLineForControlBlocks: Self = this.set("placeOpenBraceOnNewLineForControlBlocks", js.undefined)
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = this.set("placeOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceOpenBraceOnNewLineForFunctions: Self = this.set("placeOpenBraceOnNewLineForFunctions", js.undefined)
    
    @scala.inline
    def setSemicolons(value: SemicolonPreference): Self = this.set("semicolons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemicolons: Self = this.set("semicolons", js.undefined)
  }
}

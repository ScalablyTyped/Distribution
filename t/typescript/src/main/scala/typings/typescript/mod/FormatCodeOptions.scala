package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCodeOptions extends EditorOptions {
  
  var InsertSpaceAfterCommaDelimiter: Boolean = js.native
  
  var InsertSpaceAfterConstructor: js.UndefOr[Boolean] = js.native
  
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean = js.native
  
  var InsertSpaceAfterKeywordsInControlFlowStatements: Boolean = js.native
  
  var InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.native
  
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.native
  
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Boolean = js.native
  
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean = js.native
  
  var InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Boolean = js.native
  
  var InsertSpaceAfterSemicolonInForStatements: Boolean = js.native
  
  var InsertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.native
  
  var InsertSpaceBeforeAndAfterBinaryOperators: Boolean = js.native
  
  var InsertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.native
  
  var PlaceOpenBraceOnNewLineForControlBlocks: Boolean = js.native
  
  var PlaceOpenBraceOnNewLineForFunctions: Boolean = js.native
  
  var insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.native
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
    NewLineCharacter: java.lang.String,
    PlaceOpenBraceOnNewLineForControlBlocks: Boolean,
    PlaceOpenBraceOnNewLineForFunctions: Boolean,
    TabSize: Double
  ): FormatCodeOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], InsertSpaceAfterCommaDelimiter = InsertSpaceAfterCommaDelimiter.asInstanceOf[js.Any], InsertSpaceAfterFunctionKeywordForAnonymousFunctions = InsertSpaceAfterFunctionKeywordForAnonymousFunctions.asInstanceOf[js.Any], InsertSpaceAfterKeywordsInControlFlowStatements = InsertSpaceAfterKeywordsInControlFlowStatements.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces = InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces.asInstanceOf[js.Any], InsertSpaceAfterSemicolonInForStatements = InsertSpaceAfterSemicolonInForStatements.asInstanceOf[js.Any], InsertSpaceBeforeAndAfterBinaryOperators = InsertSpaceBeforeAndAfterBinaryOperators.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForControlBlocks = PlaceOpenBraceOnNewLineForControlBlocks.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForFunctions = PlaceOpenBraceOnNewLineForFunctions.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCodeOptions]
  }
  
  @scala.inline
  implicit class FormatCodeOptionsOps[Self <: FormatCodeOptions] (val x: Self) extends AnyVal {
    
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
    def setInsertSpaceAfterCommaDelimiter(value: Boolean): Self = this.set("InsertSpaceAfterCommaDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = this.set("InsertSpaceAfterFunctionKeywordForAnonymousFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = this.set("InsertSpaceAfterKeywordsInControlFlowStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(value: Boolean): Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces(value: Boolean): Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = this.set("InsertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = this.set("InsertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = this.set("PlaceOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = this.set("PlaceOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterConstructor(value: Boolean): Self = this.set("InsertSpaceAfterConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterConstructor: Self = this.set("InsertSpaceAfterConstructor", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces(value: Boolean): Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces(value: Boolean): Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterTypeAssertion(value: Boolean): Self = this.set("InsertSpaceAfterTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceAfterTypeAssertion: Self = this.set("InsertSpaceAfterTypeAssertion", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeFunctionParenthesis(value: Boolean): Self = this.set("InsertSpaceBeforeFunctionParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceBeforeFunctionParenthesis: Self = this.set("InsertSpaceBeforeFunctionParenthesis", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeTypeAnnotation(value: Boolean): Self = this.set("insertSpaceBeforeTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaceBeforeTypeAnnotation: Self = this.set("insertSpaceBeforeTypeAnnotation", js.undefined)
  }
}

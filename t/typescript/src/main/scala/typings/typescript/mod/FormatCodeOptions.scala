package typings.typescript.mod

import org.scalablytyped.runtime.StObject
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
  implicit class FormatCodeOptionsMutableBuilder[Self <: FormatCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertSpaceAfterCommaDelimiter(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterCommaDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterConstructor(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterConstructorUndefined: Self = StObject.set(x, "InsertSpaceAfterConstructor", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterFunctionKeywordForAnonymousFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterKeywordsInControlFlowStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBracesUndefined: Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBracesUndefined: Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", js.undefined)
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterTypeAssertion(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterTypeAssertionUndefined: Self = StObject.set(x, "InsertSpaceAfterTypeAssertion", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = StObject.set(x, "InsertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceBeforeFunctionParenthesis(value: Boolean): Self = StObject.set(x, "InsertSpaceBeforeFunctionParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceBeforeFunctionParenthesisUndefined: Self = StObject.set(x, "InsertSpaceBeforeFunctionParenthesis", js.undefined)
    
    @scala.inline
    def setInsertSpaceBeforeTypeAnnotation(value: Boolean): Self = StObject.set(x, "insertSpaceBeforeTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceBeforeTypeAnnotationUndefined: Self = StObject.set(x, "insertSpaceBeforeTypeAnnotation", js.undefined)
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
  }
}

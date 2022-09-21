package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated - consider using FormatCodeSettings instead */
trait FormatCodeOptions
  extends StObject
     with EditorOptions {
  
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
  
  inline def apply(
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
  
  extension [Self <: FormatCodeOptions](x: Self) {
    
    inline def setInsertSpaceAfterCommaDelimiter(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterCommaDelimiter", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterConstructor(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterConstructor", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterConstructorUndefined: Self = StObject.set(x, "InsertSpaceAfterConstructor", js.undefined)
    
    inline def setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterFunctionKeywordForAnonymousFunctions", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterKeywordsInControlFlowStatements", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBracesUndefined: Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces", js.undefined)
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBracesUndefined: Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces", js.undefined)
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterTypeAssertion(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterTypeAssertion", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterTypeAssertionUndefined: Self = StObject.set(x, "InsertSpaceAfterTypeAssertion", js.undefined)
    
    inline def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = StObject.set(x, "InsertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceBeforeFunctionParenthesis(value: Boolean): Self = StObject.set(x, "InsertSpaceBeforeFunctionParenthesis", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceBeforeFunctionParenthesisUndefined: Self = StObject.set(x, "InsertSpaceBeforeFunctionParenthesis", js.undefined)
    
    inline def setInsertSpaceBeforeTypeAnnotation(value: Boolean): Self = StObject.set(x, "insertSpaceBeforeTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceBeforeTypeAnnotationUndefined: Self = StObject.set(x, "insertSpaceBeforeTypeAnnotation", js.undefined)
    
    inline def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    
    inline def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
  }
}

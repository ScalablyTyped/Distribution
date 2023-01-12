package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatCodeOptions
  extends StObject
     with EditorOptions {
  
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatCodeOptions] (val x: Self) extends AnyVal {
    
    inline def setInsertSpaceAfterCommaDelimiter(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterCommaDelimiter", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterFunctionKeywordForAnonymousFunctions", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterKeywordsInControlFlowStatements", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = StObject.set(x, "InsertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    
    inline def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    
    inline def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
  }
}

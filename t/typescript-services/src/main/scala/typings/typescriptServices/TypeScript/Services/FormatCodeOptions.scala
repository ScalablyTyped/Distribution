package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCodeOptions extends EditorOptions {
  
  var InsertSpaceAfterCommaDelimiter: Boolean = js.native
  
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean = js.native
  
  var InsertSpaceAfterKeywordsInControlFlowStatements: Boolean = js.native
  
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean = js.native
  
  var InsertSpaceAfterSemicolonInForStatements: Boolean = js.native
  
  var InsertSpaceBeforeAndAfterBinaryOperators: Boolean = js.native
  
  var PlaceOpenBraceOnNewLineForControlBlocks: Boolean = js.native
  
  var PlaceOpenBraceOnNewLineForFunctions: Boolean = js.native
}
object FormatCodeOptions {
  
  @scala.inline
  def apply(
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
  implicit class FormatCodeOptionsMutableBuilder[Self <: FormatCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertSpaceAfterCommaDelimiter(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterCommaDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterFunctionKeywordForAnonymousFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterKeywordsInControlFlowStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = StObject.set(x, "InsertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = StObject.set(x, "InsertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = StObject.set(x, "PlaceOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
  }
}

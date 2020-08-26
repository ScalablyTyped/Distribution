package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class FormatCodeOptionsOps[Self <: FormatCodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
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
    def setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = this.set("InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = this.set("InsertSpaceAfterSemicolonInForStatements", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = this.set("InsertSpaceBeforeAndAfterBinaryOperators", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = this.set("PlaceOpenBraceOnNewLineForControlBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = this.set("PlaceOpenBraceOnNewLineForFunctions", value.asInstanceOf[js.Any])
  }
  
}


package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItem extends StObject {
  
  /**
    * An optional array of additional {@link TextEdit text edits} that are applied when
    * selecting this completion. Edits must not overlap (including the same insert position)
    * with the main {@link CompletionItem.textEdit edit} nor with themselves.
    *
    * Additional text edits should be used to change text unrelated to the current cursor position
    * (for example adding an import statement at the top of the file if the completion item will
    * insert an unqualified type).
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  /**
    * An optional {@link Command command} that is executed *after* inserting this completion. *Note* that
    * additional modifications to the current document should be described with the
    * {@link CompletionItem.additionalTextEdits additionalTextEdits}-property.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * An optional set of characters that when pressed while this completion is active will accept it first and
    * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
    * characters will be ignored.
    */
  var commitCharacters: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A data entry field that is preserved on a completion item between a
    * {@link CompletionRequest} and a {@link CompletionResolveRequest}.
    */
  var data: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * Indicates if this item is deprecated.
    * @deprecated Use `tags` instead.
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A human-readable string with additional information
    * about this item, like type or symbol information.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable string that represents a doc-comment.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.undefined
  
  /**
    * A string that should be used when filtering a set of
    * completion items. When `falsy` the {@link CompletionItem.label label}
    * is used.
    */
  var filterText: js.UndefOr[String] = js.undefined
  
  /**
    * A string that should be inserted into a document when selecting
    * this completion. When `falsy` the {@link CompletionItem.label label}
    * is used.
    *
    * The `insertText` is subject to interpretation by the client side.
    * Some tools might not take the string literally. For example
    * VS Code when code complete is requested in this example
    * `con<cursor position>` and a completion item with an `insertText` of
    * `console` is provided it will only insert `sole`. Therefore it is
    * recommended to use `textEdit` instead since it avoids additional client
    * side interpretation.
    */
  var insertText: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the insert text. The format applies to both the
    * `insertText` property and the `newText` property of a provided
    * `textEdit`. If omitted defaults to `InsertTextFormat.PlainText`.
    *
    * Please note that the insertTextFormat doesn't apply to
    * `additionalTextEdits`.
    */
  var insertTextFormat: js.UndefOr[InsertTextFormat] = js.undefined
  
  /**
    * How whitespace and indentation is handled during completion
    * item insertion. If not provided the clients default value depends on
    * the `textDocument.completion.insertTextMode` client capability.
    *
    * @since 3.16.0
    */
  var insertTextMode: js.UndefOr[InsertTextMode] = js.undefined
  
  /**
    * The kind of this completion item. Based of the kind
    * an icon is chosen by the editor.
    */
  var kind: js.UndefOr[CompletionItemKind] = js.undefined
  
  /**
    * The label of this completion item.
    *
    * The label property is also by default the text that
    * is inserted when selecting this completion.
    *
    * If label details are provided the label itself should
    * be an unqualified name of the completion item.
    */
  var label: String
  
  /**
    * Additional details for the label
    *
    * @since 3.17.0
    */
  var labelDetails: js.UndefOr[CompletionItemLabelDetails] = js.undefined
  
  /**
    * Select this item when showing.
    *
    * *Note* that only one completion item can be selected and that the
    * tool / client decides which item that is. The rule is that the *first*
    * item of those that match best is selected.
    */
  var preselect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string that should be used when comparing this item
    * with other items. When `falsy` the {@link CompletionItem.label label}
    * is used.
    */
  var sortText: js.UndefOr[String] = js.undefined
  
  /**
    * Tags for this completion item.
    *
    * @since 3.15.0
    */
  var tags: js.UndefOr[js.Array[CompletionItemTag]] = js.undefined
  
  /**
    * An {@link TextEdit edit} which is applied to a document when selecting
    * this completion. When an edit is provided the value of
    * {@link CompletionItem.insertText insertText} is ignored.
    *
    * Most editors support two different operations when accepting a completion
    * item. One is to insert a completion text and the other is to replace an
    * existing text with a completion text. Since this can usually not be
    * predetermined by a server it can report both ranges. Clients need to
    * signal support for `InsertReplaceEdits` via the
    * `textDocument.completion.insertReplaceSupport` client capability
    * property.
    *
    * *Note 1:* The text edit's range as well as both ranges from an insert
    * replace edit must be a [single line] and they must contain the position
    * at which completion has been requested.
    * *Note 2:* If an `InsertReplaceEdit` is returned the edit's insert range
    * must be a prefix of the edit's replace range, that means it must be
    * contained and starting at the same position.
    *
    * @since 3.16.0 additional type `InsertReplaceEdit`
    */
  var textEdit: js.UndefOr[TextEdit | InsertReplaceEdit] = js.undefined
  
  /**
    * The edit text used if the completion item is part of a CompletionList and
    * CompletionList defines an item default for the text edit range.
    *
    * Clients will only honor this property if they opt into completion list
    * item defaults using the capability `completionList.itemDefaults`.
    *
    * If not provided and a list's default range is provided the label
    * property is used as a text.
    *
    * @since 3.17.0
    */
  var textEditText: js.UndefOr[String] = js.undefined
}
object CompletionItem {
  
  inline def apply(label: String): CompletionItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  
  @JSImport("vscode-languageserver-types", "CompletionItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a completion item and seed it with a label.
    * @param label The completion item's label
    */
  inline def create(label: String): CompletionItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[CompletionItem]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionItem] (val x: Self) extends AnyVal {
    
    inline def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    inline def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value*))
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommitCharacters(value: js.Array[String]): Self = StObject.set(x, "commitCharacters", value.asInstanceOf[js.Any])
    
    inline def setCommitCharactersUndefined: Self = StObject.set(x, "commitCharacters", js.undefined)
    
    inline def setCommitCharactersVarargs(value: String*): Self = StObject.set(x, "commitCharacters", js.Array(value*))
    
    inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDocumentation(value: String | MarkupContent): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    inline def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextFormat(value: InsertTextFormat): Self = StObject.set(x, "insertTextFormat", value.asInstanceOf[js.Any])
    
    inline def setInsertTextFormatUndefined: Self = StObject.set(x, "insertTextFormat", js.undefined)
    
    inline def setInsertTextMode(value: InsertTextMode): Self = StObject.set(x, "insertTextMode", value.asInstanceOf[js.Any])
    
    inline def setInsertTextModeUndefined: Self = StObject.set(x, "insertTextMode", js.undefined)
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setKind(value: CompletionItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDetails(value: CompletionItemLabelDetails): Self = StObject.set(x, "labelDetails", value.asInstanceOf[js.Any])
    
    inline def setLabelDetailsUndefined: Self = StObject.set(x, "labelDetails", js.undefined)
    
    inline def setPreselect(value: Boolean): Self = StObject.set(x, "preselect", value.asInstanceOf[js.Any])
    
    inline def setPreselectUndefined: Self = StObject.set(x, "preselect", js.undefined)
    
    inline def setSortText(value: String): Self = StObject.set(x, "sortText", value.asInstanceOf[js.Any])
    
    inline def setSortTextUndefined: Self = StObject.set(x, "sortText", js.undefined)
    
    inline def setTags(value: js.Array[CompletionItemTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: CompletionItemTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTextEdit(value: TextEdit | InsertReplaceEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    inline def setTextEditText(value: String): Self = StObject.set(x, "textEditText", value.asInstanceOf[js.Any])
    
    inline def setTextEditTextUndefined: Self = StObject.set(x, "textEditText", js.undefined)
    
    inline def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}

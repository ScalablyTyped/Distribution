package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItem extends StObject {
  
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this completion. Edits must not overlap (including the same insert position)
    * with the main [edit](#CompletionItem.textEdit) nor with themselves.
    *
    * Additional text edits should be used to change text unrelated to the current cursor position
    * (for example adding an import statement at the top of the file if the completion item will
    * insert an unqualified type).
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  /**
    * An optional [command](#Command) that is executed *after* inserting this completion. *Note* that
    * additional modifications to the current document should be described with the
    * [additionalTextEdits](#CompletionItem.additionalTextEdits)-property.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * An optional set of characters that when pressed while this completion is active will accept it first and
    * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
    * characters will be ignored.
    */
  var commitCharacters: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An data entry field that is preserved on a completion item between
    * a [CompletionRequest](#CompletionRequest) and a [CompletionResolveRequest]
    * (#CompletionResolveRequest)
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
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
    * completion items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var filterText: js.UndefOr[String] = js.undefined
  
  /**
    * A string that should be inserted into a document when selecting
    * this completion. When `falsy` the [label](#CompletionItem.label)
    * is used.
    *
    * The `insertText` is subject to interpretation by the client side.
    * Some tools might not take the string literally. For example
    * VS Code when code complete is requested in this example `con<cursor position>`
    * and a completion item with an `insertText` of `console` is provided it
    * will only insert `sole`. Therefore it is recommended to use `textEdit` instead
    * since it avoids additional client side interpretation.
    */
  var insertText: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the insert text. The format applies to both the `insertText` property
    * and the `newText` property of a provided `textEdit`. If ommitted defaults to
    * `InsertTextFormat.PlainText`.
    */
  var insertTextFormat: js.UndefOr[InsertTextFormat] = js.undefined
  
  /**
    * The kind of this completion item. Based of the kind
    * an icon is chosen by the editor.
    */
  var kind: js.UndefOr[CompletionItemKind] = js.undefined
  
  /**
    * The label of this completion item. By default
    * also the text that is inserted when selecting
    * this completion.
    */
  var label: String
  
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
    * with other items. When `falsy` the [label](#CompletionItem.label)
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
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this completion. When an edit is provided the value of
    * [insertText](#CompletionItem.insertText) is ignored.
    *
    * *Note:* The text edit's range must be a [single line] and it must contain the position
    * at which completion has been requested.
    */
  var textEdit: js.UndefOr[TextEdit] = js.undefined
}
object CompletionItem {
  
  @scala.inline
  def apply(label: String): CompletionItem = {
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
  @scala.inline
  def create(label: String): CompletionItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[CompletionItem]
  
  @scala.inline
  implicit class CompletionItemMutableBuilder[Self <: CompletionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommitCharacters(value: js.Array[String]): Self = StObject.set(x, "commitCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitCharactersUndefined: Self = StObject.set(x, "commitCharacters", js.undefined)
    
    @scala.inline
    def setCommitCharactersVarargs(value: String*): Self = StObject.set(x, "commitCharacters", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String | MarkupContent): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextFormat(value: InsertTextFormat): Self = StObject.set(x, "insertTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextFormatUndefined: Self = StObject.set(x, "insertTextFormat", js.undefined)
    
    @scala.inline
    def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    @scala.inline
    def setKind(value: CompletionItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselect(value: Boolean): Self = StObject.set(x, "preselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselectUndefined: Self = StObject.set(x, "preselect", js.undefined)
    
    @scala.inline
    def setSortText(value: String): Self = StObject.set(x, "sortText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTextUndefined: Self = StObject.set(x, "sortText", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[CompletionItemTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: CompletionItemTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTextEdit(value: TextEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}

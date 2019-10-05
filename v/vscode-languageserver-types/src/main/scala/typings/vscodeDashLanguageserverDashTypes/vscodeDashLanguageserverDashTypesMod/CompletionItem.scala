package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItem extends js.Object {
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
    *
    * @deprecated Use textEdit instead.
    */
  var insertText: js.UndefOr[String] = js.undefined
  /**
    * The format of the insert text. The format applies to both the `insertText` property
    * and the `newText` property of a provided `textEdit`.
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
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this completion. When an edit is provided the value of
    * [insertText](#CompletionItem.insertText) is ignored.
    *
    * *Note:* The text edit's range must be a [single line] and it must contain the position
    * at which completion has been requested.
    */
  var textEdit: js.UndefOr[TextEdit] = js.undefined
}

@JSImport("vscode-languageserver-types", "CompletionItem")
@js.native
object CompletionItem extends js.Object {
  /**
    * Create a completion item and seed it with a label.
    * @param label The completion item's label
    */
  def create(label: String): CompletionItem = js.native
}


package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditor extends js.Object {
  /**
  		 * The document associated with this text editor. The document will be the same for the entire lifetime of this text editor.
  		 */
  var document: TextDocument = js.native
  /**
  		 * Text editor options.
  		 */
  var options: TextEditorOptions = js.native
  /**
  		 * The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`.
  		 */
  var selection: Selection = js.native
  /**
  		 * The selections in this text editor. The primary selection is always at index 0.
  		 */
  var selections: js.Array[Selection] = js.native
  /**
  		 * The column in which this editor shows. Will be `undefined` in case this
  		 * isn't one of the three main editors, e.g an embedded editor.
  		 */
  var viewColumn: js.UndefOr[ViewColumn] = js.native
  /**
  		 * Perform an edit on the document associated with this text editor.
  		 *
  		 * The given callback-function is invoked with an [edit-builder](#TextEditorEdit) which must
  		 * be used to make edits. Note that the edit-builder is only valid while the
  		 * callback executes.
  		 *
  		 * @param callback A function which can create edits using an [edit-builder](#TextEditorEdit).
  		 * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
  		 * @return A promise that resolves with a value indicating if the edits could be applied.
  		 */
  def edit(callback: js.Function1[/* editBuilder */ TextEditorEdit, scala.Unit]): vscodeLib.Thenable[scala.Boolean] = js.native
  def edit(
    callback: js.Function1[/* editBuilder */ TextEditorEdit, scala.Unit],
    options: vscodeLib.Anon_UndoStopAfter
  ): vscodeLib.Thenable[scala.Boolean] = js.native
  /**
  		 * ~~Hide the text editor.~~
  		 *
  		 * @deprecated Use the command `workbench.action.closeActiveEditor` instead.
  		 * This method shows unexpected behavior and will be removed in the next major update.
  		 */
  def hide(): scala.Unit = js.native
  /**
  		 * Insert a [snippet](#SnippetString) and put the editor into snippet mode. "Snippet mode"
  		 * means the editor adds placeholders and additionals cursors so that the user can complete
  		 * or accept the snippet.
  		 *
  		 * @param snippet The snippet to insert in this edit.
  		 * @param location Position or range at which to insert the snippet, defaults to the current editor selection or selections.
  		 * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
  		 * @return A promise that resolves with a value indicating if the snippet could be inserted. Note that the promise does not signal
  		 * that the snippet is completely filled-in or accepted.
  		 */
  def insertSnippet(snippet: SnippetString): vscodeLib.Thenable[scala.Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: js.Array[Position | Range]): vscodeLib.Thenable[scala.Boolean] = js.native
  def insertSnippet(
    snippet: SnippetString,
    location: js.Array[Position | Range],
    options: vscodeLib.Anon_UndoStopAfter
  ): vscodeLib.Thenable[scala.Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: Position): vscodeLib.Thenable[scala.Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: Position, options: vscodeLib.Anon_UndoStopAfter): vscodeLib.Thenable[scala.Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: Range): vscodeLib.Thenable[scala.Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: Range, options: vscodeLib.Anon_UndoStopAfter): vscodeLib.Thenable[scala.Boolean] = js.native
  /**
  		 * Scroll as indicated by `revealType` in order to reveal the given range.
  		 *
  		 * @param range A range.
  		 * @param revealType The scrolling strategy for revealing `range`.
  		 */
  def revealRange(range: Range): scala.Unit = js.native
  def revealRange(range: Range, revealType: TextEditorRevealType): scala.Unit = js.native
  /**
  		 * Adds a set of decorations to the text editor. If a set of decorations already exists with
  		 * the given [decoration type](#TextEditorDecorationType), they will be replaced.
  		 *
  		 * @see [createTextEditorDecorationType](#window.createTextEditorDecorationType).
  		 *
  		 * @param decorationType A decoration type.
  		 * @param rangesOrOptions Either [ranges](#Range) or more detailed [options](#DecorationOptions).
  		 */
  def setDecorations(decorationType: TextEditorDecorationType, rangesOrOptions: js.Array[DecorationOptions | Range]): scala.Unit = js.native
  /**
  		 * ~~Show the text editor.~~
  		 *
  		 * @deprecated Use [window.showTextDocument](#window.showTextDocument)
  		 *
  		 * @param column The [column](#ViewColumn) in which to show this editor.
  		 * instead. This method shows unexpected behavior and will be removed in the next major update.
  		 */
  def show(): scala.Unit = js.native
  def show(column: ViewColumn): scala.Unit = js.native
}


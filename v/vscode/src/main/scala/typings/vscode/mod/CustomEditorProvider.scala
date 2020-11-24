package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEditorProvider[T /* <: CustomDocument */] extends CustomReadonlyEditorProvider[T] {
  
  /**
    * Back up a dirty custom document.
    *
    * Backups are used for hot exit and to prevent data loss. Your `backup` method should persist the resource in
    * its current state, i.e. with the edits applied. Most commonly this means saving the resource to disk in
    * the `ExtensionContext.storagePath`. When VS Code reloads and your custom editor is opened for a resource,
    * your extension should first check to see if any backups exist for the resource. If there is a backup, your
    * extension should load the file contents from there instead of from the resource in the workspace.
    *
    * `backup` is triggered approximately one second after the the user stops editing the document. If the user
    * rapidly edits the document, `backup` will not be invoked until the editing stops.
    *
    * `backup` is not invoked when `auto save` is enabled (since auto save already persists the resource).
    *
    * @param document Document to backup.
    * @param context Information that can be used to backup the document.
    * @param cancellation Token that signals the current backup since a new backup is coming in. It is up to your
    * extension to decided how to respond to cancellation. If for example your extension is backing up a large file
    * in an operation that takes time to complete, your extension may decide to finish the ongoing backup rather
    * than cancelling it to ensure that VS Code has some valid backup.
    */
  def backupCustomDocument(document: T, context: CustomDocumentBackupContext, cancellation: CancellationToken): Thenable[CustomDocumentBackup] = js.native
  
  /**
    * Signal that an edit has occurred inside a custom editor.
    *
    * This event must be fired by your extension whenever an edit happens in a custom editor. An edit can be
    * anything from changing some text, to cropping an image, to reordering a list. Your extension is free to
    * define what an edit is and what data is stored on each edit.
    *
    * Firing `onDidChange` causes VS Code to mark the editors as being dirty. This is cleared when the user either
    * saves or reverts the file.
    *
    * Editors that support undo/redo must fire a `CustomDocumentEditEvent` whenever an edit happens. This allows
    * users to undo and redo the edit using VS Code's standard VS Code keyboard shortcuts. VS Code will also mark
    * the editor as no longer being dirty if the user undoes all edits to the last saved state.
    *
    * Editors that support editing but cannot use VS Code's standard undo/redo mechanism must fire a `CustomDocumentContentChangeEvent`.
    * The only way for a user to clear the dirty state of an editor that does not support undo/redo is to either
    * `save` or `revert` the file.
    *
    * An editor should only ever fire `CustomDocumentEditEvent` events, or only ever fire `CustomDocumentContentChangeEvent` events.
    */
  val onDidChangeCustomDocument: Event[CustomDocumentContentChangeEvent[T] | CustomDocumentEditEvent[T]] = js.native
  
  /**
    * Revert a custom document to its last saved state.
    *
    * This method is invoked by VS Code when the user triggers `File: Revert File` in a custom editor. (Note that
    * this is only used using VS Code's `File: Revert File` command and not on a `git revert` of the file).
    *
    * To implement `revert`, the implementer must make sure all editor instances (webviews) for `document`
    * are displaying the document in the same state is saved in. This usually means reloading the file from the
    * workspace.
    *
    * @param document Document to revert.
    * @param cancellation Token that signals the revert is no longer required.
    *
    * @return Thenable signaling that the change has completed.
    */
  def revertCustomDocument(document: T, cancellation: CancellationToken): Thenable[Unit] = js.native
  
  /**
    * Save a custom document.
    *
    * This method is invoked by VS Code when the user saves a custom editor. This can happen when the user
    * triggers save while the custom editor is active, by commands such as `save all`, or by auto save if enabled.
    *
    * To implement `save`, the implementer must persist the custom editor. This usually means writing the
    * file data for the custom document to disk. After `save` completes, any associated editor instances will
    * no longer be marked as dirty.
    *
    * @param document Document to save.
    * @param cancellation Token that signals the save is no longer required (for example, if another save was triggered).
    *
    * @return Thenable signaling that saving has completed.
    */
  def saveCustomDocument(document: T, cancellation: CancellationToken): Thenable[Unit] = js.native
  
  /**
    * Save a custom document to a different location.
    *
    * This method is invoked by VS Code when the user triggers 'save as' on a custom editor. The implementer must
    * persist the custom editor to `destination`.
    *
    * When the user accepts save as, the current editor is be replaced by an non-dirty editor for the newly saved file.
    *
    * @param document Document to save.
    * @param destination Location to save to.
    * @param cancellation Token that signals the save is no longer required.
    *
    * @return Thenable signaling that saving has completed.
    */
  def saveCustomDocumentAs(document: T, destination: Uri, cancellation: CancellationToken): Thenable[Unit] = js.native
}
object CustomEditorProvider {
  
  @scala.inline
  def apply[T /* <: CustomDocument */](
    backupCustomDocument: (T, CustomDocumentBackupContext, CancellationToken) => Thenable[CustomDocumentBackup],
    onDidChangeCustomDocument: (/* listener */ js.Function1[CustomDocumentContentChangeEvent[T] | CustomDocumentEditEvent[T], js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
    openCustomDocument: (Uri, CustomDocumentOpenContext, CancellationToken) => Thenable[T] | T,
    resolveCustomEditor: (T, WebviewPanel, CancellationToken) => Thenable[Unit] | Unit,
    revertCustomDocument: (T, CancellationToken) => Thenable[Unit],
    saveCustomDocument: (T, CancellationToken) => Thenable[Unit],
    saveCustomDocumentAs: (T, Uri, CancellationToken) => Thenable[Unit]
  ): CustomEditorProvider[T] = {
    val __obj = js.Dynamic.literal(backupCustomDocument = js.Any.fromFunction3(backupCustomDocument), onDidChangeCustomDocument = js.Any.fromFunction3(onDidChangeCustomDocument), openCustomDocument = js.Any.fromFunction3(openCustomDocument), resolveCustomEditor = js.Any.fromFunction3(resolveCustomEditor), revertCustomDocument = js.Any.fromFunction2(revertCustomDocument), saveCustomDocument = js.Any.fromFunction2(saveCustomDocument), saveCustomDocumentAs = js.Any.fromFunction3(saveCustomDocumentAs))
    __obj.asInstanceOf[CustomEditorProvider[T]]
  }
  
  @scala.inline
  implicit class CustomEditorProviderOps[Self <: CustomEditorProvider[_], T /* <: CustomDocument */] (val x: Self with CustomEditorProvider[T]) extends AnyVal {
    
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
    def setBackupCustomDocument(value: (T, CustomDocumentBackupContext, CancellationToken) => Thenable[CustomDocumentBackup]): Self = this.set("backupCustomDocument", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnDidChangeCustomDocument(
      value: (/* listener */ js.Function1[CustomDocumentContentChangeEvent[T] | CustomDocumentEditEvent[T], js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = this.set("onDidChangeCustomDocument", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRevertCustomDocument(value: (T, CancellationToken) => Thenable[Unit]): Self = this.set("revertCustomDocument", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSaveCustomDocument(value: (T, CancellationToken) => Thenable[Unit]): Self = this.set("saveCustomDocument", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSaveCustomDocumentAs(value: (T, Uri, CancellationToken) => Thenable[Unit]): Self = this.set("saveCustomDocumentAs", js.Any.fromFunction3(value))
  }
}

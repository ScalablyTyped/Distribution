package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "WorkspaceChange")
@js.native
class WorkspaceChange () extends js.Object {
  def this(workspaceEdit: WorkspaceEdit) = this()
  var _textEditChanges: js.Any = js.native
  var _workspaceEdit: js.Any = js.native
  var checkDocumentChanges: js.Any = js.native
  def createFile(uri: DocumentUri): Unit = js.native
  def createFile(uri: DocumentUri, options: CreateFileOptions): Unit = js.native
  def deleteFile(uri: DocumentUri): Unit = js.native
  def deleteFile(uri: DocumentUri, options: DeleteFileOptions): Unit = js.native
  /**
    * Returns the underlying [WorkspaceEdit](#WorkspaceEdit) literal
    * use to be returned from a workspace edit operation like rename.
    */
  def edit: WorkspaceEdit = js.native
  /**
    * Returns the [TextEditChange](#TextEditChange) to manage text edits
    * for resources.
    */
  def getTextEditChange(textDocument: VersionedTextDocumentIdentifier): TextEditChange = js.native
  def getTextEditChange(uri: DocumentUri): TextEditChange = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri): Unit = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): Unit = js.native
}


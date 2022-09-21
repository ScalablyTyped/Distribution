package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-types", "WorkspaceChange")
@js.native
open class WorkspaceChange () extends StObject {
  def this(workspaceEdit: WorkspaceEdit) = this()
  
  /* private */ var _changeAnnotations: Any = js.native
  
  /* private */ var _textEditChanges: Any = js.native
  
  /* private */ var _workspaceEdit: Any = js.native
  
  def createFile(uri: DocumentUri): Unit = js.native
  def createFile(uri: DocumentUri, annotation: ChangeAnnotation): ChangeAnnotationIdentifier = js.native
  def createFile(uri: DocumentUri, annotation: ChangeAnnotationIdentifier): ChangeAnnotationIdentifier = js.native
  def createFile(uri: DocumentUri, annotation: ChangeAnnotationIdentifier, options: CreateFileOptions): ChangeAnnotationIdentifier = js.native
  def createFile(uri: DocumentUri, annotation: ChangeAnnotation, options: CreateFileOptions): ChangeAnnotationIdentifier = js.native
  def createFile(uri: DocumentUri, options: CreateFileOptions): Unit = js.native
  
  def deleteFile(uri: DocumentUri): Unit = js.native
  def deleteFile(uri: DocumentUri, annotation: ChangeAnnotation): ChangeAnnotationIdentifier = js.native
  def deleteFile(uri: DocumentUri, annotation: ChangeAnnotationIdentifier): ChangeAnnotationIdentifier = js.native
  def deleteFile(uri: DocumentUri, annotation: ChangeAnnotationIdentifier, options: DeleteFileOptions): ChangeAnnotationIdentifier = js.native
  def deleteFile(uri: DocumentUri, annotation: ChangeAnnotation, options: DeleteFileOptions): ChangeAnnotationIdentifier = js.native
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
  def getTextEditChange(textDocument: OptionalVersionedTextDocumentIdentifier): TextEditChange = js.native
  def getTextEditChange(uri: DocumentUri): TextEditChange = js.native
  
  /* private */ var initChanges: Any = js.native
  
  /* private */ var initDocumentChanges: Any = js.native
  
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri): ChangeAnnotationIdentifier = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri, annotation: Unit, options: RenameFileOptions): ChangeAnnotationIdentifier = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri, annotation: ChangeAnnotation): ChangeAnnotationIdentifier = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri, annotation: ChangeAnnotationIdentifier): ChangeAnnotationIdentifier = js.native
  def renameFile(
    oldUri: DocumentUri,
    newUri: DocumentUri,
    annotation: ChangeAnnotationIdentifier,
    options: RenameFileOptions
  ): ChangeAnnotationIdentifier = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri, annotation: ChangeAnnotation, options: RenameFileOptions): ChangeAnnotationIdentifier = js.native
  def renameFile(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): Unit = js.native
  @JSName("renameFile")
  def renameFile_Unit(oldUri: DocumentUri, newUri: DocumentUri): Unit = js.native
}

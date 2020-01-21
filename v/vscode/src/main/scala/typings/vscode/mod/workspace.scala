package typings.vscode.mod

import typings.vscode.AnonContent
import typings.vscode.AnonIsCaseSensitive
import typings.vscode.AnonName
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "workspace")
@js.native
object workspace extends js.Object {
  val fs: FileSystem = js.native
  val name: js.UndefOr[String] = js.native
  val onDidChangeConfiguration: Event[ConfigurationChangeEvent] = js.native
  val onDidChangeTextDocument: Event[TextDocumentChangeEvent] = js.native
  val onDidChangeWorkspaceFolders: Event[WorkspaceFoldersChangeEvent] = js.native
  val onDidCloseTextDocument: Event[TextDocument] = js.native
  val onDidCreateFiles: Event[FileCreateEvent] = js.native
  val onDidDeleteFiles: Event[FileDeleteEvent] = js.native
  val onDidOpenTextDocument: Event[TextDocument] = js.native
  val onDidRenameFiles: Event[FileRenameEvent] = js.native
  val onDidSaveTextDocument: Event[TextDocument] = js.native
  val onWillCreateFiles: Event[FileWillCreateEvent] = js.native
  val onWillDeleteFiles: Event[FileWillDeleteEvent] = js.native
  val onWillRenameFiles: Event[FileWillRenameEvent] = js.native
  val onWillSaveTextDocument: Event[TextDocumentWillSaveEvent] = js.native
  val rootPath: js.UndefOr[String] = js.native
  val textDocuments: js.Array[TextDocument] = js.native
  val workspaceFile: js.UndefOr[Uri] = js.native
  val workspaceFolders: js.UndefOr[js.Array[WorkspaceFolder]] = js.native
  def applyEdit(edit: WorkspaceEdit): Thenable[Boolean] = js.native
  def asRelativePath(pathOrUri: String): String = js.native
  def asRelativePath(pathOrUri: String, includeWorkspaceFolder: Boolean): String = js.native
  def asRelativePath(pathOrUri: Uri): String = js.native
  def asRelativePath(pathOrUri: Uri, includeWorkspaceFolder: Boolean): String = js.native
  def createFileSystemWatcher(globPattern: GlobPattern): FileSystemWatcher = js.native
  def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean): FileSystemWatcher = js.native
  def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean, ignoreChangeEvents: Boolean): FileSystemWatcher = js.native
  def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Boolean,
    ignoreChangeEvents: Boolean,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = js.native
  def findFiles(include: GlobPattern): Thenable[js.Array[Uri]] = js.native
  def findFiles(include: GlobPattern, exclude: Null, maxResults: Double): Thenable[js.Array[Uri]] = js.native
  def findFiles(include: GlobPattern, exclude: Null, maxResults: Double, token: CancellationToken): Thenable[js.Array[Uri]] = js.native
  def findFiles(include: GlobPattern, exclude: GlobPattern): Thenable[js.Array[Uri]] = js.native
  def findFiles(include: GlobPattern, exclude: GlobPattern, maxResults: Double): Thenable[js.Array[Uri]] = js.native
  def findFiles(include: GlobPattern, exclude: GlobPattern, maxResults: Double, token: CancellationToken): Thenable[js.Array[Uri]] = js.native
  def getConfiguration(): WorkspaceConfiguration = js.native
  def getConfiguration(section: String): WorkspaceConfiguration = js.native
  def getConfiguration(section: String, resource: Uri): WorkspaceConfiguration = js.native
  def getWorkspaceFolder(uri: Uri): js.UndefOr[WorkspaceFolder] = js.native
  def openTextDocument(): Thenable[TextDocument] = js.native
  def openTextDocument(fileName: String): Thenable[TextDocument] = js.native
  def openTextDocument(options: AnonContent): Thenable[TextDocument] = js.native
  def openTextDocument(uri: Uri): Thenable[TextDocument] = js.native
  def registerFileSystemProvider(scheme: String, provider: FileSystemProvider): Disposable = js.native
  def registerFileSystemProvider(scheme: String, provider: FileSystemProvider, options: AnonIsCaseSensitive): Disposable = js.native
  def registerTaskProvider(`type`: String, provider: TaskProvider): Disposable = js.native
  def registerTextDocumentContentProvider(scheme: String, provider: TextDocumentContentProvider): Disposable = js.native
  def saveAll(): Thenable[Boolean] = js.native
  def saveAll(includeUntitled: Boolean): Thenable[Boolean] = js.native
  def updateWorkspaceFolders(start: Double, deleteCount: Double, workspaceFoldersToAdd: AnonName*): Boolean = js.native
  def updateWorkspaceFolders(start: Double, workspaceFoldersToAdd: AnonName*): Boolean = js.native
}


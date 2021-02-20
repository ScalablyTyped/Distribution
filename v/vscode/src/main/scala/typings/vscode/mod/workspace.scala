package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Content
import typings.vscode.anon.IsCaseSensitive
import typings.vscode.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspace {
  
  @JSImport("vscode", "workspace.applyEdit")
  @js.native
  def applyEdit(edit: WorkspaceEdit): Thenable[Boolean] = js.native
  
  @JSImport("vscode", "workspace.asRelativePath")
  @js.native
  def asRelativePath(pathOrUri: String): String = js.native
  @JSImport("vscode", "workspace.asRelativePath")
  @js.native
  def asRelativePath(pathOrUri: String, includeWorkspaceFolder: Boolean): String = js.native
  @JSImport("vscode", "workspace.asRelativePath")
  @js.native
  def asRelativePath(pathOrUri: Uri): String = js.native
  @JSImport("vscode", "workspace.asRelativePath")
  @js.native
  def asRelativePath(pathOrUri: Uri, includeWorkspaceFolder: Boolean): String = js.native
  
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(globPattern: GlobPattern): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: js.UndefOr[scala.Nothing],
    ignoreChangeEvents: js.UndefOr[scala.Nothing],
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: js.UndefOr[scala.Nothing],
    ignoreChangeEvents: Boolean
  ): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: js.UndefOr[scala.Nothing],
    ignoreChangeEvents: Boolean,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Boolean,
    ignoreChangeEvents: js.UndefOr[scala.Nothing],
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean, ignoreChangeEvents: Boolean): FileSystemWatcher = js.native
  @JSImport("vscode", "workspace.createFileSystemWatcher")
  @js.native
  def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Boolean,
    ignoreChangeEvents: Boolean,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = js.native
  
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(include: GlobPattern): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(
    include: GlobPattern,
    exclude: js.UndefOr[GlobPattern],
    maxResults: js.UndefOr[scala.Nothing],
    token: CancellationToken
  ): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(include: GlobPattern, exclude: js.UndefOr[GlobPattern], maxResults: Double): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(
    include: GlobPattern,
    exclude: js.UndefOr[GlobPattern],
    maxResults: Double,
    token: CancellationToken
  ): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(
    include: GlobPattern,
    exclude: Null,
    maxResults: js.UndefOr[scala.Nothing],
    token: CancellationToken
  ): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(include: GlobPattern, exclude: Null, maxResults: Double): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(include: GlobPattern, exclude: Null, maxResults: Double, token: CancellationToken): Thenable[js.Array[Uri]] = js.native
  @JSImport("vscode", "workspace.findFiles")
  @js.native
  def findFiles(include: GlobPattern, exclude: GlobPattern): Thenable[js.Array[Uri]] = js.native
  
  @JSImport("vscode", "workspace.fs")
  @js.native
  val fs: FileSystem = js.native
  
  @JSImport("vscode", "workspace.getConfiguration")
  @js.native
  def getConfiguration(): WorkspaceConfiguration = js.native
  @JSImport("vscode", "workspace.getConfiguration")
  @js.native
  def getConfiguration(section: js.UndefOr[scala.Nothing], scope: ConfigurationScope): WorkspaceConfiguration = js.native
  @JSImport("vscode", "workspace.getConfiguration")
  @js.native
  def getConfiguration(section: String): WorkspaceConfiguration = js.native
  @JSImport("vscode", "workspace.getConfiguration")
  @js.native
  def getConfiguration(section: String, scope: ConfigurationScope): WorkspaceConfiguration = js.native
  
  @JSImport("vscode", "workspace.getWorkspaceFolder")
  @js.native
  def getWorkspaceFolder(uri: Uri): js.UndefOr[WorkspaceFolder] = js.native
  
  @JSImport("vscode", "workspace.name")
  @js.native
  val name: js.UndefOr[String] = js.native
  
  @JSImport("vscode", "workspace.onDidChangeConfiguration")
  @js.native
  val onDidChangeConfiguration: Event[ConfigurationChangeEvent] = js.native
  
  @JSImport("vscode", "workspace.onDidChangeTextDocument")
  @js.native
  val onDidChangeTextDocument: Event[TextDocumentChangeEvent] = js.native
  
  @JSImport("vscode", "workspace.onDidChangeWorkspaceFolders")
  @js.native
  val onDidChangeWorkspaceFolders: Event[WorkspaceFoldersChangeEvent] = js.native
  
  @JSImport("vscode", "workspace.onDidCloseTextDocument")
  @js.native
  val onDidCloseTextDocument: Event[TextDocument] = js.native
  
  @JSImport("vscode", "workspace.onDidCreateFiles")
  @js.native
  val onDidCreateFiles: Event[FileCreateEvent] = js.native
  
  @JSImport("vscode", "workspace.onDidDeleteFiles")
  @js.native
  val onDidDeleteFiles: Event[FileDeleteEvent] = js.native
  
  @JSImport("vscode", "workspace.onDidOpenTextDocument")
  @js.native
  val onDidOpenTextDocument: Event[TextDocument] = js.native
  
  @JSImport("vscode", "workspace.onDidRenameFiles")
  @js.native
  val onDidRenameFiles: Event[FileRenameEvent] = js.native
  
  @JSImport("vscode", "workspace.onDidSaveTextDocument")
  @js.native
  val onDidSaveTextDocument: Event[TextDocument] = js.native
  
  @JSImport("vscode", "workspace.onWillCreateFiles")
  @js.native
  val onWillCreateFiles: Event[FileWillCreateEvent] = js.native
  
  @JSImport("vscode", "workspace.onWillDeleteFiles")
  @js.native
  val onWillDeleteFiles: Event[FileWillDeleteEvent] = js.native
  
  @JSImport("vscode", "workspace.onWillRenameFiles")
  @js.native
  val onWillRenameFiles: Event[FileWillRenameEvent] = js.native
  
  @JSImport("vscode", "workspace.onWillSaveTextDocument")
  @js.native
  val onWillSaveTextDocument: Event[TextDocumentWillSaveEvent] = js.native
  
  @JSImport("vscode", "workspace.openTextDocument")
  @js.native
  def openTextDocument(): Thenable[TextDocument] = js.native
  @JSImport("vscode", "workspace.openTextDocument")
  @js.native
  def openTextDocument(fileName: String): Thenable[TextDocument] = js.native
  @JSImport("vscode", "workspace.openTextDocument")
  @js.native
  def openTextDocument(options: Content): Thenable[TextDocument] = js.native
  @JSImport("vscode", "workspace.openTextDocument")
  @js.native
  def openTextDocument(uri: Uri): Thenable[TextDocument] = js.native
  
  @JSImport("vscode", "workspace.registerFileSystemProvider")
  @js.native
  def registerFileSystemProvider(scheme: String, provider: FileSystemProvider): Disposable = js.native
  @JSImport("vscode", "workspace.registerFileSystemProvider")
  @js.native
  def registerFileSystemProvider(scheme: String, provider: FileSystemProvider, options: IsCaseSensitive): Disposable = js.native
  
  @JSImport("vscode", "workspace.registerTaskProvider")
  @js.native
  def registerTaskProvider(`type`: String, provider: TaskProvider[Task]): Disposable = js.native
  
  @JSImport("vscode", "workspace.registerTextDocumentContentProvider")
  @js.native
  def registerTextDocumentContentProvider(scheme: String, provider: TextDocumentContentProvider): Disposable = js.native
  
  @JSImport("vscode", "workspace.rootPath")
  @js.native
  val rootPath: js.UndefOr[String] = js.native
  
  @JSImport("vscode", "workspace.saveAll")
  @js.native
  def saveAll(): Thenable[Boolean] = js.native
  @JSImport("vscode", "workspace.saveAll")
  @js.native
  def saveAll(includeUntitled: Boolean): Thenable[Boolean] = js.native
  
  @JSImport("vscode", "workspace.textDocuments")
  @js.native
  val textDocuments: js.Array[TextDocument] = js.native
  
  @JSImport("vscode", "workspace.updateWorkspaceFolders")
  @js.native
  def updateWorkspaceFolders(start: Double, deleteCount: js.UndefOr[scala.Nothing], workspaceFoldersToAdd: Name*): Boolean = js.native
  @JSImport("vscode", "workspace.updateWorkspaceFolders")
  @js.native
  def updateWorkspaceFolders(start: Double, deleteCount: Double, workspaceFoldersToAdd: Name*): Boolean = js.native
  @JSImport("vscode", "workspace.updateWorkspaceFolders")
  @js.native
  def updateWorkspaceFolders(start: Double, deleteCount: Null, workspaceFoldersToAdd: Name*): Boolean = js.native
  
  @JSImport("vscode", "workspace.workspaceFile")
  @js.native
  val workspaceFile: js.UndefOr[Uri] = js.native
  
  @JSImport("vscode", "workspace.workspaceFolders")
  @js.native
  val workspaceFolders: js.UndefOr[js.Array[WorkspaceFolder]] = js.native
}

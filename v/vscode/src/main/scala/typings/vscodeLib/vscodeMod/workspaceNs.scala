package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "workspace")
@js.native
object workspaceNs extends js.Object {
  val onDidChangeConfiguration: vscodeLib.vscodeMod.Event[scala.Unit] = js.native
  val onDidChangeTextDocument: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextDocumentChangeEvent] = js.native
  val onDidChangeWorkspaceFolders: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.WorkspaceFoldersChangeEvent] = js.native
  val onDidCloseTextDocument: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextDocument] = js.native
  val onDidOpenTextDocument: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextDocument] = js.native
  val onDidSaveTextDocument: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextDocument] = js.native
  val onWillSaveTextDocument: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextDocumentWillSaveEvent] = js.native
  var rootPath: js.UndefOr[java.lang.String] = js.native
  var textDocuments: js.Array[vscodeLib.vscodeMod.TextDocument] = js.native
  var workspaceFolders: js.UndefOr[js.Array[vscodeLib.vscodeMod.WorkspaceFolder]] = js.native
  def applyEdit(edit: vscodeLib.vscodeMod.WorkspaceEdit): vscodeLib.Thenable[scala.Boolean] = js.native
  def asRelativePath(pathOrUri: java.lang.String): java.lang.String = js.native
  def asRelativePath(pathOrUri: java.lang.String, includeWorkspaceFolder: scala.Boolean): java.lang.String = js.native
  def asRelativePath(pathOrUri: vscodeLib.vscodeMod.Uri): java.lang.String = js.native
  def asRelativePath(pathOrUri: vscodeLib.vscodeMod.Uri, includeWorkspaceFolder: scala.Boolean): java.lang.String = js.native
  def createFileSystemWatcher(globPattern: vscodeLib.vscodeMod.GlobPattern): vscodeLib.vscodeMod.FileSystemWatcher = js.native
  def createFileSystemWatcher(globPattern: vscodeLib.vscodeMod.GlobPattern, ignoreCreateEvents: scala.Boolean): vscodeLib.vscodeMod.FileSystemWatcher = js.native
  def createFileSystemWatcher(
    globPattern: vscodeLib.vscodeMod.GlobPattern,
    ignoreCreateEvents: scala.Boolean,
    ignoreChangeEvents: scala.Boolean
  ): vscodeLib.vscodeMod.FileSystemWatcher = js.native
  def createFileSystemWatcher(
    globPattern: vscodeLib.vscodeMod.GlobPattern,
    ignoreCreateEvents: scala.Boolean,
    ignoreChangeEvents: scala.Boolean,
    ignoreDeleteEvents: scala.Boolean
  ): vscodeLib.vscodeMod.FileSystemWatcher = js.native
  def findFiles(include: vscodeLib.vscodeMod.GlobPattern): vscodeLib.Thenable[js.Array[vscodeLib.vscodeMod.Uri]] = js.native
  def findFiles(include: vscodeLib.vscodeMod.GlobPattern, exclude: vscodeLib.vscodeMod.GlobPattern): vscodeLib.Thenable[js.Array[vscodeLib.vscodeMod.Uri]] = js.native
  def findFiles(
    include: vscodeLib.vscodeMod.GlobPattern,
    exclude: vscodeLib.vscodeMod.GlobPattern,
    maxResults: scala.Double
  ): vscodeLib.Thenable[js.Array[vscodeLib.vscodeMod.Uri]] = js.native
  def findFiles(
    include: vscodeLib.vscodeMod.GlobPattern,
    exclude: vscodeLib.vscodeMod.GlobPattern,
    maxResults: scala.Double,
    token: vscodeLib.vscodeMod.CancellationToken
  ): vscodeLib.Thenable[js.Array[vscodeLib.vscodeMod.Uri]] = js.native
  def getConfiguration(): vscodeLib.vscodeMod.WorkspaceConfiguration = js.native
  def getConfiguration(section: java.lang.String): vscodeLib.vscodeMod.WorkspaceConfiguration = js.native
  def getConfiguration(section: java.lang.String, resource: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.WorkspaceConfiguration = js.native
  def getWorkspaceFolder(uri: vscodeLib.vscodeMod.Uri): js.UndefOr[vscodeLib.vscodeMod.WorkspaceFolder] = js.native
  def openTextDocument(): vscodeLib.Thenable[vscodeLib.vscodeMod.TextDocument] = js.native
  def openTextDocument(fileName: java.lang.String): vscodeLib.Thenable[vscodeLib.vscodeMod.TextDocument] = js.native
  def openTextDocument(options: vscodeLib.Anon_Content): vscodeLib.Thenable[vscodeLib.vscodeMod.TextDocument] = js.native
  def openTextDocument(uri: vscodeLib.vscodeMod.Uri): vscodeLib.Thenable[vscodeLib.vscodeMod.TextDocument] = js.native
  def registerTaskProvider(`type`: java.lang.String, provider: vscodeLib.vscodeMod.TaskProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerTextDocumentContentProvider(scheme: java.lang.String, provider: vscodeLib.vscodeMod.TextDocumentContentProvider): vscodeLib.vscodeMod.Disposable = js.native
  def saveAll(): vscodeLib.Thenable[scala.Boolean] = js.native
  def saveAll(includeUntitled: scala.Boolean): vscodeLib.Thenable[scala.Boolean] = js.native
}


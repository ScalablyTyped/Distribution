package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "window")
@js.native
object windowNs extends js.Object {
  val activeTerminal: js.UndefOr[vscodeLib.vscodeMod.Terminal] = js.native
  var activeTextEditor: js.UndefOr[vscodeLib.vscodeMod.TextEditor] = js.native
  val onDidChangeActiveTerminal: vscodeLib.vscodeMod.Event[js.UndefOr[vscodeLib.vscodeMod.Terminal]] = js.native
  val onDidChangeActiveTextEditor: vscodeLib.vscodeMod.Event[js.UndefOr[vscodeLib.vscodeMod.TextEditor]] = js.native
  val onDidChangeTextEditorOptions: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextEditorOptionsChangeEvent] = js.native
  val onDidChangeTextEditorSelection: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextEditorSelectionChangeEvent] = js.native
  val onDidChangeTextEditorViewColumn: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextEditorViewColumnChangeEvent] = js.native
  val onDidChangeTextEditorVisibleRanges: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TextEditorVisibleRangesChangeEvent] = js.native
  val onDidChangeVisibleTextEditors: vscodeLib.vscodeMod.Event[js.Array[vscodeLib.vscodeMod.TextEditor]] = js.native
  val onDidChangeWindowState: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.WindowState] = js.native
  val onDidCloseTerminal: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.Terminal] = js.native
  val onDidOpenTerminal: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.Terminal] = js.native
  val state: vscodeLib.vscodeMod.WindowState = js.native
  val terminals: js.Array[vscodeLib.vscodeMod.Terminal] = js.native
  var visibleTextEditors: js.Array[vscodeLib.vscodeMod.TextEditor] = js.native
  def createInputBox(): vscodeLib.vscodeMod.InputBox = js.native
  def createOutputChannel(name: java.lang.String): vscodeLib.vscodeMod.OutputChannel = js.native
  def createQuickPick[T /* <: vscodeLib.vscodeMod.QuickPickItem */](): vscodeLib.vscodeMod.QuickPick[T] = js.native
  def createStatusBarItem(): vscodeLib.vscodeMod.StatusBarItem = js.native
  def createStatusBarItem(alignment: vscodeLib.vscodeMod.StatusBarAlignment): vscodeLib.vscodeMod.StatusBarItem = js.native
  def createStatusBarItem(alignment: vscodeLib.vscodeMod.StatusBarAlignment, priority: scala.Double): vscodeLib.vscodeMod.StatusBarItem = js.native
  def createTerminal(): vscodeLib.vscodeMod.Terminal = js.native
  def createTerminal(name: java.lang.String): vscodeLib.vscodeMod.Terminal = js.native
  def createTerminal(name: java.lang.String, shellPath: java.lang.String): vscodeLib.vscodeMod.Terminal = js.native
  def createTerminal(name: java.lang.String, shellPath: java.lang.String, shellArgs: js.Array[java.lang.String]): vscodeLib.vscodeMod.Terminal = js.native
  def createTerminal(options: vscodeLib.vscodeMod.TerminalOptions): vscodeLib.vscodeMod.Terminal = js.native
  def createTextEditorDecorationType(options: vscodeLib.vscodeMod.DecorationRenderOptions): vscodeLib.vscodeMod.TextEditorDecorationType = js.native
  def createTreeView[T](viewId: java.lang.String, options: vscodeLib.vscodeMod.TreeViewOptions[T]): vscodeLib.vscodeMod.TreeView[T] = js.native
  def createWebviewPanel(viewType: java.lang.String, title: java.lang.String, showOptions: vscodeLib.Anon_PreserveFocus): vscodeLib.vscodeMod.WebviewPanel = js.native
  def createWebviewPanel(
    viewType: java.lang.String,
    title: java.lang.String,
    showOptions: vscodeLib.Anon_PreserveFocus,
    options: vscodeLib.vscodeMod.WebviewPanelOptions with vscodeLib.vscodeMod.WebviewOptions
  ): vscodeLib.vscodeMod.WebviewPanel = js.native
  def createWebviewPanel(viewType: java.lang.String, title: java.lang.String, showOptions: vscodeLib.vscodeMod.ViewColumn): vscodeLib.vscodeMod.WebviewPanel = js.native
  def createWebviewPanel(
    viewType: java.lang.String,
    title: java.lang.String,
    showOptions: vscodeLib.vscodeMod.ViewColumn,
    options: vscodeLib.vscodeMod.WebviewPanelOptions with vscodeLib.vscodeMod.WebviewOptions
  ): vscodeLib.vscodeMod.WebviewPanel = js.native
  def registerTreeDataProvider[T](viewId: java.lang.String, treeDataProvider: vscodeLib.vscodeMod.TreeDataProvider[T]): vscodeLib.vscodeMod.Disposable = js.native
  def registerUriHandler(handler: vscodeLib.vscodeMod.UriHandler): vscodeLib.vscodeMod.Disposable = js.native
  def registerWebviewPanelSerializer(viewType: java.lang.String, serializer: vscodeLib.vscodeMod.WebviewPanelSerializer): vscodeLib.vscodeMod.Disposable = js.native
  def setStatusBarMessage(text: java.lang.String): vscodeLib.vscodeMod.Disposable = js.native
  def setStatusBarMessage(text: java.lang.String, hideAfterTimeout: scala.Double): vscodeLib.vscodeMod.Disposable = js.native
  def setStatusBarMessage(text: java.lang.String, hideWhenDone: vscodeLib.Thenable[_]): vscodeLib.vscodeMod.Disposable = js.native
  def showErrorMessage(message: java.lang.String, items: java.lang.String*): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showErrorMessage(message: java.lang.String, options: vscodeLib.vscodeMod.MessageOptions, items: java.lang.String*): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  @JSName("showErrorMessage")
  def showErrorMessage_TMessageItem[T /* <: vscodeLib.vscodeMod.MessageItem */](message: java.lang.String, items: T*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  @JSName("showErrorMessage")
  def showErrorMessage_TMessageItem[T /* <: vscodeLib.vscodeMod.MessageItem */](message: java.lang.String, options: vscodeLib.vscodeMod.MessageOptions, items: T*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  def showInformationMessage(message: java.lang.String, items: java.lang.String*): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showInformationMessage(message: java.lang.String, options: vscodeLib.vscodeMod.MessageOptions, items: java.lang.String*): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  @JSName("showInformationMessage")
  def showInformationMessage_TMessageItem[T /* <: vscodeLib.vscodeMod.MessageItem */](message: java.lang.String, items: T*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  @JSName("showInformationMessage")
  def showInformationMessage_TMessageItem[T /* <: vscodeLib.vscodeMod.MessageItem */](message: java.lang.String, options: vscodeLib.vscodeMod.MessageOptions, items: T*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  def showInputBox(): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showInputBox(options: vscodeLib.vscodeMod.InputBoxOptions): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showInputBox(options: vscodeLib.vscodeMod.InputBoxOptions, token: vscodeLib.vscodeMod.CancellationToken): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showOpenDialog(options: vscodeLib.vscodeMod.OpenDialogOptions): vscodeLib.Thenable[js.UndefOr[js.Array[vscodeLib.vscodeMod.Uri]]] = js.native
  def showQuickPick(items: js.Array[java.lang.String]): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showQuickPick(
    items: js.Array[java.lang.String],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions
  ): vscodeLib.Thenable[js.UndefOr[js.Array[java.lang.String]]] = js.native
  def showQuickPick(
    items: js.Array[java.lang.String],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions,
    token: vscodeLib.vscodeMod.CancellationToken
  ): vscodeLib.Thenable[js.UndefOr[js.Array[java.lang.String]]] = js.native
  def showQuickPick(items: vscodeLib.Thenable[js.Array[java.lang.String]]): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showQuickPick(
    items: vscodeLib.Thenable[js.Array[java.lang.String]],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions
  ): vscodeLib.Thenable[js.UndefOr[js.Array[java.lang.String]]] = js.native
  def showQuickPick(
    items: vscodeLib.Thenable[js.Array[java.lang.String]],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions,
    token: vscodeLib.vscodeMod.CancellationToken
  ): vscodeLib.Thenable[js.UndefOr[js.Array[java.lang.String]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_TQuickPickItem[T /* <: vscodeLib.vscodeMod.QuickPickItem */](items: js.Array[T]): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_TQuickPickItem[T /* <: vscodeLib.vscodeMod.QuickPickItem */](
    items: js.Array[T],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions
  ): vscodeLib.Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_TQuickPickItem[T /* <: vscodeLib.vscodeMod.QuickPickItem */](
    items: js.Array[T],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions,
    token: vscodeLib.vscodeMod.CancellationToken
  ): vscodeLib.Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_TQuickPickItem[T /* <: vscodeLib.vscodeMod.QuickPickItem */](items: vscodeLib.Thenable[js.Array[T]]): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_TQuickPickItem[T /* <: vscodeLib.vscodeMod.QuickPickItem */](
    items: vscodeLib.Thenable[js.Array[T]],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions
  ): vscodeLib.Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_TQuickPickItem[T /* <: vscodeLib.vscodeMod.QuickPickItem */](
    items: vscodeLib.Thenable[js.Array[T]],
    options: (vscodeLib.vscodeMod.QuickPickOptions with vscodeLib.Anon_CanPickMany) | vscodeLib.vscodeMod.QuickPickOptions,
    token: vscodeLib.vscodeMod.CancellationToken
  ): vscodeLib.Thenable[js.UndefOr[js.Array[T]]] = js.native
  def showSaveDialog(options: vscodeLib.vscodeMod.SaveDialogOptions): vscodeLib.Thenable[js.UndefOr[vscodeLib.vscodeMod.Uri]] = js.native
  def showTextDocument(document: vscodeLib.vscodeMod.TextDocument): vscodeLib.Thenable[vscodeLib.vscodeMod.TextEditor] = js.native
  def showTextDocument(document: vscodeLib.vscodeMod.TextDocument, column: vscodeLib.vscodeMod.ViewColumn): vscodeLib.Thenable[vscodeLib.vscodeMod.TextEditor] = js.native
  def showTextDocument(
    document: vscodeLib.vscodeMod.TextDocument,
    column: vscodeLib.vscodeMod.ViewColumn,
    preserveFocus: scala.Boolean
  ): vscodeLib.Thenable[vscodeLib.vscodeMod.TextEditor] = js.native
  def showTextDocument(document: vscodeLib.vscodeMod.TextDocument, options: vscodeLib.vscodeMod.TextDocumentShowOptions): vscodeLib.Thenable[vscodeLib.vscodeMod.TextEditor] = js.native
  def showTextDocument(uri: vscodeLib.vscodeMod.Uri): vscodeLib.Thenable[vscodeLib.vscodeMod.TextEditor] = js.native
  def showTextDocument(uri: vscodeLib.vscodeMod.Uri, options: vscodeLib.vscodeMod.TextDocumentShowOptions): vscodeLib.Thenable[vscodeLib.vscodeMod.TextEditor] = js.native
  def showWarningMessage(message: java.lang.String, items: java.lang.String*): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  def showWarningMessage(message: java.lang.String, options: vscodeLib.vscodeMod.MessageOptions, items: java.lang.String*): vscodeLib.Thenable[js.UndefOr[java.lang.String]] = js.native
  @JSName("showWarningMessage")
  def showWarningMessage_TMessageItem[T /* <: vscodeLib.vscodeMod.MessageItem */](message: java.lang.String, items: T*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  @JSName("showWarningMessage")
  def showWarningMessage_TMessageItem[T /* <: vscodeLib.vscodeMod.MessageItem */](message: java.lang.String, options: vscodeLib.vscodeMod.MessageOptions, items: T*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  def showWorkspaceFolderPick(): vscodeLib.Thenable[js.UndefOr[vscodeLib.vscodeMod.WorkspaceFolder]] = js.native
  def showWorkspaceFolderPick(options: vscodeLib.vscodeMod.WorkspaceFolderPickOptions): vscodeLib.Thenable[js.UndefOr[vscodeLib.vscodeMod.WorkspaceFolder]] = js.native
  def withProgress[R](
    options: vscodeLib.vscodeMod.ProgressOptions,
    task: js.Function2[
      /* progress */ vscodeLib.vscodeMod.Progress[vscodeLib.Anon_Increment], 
      /* token */ vscodeLib.vscodeMod.CancellationToken, 
      vscodeLib.Thenable[R]
    ]
  ): vscodeLib.Thenable[R] = js.native
  def withScmProgress[R](
    task: js.Function1[/* progress */ vscodeLib.vscodeMod.Progress[scala.Double], vscodeLib.Thenable[R]]
  ): vscodeLib.Thenable[R] = js.native
}


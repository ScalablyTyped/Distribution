package typings.vscode.mod

import typings.vscode.AnonIncrement
import typings.vscode.AnonPreserveFocus
import typings.vscode.QuickPickOptionscanPickMa
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "window")
@js.native
object window extends js.Object {
  val activeTerminal: js.UndefOr[Terminal] = js.native
  var activeTextEditor: js.UndefOr[TextEditor] = js.native
  val onDidChangeActiveTerminal: Event[js.UndefOr[Terminal]] = js.native
  val onDidChangeActiveTextEditor: Event[js.UndefOr[TextEditor]] = js.native
  val onDidChangeTextEditorOptions: Event[TextEditorOptionsChangeEvent] = js.native
  val onDidChangeTextEditorSelection: Event[TextEditorSelectionChangeEvent] = js.native
  val onDidChangeTextEditorViewColumn: Event[TextEditorViewColumnChangeEvent] = js.native
  val onDidChangeTextEditorVisibleRanges: Event[TextEditorVisibleRangesChangeEvent] = js.native
  val onDidChangeVisibleTextEditors: Event[js.Array[TextEditor]] = js.native
  val onDidChangeWindowState: Event[WindowState] = js.native
  val onDidCloseTerminal: Event[Terminal] = js.native
  val onDidOpenTerminal: Event[Terminal] = js.native
  val state: WindowState = js.native
  val terminals: js.Array[Terminal] = js.native
  var visibleTextEditors: js.Array[TextEditor] = js.native
  def createInputBox(): InputBox = js.native
  def createOutputChannel(name: String): OutputChannel = js.native
  def createQuickPick[T /* <: QuickPickItem */](): QuickPick[T] = js.native
  def createStatusBarItem(): StatusBarItem = js.native
  def createStatusBarItem(alignment: StatusBarAlignment): StatusBarItem = js.native
  def createStatusBarItem(alignment: StatusBarAlignment, priority: Double): StatusBarItem = js.native
  def createTerminal(): Terminal = js.native
  def createTerminal(name: String): Terminal = js.native
  def createTerminal(name: String, shellPath: String): Terminal = js.native
  def createTerminal(name: String, shellPath: String, shellArgs: String): Terminal = js.native
  def createTerminal(name: String, shellPath: String, shellArgs: js.Array[String]): Terminal = js.native
  def createTerminal(options: ExtensionTerminalOptions): Terminal = js.native
  def createTerminal(options: TerminalOptions): Terminal = js.native
  def createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType = js.native
  def createTreeView[T](viewId: String, options: TreeViewOptions[T]): TreeView[T] = js.native
  def createWebviewPanel(viewType: String, title: String, showOptions: AnonPreserveFocus): WebviewPanel = js.native
  def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: AnonPreserveFocus,
    options: WebviewPanelOptions with WebviewOptions
  ): WebviewPanel = js.native
  def createWebviewPanel(viewType: String, title: String, showOptions: ViewColumn): WebviewPanel = js.native
  def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: ViewColumn,
    options: WebviewPanelOptions with WebviewOptions
  ): WebviewPanel = js.native
  def registerTreeDataProvider[T](viewId: String, treeDataProvider: TreeDataProvider[T]): Disposable = js.native
  def registerUriHandler(handler: UriHandler): Disposable = js.native
  def registerWebviewPanelSerializer(viewType: String, serializer: WebviewPanelSerializer): Disposable = js.native
  def setStatusBarMessage(text: String): Disposable = js.native
  def setStatusBarMessage(text: String, hideAfterTimeout: Double): Disposable = js.native
  def setStatusBarMessage(text: String, hideWhenDone: Thenable[_]): Disposable = js.native
  def showErrorMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = js.native
  def showErrorMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSName("showErrorMessage")
  def showErrorMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = js.native
  @JSName("showErrorMessage")
  def showErrorMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = js.native
  def showInformationMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = js.native
  def showInformationMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSName("showInformationMessage")
  def showInformationMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = js.native
  @JSName("showInformationMessage")
  def showInformationMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = js.native
  def showInputBox(): Thenable[js.UndefOr[String]] = js.native
  def showInputBox(options: InputBoxOptions): Thenable[js.UndefOr[String]] = js.native
  def showInputBox(options: InputBoxOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  def showOpenDialog(options: OpenDialogOptions): Thenable[js.UndefOr[js.Array[Uri]]] = js.native
  def showQuickPick(items: js.Array[String]): Thenable[js.UndefOr[String]] = js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptions): Thenable[js.UndefOr[String]] = js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  def showQuickPick(items: Thenable[js.Array[String]]): Thenable[js.UndefOr[String]] = js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions): Thenable[js.UndefOr[String]] = js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T]): Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions): Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]]): Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions): Thenable[js.UndefOr[T]] = js.native
  @JSName("showQuickPick")
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = js.native
  def showSaveDialog(options: SaveDialogOptions): Thenable[js.UndefOr[Uri]] = js.native
  def showTextDocument(document: TextDocument): Thenable[TextEditor] = js.native
  def showTextDocument(document: TextDocument, column: ViewColumn): Thenable[TextEditor] = js.native
  def showTextDocument(document: TextDocument, column: ViewColumn, preserveFocus: Boolean): Thenable[TextEditor] = js.native
  def showTextDocument(document: TextDocument, options: TextDocumentShowOptions): Thenable[TextEditor] = js.native
  def showTextDocument(uri: Uri): Thenable[TextEditor] = js.native
  def showTextDocument(uri: Uri, options: TextDocumentShowOptions): Thenable[TextEditor] = js.native
  def showWarningMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = js.native
  def showWarningMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSName("showWarningMessage")
  def showWarningMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = js.native
  @JSName("showWarningMessage")
  def showWarningMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = js.native
  def showWorkspaceFolderPick(): Thenable[js.UndefOr[WorkspaceFolder]] = js.native
  def showWorkspaceFolderPick(options: WorkspaceFolderPickOptions): Thenable[js.UndefOr[WorkspaceFolder]] = js.native
  def withProgress[R](
    options: ProgressOptions,
    task: js.Function2[/* progress */ Progress[AnonIncrement], /* token */ CancellationToken, Thenable[R]]
  ): Thenable[R] = js.native
  def withScmProgress[R](task: js.Function1[/* progress */ Progress[Double], Thenable[R]]): Thenable[R] = js.native
}


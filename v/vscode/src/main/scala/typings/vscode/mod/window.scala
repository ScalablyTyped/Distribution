package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Increment
import typings.vscode.anon.PreserveFocus
import typings.vscode.anon.QuickPickOptionscanPickMa
import typings.vscode.anon.SupportsMultipleEditorsPerDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object window {
  
  @JSImport("vscode", "window")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode", "window.activeColorTheme")
  @js.native
  def activeColorTheme: ColorTheme = js.native
  @scala.inline
  def activeColorTheme_=(x: ColorTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeColorTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "window.activeTerminal")
  @js.native
  val activeTerminal: js.UndefOr[Terminal] = js.native
  
  @JSImport("vscode", "window.activeTextEditor")
  @js.native
  def activeTextEditor: js.UndefOr[TextEditor] = js.native
  @scala.inline
  def activeTextEditor_=(x: js.UndefOr[TextEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeTextEditor")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "window.createInputBox")
  @js.native
  def createInputBox(): InputBox = js.native
  
  @JSImport("vscode", "window.createOutputChannel")
  @js.native
  def createOutputChannel(name: String): OutputChannel = js.native
  
  @JSImport("vscode", "window.createQuickPick")
  @js.native
  def createQuickPick[T /* <: QuickPickItem */](): QuickPick[T] = js.native
  
  @JSImport("vscode", "window.createStatusBarItem")
  @js.native
  def createStatusBarItem(): StatusBarItem = js.native
  @JSImport("vscode", "window.createStatusBarItem")
  @js.native
  def createStatusBarItem(alignment: js.UndefOr[scala.Nothing], priority: Double): StatusBarItem = js.native
  @JSImport("vscode", "window.createStatusBarItem")
  @js.native
  def createStatusBarItem(alignment: StatusBarAlignment): StatusBarItem = js.native
  @JSImport("vscode", "window.createStatusBarItem")
  @js.native
  def createStatusBarItem(alignment: StatusBarAlignment, priority: Double): StatusBarItem = js.native
  
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: js.UndefOr[scala.Nothing], shellPath: js.UndefOr[scala.Nothing], shellArgs: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: js.UndefOr[scala.Nothing], shellPath: js.UndefOr[scala.Nothing], shellArgs: js.Array[String]): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: js.UndefOr[scala.Nothing], shellPath: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: js.UndefOr[scala.Nothing], shellPath: String, shellArgs: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: js.UndefOr[scala.Nothing], shellPath: String, shellArgs: js.Array[String]): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: String, shellPath: js.UndefOr[scala.Nothing], shellArgs: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: String, shellPath: js.UndefOr[scala.Nothing], shellArgs: js.Array[String]): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: String, shellPath: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: String, shellPath: String, shellArgs: String): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(name: String, shellPath: String, shellArgs: js.Array[String]): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(options: ExtensionTerminalOptions): Terminal = js.native
  @JSImport("vscode", "window.createTerminal")
  @js.native
  def createTerminal(options: TerminalOptions): Terminal = js.native
  
  @JSImport("vscode", "window.createTextEditorDecorationType")
  @js.native
  def createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType = js.native
  
  @JSImport("vscode", "window.createTreeView")
  @js.native
  def createTreeView[T](viewId: String, options: TreeViewOptions[T]): TreeView[T] = js.native
  
  @JSImport("vscode", "window.createWebviewPanel")
  @js.native
  def createWebviewPanel(viewType: String, title: String, showOptions: PreserveFocus): WebviewPanel = js.native
  @JSImport("vscode", "window.createWebviewPanel")
  @js.native
  def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: PreserveFocus,
    options: WebviewPanelOptions with WebviewOptions
  ): WebviewPanel = js.native
  @JSImport("vscode", "window.createWebviewPanel")
  @js.native
  def createWebviewPanel(viewType: String, title: String, showOptions: ViewColumn): WebviewPanel = js.native
  @JSImport("vscode", "window.createWebviewPanel")
  @js.native
  def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: ViewColumn,
    options: WebviewPanelOptions with WebviewOptions
  ): WebviewPanel = js.native
  
  @JSImport("vscode", "window.onDidChangeActiveColorTheme")
  @js.native
  val onDidChangeActiveColorTheme: Event[ColorTheme] = js.native
  
  @JSImport("vscode", "window.onDidChangeActiveTerminal")
  @js.native
  val onDidChangeActiveTerminal: Event[js.UndefOr[Terminal]] = js.native
  
  @JSImport("vscode", "window.onDidChangeActiveTextEditor")
  @js.native
  val onDidChangeActiveTextEditor: Event[js.UndefOr[TextEditor]] = js.native
  
  @JSImport("vscode", "window.onDidChangeTextEditorOptions")
  @js.native
  val onDidChangeTextEditorOptions: Event[TextEditorOptionsChangeEvent] = js.native
  
  @JSImport("vscode", "window.onDidChangeTextEditorSelection")
  @js.native
  val onDidChangeTextEditorSelection: Event[TextEditorSelectionChangeEvent] = js.native
  
  @JSImport("vscode", "window.onDidChangeTextEditorViewColumn")
  @js.native
  val onDidChangeTextEditorViewColumn: Event[TextEditorViewColumnChangeEvent] = js.native
  
  @JSImport("vscode", "window.onDidChangeTextEditorVisibleRanges")
  @js.native
  val onDidChangeTextEditorVisibleRanges: Event[TextEditorVisibleRangesChangeEvent] = js.native
  
  @JSImport("vscode", "window.onDidChangeVisibleTextEditors")
  @js.native
  val onDidChangeVisibleTextEditors: Event[js.Array[TextEditor]] = js.native
  
  @JSImport("vscode", "window.onDidChangeWindowState")
  @js.native
  val onDidChangeWindowState: Event[WindowState] = js.native
  
  @JSImport("vscode", "window.onDidCloseTerminal")
  @js.native
  val onDidCloseTerminal: Event[Terminal] = js.native
  
  @JSImport("vscode", "window.onDidOpenTerminal")
  @js.native
  val onDidOpenTerminal: Event[Terminal] = js.native
  
  @JSImport("vscode", "window.registerCustomEditorProvider")
  @js.native
  def registerCustomEditorProvider(viewType: String, provider: CustomEditorProvider[CustomDocument]): Disposable = js.native
  @JSImport("vscode", "window.registerCustomEditorProvider")
  @js.native
  def registerCustomEditorProvider(
    viewType: String,
    provider: CustomEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): Disposable = js.native
  @JSImport("vscode", "window.registerCustomEditorProvider")
  @js.native
  def registerCustomEditorProvider(viewType: String, provider: CustomReadonlyEditorProvider[CustomDocument]): Disposable = js.native
  @JSImport("vscode", "window.registerCustomEditorProvider")
  @js.native
  def registerCustomEditorProvider(
    viewType: String,
    provider: CustomReadonlyEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): Disposable = js.native
  @JSImport("vscode", "window.registerCustomEditorProvider")
  @js.native
  def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider): Disposable = js.native
  @JSImport("vscode", "window.registerCustomEditorProvider")
  @js.native
  def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider, options: SupportsMultipleEditorsPerDocument): Disposable = js.native
  
  @JSImport("vscode", "window.registerTerminalLinkProvider")
  @js.native
  def registerTerminalLinkProvider(provider: TerminalLinkProvider[TerminalLink]): Disposable = js.native
  
  @JSImport("vscode", "window.registerTreeDataProvider")
  @js.native
  def registerTreeDataProvider[T](viewId: String, treeDataProvider: TreeDataProvider[T]): Disposable = js.native
  
  @JSImport("vscode", "window.registerUriHandler")
  @js.native
  def registerUriHandler(handler: UriHandler): Disposable = js.native
  
  @JSImport("vscode", "window.registerWebviewPanelSerializer")
  @js.native
  def registerWebviewPanelSerializer(viewType: String, serializer: WebviewPanelSerializer[_]): Disposable = js.native
  
  @JSImport("vscode", "window.registerWebviewViewProvider")
  @js.native
  def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider): Disposable = js.native
  @JSImport("vscode", "window.registerWebviewViewProvider")
  @js.native
  def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider, options: typings.vscode.anon.WebviewOptions): Disposable = js.native
  
  @JSImport("vscode", "window.setStatusBarMessage")
  @js.native
  def setStatusBarMessage(text: String): Disposable = js.native
  @JSImport("vscode", "window.setStatusBarMessage")
  @js.native
  def setStatusBarMessage(text: String, hideAfterTimeout: Double): Disposable = js.native
  @JSImport("vscode", "window.setStatusBarMessage")
  @js.native
  def setStatusBarMessage(text: String, hideWhenDone: Thenable[_]): Disposable = js.native
  
  @JSImport("vscode", "window.showErrorMessage")
  @js.native
  def showErrorMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showErrorMessage")
  @js.native
  def showErrorMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showErrorMessage")
  @js.native
  def showErrorMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showErrorMessage")
  @js.native
  def showErrorMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = js.native
  
  @JSImport("vscode", "window.showInformationMessage")
  @js.native
  def showInformationMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showInformationMessage")
  @js.native
  def showInformationMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showInformationMessage")
  @js.native
  def showInformationMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showInformationMessage")
  @js.native
  def showInformationMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = js.native
  
  @JSImport("vscode", "window.showInputBox")
  @js.native
  def showInputBox(): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showInputBox")
  @js.native
  def showInputBox(options: js.UndefOr[scala.Nothing], token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showInputBox")
  @js.native
  def showInputBox(options: InputBoxOptions): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showInputBox")
  @js.native
  def showInputBox(options: InputBoxOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  
  @JSImport("vscode", "window.showOpenDialog")
  @js.native
  def showOpenDialog(): Thenable[js.UndefOr[js.Array[Uri]]] = js.native
  @JSImport("vscode", "window.showOpenDialog")
  @js.native
  def showOpenDialog(options: OpenDialogOptions): Thenable[js.UndefOr[js.Array[Uri]]] = js.native
  
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: js.Array[String]): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: js.Array[String], options: js.UndefOr[scala.Nothing], token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptions): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: js.Array[String], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: Thenable[js.Array[String]]): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: js.UndefOr[scala.Nothing], token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T]): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: js.UndefOr[scala.Nothing], token: CancellationToken): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]]): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: js.UndefOr[scala.Nothing], token: CancellationToken): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showQuickPick")
  @js.native
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = js.native
  
  @JSImport("vscode", "window.showSaveDialog")
  @js.native
  def showSaveDialog(): Thenable[js.UndefOr[Uri]] = js.native
  @JSImport("vscode", "window.showSaveDialog")
  @js.native
  def showSaveDialog(options: SaveDialogOptions): Thenable[js.UndefOr[Uri]] = js.native
  
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(document: TextDocument): Thenable[TextEditor] = js.native
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(document: TextDocument, column: js.UndefOr[scala.Nothing], preserveFocus: Boolean): Thenable[TextEditor] = js.native
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(document: TextDocument, column: ViewColumn): Thenable[TextEditor] = js.native
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(document: TextDocument, column: ViewColumn, preserveFocus: Boolean): Thenable[TextEditor] = js.native
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(document: TextDocument, options: TextDocumentShowOptions): Thenable[TextEditor] = js.native
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(uri: Uri): Thenable[TextEditor] = js.native
  @JSImport("vscode", "window.showTextDocument")
  @js.native
  def showTextDocument(uri: Uri, options: TextDocumentShowOptions): Thenable[TextEditor] = js.native
  
  @JSImport("vscode", "window.showWarningMessage")
  @js.native
  def showWarningMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showWarningMessage")
  @js.native
  def showWarningMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = js.native
  @JSImport("vscode", "window.showWarningMessage")
  @js.native
  def showWarningMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = js.native
  @JSImport("vscode", "window.showWarningMessage")
  @js.native
  def showWarningMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = js.native
  
  @JSImport("vscode", "window.showWorkspaceFolderPick")
  @js.native
  def showWorkspaceFolderPick(): Thenable[js.UndefOr[WorkspaceFolder]] = js.native
  @JSImport("vscode", "window.showWorkspaceFolderPick")
  @js.native
  def showWorkspaceFolderPick(options: WorkspaceFolderPickOptions): Thenable[js.UndefOr[WorkspaceFolder]] = js.native
  
  @JSImport("vscode", "window.state")
  @js.native
  val state: WindowState = js.native
  
  @JSImport("vscode", "window.terminals")
  @js.native
  val terminals: js.Array[Terminal] = js.native
  
  @JSImport("vscode", "window.visibleTextEditors")
  @js.native
  def visibleTextEditors: js.Array[TextEditor] = js.native
  @scala.inline
  def visibleTextEditors_=(x: js.Array[TextEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visibleTextEditors")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "window.withProgress")
  @js.native
  def withProgress[R](
    options: ProgressOptions,
    task: js.Function2[/* progress */ Progress[Increment], /* token */ CancellationToken, Thenable[R]]
  ): Thenable[R] = js.native
  
  @JSImport("vscode", "window.withScmProgress")
  @js.native
  def withScmProgress[R](task: js.Function1[/* progress */ Progress[Double], Thenable[R]]): Thenable[R] = js.native
}

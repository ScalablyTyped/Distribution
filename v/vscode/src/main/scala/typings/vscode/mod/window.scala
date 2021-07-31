package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Increment
import typings.vscode.anon.PreserveFocus
import typings.vscode.anon.QuickPickOptionscanPickMa
import typings.vscode.anon.SupportsMultipleEditorsPerDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def createInputBox(): InputBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInputBox")().asInstanceOf[InputBox]
  
  @scala.inline
  def createOutputChannel(name: String): OutputChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createOutputChannel")(name.asInstanceOf[js.Any]).asInstanceOf[OutputChannel]
  
  @scala.inline
  def createQuickPick[T /* <: QuickPickItem */](): QuickPick[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQuickPick")().asInstanceOf[QuickPick[T]]
  
  @scala.inline
  def createStatusBarItem(): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")().asInstanceOf[StatusBarItem]
  @scala.inline
  def createStatusBarItem(alignment: Unit, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  @scala.inline
  def createStatusBarItem(alignment: StatusBarAlignment): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any]).asInstanceOf[StatusBarItem]
  @scala.inline
  def createStatusBarItem(alignment: StatusBarAlignment, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  
  @scala.inline
  def createTerminal(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")().asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: String): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: String, shellPath: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: String, shellPath: String, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: String, shellPath: String, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: String, shellPath: Unit, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: String, shellPath: Unit, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: Unit, shellPath: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: Unit, shellPath: String, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: Unit, shellPath: String, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: Unit, shellPath: Unit, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(name: Unit, shellPath: Unit, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(options: ExtensionTerminalOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(options.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  @scala.inline
  def createTerminal(options: TerminalOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(options.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  
  @scala.inline
  def createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextEditorDecorationType")(options.asInstanceOf[js.Any]).asInstanceOf[TextEditorDecorationType]
  
  @scala.inline
  def createTreeView[T](viewId: String, options: TreeViewOptions[T]): TreeView[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTreeView")(viewId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TreeView[T]]
  
  @scala.inline
  def createWebviewPanel(viewType: String, title: String, showOptions: PreserveFocus): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  @scala.inline
  def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: PreserveFocus,
    options: WebviewPanelOptions & WebviewOptions
  ): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  @scala.inline
  def createWebviewPanel(viewType: String, title: String, showOptions: ViewColumn): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  @scala.inline
  def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: ViewColumn,
    options: WebviewPanelOptions & WebviewOptions
  ): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  
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
  
  @scala.inline
  def registerCustomEditorProvider(viewType: String, provider: CustomEditorProvider[CustomDocument]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerCustomEditorProvider(
    viewType: String,
    provider: CustomEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerCustomEditorProvider(viewType: String, provider: CustomReadonlyEditorProvider[CustomDocument]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerCustomEditorProvider(
    viewType: String,
    provider: CustomReadonlyEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider, options: SupportsMultipleEditorsPerDocument): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def registerTerminalLinkProvider(provider: TerminalLinkProvider[TerminalLink]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTerminalLinkProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  @scala.inline
  def registerTreeDataProvider[T](viewId: String, treeDataProvider: TreeDataProvider[T]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTreeDataProvider")(viewId.asInstanceOf[js.Any], treeDataProvider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def registerUriHandler(handler: UriHandler): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUriHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  @scala.inline
  def registerWebviewPanelSerializer(viewType: String, serializer: WebviewPanelSerializer[js.Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewPanelSerializer")(viewType.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewViewProvider")(viewId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider, options: typings.vscode.anon.WebviewOptions): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewViewProvider")(viewId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def setStatusBarMessage(text: String): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  @scala.inline
  def setStatusBarMessage(text: String, hideAfterTimeout: Double): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any], hideAfterTimeout.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def setStatusBarMessage(text: String, hideWhenDone: Thenable[js.Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any], hideWhenDone.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def showErrorMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(message.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showErrorMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  @scala.inline
  def showErrorMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(message.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showErrorMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  @scala.inline
  def showInformationMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(message.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showInformationMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  @scala.inline
  def showInformationMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(message.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showInformationMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  @scala.inline
  def showInputBox(): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")().asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showInputBox(options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showInputBox(options: InputBoxOptions): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showInputBox(options: InputBoxOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  @scala.inline
  def showOpenDialog(): Thenable[js.UndefOr[js.Array[Uri]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")().asInstanceOf[Thenable[js.UndefOr[js.Array[Uri]]]]
  @scala.inline
  def showOpenDialog(options: OpenDialogOptions): Thenable[js.UndefOr[js.Array[Uri]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[js.Array[Uri]]]]
  
  @scala.inline
  def showQuickPick(items: js.Array[String]): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: js.Array[String], options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  @scala.inline
  def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  @scala.inline
  def showQuickPick(items: js.Array[String], options: QuickPickOptions): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: js.Array[String], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: Thenable[js.Array[String]]): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: Thenable[js.Array[String]], options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  @scala.inline
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  @scala.inline
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T]): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: Unit, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]]): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: Unit, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showQuickPick_T_QuickPickItem[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  @scala.inline
  def showSaveDialog(): Thenable[js.UndefOr[Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")().asInstanceOf[Thenable[js.UndefOr[Uri]]]
  @scala.inline
  def showSaveDialog(options: SaveDialogOptions): Thenable[js.UndefOr[Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[Uri]]]
  
  @scala.inline
  def showTextDocument(document: TextDocument): Thenable[TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextEditor]]
  @scala.inline
  def showTextDocument(document: TextDocument, column: Unit, preserveFocus: Boolean): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any], preserveFocus.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  @scala.inline
  def showTextDocument(document: TextDocument, column: ViewColumn): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  @scala.inline
  def showTextDocument(document: TextDocument, column: ViewColumn, preserveFocus: Boolean): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any], preserveFocus.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  @scala.inline
  def showTextDocument(document: TextDocument, options: TextDocumentShowOptions): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  @scala.inline
  def showTextDocument(uri: Uri): Thenable[TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextEditor]]
  @scala.inline
  def showTextDocument(uri: Uri, options: TextDocumentShowOptions): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  
  @scala.inline
  def showWarningMessage(message: String, items: String*): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")(message.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  @scala.inline
  def showWarningMessage(message: String, options: MessageOptions, items: String*): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  @scala.inline
  def showWarningMessage_T_MessageItem[T /* <: MessageItem */](message: String, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")(message.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  @scala.inline
  def showWarningMessage_T_MessageItem[T /* <: MessageItem */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  @scala.inline
  def showWorkspaceFolderPick(): Thenable[js.UndefOr[WorkspaceFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkspaceFolderPick")().asInstanceOf[Thenable[js.UndefOr[WorkspaceFolder]]]
  @scala.inline
  def showWorkspaceFolderPick(options: WorkspaceFolderPickOptions): Thenable[js.UndefOr[WorkspaceFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkspaceFolderPick")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[WorkspaceFolder]]]
  
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
  
  @scala.inline
  def withProgress[R](
    options: ProgressOptions,
    task: js.Function2[/* progress */ Progress[Increment], /* token */ CancellationToken, Thenable[R]]
  ): Thenable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withProgress")(options.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Thenable[R]]
  
  @scala.inline
  def withScmProgress[R](task: js.Function1[/* progress */ Progress[Double], Thenable[R]]): Thenable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScmProgress")(task.asInstanceOf[js.Any]).asInstanceOf[Thenable[R]]
}

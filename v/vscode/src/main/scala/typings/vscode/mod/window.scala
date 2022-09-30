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
  inline def activeColorTheme_=(x: ColorTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeColorTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "window.activeNotebookEditor")
  @js.native
  val activeNotebookEditor: js.UndefOr[NotebookEditor] = js.native
  
  @JSImport("vscode", "window.activeTerminal")
  @js.native
  val activeTerminal: js.UndefOr[Terminal] = js.native
  
  @JSImport("vscode", "window.activeTextEditor")
  @js.native
  def activeTextEditor: js.UndefOr[TextEditor] = js.native
  inline def activeTextEditor_=(x: js.UndefOr[TextEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeTextEditor")(x.asInstanceOf[js.Any])
  
  inline def createInputBox(): InputBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInputBox")().asInstanceOf[InputBox]
  
  inline def createOutputChannel(name: String): OutputChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createOutputChannel")(name.asInstanceOf[js.Any]).asInstanceOf[OutputChannel]
  inline def createOutputChannel(name: String, languageId: String): OutputChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createOutputChannel")(name.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[OutputChannel]
  
  inline def createQuickPick[T /* <: QuickPickItem */](): QuickPick[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQuickPick")().asInstanceOf[QuickPick[T]]
  
  inline def createStatusBarItem(): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")().asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(alignment: Unit, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(alignment: StatusBarAlignment): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any]).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(alignment: StatusBarAlignment, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any]).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String, alignment: Unit, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String, alignment: StatusBarAlignment): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String, alignment: StatusBarAlignment, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  
  inline def createTerminal(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")().asInstanceOf[Terminal]
  inline def createTerminal(name: String): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: String, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: String, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: Unit, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: Unit, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: String, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: String, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: Unit, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: Unit, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(options: ExtensionTerminalOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(options.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def createTerminal(options: TerminalOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(options.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  
  inline def createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextEditorDecorationType")(options.asInstanceOf[js.Any]).asInstanceOf[TextEditorDecorationType]
  
  inline def createTreeView[T](viewId: String, options: TreeViewOptions[T]): TreeView[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTreeView")(viewId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TreeView[T]]
  
  inline def createWebviewPanel(viewType: String, title: String, showOptions: PreserveFocus): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  inline def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: PreserveFocus,
    options: WebviewPanelOptions & WebviewOptions
  ): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  inline def createWebviewPanel(viewType: String, title: String, showOptions: ViewColumn): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  inline def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: ViewColumn,
    options: WebviewPanelOptions & WebviewOptions
  ): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  
  @JSImport("vscode", "window.onDidChangeActiveColorTheme")
  @js.native
  val onDidChangeActiveColorTheme: Event[ColorTheme] = js.native
  
  @JSImport("vscode", "window.onDidChangeActiveNotebookEditor")
  @js.native
  val onDidChangeActiveNotebookEditor: Event[js.UndefOr[NotebookEditor]] = js.native
  
  @JSImport("vscode", "window.onDidChangeActiveTerminal")
  @js.native
  val onDidChangeActiveTerminal: Event[js.UndefOr[Terminal]] = js.native
  
  @JSImport("vscode", "window.onDidChangeActiveTextEditor")
  @js.native
  val onDidChangeActiveTextEditor: Event[js.UndefOr[TextEditor]] = js.native
  
  @JSImport("vscode", "window.onDidChangeNotebookEditorSelection")
  @js.native
  val onDidChangeNotebookEditorSelection: Event[NotebookEditorSelectionChangeEvent] = js.native
  
  @JSImport("vscode", "window.onDidChangeNotebookEditorVisibleRanges")
  @js.native
  val onDidChangeNotebookEditorVisibleRanges: Event[NotebookEditorVisibleRangesChangeEvent] = js.native
  
  @JSImport("vscode", "window.onDidChangeTerminalState")
  @js.native
  val onDidChangeTerminalState: Event[Terminal] = js.native
  
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
  
  @JSImport("vscode", "window.onDidChangeVisibleNotebookEditors")
  @js.native
  val onDidChangeVisibleNotebookEditors: Event[js.Array[NotebookEditor]] = js.native
  
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
  
  inline def registerCustomEditorProvider(viewType: String, provider: CustomEditorProvider[CustomDocument]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCustomEditorProvider(
    viewType: String,
    provider: CustomEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCustomEditorProvider(viewType: String, provider: CustomReadonlyEditorProvider[CustomDocument]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCustomEditorProvider(
    viewType: String,
    provider: CustomReadonlyEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider, options: SupportsMultipleEditorsPerDocument): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerFileDecorationProvider(provider: FileDecorationProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFileDecorationProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerTerminalLinkProvider(provider: TerminalLinkProvider[TerminalLink]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTerminalLinkProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerTerminalProfileProvider(id: String, provider: TerminalProfileProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTerminalProfileProvider")(id.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerTreeDataProvider[T](viewId: String, treeDataProvider: TreeDataProvider[T]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTreeDataProvider")(viewId.asInstanceOf[js.Any], treeDataProvider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerUriHandler(handler: UriHandler): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUriHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerWebviewPanelSerializer(viewType: String, serializer: WebviewPanelSerializer[Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewPanelSerializer")(viewType.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewViewProvider")(viewId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider, options: typings.vscode.anon.WebviewOptions): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewViewProvider")(viewId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def setStatusBarMessage(text: String): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  inline def setStatusBarMessage(text: String, hideAfterTimeout: Double): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any], hideAfterTimeout.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def setStatusBarMessage(text: String, hideWhenDone: Thenable[Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any], hideWhenDone.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def showErrorMessage[T /* <: String */](message: String, items: T*): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(scala.List(message.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showErrorMessage[T /* <: String */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")((scala.List(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showInformationMessage[T /* <: String */](message: String, items: T*): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(scala.List(message.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showInformationMessage[T /* <: String */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")((scala.List(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showInputBox(): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")().asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showInputBox(options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showInputBox(options: InputBoxOptions): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showInputBox(options: InputBoxOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  inline def showNotebookDocument(document: NotebookDocument): Thenable[NotebookEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Thenable[NotebookEditor]]
  inline def showNotebookDocument(document: NotebookDocument, options: NotebookDocumentShowOptions): Thenable[NotebookEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(document.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[NotebookEditor]]
  
  inline def showOpenDialog(): Thenable[js.UndefOr[js.Array[Uri]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")().asInstanceOf[Thenable[js.UndefOr[js.Array[Uri]]]]
  inline def showOpenDialog(options: OpenDialogOptions): Thenable[js.UndefOr[js.Array[Uri]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[js.Array[Uri]]]]
  
  inline def showQuickPick(items: js.Array[String]): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: js.Array[String], options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptions): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]]): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T]): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: Unit, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]]): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: Unit, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showSaveDialog(): Thenable[js.UndefOr[Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")().asInstanceOf[Thenable[js.UndefOr[Uri]]]
  inline def showSaveDialog(options: SaveDialogOptions): Thenable[js.UndefOr[Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[Uri]]]
  
  inline def showTextDocument(document: TextDocument): Thenable[TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, column: Unit, preserveFocus: Boolean): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any], preserveFocus.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, column: ViewColumn): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, column: ViewColumn, preserveFocus: Boolean): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any], preserveFocus.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, options: TextDocumentShowOptions): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(uri: Uri): Thenable[TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(uri: Uri, options: TextDocumentShowOptions): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  
  inline def showWarningMessage[T /* <: String */](message: String, items: T*): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")(scala.List(message.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showWarningMessage[T /* <: String */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")((scala.List(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showWorkspaceFolderPick(): Thenable[js.UndefOr[WorkspaceFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkspaceFolderPick")().asInstanceOf[Thenable[js.UndefOr[WorkspaceFolder]]]
  inline def showWorkspaceFolderPick(options: WorkspaceFolderPickOptions): Thenable[js.UndefOr[WorkspaceFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkspaceFolderPick")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[WorkspaceFolder]]]
  
  @JSImport("vscode", "window.state")
  @js.native
  val state: WindowState = js.native
  
  @JSImport("vscode", "window.tabGroups")
  @js.native
  val tabGroups: TabGroups = js.native
  
  @JSImport("vscode", "window.terminals")
  @js.native
  val terminals: js.Array[Terminal] = js.native
  
  @JSImport("vscode", "window.visibleNotebookEditors")
  @js.native
  val visibleNotebookEditors: js.Array[NotebookEditor] = js.native
  
  @JSImport("vscode", "window.visibleTextEditors")
  @js.native
  def visibleTextEditors: js.Array[TextEditor] = js.native
  inline def visibleTextEditors_=(x: js.Array[TextEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visibleTextEditors")(x.asInstanceOf[js.Any])
  
  inline def withProgress[R](
    options: ProgressOptions,
    task: js.Function2[/* progress */ Progress[Increment], /* token */ CancellationToken, Thenable[R]]
  ): Thenable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withProgress")(options.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Thenable[R]]
  
  inline def withScmProgress[R](task: js.Function1[/* progress */ Progress[Double], Thenable[R]]): Thenable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScmProgress")(task.asInstanceOf[js.Any]).asInstanceOf[Thenable[R]]
}

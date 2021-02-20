package typings.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type DidChangeConfigurationSignature = js.ThisFunction1[
    /* this */ scala.Unit, 
    /* sections */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
  
  type DidChangeWatchedFileSignature = js.ThisFunction1[
    /* this */ scala.Unit, 
    /* event */ typings.vscodeLanguageserverProtocol.protocolMod.FileEvent, 
    scala.Unit
  ]
  
  @scala.inline
  def EOL: js.Array[java.lang.String] = typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]
  
  type ExecuteCommandSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* command */ java.lang.String, 
    /* args */ js.Array[js.Any], 
    typings.vscode.mod.ProviderResult[js.Any]
  ]
  
  type HandleDiagnosticsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* uri */ typings.vscode.mod.Uri, 
    /* diagnostics */ js.Array[typings.vscode.mod.Diagnostic], 
    scala.Unit
  ]
  
  type InitializationFailedHandler = js.Function1[
    /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | typings.std.Error | js.Any, 
    scala.Boolean
  ]
  
  type Middleware = typings.vscodeLanguageclient.clientMod._Middleware with typings.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware with typings.vscodeLanguageclient.implementationMod.ImplementationMiddleware with typings.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware with typings.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware with typings.vscodeLanguageclient.declarationMod.DeclarationMiddleware with typings.vscodeLanguageclient.selectionRangeMod.SelectionRangeProviderMiddleware
  
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  
  type PrepareRenameSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Range | typings.vscodeLanguageclient.anon.Placeholder]
  ]
  
  type ProvideCodeActionsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* context */ typings.vscode.mod.CodeActionContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.Command | typings.vscode.mod.CodeAction]]
  ]
  
  type ProvideCodeLensesSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.CodeLens]]
  ]
  
  type ProvideCompletionItemsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* context */ typings.vscode.mod.CompletionContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      js.Array[typings.vscode.mod.CompletionItem] | typings.vscode.mod.CompletionList[typings.vscode.mod.CompletionItem]
    ]
  ]
  
  type ProvideDefinitionSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Definition | js.Array[typings.vscode.mod.DefinitionLink]]
  ]
  
  type ProvideDocumentFormattingEditsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  
  type ProvideDocumentHighlightsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.DocumentHighlight]]
  ]
  
  type ProvideDocumentLinksSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.DocumentLink]]
  ]
  
  type ProvideDocumentRangeFormattingEditsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  
  type ProvideDocumentSymbolsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      js.Array[typings.vscode.mod.DocumentSymbol | typings.vscode.mod.SymbolInformation]
    ]
  ]
  
  type ProvideHoverSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.Hover]
  ]
  
  type ProvideOnTypeFormattingEditsSignature = js.ThisFunction5[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* ch */ java.lang.String, 
    /* options */ typings.vscode.mod.FormattingOptions, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
  ]
  
  type ProvideReferencesSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* options */ typings.vscodeLanguageclient.anon.IncludeDeclaration, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.Location]]
  ]
  
  type ProvideRenameEditsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* newName */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.WorkspaceEdit]
  ]
  
  type ProvideSignatureHelpSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* position */ typings.vscode.mod.Position, 
    /* context */ typings.vscode.mod.SignatureHelpContext, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.SignatureHelp]
  ]
  
  type ProvideWorkspaceSymbolsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* query */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.SymbolInformation]]
  ]
  
  type ResolveCodeLensSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* codeLens */ typings.vscode.mod.CodeLens, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CodeLens]
  ]
  
  type ResolveCompletionItemSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typings.vscode.mod.CompletionItem, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.CompletionItem]
  ]
  
  type ResolveDocumentLinkSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* link */ typings.vscode.mod.DocumentLink, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.DocumentLink]
  ]
  
  type WorkspaceMiddleware = typings.vscodeLanguageclient.clientMod._WorkspaceMiddleware with typings.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware with typings.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
  
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  
  @scala.inline
  def createClientSocketTransport(port: scala.Double): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  @scala.inline
  def createClientSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  
  @scala.inline
  def createProtocolConnection(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typings.vscodeJsonrpc.mod.Logger
  ): typings.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  @scala.inline
  def createProtocolConnection(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typings.vscodeJsonrpc.mod.Logger,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): typings.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def generateRandomPipeName(): java.lang.String = typings.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]
}

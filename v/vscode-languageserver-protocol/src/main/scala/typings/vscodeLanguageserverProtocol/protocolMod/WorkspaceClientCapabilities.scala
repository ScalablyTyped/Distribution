package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticWorkspaceClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintWorkspaceClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolInlineValueMod.InlineValueWorkspaceClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensWorkspaceClientCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceClientCapabilities extends StObject {
  
  /**
    * The client supports applying batch edits
    * to the workspace by supporting the request
    * 'workspace/applyEdit'
    */
  var applyEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Capabilities specific to the code lens requests scoped to the
    * workspace.
    *
    * @since 3.16.0.
    */
  var codeLens: js.UndefOr[CodeLensWorkspaceClientCapabilities] = js.undefined
  
  /**
    * The client supports `workspace/configuration` requests.
    *
    * @since 3.6.0
    */
  var configuration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Capabilities specific to the diagnostic requests scoped to the
    * workspace.
    *
    * @since 3.17.0.
    */
  var diagnostics: js.UndefOr[DiagnosticWorkspaceClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `workspace/didChangeConfiguration` notification.
    */
  var didChangeConfiguration: js.UndefOr[DidChangeConfigurationClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[DidChangeWatchedFilesClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[ExecuteCommandClientCapabilities] = js.undefined
  
  /**
    * The client has support for file notifications/requests for user operations on files.
    *
    * Since 3.16.0
    */
  var fileOperations: js.UndefOr[FileOperationClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the inlay hint requests scoped to the
    * workspace.
    *
    * @since 3.17.0.
    */
  var inlayHint: js.UndefOr[InlayHintWorkspaceClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the inline values requests scoped to the
    * workspace.
    *
    * @since 3.17.0.
    */
  var inlineValue: js.UndefOr[InlineValueWorkspaceClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the semantic token requests scoped to the
    * workspace.
    *
    * @since 3.16.0.
    */
  var semanticTokens: js.UndefOr[SemanticTokensWorkspaceClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[WorkspaceSymbolClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to `WorkspaceEdit`s.
    */
  var workspaceEdit: js.UndefOr[WorkspaceEditClientCapabilities] = js.undefined
  
  /**
    * The client has support for workspace folders.
    *
    * @since 3.6.0
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceClientCapabilities {
  
  inline def apply(): WorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceClientCapabilities]
  }
  
  extension [Self <: WorkspaceClientCapabilities](x: Self) {
    
    inline def setApplyEdit(value: Boolean): Self = StObject.set(x, "applyEdit", value.asInstanceOf[js.Any])
    
    inline def setApplyEditUndefined: Self = StObject.set(x, "applyEdit", js.undefined)
    
    inline def setCodeLens(value: CodeLensWorkspaceClientCapabilities): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
    
    inline def setCodeLensUndefined: Self = StObject.set(x, "codeLens", js.undefined)
    
    inline def setConfiguration(value: Boolean): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDiagnostics(value: DiagnosticWorkspaceClientCapabilities): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDidChangeConfiguration(value: DidChangeConfigurationClientCapabilities): Self = StObject.set(x, "didChangeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDidChangeConfigurationUndefined: Self = StObject.set(x, "didChangeConfiguration", js.undefined)
    
    inline def setDidChangeWatchedFiles(value: DidChangeWatchedFilesClientCapabilities): Self = StObject.set(x, "didChangeWatchedFiles", value.asInstanceOf[js.Any])
    
    inline def setDidChangeWatchedFilesUndefined: Self = StObject.set(x, "didChangeWatchedFiles", js.undefined)
    
    inline def setExecuteCommand(value: ExecuteCommandClientCapabilities): Self = StObject.set(x, "executeCommand", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandUndefined: Self = StObject.set(x, "executeCommand", js.undefined)
    
    inline def setFileOperations(value: FileOperationClientCapabilities): Self = StObject.set(x, "fileOperations", value.asInstanceOf[js.Any])
    
    inline def setFileOperationsUndefined: Self = StObject.set(x, "fileOperations", js.undefined)
    
    inline def setInlayHint(value: InlayHintWorkspaceClientCapabilities): Self = StObject.set(x, "inlayHint", value.asInstanceOf[js.Any])
    
    inline def setInlayHintUndefined: Self = StObject.set(x, "inlayHint", js.undefined)
    
    inline def setInlineValue(value: InlineValueWorkspaceClientCapabilities): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
    
    inline def setInlineValueUndefined: Self = StObject.set(x, "inlineValue", js.undefined)
    
    inline def setSemanticTokens(value: SemanticTokensWorkspaceClientCapabilities): Self = StObject.set(x, "semanticTokens", value.asInstanceOf[js.Any])
    
    inline def setSemanticTokensUndefined: Self = StObject.set(x, "semanticTokens", js.undefined)
    
    inline def setSymbol(value: WorkspaceSymbolClientCapabilities): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setWorkspaceEdit(value: WorkspaceEditClientCapabilities): Self = StObject.set(x, "workspaceEdit", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceEditUndefined: Self = StObject.set(x, "workspaceEdit", js.undefined)
    
    inline def setWorkspaceFolders(value: Boolean): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
  }
}

package typings.vscodeLanguageserverProtocol.protocolMod

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
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[WorkspaceSymbolClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[WorkspaceEditClientCapabilities] = js.undefined
}
object WorkspaceClientCapabilities {
  
  inline def apply(): WorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceClientCapabilities]
  }
  
  extension [Self <: WorkspaceClientCapabilities](x: Self) {
    
    inline def setApplyEdit(value: Boolean): Self = StObject.set(x, "applyEdit", value.asInstanceOf[js.Any])
    
    inline def setApplyEditUndefined: Self = StObject.set(x, "applyEdit", js.undefined)
    
    inline def setDidChangeConfiguration(value: DidChangeConfigurationClientCapabilities): Self = StObject.set(x, "didChangeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDidChangeConfigurationUndefined: Self = StObject.set(x, "didChangeConfiguration", js.undefined)
    
    inline def setDidChangeWatchedFiles(value: DidChangeWatchedFilesClientCapabilities): Self = StObject.set(x, "didChangeWatchedFiles", value.asInstanceOf[js.Any])
    
    inline def setDidChangeWatchedFilesUndefined: Self = StObject.set(x, "didChangeWatchedFiles", js.undefined)
    
    inline def setExecuteCommand(value: ExecuteCommandClientCapabilities): Self = StObject.set(x, "executeCommand", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandUndefined: Self = StObject.set(x, "executeCommand", js.undefined)
    
    inline def setSymbol(value: WorkspaceSymbolClientCapabilities): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setWorkspaceEdit(value: WorkspaceEditClientCapabilities): Self = StObject.set(x, "workspaceEdit", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceEditUndefined: Self = StObject.set(x, "workspaceEdit", js.undefined)
  }
}

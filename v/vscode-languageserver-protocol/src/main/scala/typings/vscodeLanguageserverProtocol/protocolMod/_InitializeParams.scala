package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.Name
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.messages
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.off
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.verbose
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _InitializeParams
  extends StObject
     with WorkDoneProgressParams {
  
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities
  
  /**
    * Information about the client
    *
    * @since 3.15.0
    */
  var clientInfo: js.UndefOr[Name] = js.undefined
  
  /**
    * User provided initialization options.
    */
  var initializationOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The process Id of the parent process that started
    * the server.
    */
  var processId: Double | Null
  
  /**
    * The rootPath of the workspace. Is null
    * if no folder is open.
    *
    * @deprecated in favour of rootUri.
    */
  var rootPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rootUri of the workspace. Is null if no
    * folder is open. If both `rootPath` and `rootUri` are set
    * `rootUri` wins.
    *
    * @deprecated in favour of workspaceFolders.
    */
  var rootUri: DocumentUri | Null
  
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[off | messages | verbose] = js.undefined
}
object _InitializeParams {
  
  inline def apply(capabilities: ClientCapabilities): _InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], processId = null, rootUri = null)
    __obj.asInstanceOf[_InitializeParams]
  }
  
  extension [Self <: _InitializeParams](x: Self) {
    
    inline def setCapabilities(value: ClientCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setClientInfo(value: Name): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setInitializationOptions(value: js.Any): Self = StObject.set(x, "initializationOptions", value.asInstanceOf[js.Any])
    
    inline def setInitializationOptionsUndefined: Self = StObject.set(x, "initializationOptions", js.undefined)
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdNull: Self = StObject.set(x, "processId", null)
    
    inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
    
    inline def setRootPathNull: Self = StObject.set(x, "rootPath", null)
    
    inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    
    inline def setRootUri(value: DocumentUri): Self = StObject.set(x, "rootUri", value.asInstanceOf[js.Any])
    
    inline def setRootUriNull: Self = StObject.set(x, "rootUri", null)
    
    inline def setTrace(value: off | messages | verbose): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}

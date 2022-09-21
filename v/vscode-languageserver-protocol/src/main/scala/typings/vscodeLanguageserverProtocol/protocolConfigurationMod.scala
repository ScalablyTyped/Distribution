package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.connectionMod.HandlerResult
import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashconfiguration
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolConfigurationMod {
  
  object ConfigurationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.configuration", "ConfigurationRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.configuration", "ConfigurationRequest.method")
    @js.native
    val method: workspaceSlashconfiguration = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.configuration", "ConfigurationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[ConfigurationParams & PartialResultParams, js.Array[Any], scala.Nothing, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[LSPAny], Unit]
    
    type MiddlewareSignature = js.Function3[
        /* params */ ConfigurationParams, 
        /* token */ CancellationToken, 
        /* next */ HandlerSignature, 
        HandlerResult[js.Array[LSPAny], Unit]
      ]
  }
  
  trait ConfigurationItem extends StObject {
    
    /**
      * The scope to get the configuration section for.
      */
    var scopeUri: js.UndefOr[String] = js.undefined
    
    /**
      * The configuration section asked for.
      */
    var section: js.UndefOr[String] = js.undefined
  }
  object ConfigurationItem {
    
    inline def apply(): ConfigurationItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationItem]
    }
    
    extension [Self <: ConfigurationItem](x: Self) {
      
      inline def setScopeUri(value: String): Self = StObject.set(x, "scopeUri", value.asInstanceOf[js.Any])
      
      inline def setScopeUriUndefined: Self = StObject.set(x, "scopeUri", js.undefined)
      
      inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    }
  }
  
  trait ConfigurationParams extends StObject {
    
    var items: js.Array[ConfigurationItem]
  }
  object ConfigurationParams {
    
    inline def apply(items: js.Array[ConfigurationItem]): ConfigurationParams = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationParams]
    }
    
    extension [Self <: ConfigurationParams](x: Self) {
      
      inline def setItems(value: js.Array[ConfigurationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ConfigurationItem*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}

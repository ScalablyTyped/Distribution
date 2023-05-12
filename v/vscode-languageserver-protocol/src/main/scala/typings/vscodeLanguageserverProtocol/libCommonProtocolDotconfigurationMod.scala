package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeJsonrpc.libCommonConnectionMod.HandlerResult
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashconfiguration
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotconfigurationMod {
  
  object ConfigurationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.configuration", "ConfigurationRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.configuration", "ConfigurationRequest.method")
    @js.native
    val method: workspaceSlashconfiguration = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.configuration", "ConfigurationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[ConfigurationParams, js.Array[Any], scala.Nothing, Unit, Unit] = js.native
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationItem] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationParams] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[ConfigurationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ConfigurationItem*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}

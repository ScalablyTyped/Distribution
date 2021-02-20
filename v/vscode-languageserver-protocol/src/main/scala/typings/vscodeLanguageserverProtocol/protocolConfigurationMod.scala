package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.anon.Configuration
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolConfigurationMod {
  
  object ConfigurationRequest {
    
    type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[js.Any], Unit]
    
    type MiddlewareSignature = js.Function3[
        /* params */ ConfigurationParams, 
        /* token */ CancellationToken, 
        /* next */ HandlerSignature, 
        HandlerResult[js.Array[js.Any], Unit]
      ]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        ConfigurationParams with PartialResultParams, 
        js.Array[js.Any], 
        scala.Nothing, 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  trait ConfigurationClientCapabilities extends StObject {
    
    /**
      * The workspace client capabilities
      */
    var workspace: js.UndefOr[Configuration] = js.native
  }
  object ConfigurationClientCapabilities {
    
    @scala.inline
    def apply(): ConfigurationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationClientCapabilities]
    }
    
    @scala.inline
    implicit class ConfigurationClientCapabilitiesMutableBuilder[Self <: ConfigurationClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkspace(value: Configuration): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationItem extends StObject {
    
    /**
      * The scope to get the configuration section for.
      */
    var scopeUri: js.UndefOr[String] = js.native
    
    /**
      * The configuration section asked for.
      */
    var section: js.UndefOr[String] = js.native
  }
  object ConfigurationItem {
    
    @scala.inline
    def apply(): ConfigurationItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationItem]
    }
    
    @scala.inline
    implicit class ConfigurationItemMutableBuilder[Self <: ConfigurationItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScopeUri(value: String): Self = StObject.set(x, "scopeUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUriUndefined: Self = StObject.set(x, "scopeUri", js.undefined)
      
      @scala.inline
      def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationParams extends StObject {
    
    var items: js.Array[ConfigurationItem] = js.native
  }
  object ConfigurationParams {
    
    @scala.inline
    def apply(items: js.Array[ConfigurationItem]): ConfigurationParams = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationParams]
    }
    
    @scala.inline
    implicit class ConfigurationParamsMutableBuilder[Self <: ConfigurationParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[ConfigurationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ConfigurationItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}

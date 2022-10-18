package typings.vscodeLanguageclient

import typings.vscode.mod.FileSystemWatcher
import typings.vscode.mod.WorkspaceFolder
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeJsonrpc.libCommonConnectionMod.HandlerResult
import typings.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.StaticFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationRequest.MiddlewareSignature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeConfigurationRegistrationOptions
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonConfigurationMod {
  
  @JSImport("vscode-languageclient/lib/common/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient/lib/common/configuration", "ConfigurationFeature")
  @js.native
  open class ConfigurationFeature protected ()
    extends StObject
       with StaticFeature {
    def this(client: FeatureClient[ConfigurationWorkspaceMiddleware, js.Object]) = this()
    
    /* private */ val _client: Any = js.native
    
    /* private */ var getConfiguration: Any = js.native
    
    def initialize(): Unit = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/configuration", "SyncConfigurationFeature")
  @js.native
  open class SyncConfigurationFeature protected ()
    extends StObject
       with DynamicFeature[DidChangeConfigurationRegistrationOptions] {
    def this(_client: FeatureClient[DidChangeConfigurationWorkspaceMiddleware, ConfigurationOptions]) = this()
    
    /* private */ var _client: Any = js.native
    
    /* private */ val _listeners: Any = js.native
    
    /* private */ var extractSettingsInformation: Any = js.native
    
    def initialize(): Unit = js.native
    
    /* private */ var onDidChangeConfiguration: Any = js.native
    
    @JSName("registrationType")
    def registrationType_MSyncConfigurationFeature: RegistrationType[DidChangeConfigurationRegistrationOptions] = js.native
  }
  
  inline def toJSONObject(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ConfigurationMiddleware extends StObject {
    
    var configuration: js.UndefOr[MiddlewareSignature] = js.undefined
  }
  object ConfigurationMiddleware {
    
    inline def apply(): ConfigurationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationMiddleware]
    }
    
    extension [Self <: ConfigurationMiddleware](x: Self) {
      
      inline def setConfiguration(
        value: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[LSPAny], Unit]
      ): Self = StObject.set(x, "configuration", js.Any.fromFunction3(value))
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    }
  }
  
  trait ConfigurationOptions extends StObject {
    
    var synchronize: js.UndefOr[SynchronizeOptions] = js.undefined
    
    var workspaceFolder: js.UndefOr[WorkspaceFolder] = js.undefined
  }
  object ConfigurationOptions {
    
    inline def apply(): ConfigurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    extension [Self <: ConfigurationOptions](x: Self) {
      
      inline def setSynchronize(value: SynchronizeOptions): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      inline def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      inline def setWorkspaceFolder(value: WorkspaceFolder): Self = StObject.set(x, "workspaceFolder", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceFolderUndefined: Self = StObject.set(x, "workspaceFolder", js.undefined)
    }
  }
  
  trait ConfigurationWorkspaceMiddleware extends StObject {
    
    var workspace: js.UndefOr[ConfigurationMiddleware] = js.undefined
  }
  object ConfigurationWorkspaceMiddleware {
    
    inline def apply(): ConfigurationWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
    }
    
    extension [Self <: ConfigurationWorkspaceMiddleware](x: Self) {
      
      inline def setWorkspace(value: ConfigurationMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait DidChangeConfigurationMiddleware extends StObject {
    
    var didChangeConfiguration: js.UndefOr[
        js.ThisFunction2[
          /* this */ Unit, 
          /* sections */ js.UndefOr[js.Array[String]], 
          /* next */ DidChangeConfigurationSignature, 
          js.Promise[Unit]
        ]
      ] = js.undefined
  }
  object DidChangeConfigurationMiddleware {
    
    inline def apply(): DidChangeConfigurationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DidChangeConfigurationMiddleware]
    }
    
    extension [Self <: DidChangeConfigurationMiddleware](x: Self) {
      
      inline def setDidChangeConfiguration(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* sections */ js.UndefOr[js.Array[String]], 
              /* next */ DidChangeConfigurationSignature, 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "didChangeConfiguration", value.asInstanceOf[js.Any])
      
      inline def setDidChangeConfigurationUndefined: Self = StObject.set(x, "didChangeConfiguration", js.undefined)
    }
  }
  
  type DidChangeConfigurationSignature = js.ThisFunction1[/* this */ Unit, /* sections */ js.UndefOr[js.Array[String]], js.Promise[Unit]]
  
  trait DidChangeConfigurationWorkspaceMiddleware extends StObject {
    
    var workspace: js.UndefOr[DidChangeConfigurationMiddleware] = js.undefined
  }
  object DidChangeConfigurationWorkspaceMiddleware {
    
    inline def apply(): DidChangeConfigurationWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DidChangeConfigurationWorkspaceMiddleware]
    }
    
    extension [Self <: DidChangeConfigurationWorkspaceMiddleware](x: Self) {
      
      inline def setWorkspace(value: DidChangeConfigurationMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait SynchronizeOptions extends StObject {
    
    /**
      * The configuration sections to synchronize. Pushing settings from the
      * client to the server is deprecated in favour of the new pull model
      * that allows servers to query settings scoped on resources. In this
      * model the client can only deliver an empty change event since the
      * actually setting value can vary on the provided resource scope.
      *
      * @deprecated Use the new pull model (`workspace/configuration` request)
      */
    var configurationSection: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Asks the client to send file change events to the server. Watchers
      * operate on workspace folders. The LSP client doesn't support watching
      * files outside a workspace folder.
      */
    var fileEvents: js.UndefOr[FileSystemWatcher | js.Array[FileSystemWatcher]] = js.undefined
  }
  object SynchronizeOptions {
    
    inline def apply(): SynchronizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SynchronizeOptions]
    }
    
    extension [Self <: SynchronizeOptions](x: Self) {
      
      inline def setConfigurationSection(value: String | js.Array[String]): Self = StObject.set(x, "configurationSection", value.asInstanceOf[js.Any])
      
      inline def setConfigurationSectionUndefined: Self = StObject.set(x, "configurationSection", js.undefined)
      
      inline def setConfigurationSectionVarargs(value: String*): Self = StObject.set(x, "configurationSection", js.Array(value*))
      
      inline def setFileEvents(value: FileSystemWatcher | js.Array[FileSystemWatcher]): Self = StObject.set(x, "fileEvents", value.asInstanceOf[js.Any])
      
      inline def setFileEventsUndefined: Self = StObject.set(x, "fileEvents", js.undefined)
      
      inline def setFileEventsVarargs(value: FileSystemWatcher*): Self = StObject.set(x, "fileEvents", js.Array(value*))
    }
  }
}

package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeJsonrpc.libCommonConnectionMod.HandlerResult
import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler0
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidChangeWorkspaceFolders
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashworkspaceFolders
import typings.vscodeLanguageserverTypes.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotworkspaceFolderMod {
  
  object DidChangeWorkspaceFoldersNotification {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.workspaceFolder", "DidChangeWorkspaceFoldersNotification.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.workspaceFolder", "DidChangeWorkspaceFoldersNotification.method")
    @js.native
    val method: workspaceSlashdidChangeWorkspaceFolders = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.workspaceFolder", "DidChangeWorkspaceFoldersNotification.type")
    @js.native
    val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
    
    type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
    
    type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
  }
  
  object WorkspaceFoldersRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.workspaceFolder", "WorkspaceFoldersRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.workspaceFolder", "WorkspaceFoldersRequest.method")
    @js.native
    val method: workspaceSlashworkspaceFolders = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.workspaceFolder", "WorkspaceFoldersRequest.type")
    @js.native
    val `type`: ProtocolRequestType0[js.Array[WorkspaceFolder] | Null, scala.Nothing, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler0[js.Array[WorkspaceFolder] | Null, Unit]
    
    type MiddlewareSignature = js.Function2[
        /* token */ CancellationToken, 
        /* next */ HandlerSignature, 
        HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
      ]
  }
  
  trait DidChangeWorkspaceFoldersParams extends StObject {
    
    /**
      * The actual workspace folder change event.
      */
    var event: WorkspaceFoldersChangeEvent
  }
  object DidChangeWorkspaceFoldersParams {
    
    inline def apply(event: WorkspaceFoldersChangeEvent): DidChangeWorkspaceFoldersParams = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[DidChangeWorkspaceFoldersParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DidChangeWorkspaceFoldersParams] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: WorkspaceFoldersChangeEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceFoldersChangeEvent extends StObject {
    
    /**
      * The array of added workspace folders
      */
    var added: js.Array[WorkspaceFolder]
    
    /**
      * The array of the removed workspace folders
      */
    var removed: js.Array[WorkspaceFolder]
  }
  object WorkspaceFoldersChangeEvent {
    
    inline def apply(added: js.Array[WorkspaceFolder], removed: js.Array[WorkspaceFolder]): WorkspaceFoldersChangeEvent = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceFoldersChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceFoldersChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setAdded(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setRemoved(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "removed", js.Array(value*))
    }
  }
  
  trait WorkspaceFoldersInitializeParams extends StObject {
    
    /**
      * The workspace folders configured in the client when the server starts.
      *
      * This property is only available if the client supports workspace folders.
      * It can be `null` if the client supports workspace folders but none are
      * configured.
      *
      * @since 3.6.0
      */
    var workspaceFolders: js.UndefOr[js.Array[WorkspaceFolder] | Null] = js.undefined
  }
  object WorkspaceFoldersInitializeParams {
    
    inline def apply(): WorkspaceFoldersInitializeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersInitializeParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceFoldersInitializeParams] (val x: Self) extends AnyVal {
      
      inline def setWorkspaceFolders(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceFoldersNull: Self = StObject.set(x, "workspaceFolders", null)
      
      inline def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
      
      inline def setWorkspaceFoldersVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "workspaceFolders", js.Array(value*))
    }
  }
  
  trait WorkspaceFoldersServerCapabilities extends StObject {
    
    /**
      * Whether the server wants to receive workspace folder
      * change notifications.
      *
      * If a string is provided the string is treated as an ID
      * under which the notification is registered on the client
      * side. The ID can be used to unregister for these events
      * using the `client/unregisterCapability` request.
      */
    var changeNotifications: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The server has support for workspace folders
      */
    var supported: js.UndefOr[Boolean] = js.undefined
  }
  object WorkspaceFoldersServerCapabilities {
    
    inline def apply(): WorkspaceFoldersServerCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceFoldersServerCapabilities] (val x: Self) extends AnyVal {
      
      inline def setChangeNotifications(value: String | Boolean): Self = StObject.set(x, "changeNotifications", value.asInstanceOf[js.Any])
      
      inline def setChangeNotificationsUndefined: Self = StObject.set(x, "changeNotifications", js.undefined)
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
      
      inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    }
  }
}

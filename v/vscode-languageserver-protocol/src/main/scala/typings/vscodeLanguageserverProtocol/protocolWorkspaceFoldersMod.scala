package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.RequestHandler0
import typings.vscodeLanguageserverProtocol.anon.WorkspaceFolders
import typings.vscodeLanguageserverProtocol.anon.`4`
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolWorkspaceFoldersMod {
  
  object DidChangeWorkspaceFoldersNotification {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification.type")
    @js.native
    val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
    
    type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
    
    type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
  }
  
  object WorkspaceFoldersRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest.type")
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
    
    extension [Self <: DidChangeWorkspaceFoldersParams](x: Self) {
      
      inline def setEvent(value: WorkspaceFoldersChangeEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceFolder extends StObject {
    
    /**
      * The name of the workspace folder. Used to refer to this
      * workspace folder in the user interface.
      */
    var name: String
    
    /**
      * The associated URI for this workspace folder.
      */
    var uri: String
  }
  object WorkspaceFolder {
    
    inline def apply(name: String, uri: String): WorkspaceFolder = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceFolder]
    }
    
    extension [Self <: WorkspaceFolder](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
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
    
    extension [Self <: WorkspaceFoldersChangeEvent](x: Self) {
      
      inline def setAdded(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      inline def setRemoved(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "removed", js.Array(value :_*))
    }
  }
  
  trait WorkspaceFoldersClientCapabilities extends StObject {
    
    /**
      * The workspace client capabilities
      */
    var workspace: js.UndefOr[WorkspaceFolders] = js.undefined
  }
  object WorkspaceFoldersClientCapabilities {
    
    inline def apply(): WorkspaceFoldersClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersClientCapabilities]
    }
    
    extension [Self <: WorkspaceFoldersClientCapabilities](x: Self) {
      
      inline def setWorkspace(value: WorkspaceFolders): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait WorkspaceFoldersInitializeParams extends StObject {
    
    /**
      * The actual configured workspace folders.
      */
    var workspaceFolders: js.Array[WorkspaceFolder] | Null
  }
  object WorkspaceFoldersInitializeParams {
    
    inline def apply(): WorkspaceFoldersInitializeParams = {
      val __obj = js.Dynamic.literal(workspaceFolders = null)
      __obj.asInstanceOf[WorkspaceFoldersInitializeParams]
    }
    
    extension [Self <: WorkspaceFoldersInitializeParams](x: Self) {
      
      inline def setWorkspaceFolders(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceFoldersNull: Self = StObject.set(x, "workspaceFolders", null)
      
      inline def setWorkspaceFoldersVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "workspaceFolders", js.Array(value :_*))
    }
  }
  
  trait WorkspaceFoldersServerCapabilities extends StObject {
    
    /**
      * The workspace server capabilities
      */
    var workspace: js.UndefOr[`4`] = js.undefined
  }
  object WorkspaceFoldersServerCapabilities {
    
    inline def apply(): WorkspaceFoldersServerCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
    }
    
    extension [Self <: WorkspaceFoldersServerCapabilities](x: Self) {
      
      inline def setWorkspace(value: `4`): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
}

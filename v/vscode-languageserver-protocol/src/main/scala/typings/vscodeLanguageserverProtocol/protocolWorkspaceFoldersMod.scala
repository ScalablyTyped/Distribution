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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolWorkspaceFoldersMod {
  
  object DidChangeWorkspaceFoldersNotification {
    
    type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
    
    type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification.type")
    @js.native
    val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
  }
  
  object WorkspaceFoldersRequest {
    
    type HandlerSignature = RequestHandler0[js.Array[WorkspaceFolder] | Null, Unit]
    
    type MiddlewareSignature = js.Function2[
        /* token */ CancellationToken, 
        /* next */ HandlerSignature, 
        HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
      ]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest.type")
    @js.native
    val `type`: ProtocolRequestType0[js.Array[WorkspaceFolder] | Null, scala.Nothing, Unit, Unit] = js.native
  }
  
  @js.native
  trait DidChangeWorkspaceFoldersParams extends StObject {
    
    /**
      * The actual workspace folder change event.
      */
    var event: WorkspaceFoldersChangeEvent = js.native
  }
  object DidChangeWorkspaceFoldersParams {
    
    @scala.inline
    def apply(event: WorkspaceFoldersChangeEvent): DidChangeWorkspaceFoldersParams = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[DidChangeWorkspaceFoldersParams]
    }
    
    @scala.inline
    implicit class DidChangeWorkspaceFoldersParamsMutableBuilder[Self <: DidChangeWorkspaceFoldersParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: WorkspaceFoldersChangeEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkspaceFolder extends StObject {
    
    /**
      * The name of the workspace folder. Used to refer to this
      * workspace folder in the user interface.
      */
    var name: String = js.native
    
    /**
      * The associated URI for this workspace folder.
      */
    var uri: String = js.native
  }
  object WorkspaceFolder {
    
    @scala.inline
    def apply(name: String, uri: String): WorkspaceFolder = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceFolder]
    }
    
    @scala.inline
    implicit class WorkspaceFolderMutableBuilder[Self <: WorkspaceFolder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkspaceFoldersChangeEvent extends StObject {
    
    /**
      * The array of added workspace folders
      */
    var added: js.Array[WorkspaceFolder] = js.native
    
    /**
      * The array of the removed workspace folders
      */
    var removed: js.Array[WorkspaceFolder] = js.native
  }
  object WorkspaceFoldersChangeEvent {
    
    @scala.inline
    def apply(added: js.Array[WorkspaceFolder], removed: js.Array[WorkspaceFolder]): WorkspaceFoldersChangeEvent = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceFoldersChangeEvent]
    }
    
    @scala.inline
    implicit class WorkspaceFoldersChangeEventMutableBuilder[Self <: WorkspaceFoldersChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      @scala.inline
      def setRemoved(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "removed", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WorkspaceFoldersClientCapabilities extends StObject {
    
    /**
      * The workspace client capabilities
      */
    var workspace: js.UndefOr[WorkspaceFolders] = js.native
  }
  object WorkspaceFoldersClientCapabilities {
    
    @scala.inline
    def apply(): WorkspaceFoldersClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersClientCapabilities]
    }
    
    @scala.inline
    implicit class WorkspaceFoldersClientCapabilitiesMutableBuilder[Self <: WorkspaceFoldersClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkspace(value: WorkspaceFolders): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  @js.native
  trait WorkspaceFoldersInitializeParams extends StObject {
    
    /**
      * The actual configured workspace folders.
      */
    var workspaceFolders: js.Array[WorkspaceFolder] | Null = js.native
  }
  object WorkspaceFoldersInitializeParams {
    
    @scala.inline
    def apply(): WorkspaceFoldersInitializeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersInitializeParams]
    }
    
    @scala.inline
    implicit class WorkspaceFoldersInitializeParamsMutableBuilder[Self <: WorkspaceFoldersInitializeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkspaceFolders(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceFoldersNull: Self = StObject.set(x, "workspaceFolders", null)
      
      @scala.inline
      def setWorkspaceFoldersVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "workspaceFolders", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WorkspaceFoldersServerCapabilities extends StObject {
    
    /**
      * The workspace server capabilities
      */
    var workspace: js.UndefOr[`4`] = js.native
  }
  object WorkspaceFoldersServerCapabilities {
    
    @scala.inline
    def apply(): WorkspaceFoldersServerCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
    }
    
    @scala.inline
    implicit class WorkspaceFoldersServerCapabilitiesMutableBuilder[Self <: WorkspaceFoldersServerCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkspace(value: `4`): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
}

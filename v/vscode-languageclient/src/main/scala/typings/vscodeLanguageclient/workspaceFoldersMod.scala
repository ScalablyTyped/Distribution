package typings.vscodeLanguageclient

import typings.vscode.mod.WorkspaceFolder
import typings.vscode.mod.WorkspaceFoldersChangeEvent
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.messagesMod.MessageType
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.DynamicFeature
import typings.vscodeLanguageclient.clientMod.NextSignature
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.MiddlewareSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceFoldersMod {
  
  @JSImport("vscode-languageclient/lib/workspaceFolders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient/lib/workspaceFolders", "WorkspaceFoldersFeature")
  @js.native
  class WorkspaceFoldersFeature protected ()
    extends StObject
       with DynamicFeature[Unit] {
    def this(_client: BaseLanguageClient) = this()
    
    var _client: js.Any = js.native
    
    var _initialFolders: js.Any = js.native
    
    var _listeners: js.Any = js.native
    
    var asProtocol: js.Any = js.native
    
    var doSendEvent: js.Any = js.native
    
    @JSName("fillInitializeParams")
    def fillInitializeParams_MWorkspaceFoldersFeature(params: InitializeParams): Unit = js.native
    
    /* protected */ def initializeWithFolders(): Unit = js.native
    /* protected */ def initializeWithFolders(currentWorkspaceFolders: js.Array[WorkspaceFolder]): Unit = js.native
    
    @JSName("messages")
    def messages_MWorkspaceFoldersFeature: MessageType = js.native
    
    /* protected */ def sendInitialEvent(): Unit = js.native
    /* protected */ def sendInitialEvent(currentWorkspaceFolders: js.Array[WorkspaceFolder]): Unit = js.native
  }
  
  @scala.inline
  def arrayDiff[T](left: js.Array[T], right: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayDiff")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait WorkspaceFolderWorkspaceMiddleware extends StObject {
    
    var didChangeWorkspaceFolders: js.UndefOr[NextSignature[WorkspaceFoldersChangeEvent, Unit]] = js.undefined
    
    var workspaceFolders: js.UndefOr[MiddlewareSignature] = js.undefined
  }
  object WorkspaceFolderWorkspaceMiddleware {
    
    @scala.inline
    def apply(): WorkspaceFolderWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
    }
    
    @scala.inline
    implicit class WorkspaceFolderWorkspaceMiddlewareMutableBuilder[Self <: WorkspaceFolderWorkspaceMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidChangeWorkspaceFolders(value: NextSignature[WorkspaceFoldersChangeEvent, Unit]): Self = StObject.set(x, "didChangeWorkspaceFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidChangeWorkspaceFoldersUndefined: Self = StObject.set(x, "didChangeWorkspaceFolders", js.undefined)
      
      @scala.inline
      def setWorkspaceFolders(
        value: (/* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[
              js.Array[typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder] | Null, 
              Unit
            ]
      ): Self = StObject.set(x, "workspaceFolders", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
    }
  }
}

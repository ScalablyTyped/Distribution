package typings.vscodeLanguageclient

import typings.vscode.mod.WorkspaceFolder
import typings.vscode.mod.WorkspaceFoldersChangeEvent
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.connectionMod.HandlerResult
import typings.vscodeLanguageclient.featuresMod.DynamicFeature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.NextSignature
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFolderMod.WorkspaceFoldersRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFolderMod.WorkspaceFoldersRequest.MiddlewareSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceFolderMod {
  
  @JSImport("vscode-languageclient/lib/common/workspaceFolder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient/lib/common/workspaceFolder", "WorkspaceFoldersFeature")
  @js.native
  open class WorkspaceFoldersFeature protected ()
    extends StObject
       with DynamicFeature[Unit] {
    def this(client: FeatureClient[WorkspaceFolderWorkspaceMiddleware, js.Object]) = this()
    
    /* private */ val _client: Any = js.native
    
    /* private */ var _initialFolders: Any = js.native
    
    /* private */ val _listeners: Any = js.native
    
    /* private */ var asProtocol: Any = js.native
    
    /* private */ var doSendEvent: Any = js.native
    
    @JSName("fillInitializeParams")
    def fillInitializeParams_MWorkspaceFoldersFeature(params: InitializeParams): Unit = js.native
    
    /* protected */ def initializeWithFolders(): Unit = js.native
    /* protected */ def initializeWithFolders(currentWorkspaceFolders: js.Array[WorkspaceFolder]): Unit = js.native
    
    @JSName("registrationType")
    def registrationType_MWorkspaceFoldersFeature: RegistrationType[Unit] = js.native
    
    /* protected */ def sendInitialEvent(): Unit = js.native
    /* protected */ def sendInitialEvent(currentWorkspaceFolders: js.Array[WorkspaceFolder]): Unit = js.native
  }
  
  inline def arrayDiff[T](left: js.Array[T], right: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayDiff")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait WorkspaceFolderMiddleware extends StObject {
    
    var didChangeWorkspaceFolders: js.UndefOr[NextSignature[WorkspaceFoldersChangeEvent, js.Promise[Unit]]] = js.undefined
    
    var workspaceFolders: js.UndefOr[MiddlewareSignature] = js.undefined
  }
  object WorkspaceFolderMiddleware {
    
    inline def apply(): WorkspaceFolderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFolderMiddleware]
    }
    
    extension [Self <: WorkspaceFolderMiddleware](x: Self) {
      
      inline def setDidChangeWorkspaceFolders(value: NextSignature[WorkspaceFoldersChangeEvent, js.Promise[Unit]]): Self = StObject.set(x, "didChangeWorkspaceFolders", value.asInstanceOf[js.Any])
      
      inline def setDidChangeWorkspaceFoldersUndefined: Self = StObject.set(x, "didChangeWorkspaceFolders", js.undefined)
      
      inline def setWorkspaceFolders(
        value: (/* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[typings.vscodeLanguageserverTypes.mod.WorkspaceFolder] | Null, Unit]
      ): Self = StObject.set(x, "workspaceFolders", js.Any.fromFunction2(value))
      
      inline def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
    }
  }
  
  trait WorkspaceFolderWorkspaceMiddleware extends StObject {
    
    var workspace: js.UndefOr[WorkspaceFolderMiddleware] = js.undefined
  }
  object WorkspaceFolderWorkspaceMiddleware {
    
    inline def apply(): WorkspaceFolderWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
    }
    
    extension [Self <: WorkspaceFolderWorkspaceMiddleware](x: Self) {
      
      inline def setWorkspace(value: WorkspaceFolderMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
}

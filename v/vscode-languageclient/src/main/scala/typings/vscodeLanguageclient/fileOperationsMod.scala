package typings.vscodeLanguageclient

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Disposable
import typings.vscode.mod.FileCreateEvent
import typings.vscode.mod.FileDeleteEvent
import typings.vscode.mod.FileRenameEvent
import typings.vscode.mod.FileType
import typings.vscode.mod.FileWillCreateEvent
import typings.vscode.mod.FileWillDeleteEvent
import typings.vscode.mod.FileWillRenameEvent
import typings.vscode.mod.Uri
import typings.vscode.mod.WorkspaceEdit
import typings.vscodeJsonrpc.Thenable
import typings.vscodeLanguageclient.anon.Files
import typings.vscodeLanguageclient.anon.NewUri
import typings.vscodeLanguageclient.featuresMod.DynamicFeature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.NextSignature
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.CreateFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.RenameFilesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileOperationsMod {
  
  @JSImport("vscode-languageclient/lib/common/fileOperations", "DidCreateFilesFeature")
  @js.native
  open class DidCreateFilesFeature protected ()
    extends StObject
       with NotificationFileOperationFeature[Uri, FileCreateEvent, CreateFilesParams] {
    def this(client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object]) = this()
  }
  
  @JSImport("vscode-languageclient/lib/common/fileOperations", "DidDeleteFilesFeature")
  @js.native
  open class DidDeleteFilesFeature protected ()
    extends StObject
       with CachingNotificationFileOperationFeature[Uri, FileDeleteEvent, DeleteFilesParams] {
    def this(client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object]) = this()
    
    /* protected */ def doSend(event: FileCreateEvent, next: js.Function1[/* event */ FileCreateEvent, js.Promise[Unit]]): js.Promise[Unit] = js.native
    
    /* private */ var willDelete: Any = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/fileOperations", "DidRenameFilesFeature")
  @js.native
  open class DidRenameFilesFeature protected ()
    extends StObject
       with CachingNotificationFileOperationFeature[NewUri, FileRenameEvent, RenameFilesParams] {
    def this(client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object]) = this()
    
    /* private */ var willRename: Any = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/fileOperations", "WillCreateFilesFeature")
  @js.native
  open class WillCreateFilesFeature protected ()
    extends StObject
       with RequestFileOperationFeature[Uri, FileWillCreateEvent, CreateFilesParams] {
    def this(client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object]) = this()
  }
  
  @JSImport("vscode-languageclient/lib/common/fileOperations", "WillDeleteFilesFeature")
  @js.native
  open class WillDeleteFilesFeature protected ()
    extends StObject
       with RequestFileOperationFeature[Uri, FileWillDeleteEvent, DeleteFilesParams] {
    def this(client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object]) = this()
  }
  
  @JSImport("vscode-languageclient/lib/common/fileOperations", "WillRenameFilesFeature")
  @js.native
  open class WillRenameFilesFeature protected ()
    extends StObject
       with RequestFileOperationFeature[NewUri, FileWillRenameEvent, RenameFilesParams] {
    def this(client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object]) = this()
  }
  
  @js.native
  trait CachingNotificationFileOperationFeature[I, E /* <: Files[I] */, P]
    extends StObject
       with NotificationFileOperationFeature[I, E, P] {
    
    /* private */ val _fsPathFileTypes: Any = js.native
    
    /* protected */ var _willListener: js.UndefOr[Disposable] = js.native
    
    /* protected */ def cacheFileTypes(event: E, prop: js.Function1[/* i */ I, Uri]): js.Promise[Unit] = js.native
    
    /* protected */ def clearFileTypeCache(): Unit = js.native
  }
  
  trait Event[I] extends StObject {
    
    val files: js.Array[I]
  }
  object Event {
    
    inline def apply[I](files: js.Array[I]): Event[I] = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event[I]]
    }
    
    extension [Self <: Event[?], I](x: Self & Event[I]) {
      
      inline def setFiles(value: js.Array[I]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: I*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  @js.native
  trait FileOperationFeature[I, E /* <: Event[I] */]
    extends StObject
       with DynamicFeature[FileOperationRegistrationOptions] {
    
    /* protected */ val _client: FeatureClient[FileOperationsWorkspaceMiddleware, js.Object] = js.native
    
    /* private */ val _clientCapability: Any = js.native
    
    /* private */ val _event: Any = js.native
    
    /* private */ val _filters: Any = js.native
    
    /* private */ var _listener: Any = js.native
    
    /* private */ val _registrationType: Any = js.native
    
    /* private */ val _serverCapability: Any = js.native
    
    /* protected */ def filter(event: E, prop: js.Function1[/* i */ I, Uri]): js.Promise[E] = js.native
    
    /* protected */ def filterSize(): Double = js.native
    
    /* protected */ def getFileType(uri: Uri): js.Promise[js.UndefOr[FileType]] = js.native
    
    @JSName("registrationType")
    def registrationType_MFileOperationFeature: RegistrationType[FileOperationRegistrationOptions] = js.native
    
    def send(data: E): js.Promise[Unit] = js.native
  }
  
  trait FileOperationsMiddleware extends StObject {
    
    var didCreateFiles: js.UndefOr[NextSignature[FileCreateEvent, js.Promise[Unit]]] = js.undefined
    
    var didDeleteFiles: js.UndefOr[NextSignature[FileDeleteEvent, js.Promise[Unit]]] = js.undefined
    
    var didRenameFiles: js.UndefOr[NextSignature[FileRenameEvent, js.Promise[Unit]]] = js.undefined
    
    var willCreateFiles: js.UndefOr[NextSignature[FileWillCreateEvent, Thenable[js.UndefOr[WorkspaceEdit | Null]]]] = js.undefined
    
    var willDeleteFiles: js.UndefOr[NextSignature[FileWillDeleteEvent, Thenable[js.UndefOr[WorkspaceEdit | Null]]]] = js.undefined
    
    var willRenameFiles: js.UndefOr[NextSignature[FileWillRenameEvent, Thenable[js.UndefOr[WorkspaceEdit | Null]]]] = js.undefined
  }
  object FileOperationsMiddleware {
    
    inline def apply(): FileOperationsMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOperationsMiddleware]
    }
    
    extension [Self <: FileOperationsMiddleware](x: Self) {
      
      inline def setDidCreateFiles(value: NextSignature[FileCreateEvent, js.Promise[Unit]]): Self = StObject.set(x, "didCreateFiles", value.asInstanceOf[js.Any])
      
      inline def setDidCreateFilesUndefined: Self = StObject.set(x, "didCreateFiles", js.undefined)
      
      inline def setDidDeleteFiles(value: NextSignature[FileDeleteEvent, js.Promise[Unit]]): Self = StObject.set(x, "didDeleteFiles", value.asInstanceOf[js.Any])
      
      inline def setDidDeleteFilesUndefined: Self = StObject.set(x, "didDeleteFiles", js.undefined)
      
      inline def setDidRenameFiles(value: NextSignature[FileRenameEvent, js.Promise[Unit]]): Self = StObject.set(x, "didRenameFiles", value.asInstanceOf[js.Any])
      
      inline def setDidRenameFilesUndefined: Self = StObject.set(x, "didRenameFiles", js.undefined)
      
      inline def setWillCreateFiles(value: NextSignature[FileWillCreateEvent, Thenable[js.UndefOr[WorkspaceEdit | Null]]]): Self = StObject.set(x, "willCreateFiles", value.asInstanceOf[js.Any])
      
      inline def setWillCreateFilesUndefined: Self = StObject.set(x, "willCreateFiles", js.undefined)
      
      inline def setWillDeleteFiles(value: NextSignature[FileWillDeleteEvent, Thenable[js.UndefOr[WorkspaceEdit | Null]]]): Self = StObject.set(x, "willDeleteFiles", value.asInstanceOf[js.Any])
      
      inline def setWillDeleteFilesUndefined: Self = StObject.set(x, "willDeleteFiles", js.undefined)
      
      inline def setWillRenameFiles(value: NextSignature[FileWillRenameEvent, Thenable[js.UndefOr[WorkspaceEdit | Null]]]): Self = StObject.set(x, "willRenameFiles", value.asInstanceOf[js.Any])
      
      inline def setWillRenameFilesUndefined: Self = StObject.set(x, "willRenameFiles", js.undefined)
    }
  }
  
  trait FileOperationsWorkspaceMiddleware extends StObject {
    
    var workspace: js.UndefOr[FileOperationsMiddleware] = js.undefined
  }
  object FileOperationsWorkspaceMiddleware {
    
    inline def apply(): FileOperationsWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOperationsWorkspaceMiddleware]
    }
    
    extension [Self <: FileOperationsWorkspaceMiddleware](x: Self) {
      
      inline def setWorkspace(value: FileOperationsMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  @js.native
  trait NotificationFileOperationFeature[I, E /* <: Files[I] */, P]
    extends StObject
       with FileOperationFeature[I, E] {
    
    /* private */ var _accessUri: Any = js.native
    
    /* private */ var _createParams: Any = js.native
    
    /* private */ var _notificationType: Any = js.native
    
    /* protected */ def doSend(event: E, next: js.Function1[/* event */ E, js.Promise[Unit]]): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait RequestEvent[I] extends StObject {
    
    val files: js.Array[I] = js.native
    
    val token: CancellationToken = js.native
    
    def waitUntil(thenable: Thenable[Any | WorkspaceEdit]): Unit = js.native
  }
  
  @js.native
  trait RequestFileOperationFeature[I, E /* <: RequestEvent[I] */, P]
    extends StObject
       with FileOperationFeature[I, E] {
    
    /* private */ var _accessUri: Any = js.native
    
    /* private */ var _createParams: Any = js.native
    
    /* private */ var _requestType: Any = js.native
    
    /* protected */ def doSend(event: E, next: js.Function1[/* event */ RequestEvent[I], Thenable[Any | WorkspaceEdit]]): Thenable[Any | WorkspaceEdit] = js.native
    
    /* private */ var waitUntil: Any = js.native
  }
}

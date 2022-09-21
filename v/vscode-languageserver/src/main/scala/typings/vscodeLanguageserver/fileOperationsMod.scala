package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.connectionMod.NotificationHandler
import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeLanguageserver.serverMod.Feature
import typings.vscodeLanguageserver.serverMod._RemoteWorkspace
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.CreateFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.RenameFilesParams
import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileOperationsMod {
  
  @JSImport("vscode-languageserver/lib/common/fileOperations", "FileOperationsFeature")
  @js.native
  val FileOperationsFeature: Feature[_RemoteWorkspace, FileOperationsFeatureShape] = js.native
  
  trait FileOperationsFeatureShape extends StObject {
    
    def onDidCreateFiles(handler: NotificationHandler[CreateFilesParams]): Disposable
    
    def onDidDeleteFiles(handler: NotificationHandler[DeleteFilesParams]): Disposable
    
    def onDidRenameFiles(handler: NotificationHandler[RenameFilesParams]): Disposable
    
    def onWillCreateFiles(handler: RequestHandler[CreateFilesParams, WorkspaceEdit | Null, scala.Nothing]): Disposable
    
    def onWillDeleteFiles(handler: RequestHandler[DeleteFilesParams, WorkspaceEdit | Null, scala.Nothing]): Disposable
    
    def onWillRenameFiles(handler: RequestHandler[RenameFilesParams, WorkspaceEdit | Null, scala.Nothing]): Disposable
  }
  object FileOperationsFeatureShape {
    
    inline def apply(
      onDidCreateFiles: NotificationHandler[CreateFilesParams] => Disposable,
      onDidDeleteFiles: NotificationHandler[DeleteFilesParams] => Disposable,
      onDidRenameFiles: NotificationHandler[RenameFilesParams] => Disposable,
      onWillCreateFiles: RequestHandler[CreateFilesParams, WorkspaceEdit | Null, scala.Nothing] => Disposable,
      onWillDeleteFiles: RequestHandler[DeleteFilesParams, WorkspaceEdit | Null, scala.Nothing] => Disposable,
      onWillRenameFiles: RequestHandler[RenameFilesParams, WorkspaceEdit | Null, scala.Nothing] => Disposable
    ): FileOperationsFeatureShape = {
      val __obj = js.Dynamic.literal(onDidCreateFiles = js.Any.fromFunction1(onDidCreateFiles), onDidDeleteFiles = js.Any.fromFunction1(onDidDeleteFiles), onDidRenameFiles = js.Any.fromFunction1(onDidRenameFiles), onWillCreateFiles = js.Any.fromFunction1(onWillCreateFiles), onWillDeleteFiles = js.Any.fromFunction1(onWillDeleteFiles), onWillRenameFiles = js.Any.fromFunction1(onWillRenameFiles))
      __obj.asInstanceOf[FileOperationsFeatureShape]
    }
    
    extension [Self <: FileOperationsFeatureShape](x: Self) {
      
      inline def setOnDidCreateFiles(value: NotificationHandler[CreateFilesParams] => Disposable): Self = StObject.set(x, "onDidCreateFiles", js.Any.fromFunction1(value))
      
      inline def setOnDidDeleteFiles(value: NotificationHandler[DeleteFilesParams] => Disposable): Self = StObject.set(x, "onDidDeleteFiles", js.Any.fromFunction1(value))
      
      inline def setOnDidRenameFiles(value: NotificationHandler[RenameFilesParams] => Disposable): Self = StObject.set(x, "onDidRenameFiles", js.Any.fromFunction1(value))
      
      inline def setOnWillCreateFiles(value: RequestHandler[CreateFilesParams, WorkspaceEdit | Null, scala.Nothing] => Disposable): Self = StObject.set(x, "onWillCreateFiles", js.Any.fromFunction1(value))
      
      inline def setOnWillDeleteFiles(value: RequestHandler[DeleteFilesParams, WorkspaceEdit | Null, scala.Nothing] => Disposable): Self = StObject.set(x, "onWillDeleteFiles", js.Any.fromFunction1(value))
      
      inline def setOnWillRenameFiles(value: RequestHandler[RenameFilesParams, WorkspaceEdit | Null, scala.Nothing] => Disposable): Self = StObject.set(x, "onWillRenameFiles", js.Any.fromFunction1(value))
    }
  }
}

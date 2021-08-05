package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.eventsMod.Disposable
import typings.vscodeJsonrpc.eventsMod.Event
import typings.vscodeLanguageserver.mod.Feature
import typings.vscodeLanguageserver.mod._RemoteWorkspace
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceFoldersMod {
  
  @JSImport("vscode-languageserver/lib/workspaceFolders", "WorkspaceFoldersFeature")
  @js.native
  val WorkspaceFoldersFeature: Feature[_RemoteWorkspace, WorkspaceFolders] = js.native
  
  trait WorkspaceFolders extends StObject {
    
    def getWorkspaceFolders(): js.Promise[js.Array[WorkspaceFolder] | Null]
    
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, js.Any]): Disposable
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, js.Any], thisArgs: js.Any): Disposable
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, js.Any],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, js.Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable
    @JSName("onDidChangeWorkspaceFolders")
    var onDidChangeWorkspaceFolders_Original: Event[WorkspaceFoldersChangeEvent]
  }
  object WorkspaceFolders {
    
    inline def apply(
      getWorkspaceFolders: () => js.Promise[js.Array[WorkspaceFolder] | Null],
      onDidChangeWorkspaceFolders: (/* listener */ js.Function1[WorkspaceFoldersChangeEvent, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): WorkspaceFolders = {
      val __obj = js.Dynamic.literal(getWorkspaceFolders = js.Any.fromFunction0(getWorkspaceFolders), onDidChangeWorkspaceFolders = js.Any.fromFunction3(onDidChangeWorkspaceFolders))
      __obj.asInstanceOf[WorkspaceFolders]
    }
    
    extension [Self <: WorkspaceFolders](x: Self) {
      
      inline def setGetWorkspaceFolders(value: () => js.Promise[js.Array[WorkspaceFolder] | Null]): Self = StObject.set(x, "getWorkspaceFolders", js.Any.fromFunction0(value))
      
      inline def setOnDidChangeWorkspaceFolders(
        value: (/* listener */ js.Function1[WorkspaceFoldersChangeEvent, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
      ): Self = StObject.set(x, "onDidChangeWorkspaceFolders", js.Any.fromFunction3(value))
    }
  }
}

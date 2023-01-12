package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonEventsMod.Event
import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod._RemoteWorkspace
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotworkspaceFolderMod.WorkspaceFoldersChangeEvent
import typings.vscodeLanguageserverTypes.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonWorkspaceFolderMod {
  
  @JSImport("vscode-languageserver/lib/common/workspaceFolder", "WorkspaceFoldersFeature")
  @js.native
  val WorkspaceFoldersFeature: Feature[_RemoteWorkspace, WorkspaceFolders] = js.native
  
  trait WorkspaceFolders extends StObject {
    
    def getWorkspaceFolders(): js.Promise[js.Array[WorkspaceFolder] | Null]
    
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, Any]): Disposable
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, Any], thisArgs: Any): Disposable
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, Any],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable
    @JSName("onDidChangeWorkspaceFolders")
    var onDidChangeWorkspaceFolders_Original: Event[WorkspaceFoldersChangeEvent]
  }
  object WorkspaceFolders {
    
    inline def apply(
      getWorkspaceFolders: () => js.Promise[js.Array[WorkspaceFolder] | Null],
      onDidChangeWorkspaceFolders: (/* listener */ js.Function1[WorkspaceFoldersChangeEvent, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): WorkspaceFolders = {
      val __obj = js.Dynamic.literal(getWorkspaceFolders = js.Any.fromFunction0(getWorkspaceFolders), onDidChangeWorkspaceFolders = js.Any.fromFunction3(onDidChangeWorkspaceFolders))
      __obj.asInstanceOf[WorkspaceFolders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceFolders] (val x: Self) extends AnyVal {
      
      inline def setGetWorkspaceFolders(value: () => js.Promise[js.Array[WorkspaceFolder] | Null]): Self = StObject.set(x, "getWorkspaceFolders", js.Any.fromFunction0(value))
      
      inline def setOnDidChangeWorkspaceFolders(
        value: (/* listener */ js.Function1[WorkspaceFoldersChangeEvent, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
      ): Self = StObject.set(x, "onDidChangeWorkspaceFolders", js.Any.fromFunction3(value))
    }
  }
}

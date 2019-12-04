package typings.vscodeDashLanguageserver

import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libEventsMod.Event
import typings.vscodeDashLanguageserver.libWorkspaceFoldersMod.WorkspaceFolders
import typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod.Feature
import typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod._RemoteWorkspace
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/workspaceFolders", JSImport.Namespace)
@js.native
object libWorkspaceFoldersMod extends js.Object {
  @js.native
  trait WorkspaceFolders extends js.Object {
    @JSName("onDidChangeWorkspaceFolders")
    var onDidChangeWorkspaceFolders_Original: Event[WorkspaceFoldersChangeEvent] = js.native
    def getWorkspaceFolders(): Thenable[js.Array[WorkspaceFolder] | Null] = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _]): Disposable = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _], thisArgs: js.Any): Disposable = js.native
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
  }
  
  val WorkspaceFoldersFeature: Feature[_RemoteWorkspace, WorkspaceFolders] = js.native
}


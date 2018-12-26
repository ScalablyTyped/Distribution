package typings
package vscodeDashLanguageclientLib.libWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/workspaceFolders", "WorkspaceFoldersFeature")
@js.native
class WorkspaceFoldersFeature protected ()
  extends vscodeDashLanguageclientLib.libClientMod.DynamicFeature[js.UndefOr[scala.Nothing]] {
  def this(_client: vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient) = this()
  var _client: js.Any = js.native
  var _listeners: js.Any = js.native
  var asProtocol: js.Any = js.native
  @JSName("messages")
  val messages_WorkspaceFoldersFeature: vscodeDashJsonrpcLib.libMessagesMod.MessageType = js.native
  @JSName("fillInitializeParams")
  def fillInitializeParams_MWorkspaceFoldersFeature(params: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeParams): scala.Unit = js.native
}


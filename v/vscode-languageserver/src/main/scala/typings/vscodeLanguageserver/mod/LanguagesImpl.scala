package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.progressMod.ResultProgress
import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vscodeLanguageserver.mod._Languages because var conflicts: connection. Inlined attachWorkDoneProgress, attachPartialResultProgress */ @JSImport("vscode-languageserver", "LanguagesImpl")
@js.native
class LanguagesImpl () extends Remote {
  var _connection: js.Any = js.native
  /**
    * The connection this remote is attached to.
    */
  /* CompleteClass */
  override var connection: IConnection = js.native
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  /* CompleteClass */
  override def attach(connection: IConnection): Unit = js.native
  def attachPartialResultProgress[PR](_type: typings.vscodeLanguageserverProtocol.mod.ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgress[PR]] = js.native
  def attachWorkDoneProgress(params: WorkDoneProgressParams): typings.vscodeLanguageserver.progressMod.WorkDoneProgress = js.native
  @JSName("connection")
  def connection_MLanguagesImpl: IConnection = js.native
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  /* CompleteClass */
  override def fillServerCapabilities(capabilities: ServerCapabilities[_]): Unit = js.native
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  /* CompleteClass */
  override def initialize(capabilities: ClientCapabilities): Unit = js.native
}


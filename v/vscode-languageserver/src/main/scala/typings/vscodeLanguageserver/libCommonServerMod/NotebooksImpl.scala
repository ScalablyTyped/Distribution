package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserver.libCommonProgressMod.ResultProgressReporter
import typings.vscodeLanguageserver.libCommonProgressMod.WorkDoneProgressReporter
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vscodeLanguageserver.libCommonServerMod.FeatureBase because Already inherited
- typings.vscodeLanguageserver.libCommonServerMod._Notebooks because var conflicts: connection. Inlined attachWorkDoneProgress, attachPartialResultProgress */ @JSImport("vscode-languageserver/lib/common/server", "_NotebooksImpl")
@js.native
open class NotebooksImpl ()
  extends StObject
     with Remote {
  
  /* private */ var _connection: Any = js.native
  
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  /* CompleteClass */
  override def attach(connection: Connection): Unit = js.native
  
  def attachPartialResultProgress[PR](_type: ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgressReporter[PR]] = js.native
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): WorkDoneProgressReporter = js.native
  
  /**
    * The connection this remote is attached to.
    */
  /* CompleteClass */
  var connection: Connection = js.native
  @JSName("connection")
  def connection_MNotebooksImpl: Connection = js.native
  
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  /* CompleteClass */
  override def fillServerCapabilities(capabilities: ServerCapabilities[LSPAny]): Unit = js.native
  
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  /* CompleteClass */
  override def initialize(capabilities: ClientCapabilities): Unit = js.native
}

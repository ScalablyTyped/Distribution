package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.progressMod.ResultProgress
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vscodeLanguageserver.mod._Languages because var conflicts: connection. Inlined attachWorkDoneProgress, attachPartialResultProgress */ @JSImport("vscode-languageserver", "LanguagesImpl")
@js.native
class LanguagesImpl () extends Remote {
  
  var _connection: js.Any = js.native
  
  def attachPartialResultProgress[PR](_type: typings.vscodeLanguageserverProtocol.mod.ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgress[PR]] = js.native
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): typings.vscodeLanguageserver.progressMod.WorkDoneProgress = js.native
  
  @JSName("connection")
  def connection_MLanguagesImpl: IConnection = js.native
}

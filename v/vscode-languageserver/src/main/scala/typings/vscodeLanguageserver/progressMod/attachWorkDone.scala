package typings.vscodeLanguageserver.progressMod

import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver/lib/progress", "attachWorkDone")
@js.native
object attachWorkDone extends js.Object {
  
  def apply(connection: ProgressContext): WorkDoneProgress = js.native
  def apply(connection: ProgressContext, params: WorkDoneProgressParams): WorkDoneProgress = js.native
}

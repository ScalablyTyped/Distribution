package typings.vscodeLanguageserver.progressMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver/lib/progress", "attachPartialResult")
@js.native
object attachPartialResult extends js.Object {
  
  def apply[R](connection: ProgressContext, params: PartialResultParams): js.UndefOr[ResultProgress[R]] = js.native
}

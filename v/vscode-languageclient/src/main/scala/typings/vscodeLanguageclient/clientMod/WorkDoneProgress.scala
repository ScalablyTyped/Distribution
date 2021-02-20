package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressBegin
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressEnd
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgress {
  
  @JSImport("vscode-languageclient/lib/client", "WorkDoneProgress.type")
  @js.native
  val `type`: typings.vscodeJsonrpc.mod.ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}

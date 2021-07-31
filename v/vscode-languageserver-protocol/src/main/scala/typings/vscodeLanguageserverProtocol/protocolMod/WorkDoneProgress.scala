package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressBegin
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressEnd
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgress {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgress.type")
  @js.native
  val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}

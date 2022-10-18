package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressBegin
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressEnd
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgress {
  
  @JSImport("vscode-languageserver", "WorkDoneProgress")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: typings.vscodeJsonrpc.mod.ProgressType[Any]): /* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean]
  
  @JSImport("vscode-languageserver", "WorkDoneProgress.type")
  @js.native
  val `type`: typings.vscodeJsonrpc.mod.ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}

package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkDoneProgressOptions extends StObject {
  
  var workDoneProgress: js.UndefOr[Boolean] = js.undefined
}
object WorkDoneProgressOptions {
  
  inline def apply(): WorkDoneProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkDoneProgressOptions]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasWorkDoneProgress(value: Any): /* is vscode-languageserver-protocol.anon.WorkDoneProgress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWorkDoneProgress")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.WorkDoneProgress */ Boolean]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.WorkDoneProgressOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.WorkDoneProgressOptions */ Boolean]
  
  extension [Self <: WorkDoneProgressOptions](x: Self) {
    
    inline def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
    
    inline def setWorkDoneProgressUndefined: Self = StObject.set(x, "workDoneProgress", js.undefined)
  }
}

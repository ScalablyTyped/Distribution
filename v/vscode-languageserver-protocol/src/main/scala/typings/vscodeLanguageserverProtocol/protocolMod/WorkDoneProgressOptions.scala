package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkDoneProgressOptions extends StObject {
  
  var workDoneProgress: js.UndefOr[Boolean] = js.native
}
object WorkDoneProgressOptions {
  
  @scala.inline
  def apply(): WorkDoneProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkDoneProgressOptions]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgressOptions.hasWorkDoneProgress")
  @js.native
  def hasWorkDoneProgress(value: js.Any): /* is vscode-languageserver-protocol.anon.WorkDoneProgress */ Boolean = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgressOptions.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.WorkDoneProgressOptions */ Boolean = js.native
  
  @scala.inline
  implicit class WorkDoneProgressOptionsMutableBuilder[Self <: WorkDoneProgressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDoneProgressUndefined: Self = StObject.set(x, "workDoneProgress", js.undefined)
  }
}

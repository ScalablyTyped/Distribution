package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkDoneProgressOptions extends StObject {
  
  var workDoneProgress: js.UndefOr[Boolean] = js.undefined
}
object WorkDoneProgressOptions {
  
  @scala.inline
  def apply(): WorkDoneProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkDoneProgressOptions]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgressOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasWorkDoneProgress(value: js.Any): /* is vscode-languageserver-protocol.anon.WorkDoneProgress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWorkDoneProgress")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.WorkDoneProgress */ Boolean]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.WorkDoneProgressOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.WorkDoneProgressOptions */ Boolean]
  
  @scala.inline
  implicit class WorkDoneProgressOptionsMutableBuilder[Self <: WorkDoneProgressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDoneProgressUndefined: Self = StObject.set(x, "workDoneProgress", js.undefined)
  }
}

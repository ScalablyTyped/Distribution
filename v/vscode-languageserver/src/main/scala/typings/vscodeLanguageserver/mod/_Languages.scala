package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.progressMod.ResultProgress
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Languages extends StObject {
  
  def attachPartialResultProgress[PR](`type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgress[PR]]
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): typings.vscodeLanguageserver.progressMod.WorkDoneProgress
  
  var connection: IConnection
}
object _Languages {
  
  inline def apply(
    attachPartialResultProgress: (typings.vscodeLanguageserverProtocol.mod.ProgressType[js.Any], PartialResultParams) => js.UndefOr[ResultProgress[js.Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => typings.vscodeLanguageserver.progressMod.WorkDoneProgress,
    connection: IConnection
  ): _Languages = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Languages]
  }
  
  extension [Self <: _Languages](x: Self) {
    
    inline def setAttachPartialResultProgress(
      value: (typings.vscodeLanguageserverProtocol.mod.ProgressType[js.Any], PartialResultParams) => js.UndefOr[ResultProgress[js.Any]]
    ): Self = StObject.set(x, "attachPartialResultProgress", js.Any.fromFunction2(value))
    
    inline def setAttachWorkDoneProgress(value: WorkDoneProgressParams => typings.vscodeLanguageserver.progressMod.WorkDoneProgress): Self = StObject.set(x, "attachWorkDoneProgress", js.Any.fromFunction1(value))
    
    inline def setConnection(value: IConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}

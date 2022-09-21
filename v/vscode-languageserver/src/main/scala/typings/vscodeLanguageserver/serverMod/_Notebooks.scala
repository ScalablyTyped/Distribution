package typings.vscodeLanguageserver.serverMod

import typings.vscodeLanguageserver.progressMod.ResultProgressReporter
import typings.vscodeLanguageserver.progressMod.WorkDoneProgressReporter
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Notebooks
  extends StObject
     with FeatureBase {
  
  def attachPartialResultProgress[PR](`type`: ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgressReporter[PR]]
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): WorkDoneProgressReporter
  
  var connection: Connection
}
object _Notebooks {
  
  inline def apply(
    attachPartialResultProgress: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => WorkDoneProgressReporter,
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Unit,
    initialize: ClientCapabilities => Unit
  ): _Notebooks = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[_Notebooks]
  }
  
  extension [Self <: _Notebooks](x: Self) {
    
    inline def setAttachPartialResultProgress(value: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]]): Self = StObject.set(x, "attachPartialResultProgress", js.Any.fromFunction2(value))
    
    inline def setAttachWorkDoneProgress(value: WorkDoneProgressParams => WorkDoneProgressReporter): Self = StObject.set(x, "attachWorkDoneProgress", js.Any.fromFunction1(value))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}

package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkDoneProgressParams extends StObject {
  
  /**
    * An optional token that a server can use to report work done progress.
    */
  var workDoneToken: js.UndefOr[ProgressToken] = js.undefined
}
object WorkDoneProgressParams {
  
  @scala.inline
  def apply(): WorkDoneProgressParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkDoneProgressParams]
  }
  
  @scala.inline
  implicit class WorkDoneProgressParamsMutableBuilder[Self <: WorkDoneProgressParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkDoneToken(value: ProgressToken): Self = StObject.set(x, "workDoneToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDoneTokenUndefined: Self = StObject.set(x, "workDoneToken", js.undefined)
  }
}

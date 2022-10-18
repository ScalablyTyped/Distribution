package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceDiagnosticParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The additional identifier provided during registration.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * The currently known diagnostic reports with their
    * previous result ids.
    */
  var previousResultIds: js.Array[PreviousResultId]
}
object WorkspaceDiagnosticParams {
  
  inline def apply(previousResultIds: js.Array[PreviousResultId]): WorkspaceDiagnosticParams = {
    val __obj = js.Dynamic.literal(previousResultIds = previousResultIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceDiagnosticParams]
  }
  
  extension [Self <: WorkspaceDiagnosticParams](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPreviousResultIds(value: js.Array[PreviousResultId]): Self = StObject.set(x, "previousResultIds", value.asInstanceOf[js.Any])
    
    inline def setPreviousResultIdsVarargs(value: PreviousResultId*): Self = StObject.set(x, "previousResultIds", js.Array(value*))
  }
}

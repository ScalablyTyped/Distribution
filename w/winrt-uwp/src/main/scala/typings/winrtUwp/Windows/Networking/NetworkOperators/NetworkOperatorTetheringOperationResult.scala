package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a StartTetheringAsync or StopTetheringAsync operation. In addition to the TetheringOperationStatus value, it can include an optional error message string that provides mobile operator specific context to the error. */
@js.native
trait NetworkOperatorTetheringOperationResult extends StObject {
  
  /** An optional error message string that provides mobile operator specific context to the error. */
  var additionalErrorMessage: String = js.native
  
  /** Indicates the result of a tethering operation. Possible values are defined by TetheringOperationStatus . */
  var status: TetheringOperationStatus = js.native
}
object NetworkOperatorTetheringOperationResult {
  
  @scala.inline
  def apply(additionalErrorMessage: String, status: TetheringOperationStatus): NetworkOperatorTetheringOperationResult = {
    val __obj = js.Dynamic.literal(additionalErrorMessage = additionalErrorMessage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringOperationResult]
  }
  
  @scala.inline
  implicit class NetworkOperatorTetheringOperationResultMutableBuilder[Self <: NetworkOperatorTetheringOperationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalErrorMessage(value: String): Self = StObject.set(x, "additionalErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TetheringOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

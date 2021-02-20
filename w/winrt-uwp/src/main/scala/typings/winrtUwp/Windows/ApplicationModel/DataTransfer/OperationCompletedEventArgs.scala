package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains info about the action that a target app completed during a paste operation. */
@js.native
trait OperationCompletedEventArgs extends StObject {
  
  var acceptedFormatId: js.Any = js.native
  
  /* unmapped type */
  /** Specifies the operation that the target app completed. */
  var operation: DataPackageOperation = js.native
}
object OperationCompletedEventArgs {
  
  @scala.inline
  def apply(acceptedFormatId: js.Any, operation: DataPackageOperation): OperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(acceptedFormatId = acceptedFormatId.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class OperationCompletedEventArgsMutableBuilder[Self <: OperationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedFormatId(value: js.Any): Self = StObject.set(x, "acceptedFormatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: DataPackageOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}

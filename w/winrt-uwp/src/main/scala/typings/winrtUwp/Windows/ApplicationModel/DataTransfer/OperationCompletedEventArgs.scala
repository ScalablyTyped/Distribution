package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains info about the action that a target app completed during a paste operation. */
trait OperationCompletedEventArgs extends StObject {
  
  var acceptedFormatId: Any
  
  /* unmapped type */
  /** Specifies the operation that the target app completed. */
  var operation: DataPackageOperation
}
object OperationCompletedEventArgs {
  
  inline def apply(acceptedFormatId: Any, operation: DataPackageOperation): OperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(acceptedFormatId = acceptedFormatId.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationCompletedEventArgs]
  }
  
  extension [Self <: OperationCompletedEventArgs](x: Self) {
    
    inline def setAcceptedFormatId(value: Any): Self = StObject.set(x, "acceptedFormatId", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: DataPackageOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}

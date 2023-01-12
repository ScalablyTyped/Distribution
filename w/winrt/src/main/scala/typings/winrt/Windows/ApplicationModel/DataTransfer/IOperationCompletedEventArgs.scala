package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOperationCompletedEventArgs extends StObject {
  
  var operation: DataPackageOperation
}
object IOperationCompletedEventArgs {
  
  inline def apply(operation: DataPackageOperation): IOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperationCompletedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOperationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: DataPackageOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}

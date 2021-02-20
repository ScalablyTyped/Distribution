package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOperationCompletedEventArgs extends StObject {
  
  var operation: DataPackageOperation = js.native
}
object IOperationCompletedEventArgs {
  
  @scala.inline
  def apply(operation: DataPackageOperation): IOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class IOperationCompletedEventArgsMutableBuilder[Self <: IOperationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: DataPackageOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}

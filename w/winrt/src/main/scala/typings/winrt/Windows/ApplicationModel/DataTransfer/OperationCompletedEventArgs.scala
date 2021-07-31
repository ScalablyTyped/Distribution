package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationCompletedEventArgs
  extends StObject
     with IOperationCompletedEventArgs
object OperationCompletedEventArgs {
  
  @scala.inline
  def apply(operation: DataPackageOperation): OperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationCompletedEventArgs]
  }
}

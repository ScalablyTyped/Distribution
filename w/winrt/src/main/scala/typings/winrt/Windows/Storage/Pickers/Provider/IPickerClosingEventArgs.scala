package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPickerClosingEventArgs extends StObject {
  
  var closingOperation: PickerClosingOperation
  
  var isCanceled: Boolean
}
object IPickerClosingEventArgs {
  
  inline def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): IPickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerClosingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPickerClosingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setClosingOperation(value: PickerClosingOperation): Self = StObject.set(x, "closingOperation", value.asInstanceOf[js.Any])
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
  }
}

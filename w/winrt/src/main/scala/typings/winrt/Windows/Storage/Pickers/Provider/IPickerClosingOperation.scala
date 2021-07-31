package typings.winrt.Windows.Storage.Pickers.Provider

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPickerClosingOperation extends StObject {
  
  var deadline: Date
  
  def getDeferral(): PickerClosingDeferral
}
object IPickerClosingOperation {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => PickerClosingDeferral): IPickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IPickerClosingOperation]
  }
  
  @scala.inline
  implicit class IPickerClosingOperationMutableBuilder[Self <: IPickerClosingOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => PickerClosingDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}

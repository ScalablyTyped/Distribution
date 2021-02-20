package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPickerClosingDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object IPickerClosingDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IPickerClosingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPickerClosingDeferral]
  }
  
  @scala.inline
  implicit class IPickerClosingDeferralMutableBuilder[Self <: IPickerClosingDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}

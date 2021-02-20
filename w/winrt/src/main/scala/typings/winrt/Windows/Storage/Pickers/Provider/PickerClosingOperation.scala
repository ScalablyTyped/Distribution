package typings.winrt.Windows.Storage.Pickers.Provider

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerClosingOperation extends IPickerClosingOperation
object PickerClosingOperation {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => PickerClosingDeferral): PickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[PickerClosingOperation]
  }
}

package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerClosingEventArgs
  extends StObject
     with IPickerClosingEventArgs
object PickerClosingEventArgs {
  
  inline def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): PickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerClosingEventArgs]
  }
}

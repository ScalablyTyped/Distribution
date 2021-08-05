package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerClosingDeferral
  extends StObject
     with IPickerClosingDeferral
object PickerClosingDeferral {
  
  inline def apply(complete: () => Unit): PickerClosingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PickerClosingDeferral]
  }
}

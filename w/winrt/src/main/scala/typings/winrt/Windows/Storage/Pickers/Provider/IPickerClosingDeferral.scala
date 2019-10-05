package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingDeferral extends js.Object {
  def complete(): Unit
}

object IPickerClosingDeferral {
  @scala.inline
  def apply(complete: () => Unit): IPickerClosingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IPickerClosingDeferral]
  }
}


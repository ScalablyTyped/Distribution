package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderDeferral extends js.Object {
  def complete(): Unit
}

object IDataProviderDeferral {
  @scala.inline
  def apply(complete: () => Unit): IDataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IDataProviderDeferral]
  }
}


package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequestDeferral extends js.Object {
  def complete(): Unit
}

object IDataRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): IDataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IDataRequestDeferral]
  }
}


package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
@js.native
trait DataProviderDeferral extends js.Object {
  /** Informs a DataPackage that it is ready for processing. */
  def complete(): Unit = js.native
}

object DataProviderDeferral {
  @scala.inline
  def apply(complete: () => Unit): DataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataProviderDeferral]
  }
  @scala.inline
  implicit class DataProviderDeferralOps[Self <: DataProviderDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
  
}


package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
trait DataProviderDeferral extends js.Object {
  /** Informs a DataPackage that it is ready for processing. */
  def complete(): Unit
}

object DataProviderDeferral {
  @scala.inline
  def apply(complete: () => Unit): DataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataProviderDeferral]
  }
}


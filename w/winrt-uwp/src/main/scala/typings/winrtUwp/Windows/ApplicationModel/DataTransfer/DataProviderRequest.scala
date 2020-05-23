package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object of this type is passed to the DataProviderHandler delegate. */
trait DataProviderRequest extends js.Object {
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: Date
  /** Specifies the format id. */
  var formatId: String
  /**
    * Returns a DataProviderDeferral object.
    * @return An data provider deferral object.
    */
  def getDeferral(): DataProviderDeferral
  /**
    * Sets the content of the DataPackage to be shared with a target app.
    * @param value The object associated with a particular format in the DataPackage .
    */
  def setData(value: js.Any): Unit
}

object DataProviderRequest {
  @scala.inline
  def apply(deadline: Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: js.Any => Unit): DataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[DataProviderRequest]
  }
}


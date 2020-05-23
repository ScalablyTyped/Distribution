package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information that indicates why a Producer app was stopped. */
trait AllJoynProducerStoppedEventArgs extends js.Object {
  /** Returns an AllJoyn status code that indicates why the Producer was stopped. Common values are defined by AllJoynStatus . */
  var status: Double
}

object AllJoynProducerStoppedEventArgs {
  @scala.inline
  def apply(status: Double): AllJoynProducerStoppedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynProducerStoppedEventArgs]
  }
}


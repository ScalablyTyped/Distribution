package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information that indicates why a Producer app was stopped. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs")
@js.native
class AllJoynProducerStoppedEventArgs protected () extends js.Object {
  /**
    * Generates an object containing status information for the stopped Producer app.
    * @param status An AllJoyn status code that indicates why the Producer was stopped.
    */
  def this(status: Double) = this()
  /** Returns an AllJoyn status code that indicates why the Producer was stopped. Common values are defined by AllJoynStatus . */
  var status: Double = js.native
}


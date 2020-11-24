package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information that indicates why a Producer app was stopped. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs")
@js.native
class AllJoynProducerStoppedEventArgs protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs {
  /**
    * Generates an object containing status information for the stopped Producer app.
    * @param status An AllJoyn status code that indicates why the Producer was stopped.
    */
  def this(status: Double) = this()
}

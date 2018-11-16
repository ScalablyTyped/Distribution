package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionPropertyChangeRequest")
@js.native
abstract class PerceptionPropertyChangeRequest () extends js.Object {
  /** Gets the name of the property to change. */
  var name: java.lang.String = js.native
  /** Sets the new status of the request after processing the request. */
  var status: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus = js.native
  /** Gets the requested new value of the property. */
  var value: js.Any = js.native
  /**
                       * Gets a Windows::Foundation::Deferral object to allow background processing if needed.
                       * @return The Deferral object.
                       */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}


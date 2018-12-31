package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies an advertising app that is no longer available. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs")
@js.native
class AllJoynServiceInfoRemovedEventArgs protected () extends js.Object {
  /**
    * Generates an object containing information about an advertising app that is no longer available.
    * @param uniqueName The unique app name.
    */
  def this(uniqueName: java.lang.String) = this()
  /** The unique bus name of the advertising app that is no longer available. */
  var uniqueName: java.lang.String = js.native
}


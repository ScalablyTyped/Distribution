package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs")
@js.native
class AllJoynAcceptSessionJoinerEventArgs protected () extends js.Object {
  /**
    * Generates an object containing information about the connection being accepted to the session and the method that completes the session join.
    * @param uniqueName The unique bus name.
    * @param sessionPort The session port used for the connection.
    * @param trafficType The type of traffic provided over the connection.
    * @param proximity Indicates network proximity.
    * @param acceptSessionJoiner The IAllJoynAcceptSessionJoiner object used to complete the session join.
    */
  def this(uniqueName: java.lang.String, sessionPort: scala.Double, trafficType: AllJoynTrafficType, proximity: scala.Double, acceptSessionJoiner: IAllJoynAcceptSessionJoiner) = this()
  /** Indicates if the app joining the session is on the same network. */
  var sameNetwork: scala.Boolean = js.native
  /** The app joining the session is on the same physical node. */
  var samePhysicalNode: scala.Boolean = js.native
  /** The session port being used to connect to the session. */
  var sessionPort: scala.Double = js.native
  /** The traffic type supported during the session. */
  var trafficType: AllJoynTrafficType = js.native
  /** The unique bus name of the app requesting a session connection. */
  var uniqueName: java.lang.String = js.native
  /** Called to accept the session connection. */
  def accept(): scala.Unit = js.native
}


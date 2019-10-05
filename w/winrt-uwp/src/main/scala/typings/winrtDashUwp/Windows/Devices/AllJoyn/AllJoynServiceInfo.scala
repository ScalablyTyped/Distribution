package typings.winrtDashUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes unique name and transport information for an advertising app. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfo")
@js.native
class AllJoynServiceInfo protected () extends js.Object {
  /**
    * Generates an AllJoynServiceInfo object that represents an advertising app. This object provides the unique bus name, object path and transport information.
    * @param uniqueName The unique bus name.
    * @param objectPath The object path.
    * @param sessionPort The port for this session.
    */
  def this(uniqueName: String, objectPath: String, sessionPort: Double) = this()
  /** The path to the service object. This path is used to match communications with service objects connected to the session. */
  var objectPath: String = js.native
  /** The port used to connect to the session. */
  var sessionPort: Double = js.native
  /** The unique bus name associated with the advertising app. */
  var uniqueName: String = js.native
}


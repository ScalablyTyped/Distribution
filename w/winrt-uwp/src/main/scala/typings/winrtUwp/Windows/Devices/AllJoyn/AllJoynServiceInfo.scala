package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes unique name and transport information for an advertising app. */
trait AllJoynServiceInfo extends js.Object {
  /** The path to the service object. This path is used to match communications with service objects connected to the session. */
  var objectPath: String
  /** The port used to connect to the session. */
  var sessionPort: Double
  /** The unique bus name associated with the advertising app. */
  var uniqueName: String
}

object AllJoynServiceInfo {
  @scala.inline
  def apply(objectPath: String, sessionPort: Double, uniqueName: String): AllJoynServiceInfo = {
    val __obj = js.Dynamic.literal(objectPath = objectPath.asInstanceOf[js.Any], sessionPort = sessionPort.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfo]
  }
}


package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes unique name and transport information for an advertising app. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfo")
@js.native
class AllJoynServiceInfo protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynServiceInfo {
  /**
    * Generates an AllJoynServiceInfo object that represents an advertising app. This object provides the unique bus name, object path and transport information.
    * @param uniqueName The unique bus name.
    * @param objectPath The object path.
    * @param sessionPort The port for this session.
    */
  def this(uniqueName: String, objectPath: String, sessionPort: Double) = this()
}

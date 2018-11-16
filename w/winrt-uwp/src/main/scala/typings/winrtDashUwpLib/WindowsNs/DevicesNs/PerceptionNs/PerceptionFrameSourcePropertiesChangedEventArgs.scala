package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempt to change properties on a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs")
@js.native
abstract class PerceptionFrameSourcePropertiesChangedEventArgs () extends js.Object {
  /** Gets the type of change that occurred as a result of the property change request. */
  var collectionChange: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange = js.native
  /** Gets a string key indicating the location of the change in the collection. */
  var key: java.lang.String = js.native
}


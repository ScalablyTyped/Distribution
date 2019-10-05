package typings.winrtDashUwp.Windows.Devices.Perception

import typings.winrtDashUwp.Windows.Foundation.Collections.CollectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempt to change properties on a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs")
@js.native
abstract class PerceptionFrameSourcePropertiesChangedEventArgs () extends js.Object {
  /** Gets the type of change that occurred as a result of the property change request. */
  var collectionChange: CollectionChange = js.native
  /** Gets a string key indicating the location of the change in the collection. */
  var key: String = js.native
}


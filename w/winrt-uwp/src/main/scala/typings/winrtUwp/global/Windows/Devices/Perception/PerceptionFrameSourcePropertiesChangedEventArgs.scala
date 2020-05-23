package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.CollectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempt to change properties on a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs")
@js.native
abstract class PerceptionFrameSourcePropertiesChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs {
  /** Gets the type of change that occurred as a result of the property change request. */
  /* CompleteClass */
  override var collectionChange: CollectionChange = js.native
  /** Gets a string key indicating the location of the change in the collection. */
  /* CompleteClass */
  override var key: String = js.native
}


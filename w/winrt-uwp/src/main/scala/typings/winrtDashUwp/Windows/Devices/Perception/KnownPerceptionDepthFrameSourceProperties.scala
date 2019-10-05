package typings.winrtDashUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static properties of depth frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties")
@js.native
abstract class KnownPerceptionDepthFrameSourceProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties")
@js.native
object KnownPerceptionDepthFrameSourceProperties extends js.Object {
  /** Gets a string key used to retrieve a 16-bit unsigned integer property indicating the maximum depth of the depth frame source. */
  var maxDepth: String = js.native
  /** Gets a string key used to retrieve a 16-bit unsigned integer property indicating the minimum depth of the depth frame source. */
  var minDepth: String = js.native
}


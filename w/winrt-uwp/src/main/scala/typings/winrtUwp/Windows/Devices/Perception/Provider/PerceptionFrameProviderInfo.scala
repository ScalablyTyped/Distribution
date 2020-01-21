package typings.winrtUwp.Windows.Devices.Perception.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A specific set of properties describing a unique IPerceptionFrameProvider. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo")
@js.native
/** Initializes a new PerceptionFrameProviderInfo instance. */
class PerceptionFrameProviderInfo () extends js.Object {
  /** Gets or sets the descriptor of the kind of FrameProvider categorically, for example, "com.contoso.depthcamera.x500". */
  var deviceKind: String = js.native
  /** Gets or sets the friendly name for the device, for example, "Contoso Depth Camera x500". */
  var displayName: String = js.native
  /** Gets or sets the type of frames the device creates. */
  var frameKind: String = js.native
  /** Gets or sets a value indicating whether the device enumerates via FindAllAsync or device-added events on source watchers. */
  var hidden: Boolean = js.native
  /** Gets or sets the unique identifier of the IPerceptionFrameProvider. */
  var id: String = js.native
}


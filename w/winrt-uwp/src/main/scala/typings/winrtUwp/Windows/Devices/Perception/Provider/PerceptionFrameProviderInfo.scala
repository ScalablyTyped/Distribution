package typings.winrtUwp.Windows.Devices.Perception.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A specific set of properties describing a unique IPerceptionFrameProvider. */
trait PerceptionFrameProviderInfo extends js.Object {
  /** Gets or sets the descriptor of the kind of FrameProvider categorically, for example, "com.contoso.depthcamera.x500". */
  var deviceKind: String
  /** Gets or sets the friendly name for the device, for example, "Contoso Depth Camera x500". */
  var displayName: String
  /** Gets or sets the type of frames the device creates. */
  var frameKind: String
  /** Gets or sets a value indicating whether the device enumerates via FindAllAsync or device-added events on source watchers. */
  var hidden: Boolean
  /** Gets or sets the unique identifier of the IPerceptionFrameProvider. */
  var id: String
}

object PerceptionFrameProviderInfo {
  @scala.inline
  def apply(deviceKind: String, displayName: String, frameKind: String, hidden: Boolean, id: String): PerceptionFrameProviderInfo = {
    val __obj = js.Dynamic.literal(deviceKind = deviceKind.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], frameKind = frameKind.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameProviderInfo]
  }
}


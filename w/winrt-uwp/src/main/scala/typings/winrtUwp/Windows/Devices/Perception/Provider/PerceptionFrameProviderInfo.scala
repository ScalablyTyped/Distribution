package typings.winrtUwp.Windows.Devices.Perception.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A specific set of properties describing a unique IPerceptionFrameProvider. */
@js.native
trait PerceptionFrameProviderInfo extends js.Object {
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

object PerceptionFrameProviderInfo {
  @scala.inline
  def apply(deviceKind: String, displayName: String, frameKind: String, hidden: Boolean, id: String): PerceptionFrameProviderInfo = {
    val __obj = js.Dynamic.literal(deviceKind = deviceKind.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], frameKind = frameKind.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameProviderInfo]
  }
  @scala.inline
  implicit class PerceptionFrameProviderInfoOps[Self <: PerceptionFrameProviderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceKind(value: String): Self = this.set("deviceKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameKind(value: String): Self = this.set("frameKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}


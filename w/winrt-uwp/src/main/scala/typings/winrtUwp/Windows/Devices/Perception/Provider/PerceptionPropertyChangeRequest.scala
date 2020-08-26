package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus
import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
@js.native
trait PerceptionPropertyChangeRequest extends js.Object {
  /** Gets the name of the property to change. */
  var name: String = js.native
  /** Sets the new status of the request after processing the request. */
  var status: PerceptionFrameSourcePropertyChangeStatus = js.native
  /** Gets the requested new value of the property. */
  var value: js.Any = js.native
  /**
    * Gets a Windows::Foundation::Deferral object to allow background processing if needed.
    * @return The Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

object PerceptionPropertyChangeRequest {
  @scala.inline
  def apply(
    getDeferral: () => Deferral,
    name: String,
    status: PerceptionFrameSourcePropertyChangeStatus,
    value: js.Any
  ): PerceptionPropertyChangeRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionPropertyChangeRequest]
  }
  @scala.inline
  implicit class PerceptionPropertyChangeRequestOps[Self <: PerceptionPropertyChangeRequest] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => Deferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PerceptionFrameSourcePropertyChangeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus
import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
trait PerceptionPropertyChangeRequest extends js.Object {
  /** Gets the name of the property to change. */
  var name: String
  /** Sets the new status of the request after processing the request. */
  var status: PerceptionFrameSourcePropertyChangeStatus
  /** Gets the requested new value of the property. */
  var value: js.Any
  /**
    * Gets a Windows::Foundation::Deferral object to allow background processing if needed.
    * @return The Deferral object.
    */
  def getDeferral(): Deferral
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
}


package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies an advertising app that is no longer available. */
@js.native
trait AllJoynServiceInfoRemovedEventArgs extends js.Object {
  /** The unique bus name of the advertising app that is no longer available. */
  var uniqueName: String = js.native
}

object AllJoynServiceInfoRemovedEventArgs {
  @scala.inline
  def apply(uniqueName: String): AllJoynServiceInfoRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfoRemovedEventArgs]
  }
  @scala.inline
  implicit class AllJoynServiceInfoRemovedEventArgsOps[Self <: AllJoynServiceInfoRemovedEventArgs] (val x: Self) extends AnyVal {
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
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
  }
  
}


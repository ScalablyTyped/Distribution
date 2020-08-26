package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ServiceKindSupportedChanged event. */
@js.native
trait RcsServiceKindSupportedChangedEventArgs extends js.Object {
  /** Gets the type of the Rich Communication Services (RCS) service. */
  var serviceKind: RcsServiceKind = js.native
}

object RcsServiceKindSupportedChangedEventArgs {
  @scala.inline
  def apply(serviceKind: RcsServiceKind): RcsServiceKindSupportedChangedEventArgs = {
    val __obj = js.Dynamic.literal(serviceKind = serviceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsServiceKindSupportedChangedEventArgs]
  }
  @scala.inline
  implicit class RcsServiceKindSupportedChangedEventArgsOps[Self <: RcsServiceKindSupportedChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setServiceKind(value: RcsServiceKind): Self = this.set("serviceKind", value.asInstanceOf[js.Any])
  }
  
}


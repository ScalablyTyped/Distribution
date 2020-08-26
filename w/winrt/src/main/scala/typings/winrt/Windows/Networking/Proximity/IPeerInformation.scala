package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeerInformation extends js.Object {
  var displayName: String = js.native
}

object IPeerInformation {
  @scala.inline
  def apply(displayName: String): IPeerInformation = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeerInformation]
  }
  @scala.inline
  implicit class IPeerInformationOps[Self <: IPeerInformation] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
  }
  
}


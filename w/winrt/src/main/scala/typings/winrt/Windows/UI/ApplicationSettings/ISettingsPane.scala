package typings.winrt.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettingsPane extends js.Object {
  var oncommandsrequested: js.Any = js.native
}

object ISettingsPane {
  @scala.inline
  def apply(oncommandsrequested: js.Any): ISettingsPane = {
    val __obj = js.Dynamic.literal(oncommandsrequested = oncommandsrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingsPane]
  }
  @scala.inline
  implicit class ISettingsPaneOps[Self <: ISettingsPane] (val x: Self) extends AnyVal {
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
    def setOncommandsrequested(value: js.Any): Self = this.set("oncommandsrequested", value.asInstanceOf[js.Any])
  }
  
}


package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreApplicationView extends js.Object {
  var coreWindow: CoreWindow = js.native
  var isHosted: Boolean = js.native
  var isMain: Boolean = js.native
  var onactivated: js.Any = js.native
}

object ICoreApplicationView {
  @scala.inline
  def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: js.Any): ICoreApplicationView = {
    val __obj = js.Dynamic.literal(coreWindow = coreWindow.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreApplicationView]
  }
  @scala.inline
  implicit class ICoreApplicationViewOps[Self <: ICoreApplicationView] (val x: Self) extends AnyVal {
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
    def setCoreWindow(value: CoreWindow): Self = this.set("coreWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHosted(value: Boolean): Self = this.set("isHosted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMain(value: Boolean): Self = this.set("isMain", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnactivated(value: js.Any): Self = this.set("onactivated", value.asInstanceOf[js.Any])
  }
  
}


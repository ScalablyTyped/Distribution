package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreApplicationView extends ICoreApplicationView

object CoreApplicationView {
  @scala.inline
  def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: js.Any): CoreApplicationView = {
    val __obj = js.Dynamic.literal(coreWindow = coreWindow.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreApplicationView]
  }
}


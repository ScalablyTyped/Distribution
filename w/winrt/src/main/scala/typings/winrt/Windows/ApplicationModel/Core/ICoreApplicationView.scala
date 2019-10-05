package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationView extends js.Object {
  var coreWindow: CoreWindow
  var isHosted: Boolean
  var isMain: Boolean
  var onactivated: js.Any
}

object ICoreApplicationView {
  @scala.inline
  def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: js.Any): ICoreApplicationView = {
    val __obj = js.Dynamic.literal(coreWindow = coreWindow, isHosted = isHosted, isMain = isMain, onactivated = onactivated)
  
    __obj.asInstanceOf[ICoreApplicationView]
  }
}


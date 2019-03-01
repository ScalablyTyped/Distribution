package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationView extends js.Object {
  var coreWindow: winrtLib.WindowsNs.UINs.CoreNs.CoreWindow
  var isHosted: scala.Boolean
  var isMain: scala.Boolean
  var onactivated: js.Any
}

object ICoreApplicationView {
  @scala.inline
  def apply(
    coreWindow: winrtLib.WindowsNs.UINs.CoreNs.CoreWindow,
    isHosted: scala.Boolean,
    isMain: scala.Boolean,
    onactivated: js.Any
  ): ICoreApplicationView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coreWindow")(coreWindow)
    __obj.updateDynamic("isHosted")(isHosted)
    __obj.updateDynamic("isMain")(isMain)
    __obj.updateDynamic("onactivated")(onactivated)
    __obj.asInstanceOf[ICoreApplicationView]
  }
}


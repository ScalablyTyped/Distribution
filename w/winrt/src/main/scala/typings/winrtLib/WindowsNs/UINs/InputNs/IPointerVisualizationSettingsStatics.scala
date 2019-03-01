package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerVisualizationSettingsStatics extends js.Object {
  def getForCurrentView(): PointerVisualizationSettings
}

object IPointerVisualizationSettingsStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[PointerVisualizationSettings]): IPointerVisualizationSettingsStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView)
    __obj.asInstanceOf[IPointerVisualizationSettingsStatics]
  }
}


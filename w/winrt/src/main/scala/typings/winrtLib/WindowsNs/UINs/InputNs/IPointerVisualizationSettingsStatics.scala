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
  def apply(getForCurrentView: () => PointerVisualizationSettings): IPointerVisualizationSettingsStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
  
    __obj.asInstanceOf[IPointerVisualizationSettingsStatics]
  }
}


package typings
package winrtLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneStatics extends js.Object {
  var edge: SettingsEdgeLocation
  def getForCurrentView(): SettingsPane
  def show(): scala.Unit
}

object ISettingsPaneStatics {
  @scala.inline
  def apply(
    edge: SettingsEdgeLocation,
    getForCurrentView: js.Function0[SettingsPane],
    show: js.Function0[scala.Unit]
  ): ISettingsPaneStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edge")(edge)
    __obj.updateDynamic("getForCurrentView")(getForCurrentView)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[ISettingsPaneStatics]
  }
}


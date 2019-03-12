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
  def apply(edge: SettingsEdgeLocation, getForCurrentView: () => SettingsPane, show: () => scala.Unit): ISettingsPaneStatics = {
    val __obj = js.Dynamic.literal(edge = edge, getForCurrentView = js.Any.fromFunction0(getForCurrentView), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[ISettingsPaneStatics]
  }
}


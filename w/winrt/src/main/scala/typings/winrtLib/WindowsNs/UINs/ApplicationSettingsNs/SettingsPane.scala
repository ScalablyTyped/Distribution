package typings
package winrtLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
@js.native
class SettingsPane () extends ISettingsPane {
  /* CompleteClass */
  override var oncommandsrequested: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
@js.native
object SettingsPane extends js.Object {
  var edge: winrtLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation = js.native
  def getForCurrentView(): winrtLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsPane = js.native
  def show(): scala.Unit = js.native
}


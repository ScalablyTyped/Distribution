package typings.winrt.Windows.UI.ApplicationSettings

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
  var edge: SettingsEdgeLocation = js.native
  def getForCurrentView(): SettingsPane = js.native
  def show(): Unit = js.native
}


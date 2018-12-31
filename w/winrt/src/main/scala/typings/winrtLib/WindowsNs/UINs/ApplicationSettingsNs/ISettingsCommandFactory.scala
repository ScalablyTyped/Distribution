package typings
package winrtLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsCommandFactory extends js.Object {
  def create(
    settingsCommandId: js.Any,
    label: java.lang.String,
    handler: winrtLib.WindowsNs.UINs.PopupsNs.UICommandInvokedHandler
  ): SettingsCommand
}


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

object ISettingsCommandFactory {
  @scala.inline
  def apply(
    create: js.Function3[
      js.Any, 
      java.lang.String, 
      winrtLib.WindowsNs.UINs.PopupsNs.UICommandInvokedHandler, 
      SettingsCommand
    ]
  ): ISettingsCommandFactory = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[ISettingsCommandFactory]
  }
}


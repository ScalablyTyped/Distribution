package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties that are only available during the CommandsRequested event. */
trait SettingsPaneCommandsRequest extends StObject {
  
  /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
  var applicationCommands: IVector[SettingsCommand]
}
object SettingsPaneCommandsRequest {
  
  @scala.inline
  def apply(applicationCommands: IVector[SettingsCommand]): SettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsPaneCommandsRequest]
  }
  
  @scala.inline
  implicit class SettingsPaneCommandsRequestMutableBuilder[Self <: SettingsPaneCommandsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationCommands(value: IVector[SettingsCommand]): Self = StObject.set(x, "applicationCommands", value.asInstanceOf[js.Any])
  }
}

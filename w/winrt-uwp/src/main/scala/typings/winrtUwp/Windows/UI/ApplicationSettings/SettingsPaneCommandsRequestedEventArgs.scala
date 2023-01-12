package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains arguments that are available from the event object during the CommandsRequested event. */
trait SettingsPaneCommandsRequestedEventArgs extends StObject {
  
  /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
  var request: SettingsPaneCommandsRequest
}
object SettingsPaneCommandsRequestedEventArgs {
  
  inline def apply(request: SettingsPaneCommandsRequest): SettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsPaneCommandsRequestedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: SettingsPaneCommandsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationTracingSetParameters extends StObject {
  
  var enabled: Boolean = js.native
}
object NotificationTracingSetParameters {
  
  @scala.inline
  def apply(enabled: Boolean): NotificationTracingSetParameters = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationTracingSetParameters]
  }
  
  @scala.inline
  implicit class NotificationTracingSetParametersMutableBuilder[Self <: NotificationTracingSetParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

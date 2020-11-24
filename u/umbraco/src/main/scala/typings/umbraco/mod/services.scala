package typings.umbraco.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("umbraco", "services")
@js.native
object services extends js.Object {
  
  /**
    * Notification Type
    */
  @js.native
  object NotificationType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.services.NotificationType with Double] = js.native
    
    /* 1 */ val error: typings.umbraco.umbraco.services.NotificationType.error with Double = js.native
    
    /* 3 */ val info: typings.umbraco.umbraco.services.NotificationType.info with Double = js.native
    
    /* 0 */ val success: typings.umbraco.umbraco.services.NotificationType.success with Double = js.native
    
    /* 2 */ val warning: typings.umbraco.umbraco.services.NotificationType.warning with Double = js.native
  }
}

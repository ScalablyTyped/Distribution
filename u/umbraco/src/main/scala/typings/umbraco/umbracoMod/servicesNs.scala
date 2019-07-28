package typings.umbraco.umbracoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("umbraco", "services")
@js.native
object servicesNs extends js.Object {
  /**
    * Notification Type
    */
  @js.native
  object NotificationType extends js.Object {
    /* 1 */ val error: typings.umbraco.umbracoNs.servicesNs.NotificationType.error with Double = js.native
    /* 3 */ val info: typings.umbraco.umbracoNs.servicesNs.NotificationType.info with Double = js.native
    /* 0 */ val success: typings.umbraco.umbracoNs.servicesNs.NotificationType.success with Double = js.native
    /* 2 */ val warning: typings.umbraco.umbracoNs.servicesNs.NotificationType.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.umbraco.umbracoNs.servicesNs.NotificationType with Double] = js.native
  }
  
}


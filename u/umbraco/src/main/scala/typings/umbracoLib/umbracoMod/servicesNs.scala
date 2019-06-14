package typings
package umbracoLib.umbracoMod

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
    /* 1 */ val error: umbracoLib.umbracoNs.servicesNs.NotificationType.error with scala.Double = js.native
    /* 3 */ val info: umbracoLib.umbracoNs.servicesNs.NotificationType.info with scala.Double = js.native
    /* 0 */ val success: umbracoLib.umbracoNs.servicesNs.NotificationType.success with scala.Double = js.native
    /* 2 */ val warning: umbracoLib.umbracoNs.servicesNs.NotificationType.warning with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.servicesNs.NotificationType with scala.Double] = js.native
  }
  
}


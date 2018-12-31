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
    val error: umbracoLib.umbracoNs.servicesNs.NotificationType.error with java.lang.String = js.native
    val info: umbracoLib.umbracoNs.servicesNs.NotificationType.info with java.lang.String = js.native
    val success: umbracoLib.umbracoNs.servicesNs.NotificationType.success with java.lang.String = js.native
    val warning: umbracoLib.umbracoNs.servicesNs.NotificationType.warning with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.servicesNs.NotificationType with java.lang.String] = js.native
  }
  
  type NotificationType = umbracoLib.umbracoNs.servicesNs.NotificationType
}


package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationType extends js.Object

/**
  * Notification Type
  */
@JSGlobal("umbraco.services.NotificationType")
@js.native
object NotificationType extends js.Object {
  @js.native
  sealed trait error
    extends umbracoLib.umbracoNs.servicesNs.NotificationType
  
  @js.native
  sealed trait info
    extends umbracoLib.umbracoNs.servicesNs.NotificationType
  
  @js.native
  sealed trait success
    extends umbracoLib.umbracoNs.servicesNs.NotificationType
  
  @js.native
  sealed trait warning
    extends umbracoLib.umbracoNs.servicesNs.NotificationType
  
  val error: error with java.lang.String = js.native
  val info: info with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.servicesNs.NotificationType with java.lang.String] = js.native
}


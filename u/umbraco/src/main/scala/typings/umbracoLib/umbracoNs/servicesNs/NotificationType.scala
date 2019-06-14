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
  
  /* 1 */ val error: error with scala.Double = js.native
  /* 3 */ val info: info with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 2 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.servicesNs.NotificationType with scala.Double] = js.native
}


package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventPublisherQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventPublisherQueryFlags")
@js.native
object EventPublisherQueryFlags extends js.Object {
  /**
    * Include event types from the remote services too
    */
  @js.native
  sealed trait IncludeRemoteServices
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EventPublisherQueryFlags
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EventPublisherQueryFlags
  
  /* 2 */ val IncludeRemoteServices: IncludeRemoteServices with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EventPublisherQueryFlags with scala.Double
  ] = js.native
}


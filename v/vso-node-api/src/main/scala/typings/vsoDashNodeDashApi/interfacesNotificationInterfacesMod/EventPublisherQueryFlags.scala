package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

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
  sealed trait IncludeRemoteServices extends EventPublisherQueryFlags
  
  @js.native
  sealed trait None extends EventPublisherQueryFlags
  
  /* 2 */ val IncludeRemoteServices: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EventPublisherQueryFlags.IncludeRemoteServices with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EventPublisherQueryFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventPublisherQueryFlags with Double] = js.native
}


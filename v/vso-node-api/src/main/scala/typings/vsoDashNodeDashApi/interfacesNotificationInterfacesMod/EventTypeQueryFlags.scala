package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypeQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventTypeQueryFlags")
@js.native
object EventTypeQueryFlags extends js.Object {
  /**
    * IncludeFields will include all fields and their types
    */
  @js.native
  sealed trait IncludeFields extends EventTypeQueryFlags
  
  @js.native
  sealed trait None extends EventTypeQueryFlags
  
  /* 1 */ val IncludeFields: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EventTypeQueryFlags.IncludeFields with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EventTypeQueryFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypeQueryFlags with Double] = js.native
}


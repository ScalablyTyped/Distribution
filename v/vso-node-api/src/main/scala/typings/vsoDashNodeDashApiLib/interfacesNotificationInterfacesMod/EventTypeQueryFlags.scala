package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  sealed trait IncludeFields
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EventTypeQueryFlags
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EventTypeQueryFlags
  
  /* 1 */ val IncludeFields: IncludeFields with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EventTypeQueryFlags with scala.Double
  ] = js.native
}


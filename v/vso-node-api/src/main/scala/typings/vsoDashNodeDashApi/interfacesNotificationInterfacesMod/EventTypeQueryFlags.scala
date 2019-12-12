package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EventTypeQueryFlags.IncludeFields
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EventTypeQueryFlags.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypeQueryFlags with Double] = js.native
  /* 1 */ @js.native
  object IncludeFields extends TopLevel[IncludeFields with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}


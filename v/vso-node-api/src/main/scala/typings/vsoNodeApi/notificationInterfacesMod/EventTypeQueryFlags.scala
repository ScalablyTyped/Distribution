package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypeQueryFlags extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventTypeQueryFlags")
@js.native
object EventTypeQueryFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypeQueryFlags with Double] = js.native
  
  /**
    * IncludeFields will include all fields and their types
    */
  @js.native
  sealed trait IncludeFields extends EventTypeQueryFlags
  /* 1 */ @js.native
  object IncludeFields extends TopLevel[IncludeFields with Double]
  
  @js.native
  sealed trait None extends EventTypeQueryFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}

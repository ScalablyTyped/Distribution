package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventPublisherQueryFlags extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventPublisherQueryFlags")
@js.native
object EventPublisherQueryFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventPublisherQueryFlags with Double] = js.native
  
  /**
    * Include event types from the remote services too
    */
  @js.native
  sealed trait IncludeRemoteServices extends EventPublisherQueryFlags
  /* 2 */ @js.native
  object IncludeRemoteServices extends TopLevel[IncludeRemoteServices with Double]
  
  @js.native
  sealed trait None extends EventPublisherQueryFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}

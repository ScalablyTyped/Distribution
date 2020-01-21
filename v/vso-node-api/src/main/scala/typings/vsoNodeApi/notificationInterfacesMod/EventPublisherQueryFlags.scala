package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventPublisherQueryFlags with Double] = js.native
  /* 2 */ @js.native
  object IncludeRemoteServices extends TopLevel[IncludeRemoteServices with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}


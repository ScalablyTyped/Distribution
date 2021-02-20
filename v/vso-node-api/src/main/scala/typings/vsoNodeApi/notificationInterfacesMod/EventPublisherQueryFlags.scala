package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventPublisherQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventPublisherQueryFlags")
@js.native
object EventPublisherQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventPublisherQueryFlags with Double] = js.native
  
  /**
    * Include event types from the remote services too
    */
  @js.native
  sealed trait IncludeRemoteServices extends EventPublisherQueryFlags
  /* 2 */ val IncludeRemoteServices: typings.vsoNodeApi.notificationInterfacesMod.EventPublisherQueryFlags.IncludeRemoteServices with Double = js.native
  
  @js.native
  sealed trait None extends EventPublisherQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.notificationInterfacesMod.EventPublisherQueryFlags.None with Double = js.native
}

package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventPublisherQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventPublisherQueryFlags")
@js.native
object EventPublisherQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventPublisherQueryFlags & Double] = js.native
  
  /**
    * Include event types from the remote services too
    */
  @js.native
  sealed trait IncludeRemoteServices
    extends StObject
       with EventPublisherQueryFlags
  /* 2 */ val IncludeRemoteServices: typings.vsoNodeApi.interfacesNotificationInterfacesMod.EventPublisherQueryFlags.IncludeRemoteServices & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EventPublisherQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.interfacesNotificationInterfacesMod.EventPublisherQueryFlags.None & Double = js.native
}

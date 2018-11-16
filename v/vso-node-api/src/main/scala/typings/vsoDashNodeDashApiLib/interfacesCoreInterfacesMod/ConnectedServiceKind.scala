package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectedServiceKind extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ConnectedServiceKind")
@js.native
object ConnectedServiceKind extends js.Object {
  /**
       * Azure Subscription
       */
  @js.native
  sealed trait AzureSubscription
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ConnectedServiceKind
  
  /**
       * Chef Connection
       */
  @js.native
  sealed trait Chef
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ConnectedServiceKind
  
  /**
       * Custom or unknown service
       */
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ConnectedServiceKind
  
  /**
       * Generic Connection
       */
  @js.native
  sealed trait Generic
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ConnectedServiceKind
  
  /* 1 */ val AzureSubscription: AzureSubscription with scala.Double = js.native
  /* 2 */ val Chef: Chef with scala.Double = js.native
  /* 0 */ val Custom: Custom with scala.Double = js.native
  /* 3 */ val Generic: Generic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ConnectedServiceKind with scala.Double
  ] = js.native
}


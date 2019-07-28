package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

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
  sealed trait AzureSubscription extends ConnectedServiceKind
  
  /**
    * Chef Connection
    */
  @js.native
  sealed trait Chef extends ConnectedServiceKind
  
  /**
    * Custom or unknown service
    */
  @js.native
  sealed trait Custom extends ConnectedServiceKind
  
  /**
    * Generic Connection
    */
  @js.native
  sealed trait Generic extends ConnectedServiceKind
  
  /* 1 */ val AzureSubscription: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ConnectedServiceKind.AzureSubscription with Double = js.native
  /* 2 */ val Chef: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ConnectedServiceKind.Chef with Double = js.native
  /* 0 */ val Custom: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ConnectedServiceKind.Custom with Double = js.native
  /* 3 */ val Generic: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ConnectedServiceKind.Generic with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectedServiceKind with Double] = js.native
}


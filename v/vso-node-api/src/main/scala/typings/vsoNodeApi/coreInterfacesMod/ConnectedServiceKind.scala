package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectedServiceKind extends js.Object
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ConnectedServiceKind")
@js.native
object ConnectedServiceKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectedServiceKind with Double] = js.native
  
  /**
    * Azure Subscription
    */
  @js.native
  sealed trait AzureSubscription extends ConnectedServiceKind
  /* 1 */ @js.native
  object AzureSubscription extends TopLevel[AzureSubscription with Double]
  
  /**
    * Chef Connection
    */
  @js.native
  sealed trait Chef extends ConnectedServiceKind
  /* 2 */ @js.native
  object Chef extends TopLevel[Chef with Double]
  
  /**
    * Custom or unknown service
    */
  @js.native
  sealed trait Custom extends ConnectedServiceKind
  /* 0 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /**
    * Generic Connection
    */
  @js.native
  sealed trait Generic extends ConnectedServiceKind
  /* 3 */ @js.native
  object Generic extends TopLevel[Generic with Double]
}

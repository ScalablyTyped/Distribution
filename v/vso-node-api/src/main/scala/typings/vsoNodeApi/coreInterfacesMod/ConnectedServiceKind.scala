package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectedServiceKind extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ConnectedServiceKind")
@js.native
object ConnectedServiceKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectedServiceKind & Double] = js.native
  
  /**
    * Azure Subscription
    */
  @js.native
  sealed trait AzureSubscription
    extends StObject
       with ConnectedServiceKind
  /* 1 */ val AzureSubscription: typings.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.AzureSubscription & Double = js.native
  
  /**
    * Chef Connection
    */
  @js.native
  sealed trait Chef
    extends StObject
       with ConnectedServiceKind
  /* 2 */ val Chef: typings.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.Chef & Double = js.native
  
  /**
    * Custom or unknown service
    */
  @js.native
  sealed trait Custom
    extends StObject
       with ConnectedServiceKind
  /* 0 */ val Custom: typings.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.Custom & Double = js.native
  
  /**
    * Generic Connection
    */
  @js.native
  sealed trait Generic
    extends StObject
       with ConnectedServiceKind
  /* 3 */ val Generic: typings.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.Generic & Double = js.native
}

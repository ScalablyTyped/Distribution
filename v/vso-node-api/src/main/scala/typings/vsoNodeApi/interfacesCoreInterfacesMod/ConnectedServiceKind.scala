package typings.vsoNodeApi.interfacesCoreInterfacesMod

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
  /* 1 */ val AzureSubscription: typings.vsoNodeApi.interfacesCoreInterfacesMod.ConnectedServiceKind.AzureSubscription & Double = js.native
  
  /**
    * Chef Connection
    */
  @js.native
  sealed trait Chef
    extends StObject
       with ConnectedServiceKind
  /* 2 */ val Chef: typings.vsoNodeApi.interfacesCoreInterfacesMod.ConnectedServiceKind.Chef & Double = js.native
  
  /**
    * Custom or unknown service
    */
  @js.native
  sealed trait Custom
    extends StObject
       with ConnectedServiceKind
  /* 0 */ val Custom: typings.vsoNodeApi.interfacesCoreInterfacesMod.ConnectedServiceKind.Custom & Double = js.native
  
  /**
    * Generic Connection
    */
  @js.native
  sealed trait Generic
    extends StObject
       with ConnectedServiceKind
  /* 3 */ val Generic: typings.vsoNodeApi.interfacesCoreInterfacesMod.ConnectedServiceKind.Generic & Double = js.native
}

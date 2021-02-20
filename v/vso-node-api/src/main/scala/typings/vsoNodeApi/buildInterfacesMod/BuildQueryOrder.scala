package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildQueryOrder")
@js.native
object BuildQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildQueryOrder with Double] = js.native
  
  /**
    * Order by finish time ascending.
    */
  @js.native
  sealed trait FinishTimeAscending extends BuildQueryOrder
  /* 2 */ val FinishTimeAscending: typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder.FinishTimeAscending with Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait FinishTimeDescending extends BuildQueryOrder
  /* 3 */ val FinishTimeDescending: typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder.FinishTimeDescending with Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeAscending extends BuildQueryOrder
  /* 5 */ val QueueTimeAscending: typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder.QueueTimeAscending with Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeDescending extends BuildQueryOrder
  /* 4 */ val QueueTimeDescending: typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder.QueueTimeDescending with Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeAscending extends BuildQueryOrder
  /* 7 */ val StartTimeAscending: typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder.StartTimeAscending with Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeDescending extends BuildQueryOrder
  /* 6 */ val StartTimeDescending: typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder.StartTimeDescending with Double = js.native
}

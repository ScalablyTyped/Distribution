package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildQueryOrder")
@js.native
object BuildQueryOrder extends js.Object {
  /**
    * Order by finish time ascending.
    */
  @js.native
  sealed trait FinishTimeAscending extends BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait FinishTimeDescending extends BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeAscending extends BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeDescending extends BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeAscending extends BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeDescending extends BuildQueryOrder
  
  /* 2 */ val FinishTimeAscending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder.FinishTimeAscending with Double = js.native
  /* 3 */ val FinishTimeDescending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder.FinishTimeDescending with Double = js.native
  /* 5 */ val QueueTimeAscending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder.QueueTimeAscending with Double = js.native
  /* 4 */ val QueueTimeDescending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder.QueueTimeDescending with Double = js.native
  /* 7 */ val StartTimeAscending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder.StartTimeAscending with Double = js.native
  /* 6 */ val StartTimeDescending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder.StartTimeDescending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildQueryOrder with Double] = js.native
}


package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait FinishTimeAscending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait FinishTimeDescending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeAscending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeDescending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeAscending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeDescending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder
  
  /* 2 */ val FinishTimeAscending: FinishTimeAscending with scala.Double = js.native
  /* 3 */ val FinishTimeDescending: FinishTimeDescending with scala.Double = js.native
  /* 5 */ val QueueTimeAscending: QueueTimeAscending with scala.Double = js.native
  /* 4 */ val QueueTimeDescending: QueueTimeDescending with scala.Double = js.native
  /* 7 */ val StartTimeAscending: StartTimeAscending with scala.Double = js.native
  /* 6 */ val StartTimeDescending: StartTimeDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder with scala.Double
  ] = js.native
}


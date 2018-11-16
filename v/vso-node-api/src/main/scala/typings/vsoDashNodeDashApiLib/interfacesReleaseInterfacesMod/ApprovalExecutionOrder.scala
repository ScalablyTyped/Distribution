package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalExecutionOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalExecutionOrder")
@js.native
object ApprovalExecutionOrder extends js.Object {
  @js.native
  sealed trait AfterGatesAlways
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalExecutionOrder
  
  @js.native
  sealed trait AfterSuccessfulGates
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalExecutionOrder
  
  @js.native
  sealed trait BeforeGates
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalExecutionOrder
  
  /* 4 */ val AfterGatesAlways: AfterGatesAlways with scala.Double = js.native
  /* 2 */ val AfterSuccessfulGates: AfterSuccessfulGates with scala.Double = js.native
  /* 1 */ val BeforeGates: BeforeGates with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalExecutionOrder with scala.Double
  ] = js.native
}


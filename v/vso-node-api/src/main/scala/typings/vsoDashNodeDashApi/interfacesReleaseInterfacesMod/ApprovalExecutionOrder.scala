package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalExecutionOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalExecutionOrder")
@js.native
object ApprovalExecutionOrder extends js.Object {
  @js.native
  sealed trait AfterGatesAlways extends ApprovalExecutionOrder
  
  @js.native
  sealed trait AfterSuccessfulGates extends ApprovalExecutionOrder
  
  @js.native
  sealed trait BeforeGates extends ApprovalExecutionOrder
  
  /* 4 */ val AfterGatesAlways: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalExecutionOrder.AfterGatesAlways with Double = js.native
  /* 2 */ val AfterSuccessfulGates: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalExecutionOrder.AfterSuccessfulGates with Double = js.native
  /* 1 */ val BeforeGates: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalExecutionOrder.BeforeGates with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalExecutionOrder with Double] = js.native
}


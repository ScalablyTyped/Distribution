package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalExecutionOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalExecutionOrder")
@js.native
object ApprovalExecutionOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalExecutionOrder with Double] = js.native
  
  @js.native
  sealed trait AfterGatesAlways extends ApprovalExecutionOrder
  /* 4 */ val AfterGatesAlways: typings.vsoNodeApi.releaseInterfacesMod.ApprovalExecutionOrder.AfterGatesAlways with Double = js.native
  
  @js.native
  sealed trait AfterSuccessfulGates extends ApprovalExecutionOrder
  /* 2 */ val AfterSuccessfulGates: typings.vsoNodeApi.releaseInterfacesMod.ApprovalExecutionOrder.AfterSuccessfulGates with Double = js.native
  
  @js.native
  sealed trait BeforeGates extends ApprovalExecutionOrder
  /* 1 */ val BeforeGates: typings.vsoNodeApi.releaseInterfacesMod.ApprovalExecutionOrder.BeforeGates with Double = js.native
}

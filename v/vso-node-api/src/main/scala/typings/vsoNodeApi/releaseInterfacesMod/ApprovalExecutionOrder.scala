package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalExecutionOrder with Double] = js.native
  /* 4 */ @js.native
  object AfterGatesAlways extends TopLevel[AfterGatesAlways with Double]
  
  /* 2 */ @js.native
  object AfterSuccessfulGates extends TopLevel[AfterSuccessfulGates with Double]
  
  /* 1 */ @js.native
  object BeforeGates extends TopLevel[BeforeGates with Double]
  
}


package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalExecutionOrder extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalExecutionOrder")
@js.native
object ApprovalExecutionOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalExecutionOrder with Double] = js.native
  
  @js.native
  sealed trait AfterGatesAlways extends ApprovalExecutionOrder
  /* 4 */ @js.native
  object AfterGatesAlways extends TopLevel[AfterGatesAlways with Double]
  
  @js.native
  sealed trait AfterSuccessfulGates extends ApprovalExecutionOrder
  /* 2 */ @js.native
  object AfterSuccessfulGates extends TopLevel[AfterSuccessfulGates with Double]
  
  @js.native
  sealed trait BeforeGates extends ApprovalExecutionOrder
  /* 1 */ @js.native
  object BeforeGates extends TopLevel[BeforeGates with Double]
}

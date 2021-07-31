package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalExecutionOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalExecutionOrder")
@js.native
object ApprovalExecutionOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalExecutionOrder & Double] = js.native
  
  @js.native
  sealed trait AfterGatesAlways
    extends StObject
       with ApprovalExecutionOrder
  /* 4 */ val AfterGatesAlways: typings.vsoNodeApi.releaseInterfacesMod.ApprovalExecutionOrder.AfterGatesAlways & Double = js.native
  
  @js.native
  sealed trait AfterSuccessfulGates
    extends StObject
       with ApprovalExecutionOrder
  /* 2 */ val AfterSuccessfulGates: typings.vsoNodeApi.releaseInterfacesMod.ApprovalExecutionOrder.AfterSuccessfulGates & Double = js.native
  
  @js.native
  sealed trait BeforeGates
    extends StObject
       with ApprovalExecutionOrder
  /* 1 */ val BeforeGates: typings.vsoNodeApi.releaseInterfacesMod.ApprovalExecutionOrder.BeforeGates & Double = js.native
}

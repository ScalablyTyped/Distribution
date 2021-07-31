package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogicalOperation extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LogicalOperation")
@js.native
object LogicalOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperation & Double] = js.native
  
  @js.native
  sealed trait AND
    extends StObject
       with LogicalOperation
  /* 1 */ val AND: typings.vsoNodeApi.workItemTrackingInterfacesMod.LogicalOperation.AND & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with LogicalOperation
  /* 0 */ val NONE: typings.vsoNodeApi.workItemTrackingInterfacesMod.LogicalOperation.NONE & Double = js.native
  
  @js.native
  sealed trait OR
    extends StObject
       with LogicalOperation
  /* 2 */ val OR: typings.vsoNodeApi.workItemTrackingInterfacesMod.LogicalOperation.OR & Double = js.native
}

package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogicalOperation extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LogicalOperation")
@js.native
object LogicalOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperation with Double] = js.native
  
  @js.native
  sealed trait AND extends LogicalOperation
  /* 1 */ @js.native
  object AND extends TopLevel[AND with Double]
  
  @js.native
  sealed trait NONE extends LogicalOperation
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait OR extends LogicalOperation
  /* 2 */ @js.native
  object OR extends TopLevel[OR with Double]
}

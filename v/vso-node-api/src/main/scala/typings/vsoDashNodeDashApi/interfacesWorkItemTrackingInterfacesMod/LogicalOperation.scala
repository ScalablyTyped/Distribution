package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LogicalOperation.AND
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LogicalOperation.NONE
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LogicalOperation.OR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogicalOperation extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LogicalOperation")
@js.native
object LogicalOperation extends js.Object {
  @js.native
  sealed trait AND extends LogicalOperation
  
  @js.native
  sealed trait NONE extends LogicalOperation
  
  @js.native
  sealed trait OR extends LogicalOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperation with Double] = js.native
  /* 1 */ @js.native
  object AND extends TopLevel[AND with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object OR extends TopLevel[OR with Double]
  
}


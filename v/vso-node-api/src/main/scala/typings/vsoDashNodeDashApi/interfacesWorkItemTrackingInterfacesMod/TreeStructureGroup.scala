package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TreeStructureGroup extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeStructureGroup")
@js.native
object TreeStructureGroup extends js.Object {
  @js.native
  sealed trait Areas extends TreeStructureGroup
  
  @js.native
  sealed trait Iterations extends TreeStructureGroup
  
  /* 0 */ val Areas: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup.Areas with Double = js.native
  /* 1 */ val Iterations: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup.Iterations with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeStructureGroup with Double] = js.native
}


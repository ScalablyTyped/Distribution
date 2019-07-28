package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TreeNodeStructureType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeNodeStructureType")
@js.native
object TreeNodeStructureType extends js.Object {
  /**
    * Area type.
    */
  @js.native
  sealed trait Area extends TreeNodeStructureType
  
  /**
    * Iteration type.
    */
  @js.native
  sealed trait Iteration extends TreeNodeStructureType
  
  /* 0 */ val Area: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType.Area with Double = js.native
  /* 1 */ val Iteration: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType.Iteration with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeNodeStructureType with Double] = js.native
}


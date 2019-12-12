package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType.Area
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType.Iteration
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeNodeStructureType with Double] = js.native
  /* 0 */ @js.native
  object Area extends TopLevel[Area with Double]
  
  /* 1 */ @js.native
  object Iteration extends TopLevel[Iteration with Double]
  
}


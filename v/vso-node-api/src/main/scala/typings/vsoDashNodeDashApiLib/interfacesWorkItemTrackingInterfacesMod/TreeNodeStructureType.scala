package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait Area
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType
  
  /**
       * Iteration type.
       */
  @js.native
  sealed trait Iteration
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType
  
  /* 0 */ val Area: Area with scala.Double = js.native
  /* 1 */ val Iteration: Iteration with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeNodeStructureType with scala.Double
  ] = js.native
}


package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryRecursionOption extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryRecursionOption")
@js.native
object QueryRecursionOption extends js.Object {
  /**
    * Returns work items that satisfy the target criteria, even if no work item satisfies the source and link criteria.
    */
  @js.native
  sealed trait ChildFirst
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryRecursionOption
  
  /**
    * Returns work items that satisfy the source, even if no linked work item satisfies the target and link criteria.
    */
  @js.native
  sealed trait ParentFirst
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryRecursionOption
  
  /* 1 */ val ChildFirst: ChildFirst with scala.Double = js.native
  /* 0 */ val ParentFirst: ParentFirst with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryRecursionOption with scala.Double
  ] = js.native
}


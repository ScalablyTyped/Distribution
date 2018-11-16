package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TreeStructureGroup extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeStructureGroup")
@js.native
object TreeStructureGroup extends js.Object {
  @js.native
  sealed trait Areas
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  
  @js.native
  sealed trait Iterations
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  
  /* 0 */ val Areas: Areas with scala.Double = js.native
  /* 1 */ val Iterations: Iterations with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup with scala.Double
  ] = js.native
}


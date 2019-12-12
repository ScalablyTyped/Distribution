package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup.Areas
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup.Iterations
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeStructureGroup with Double] = js.native
  /* 0 */ @js.native
  object Areas extends TopLevel[Areas with Double]
  
  /* 1 */ @js.native
  object Iterations extends TopLevel[Iterations with Double]
  
}


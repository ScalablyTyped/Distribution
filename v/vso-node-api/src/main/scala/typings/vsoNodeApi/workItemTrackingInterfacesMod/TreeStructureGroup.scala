package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeStructureGroup extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeStructureGroup")
@js.native
object TreeStructureGroup extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeStructureGroup with Double] = js.native
  
  @js.native
  sealed trait Areas extends TreeStructureGroup
  /* 0 */ val Areas: typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeStructureGroup.Areas with Double = js.native
  
  @js.native
  sealed trait Iterations extends TreeStructureGroup
  /* 1 */ val Iterations: typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeStructureGroup.Iterations with Double = js.native
}

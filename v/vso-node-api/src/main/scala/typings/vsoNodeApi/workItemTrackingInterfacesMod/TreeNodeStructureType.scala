package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeNodeStructureType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeNodeStructureType")
@js.native
object TreeNodeStructureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeNodeStructureType with Double] = js.native
  
  /**
    * Area type.
    */
  @js.native
  sealed trait Area extends TreeNodeStructureType
  /* 0 */ val Area: typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeNodeStructureType.Area with Double = js.native
  
  /**
    * Iteration type.
    */
  @js.native
  sealed trait Iteration extends TreeNodeStructureType
  /* 1 */ val Iteration: typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeNodeStructureType.Iteration with Double = js.native
}

package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeNodeStructureType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeNodeStructureType")
@js.native
object TreeNodeStructureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeNodeStructureType & Double] = js.native
  
  /**
    * Area type.
    */
  @js.native
  sealed trait Area
    extends StObject
       with TreeNodeStructureType
  /* 0 */ val Area: typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeNodeStructureType.Area & Double = js.native
  
  /**
    * Iteration type.
    */
  @js.native
  sealed trait Iteration
    extends StObject
       with TreeNodeStructureType
  /* 1 */ val Iteration: typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeNodeStructureType.Iteration & Double = js.native
}

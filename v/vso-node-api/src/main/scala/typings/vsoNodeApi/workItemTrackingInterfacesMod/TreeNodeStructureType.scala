package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeNodeStructureType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeNodeStructureType")
@js.native
object TreeNodeStructureType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeNodeStructureType with Double] = js.native
  
  /**
    * Area type.
    */
  @js.native
  sealed trait Area extends TreeNodeStructureType
  /* 0 */ @js.native
  object Area extends TopLevel[Area with Double]
  
  /**
    * Iteration type.
    */
  @js.native
  sealed trait Iteration extends TreeNodeStructureType
  /* 1 */ @js.native
  object Iteration extends TopLevel[Iteration with Double]
}

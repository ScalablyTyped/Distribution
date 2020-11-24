package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryRecursionOption extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryRecursionOption")
@js.native
object QueryRecursionOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryRecursionOption with Double] = js.native
  
  /**
    * Returns work items that satisfy the target criteria, even if no work item satisfies the source and link criteria.
    */
  @js.native
  sealed trait ChildFirst extends QueryRecursionOption
  /* 1 */ @js.native
  object ChildFirst extends TopLevel[ChildFirst with Double]
  
  /**
    * Returns work items that satisfy the source, even if no linked work item satisfies the target and link criteria.
    */
  @js.native
  sealed trait ParentFirst extends QueryRecursionOption
  /* 0 */ @js.native
  object ParentFirst extends TopLevel[ParentFirst with Double]
}

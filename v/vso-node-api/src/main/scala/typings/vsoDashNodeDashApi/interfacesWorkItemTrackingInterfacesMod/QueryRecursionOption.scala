package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait ChildFirst extends QueryRecursionOption
  
  /**
    * Returns work items that satisfy the source, even if no linked work item satisfies the target and link criteria.
    */
  @js.native
  sealed trait ParentFirst extends QueryRecursionOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryRecursionOption with Double] = js.native
  /* 1 */ @js.native
  object ChildFirst extends TopLevel[ChildFirst with Double]
  
  /* 0 */ @js.native
  object ParentFirst extends TopLevel[ParentFirst with Double]
  
}


package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemRecentActivityType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemRecentActivityType")
@js.native
object WorkItemRecentActivityType extends js.Object {
  @js.native
  sealed trait Deleted extends WorkItemRecentActivityType
  
  @js.native
  sealed trait Edited extends WorkItemRecentActivityType
  
  @js.native
  sealed trait Restored extends WorkItemRecentActivityType
  
  @js.native
  sealed trait Visited extends WorkItemRecentActivityType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemRecentActivityType with Double] = js.native
  /* 2 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  /* 1 */ @js.native
  object Edited extends TopLevel[Edited with Double]
  
  /* 3 */ @js.native
  object Restored extends TopLevel[Restored with Double]
  
  /* 0 */ @js.native
  object Visited extends TopLevel[Visited with Double]
  
}


package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemRecentActivityType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemRecentActivityType")
@js.native
object WorkItemRecentActivityType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemRecentActivityType with Double] = js.native
  
  @js.native
  sealed trait Deleted extends WorkItemRecentActivityType
  /* 2 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  @js.native
  sealed trait Edited extends WorkItemRecentActivityType
  /* 1 */ @js.native
  object Edited extends TopLevel[Edited with Double]
  
  @js.native
  sealed trait Restored extends WorkItemRecentActivityType
  /* 3 */ @js.native
  object Restored extends TopLevel[Restored with Double]
  
  @js.native
  sealed trait Visited extends WorkItemRecentActivityType
  /* 0 */ @js.native
  object Visited extends TopLevel[Visited with Double]
}

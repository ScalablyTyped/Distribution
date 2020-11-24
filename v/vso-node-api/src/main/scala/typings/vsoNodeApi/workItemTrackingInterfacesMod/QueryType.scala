package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryType")
@js.native
object QueryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryType with Double] = js.native
  
  /**
    * Gets a flat list of work items.
    */
  @js.native
  sealed trait Flat extends QueryType
  /* 1 */ @js.native
  object Flat extends TopLevel[Flat with Double]
  
  /**
    * Gets a list of work items and their direct links.
    */
  @js.native
  sealed trait OneHop extends QueryType
  /* 3 */ @js.native
  object OneHop extends TopLevel[OneHop with Double]
  
  /**
    * Gets a tree of work items showing their link hierarchy.
    */
  @js.native
  sealed trait Tree extends QueryType
  /* 2 */ @js.native
  object Tree extends TopLevel[Tree with Double]
}

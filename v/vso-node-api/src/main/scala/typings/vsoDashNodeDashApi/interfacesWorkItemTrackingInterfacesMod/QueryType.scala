package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryType.Flat
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryType.OneHop
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryType.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryType")
@js.native
object QueryType extends js.Object {
  /**
    * Gets a flat list of work items.
    */
  @js.native
  sealed trait Flat extends QueryType
  
  /**
    * Gets a list of work items and their direct links.
    */
  @js.native
  sealed trait OneHop extends QueryType
  
  /**
    * Gets a tree of work items showing their link hierarchy.
    */
  @js.native
  sealed trait Tree extends QueryType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryType with Double] = js.native
  /* 1 */ @js.native
  object Flat extends TopLevel[Flat with Double]
  
  /* 3 */ @js.native
  object OneHop extends TopLevel[OneHop with Double]
  
  /* 2 */ @js.native
  object Tree extends TopLevel[Tree with Double]
  
}


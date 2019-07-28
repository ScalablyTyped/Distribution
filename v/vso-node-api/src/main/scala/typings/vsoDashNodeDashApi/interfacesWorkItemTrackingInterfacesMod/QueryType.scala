package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
  
  /* 1 */ val Flat: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryType.Flat with Double = js.native
  /* 3 */ val OneHop: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryType.OneHop with Double = js.native
  /* 2 */ val Tree: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryType.Tree with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryType with Double] = js.native
}


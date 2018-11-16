package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait Flat
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryType
  
  /**
       * Gets a list of work items and their direct links.
       */
  @js.native
  sealed trait OneHop
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryType
  
  /**
       * Gets a tree of work items showing their link hierarchy.
       */
  @js.native
  sealed trait Tree
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryType
  
  /* 1 */ val Flat: Flat with scala.Double = js.native
  /* 3 */ val OneHop: OneHop with scala.Double = js.native
  /* 2 */ val Tree: Tree with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryType with scala.Double
  ] = js.native
}


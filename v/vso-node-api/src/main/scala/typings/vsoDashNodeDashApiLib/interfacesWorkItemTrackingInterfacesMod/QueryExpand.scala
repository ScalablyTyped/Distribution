package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryExpand")
@js.native
object QueryExpand extends js.Object {
  /**
    * Expands all properties
    */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  
  /**
    * Expands Columns, Links, ChangeInfo, WIQL text and clauses
    */
  @js.native
  sealed trait Clauses
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  
  /**
    * Displays minimal properties and the WIQL text
    */
  @js.native
  sealed trait Minimal
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  
  /**
    * Expands Columns, Links and ChangeInfo
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  
  /**
    * Expands Columns, Links,  ChangeInfo and WIQL text
    */
  @js.native
  sealed trait Wiql
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 2 */ val Clauses: Clauses with scala.Double = js.native
  /* 4 */ val Minimal: Minimal with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Wiql: Wiql with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand with scala.Double
  ] = js.native
}


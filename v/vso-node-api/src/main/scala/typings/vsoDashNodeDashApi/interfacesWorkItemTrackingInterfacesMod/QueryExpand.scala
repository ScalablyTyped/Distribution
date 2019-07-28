package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait All extends QueryExpand
  
  /**
    * Expands Columns, Links, ChangeInfo, WIQL text and clauses
    */
  @js.native
  sealed trait Clauses extends QueryExpand
  
  /**
    * Displays minimal properties and the WIQL text
    */
  @js.native
  sealed trait Minimal extends QueryExpand
  
  /**
    * Expands Columns, Links and ChangeInfo
    */
  @js.native
  sealed trait None extends QueryExpand
  
  /**
    * Expands Columns, Links,  ChangeInfo and WIQL text
    */
  @js.native
  sealed trait Wiql extends QueryExpand
  
  /* 3 */ val All: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.All with Double = js.native
  /* 2 */ val Clauses: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Clauses with Double = js.native
  /* 4 */ val Minimal: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Minimal with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.None with Double = js.native
  /* 1 */ val Wiql: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Wiql with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryExpand with Double] = js.native
}


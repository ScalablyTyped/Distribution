package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.All
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Clauses
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Minimal
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryExpand with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Clauses extends TopLevel[Clauses with Double]
  
  /* 4 */ @js.native
  object Minimal extends TopLevel[Minimal with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Wiql
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Wiql with Double
        ]
  
}


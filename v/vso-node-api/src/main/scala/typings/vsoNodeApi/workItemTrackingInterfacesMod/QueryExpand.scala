package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryExpand")
@js.native
object QueryExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryExpand with Double] = js.native
  
  /**
    * Expands all properties
    */
  @js.native
  sealed trait All extends QueryExpand
  /* 3 */ val All: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand.All with Double = js.native
  
  /**
    * Expands Columns, Links, ChangeInfo, WIQL text and clauses
    */
  @js.native
  sealed trait Clauses extends QueryExpand
  /* 2 */ val Clauses: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand.Clauses with Double = js.native
  
  /**
    * Displays minimal properties and the WIQL text
    */
  @js.native
  sealed trait Minimal extends QueryExpand
  /* 4 */ val Minimal: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand.Minimal with Double = js.native
  
  /**
    * Expands Columns, Links and ChangeInfo
    */
  @js.native
  sealed trait None extends QueryExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand.None with Double = js.native
  
  /**
    * Expands Columns, Links,  ChangeInfo and WIQL text
    */
  @js.native
  sealed trait Wiql extends QueryExpand
  /* 1 */ val Wiql: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand.Wiql with Double = js.native
}

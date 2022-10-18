package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryExpand")
@js.native
object QueryExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryExpand & Double] = js.native
  
  /**
    * Expands all properties
    */
  @js.native
  sealed trait All
    extends StObject
       with QueryExpand
  /* 3 */ val All: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.All & Double = js.native
  
  /**
    * Expands Columns, Links, ChangeInfo, WIQL text and clauses
    */
  @js.native
  sealed trait Clauses
    extends StObject
       with QueryExpand
  /* 2 */ val Clauses: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Clauses & Double = js.native
  
  /**
    * Displays minimal properties and the WIQL text
    */
  @js.native
  sealed trait Minimal
    extends StObject
       with QueryExpand
  /* 4 */ val Minimal: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Minimal & Double = js.native
  
  /**
    * Expands Columns, Links and ChangeInfo
    */
  @js.native
  sealed trait None
    extends StObject
       with QueryExpand
  /* 0 */ val None: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.None & Double = js.native
  
  /**
    * Expands Columns, Links,  ChangeInfo and WIQL text
    */
  @js.native
  sealed trait Wiql
    extends StObject
       with QueryExpand
  /* 1 */ val Wiql: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand.Wiql & Double = js.native
}

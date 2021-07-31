package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryType")
@js.native
object QueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryType & Double] = js.native
  
  /**
    * Gets a flat list of work items.
    */
  @js.native
  sealed trait Flat
    extends StObject
       with QueryType
  /* 1 */ val Flat: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryType.Flat & Double = js.native
  
  /**
    * Gets a list of work items and their direct links.
    */
  @js.native
  sealed trait OneHop
    extends StObject
       with QueryType
  /* 3 */ val OneHop: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryType.OneHop & Double = js.native
  
  /**
    * Gets a tree of work items showing their link hierarchy.
    */
  @js.native
  sealed trait Tree
    extends StObject
       with QueryType
  /* 2 */ val Tree: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryType.Tree & Double = js.native
}

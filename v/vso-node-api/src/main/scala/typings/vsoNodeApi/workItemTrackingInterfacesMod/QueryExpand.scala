package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryExpand extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryExpand")
@js.native
object QueryExpand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryExpand with Double] = js.native
  
  /**
    * Expands all properties
    */
  @js.native
  sealed trait All extends QueryExpand
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * Expands Columns, Links, ChangeInfo, WIQL text and clauses
    */
  @js.native
  sealed trait Clauses extends QueryExpand
  /* 2 */ @js.native
  object Clauses extends TopLevel[Clauses with Double]
  
  /**
    * Displays minimal properties and the WIQL text
    */
  @js.native
  sealed trait Minimal extends QueryExpand
  /* 4 */ @js.native
  object Minimal extends TopLevel[Minimal with Double]
  
  /**
    * Expands Columns, Links and ChangeInfo
    */
  @js.native
  sealed trait None extends QueryExpand
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Expands Columns, Links,  ChangeInfo and WIQL text
    */
  @js.native
  sealed trait Wiql extends QueryExpand
  /* 1 */ @js.native
  object Wiql
    extends TopLevel[typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand.Wiql with Double]
}

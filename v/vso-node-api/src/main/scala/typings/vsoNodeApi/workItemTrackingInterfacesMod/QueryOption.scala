package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryOption extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryOption")
@js.native
object QueryOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryOption with Double] = js.native
  
  @js.native
  sealed trait Doing extends QueryOption
  /* 1 */ val Doing: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryOption.Doing with Double = js.native
  
  @js.native
  sealed trait Done extends QueryOption
  /* 2 */ val Done: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryOption.Done with Double = js.native
  
  @js.native
  sealed trait Followed extends QueryOption
  /* 3 */ val Followed: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryOption.Followed with Double = js.native
}

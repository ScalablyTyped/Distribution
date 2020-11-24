package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryOption extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryOption")
@js.native
object QueryOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryOption with Double] = js.native
  
  @js.native
  sealed trait Doing extends QueryOption
  /* 1 */ @js.native
  object Doing extends TopLevel[Doing with Double]
  
  @js.native
  sealed trait Done extends QueryOption
  /* 2 */ @js.native
  object Done extends TopLevel[Done with Double]
  
  @js.native
  sealed trait Followed extends QueryOption
  /* 3 */ @js.native
  object Followed extends TopLevel[Followed with Double]
}

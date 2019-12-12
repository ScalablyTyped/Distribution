package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryOption.Doing
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryOption.Done
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryOption.Followed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryOption extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryOption")
@js.native
object QueryOption extends js.Object {
  @js.native
  sealed trait Doing extends QueryOption
  
  @js.native
  sealed trait Done extends QueryOption
  
  @js.native
  sealed trait Followed extends QueryOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryOption with Double] = js.native
  /* 1 */ @js.native
  object Doing extends TopLevel[Doing with Double]
  
  /* 2 */ @js.native
  object Done extends TopLevel[Done with Double]
  
  /* 3 */ @js.native
  object Followed extends TopLevel[Followed with Double]
  
}


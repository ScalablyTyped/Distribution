package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryOption extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryOption")
@js.native
object QueryOption extends js.Object {
  @js.native
  sealed trait Doing
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryOption
  
  @js.native
  sealed trait Done
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryOption
  
  @js.native
  sealed trait Followed
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryOption
  
  /* 1 */ val Doing: Doing with scala.Double = js.native
  /* 2 */ val Done: Done with scala.Double = js.native
  /* 3 */ val Followed: Followed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryOption with scala.Double
  ] = js.native
}


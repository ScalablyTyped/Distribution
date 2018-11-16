package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkChangeType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkChangeType")
@js.native
object LinkChangeType extends js.Object {
  @js.native
  sealed trait Create
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkChangeType
  
  @js.native
  sealed trait Remove
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkChangeType
  
  /* 0 */ val Create: Create with scala.Double = js.native
  /* 1 */ val Remove: Remove with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkChangeType with scala.Double
  ] = js.native
}


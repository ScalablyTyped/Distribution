package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GateStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends js.Object {
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.GateStatus
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.GateStatus
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.GateStatus
  
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.GateStatus
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.GateStatus
  
  /* 8 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Pending: Pending with scala.Double = js.native
  /* 4 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.GateStatus with scala.Double
  ] = js.native
}


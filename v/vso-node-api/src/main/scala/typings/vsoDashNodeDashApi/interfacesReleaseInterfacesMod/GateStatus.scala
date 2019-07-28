package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GateStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends js.Object {
  @js.native
  sealed trait Failed extends GateStatus
  
  @js.native
  sealed trait InProgress extends GateStatus
  
  @js.native
  sealed trait None extends GateStatus
  
  @js.native
  sealed trait Pending extends GateStatus
  
  @js.native
  sealed trait Succeeded extends GateStatus
  
  /* 8 */ val Failed: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.Failed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.InProgress with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.None with Double = js.native
  /* 1 */ val Pending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.Pending with Double = js.native
  /* 4 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.GateStatus.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GateStatus with Double] = js.native
}


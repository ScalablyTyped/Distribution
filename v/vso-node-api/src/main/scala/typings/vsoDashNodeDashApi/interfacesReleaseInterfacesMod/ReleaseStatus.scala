package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseStatus")
@js.native
object ReleaseStatus extends js.Object {
  @js.native
  sealed trait Abandoned extends ReleaseStatus
  
  @js.native
  sealed trait Active extends ReleaseStatus
  
  @js.native
  sealed trait Draft extends ReleaseStatus
  
  @js.native
  sealed trait Undefined extends ReleaseStatus
  
  /* 4 */ val Abandoned: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Abandoned with Double = js.native
  /* 2 */ val Active: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Active with Double = js.native
  /* 1 */ val Draft: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Draft with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseStatus.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseStatus with Double] = js.native
}


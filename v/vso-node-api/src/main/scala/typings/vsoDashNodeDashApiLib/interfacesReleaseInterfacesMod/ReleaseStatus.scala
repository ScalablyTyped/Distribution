package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseStatus")
@js.native
object ReleaseStatus extends js.Object {
  @js.native
  sealed trait Abandoned
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStatus
  
  @js.native
  sealed trait Active
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStatus
  
  @js.native
  sealed trait Draft
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStatus
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStatus
  
  /* 4 */ val Abandoned: Abandoned with scala.Double = js.native
  /* 2 */ val Active: Active with scala.Double = js.native
  /* 1 */ val Draft: Draft with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStatus with scala.Double
  ] = js.native
}


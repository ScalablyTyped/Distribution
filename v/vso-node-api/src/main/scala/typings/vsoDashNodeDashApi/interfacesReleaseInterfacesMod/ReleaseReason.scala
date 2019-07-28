package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseReason extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseReason")
@js.native
object ReleaseReason extends js.Object {
  @js.native
  sealed trait ContinuousIntegration extends ReleaseReason
  
  @js.native
  sealed trait Manual extends ReleaseReason
  
  @js.native
  sealed trait None extends ReleaseReason
  
  @js.native
  sealed trait Schedule extends ReleaseReason
  
  /* 2 */ val ContinuousIntegration: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseReason.ContinuousIntegration with Double = js.native
  /* 1 */ val Manual: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseReason.Manual with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseReason.None with Double = js.native
  /* 3 */ val Schedule: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseReason.Schedule with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseReason with Double] = js.native
}


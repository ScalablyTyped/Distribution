package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseReason extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseReason")
@js.native
object ReleaseReason extends js.Object {
  @js.native
  sealed trait ContinuousIntegration
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseReason
  
  @js.native
  sealed trait Manual
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseReason
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseReason
  
  @js.native
  sealed trait Schedule
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseReason
  
  /* 2 */ val ContinuousIntegration: ContinuousIntegration with scala.Double = js.native
  /* 1 */ val Manual: Manual with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Schedule: Schedule with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseReason with scala.Double
  ] = js.native
}


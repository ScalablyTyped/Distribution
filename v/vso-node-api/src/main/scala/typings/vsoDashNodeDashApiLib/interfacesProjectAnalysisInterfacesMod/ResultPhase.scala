package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultPhase extends js.Object

@JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "ResultPhase")
@js.native
object ResultPhase extends js.Object {
  @js.native
  sealed trait Full
    extends vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ResultPhase
  
  @js.native
  sealed trait Preliminary
    extends vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ResultPhase
  
  /* 1 */ val Full: Full with scala.Double = js.native
  /* 0 */ val Preliminary: Preliminary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ResultPhase with scala.Double
  ] = js.native
}


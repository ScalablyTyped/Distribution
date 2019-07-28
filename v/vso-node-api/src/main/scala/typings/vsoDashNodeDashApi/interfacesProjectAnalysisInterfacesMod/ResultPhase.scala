package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultPhase extends js.Object

@JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "ResultPhase")
@js.native
object ResultPhase extends js.Object {
  @js.native
  sealed trait Full extends ResultPhase
  
  @js.native
  sealed trait Preliminary extends ResultPhase
  
  /* 1 */ val Full: typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ResultPhase.Full with Double = js.native
  /* 0 */ val Preliminary: typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ResultPhase.Preliminary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultPhase with Double] = js.native
}


package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ResultPhase.Full
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ResultPhase.Preliminary
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultPhase with Double] = js.native
  /* 1 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 0 */ @js.native
  object Preliminary extends TopLevel[Preliminary with Double]
  
}


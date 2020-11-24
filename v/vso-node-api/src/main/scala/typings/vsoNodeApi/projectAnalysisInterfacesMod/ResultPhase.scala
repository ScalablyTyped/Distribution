package typings.vsoNodeApi.projectAnalysisInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultPhase extends js.Object
@JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "ResultPhase")
@js.native
object ResultPhase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultPhase with Double] = js.native
  
  @js.native
  sealed trait Full extends ResultPhase
  /* 1 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  @js.native
  sealed trait Preliminary extends ResultPhase
  /* 0 */ @js.native
  object Preliminary extends TopLevel[Preliminary with Double]
}

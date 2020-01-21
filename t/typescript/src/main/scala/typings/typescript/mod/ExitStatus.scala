package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExitStatus extends js.Object

@JSImport("typescript", "ExitStatus")
@js.native
object ExitStatus extends js.Object {
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated extends ExitStatus
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped extends ExitStatus
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped extends ExitStatus
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped extends ExitStatus
  
  /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkupped extends ExitStatus
  
  @js.native
  sealed trait Success extends ExitStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus with Double] = js.native
  /* 2 */ @js.native
  object DiagnosticsPresent_OutputsGenerated extends TopLevel[DiagnosticsPresent_OutputsGenerated with Double]
  
  /* 1 */ @js.native
  object DiagnosticsPresent_OutputsSkipped extends TopLevel[DiagnosticsPresent_OutputsSkipped with Double]
  
  /* 3 */ @js.native
  object InvalidProject_OutputsSkipped extends TopLevel[InvalidProject_OutputsSkipped with Double]
  
  /* 4 */ @js.native
  object ProjectReferenceCycle_OutputsSkipped extends TopLevel[ProjectReferenceCycle_OutputsSkipped with Double]
  
  /* 4 */ @js.native
  object ProjectReferenceCycle_OutputsSkupped extends TopLevel[ProjectReferenceCycle_OutputsSkupped with Double]
  
  /* 0 */ @js.native
  object Success extends TopLevel[Success with Double]
  
}


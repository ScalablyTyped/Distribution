package typings.winrtDashUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CausalityTraceLevel extends js.Object

/** Specifies a logging level that listeners can use for trace filtering. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalityTraceLevel")
@js.native
object CausalityTraceLevel extends js.Object {
  /** Tracks operations that are not necessary to construct a causality chain but are interesting for developers. */
  @js.native
  sealed trait important extends CausalityTraceLevel
  
  /** Indicates all operations that are necessary to construct a causality chain, including all operations for job creation and completion and work item creation and completion. */
  @js.native
  sealed trait required extends CausalityTraceLevel
  
  /** Indicates operations that influence causality but are likely to be less interesting for developers, including actions like registering progress delegates. */
  @js.native
  sealed trait verbose extends CausalityTraceLevel
  
  /* 1 */ val important: typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel.important with Double = js.native
  /* 0 */ val required: typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel.required with Double = js.native
  /* 2 */ val verbose: typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel.verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CausalityTraceLevel with Double] = js.native
}


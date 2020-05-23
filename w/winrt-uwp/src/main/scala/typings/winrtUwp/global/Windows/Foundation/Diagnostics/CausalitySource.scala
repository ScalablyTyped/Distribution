package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides flags that listeners use to filter tracing events. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalitySource")
@js.native
object CausalitySource extends js.Object {
  /* 0 */ val application: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource.application with Double = js.native
  /* 1 */ val library: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource.library with Double = js.native
  /* 2 */ val system: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource.system with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource with Double] = js.native
}


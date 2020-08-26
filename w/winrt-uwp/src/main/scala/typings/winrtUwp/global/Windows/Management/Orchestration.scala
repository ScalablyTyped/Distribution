package typings.winrtUwp.global.Windows.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management.Orchestration")
@js.native
object Orchestration extends js.Object {
  @js.native
  abstract class CurrentAppOrchestration ()
    extends typings.winrtUwp.Windows.Management.Orchestration.CurrentAppOrchestration
  
  @js.native
  abstract class SingleAppModeContext ()
    extends typings.winrtUwp.Windows.Management.Orchestration.SingleAppModeContext
  
  /* static members */
  @js.native
  object CurrentAppOrchestration extends js.Object {
    var getForCurrentView: js.Any = js.native
  }
  
}


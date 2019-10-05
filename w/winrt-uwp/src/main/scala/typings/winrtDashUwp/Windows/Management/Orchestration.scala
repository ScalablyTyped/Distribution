package typings.winrtDashUwp.Windows.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management.Orchestration")
@js.native
object Orchestration extends js.Object {
  @js.native
  abstract class CurrentAppOrchestration () extends js.Object {
     /* unmapped type */ var startSingleAppMode: js.Any = js.native
  }
  
  @js.native
  abstract class SingleAppModeContext () extends js.Object {
    var close: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object CurrentAppOrchestration extends js.Object {
    var getForCurrentView: js.Any = js.native
  }
  
}


package typings.winrtUwp.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management.Deployment.Preview")
@js.native
object Preview extends js.Object {
  @js.native
  abstract class ClassicAppManager () extends js.Object
  
  @js.native
  abstract class InstalledClassicAppInfo () extends js.Object {
    var displayName: js.Any = js.native
     /* unmapped type */ var displayVersion: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ClassicAppManager extends js.Object {
    var findInstalledApp: js.Any = js.native
  }
  
}


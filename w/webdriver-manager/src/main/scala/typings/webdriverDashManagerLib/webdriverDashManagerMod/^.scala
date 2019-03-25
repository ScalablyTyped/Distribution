package typings
package webdriverDashManagerLib.webdriverDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var setLogLevel: js.Function2[
    /* level */ loglevelLib.loglevelMod.logNs.LogLevelDesc, 
    /* persist */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  def clean(options: webdriverDashManagerLib.distLibCmdsOptionsMod.Options): java.lang.String = js.native
  def shutdown(options: webdriverDashManagerLib.distLibCmdsOptionsMod.Options): js.Promise[scala.Unit] = js.native
  def start(options: webdriverDashManagerLib.distLibCmdsOptionsMod.Options): js.Promise[scala.Double] = js.native
  def status(options: webdriverDashManagerLib.distLibCmdsOptionsMod.Options): java.lang.String = js.native
  def update(options: webdriverDashManagerLib.distLibCmdsOptionsMod.Options): js.Promise[js.Array[scala.Unit]] = js.native
}


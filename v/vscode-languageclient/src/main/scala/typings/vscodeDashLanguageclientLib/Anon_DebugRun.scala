package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugRun
  extends vscodeDashLanguageclientLib.vscodeDashLanguageclientMod._ServerOptions {
  var debug: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.NodeModule
  var run: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.NodeModule
}

object Anon_DebugRun {
  @scala.inline
  def apply(
    debug: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.NodeModule,
    run: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.NodeModule
  ): Anon_DebugRun = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Anon_DebugRun]
  }
}


package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug
  extends vscodeDashLanguageclientLib.vscodeDashLanguageclientMod._ServerOptions {
  var debug: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.Executable
  var run: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.Executable
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.Executable,
    run: vscodeDashLanguageclientLib.vscodeDashLanguageclientMod.Executable
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Anon_Debug]
  }
}


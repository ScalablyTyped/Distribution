package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProcessInfo extends js.Object {
  var detached: scala.Boolean
  var process: nodeLib.childUnderscoreProcessMod.ChildProcess
}

object ChildProcessInfo {
  @scala.inline
  def apply(detached: scala.Boolean, process: nodeLib.childUnderscoreProcessMod.ChildProcess): ChildProcessInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detached")(detached)
    __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[ChildProcessInfo]
  }
}


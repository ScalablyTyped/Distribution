package typings.vscodeLanguageclient.mod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProcessInfo extends js.Object {
  var detached: Boolean
  var process: ChildProcess
}

object ChildProcessInfo {
  @scala.inline
  def apply(detached: Boolean, process: ChildProcess): ChildProcessInfo = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChildProcessInfo]
  }
}


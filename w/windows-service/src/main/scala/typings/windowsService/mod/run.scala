package typings.windowsService.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("windows-service", "run")
@js.native
object run extends js.Object {
  
  def apply(stdoutLogStream: Writable, callback: js.Function0[Unit]): Unit = js.native
  def apply(stdoutLogStream: Writable, stderrLogStream: Writable, callback: js.Function0[Unit]): Unit = js.native
}

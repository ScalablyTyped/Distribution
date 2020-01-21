package typings.vscodeLanguageclient

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/utils/processes", JSImport.Namespace)
@js.native
object processesMod extends js.Object {
  def terminate(process: ChildProcess): Boolean = js.native
  def terminate(process: ChildProcess, cwd: String): Boolean = js.native
}


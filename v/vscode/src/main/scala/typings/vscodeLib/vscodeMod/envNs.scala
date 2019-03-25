package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "env")
@js.native
object envNs extends js.Object {
  val appName: java.lang.String = js.native
  val appRoot: java.lang.String = js.native
  val clipboard: vscodeLib.vscodeMod.Clipboard = js.native
  val language: java.lang.String = js.native
  val machineId: java.lang.String = js.native
  val sessionId: java.lang.String = js.native
  def openExternal(target: vscodeLib.vscodeMod.Uri): vscodeLib.Thenable[scala.Boolean] = js.native
}


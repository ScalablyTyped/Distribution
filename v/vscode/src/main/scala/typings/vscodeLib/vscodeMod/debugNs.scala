package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "debug")
@js.native
object debugNs extends js.Object {
  var activeDebugSession: js.UndefOr[vscodeLib.vscodeMod.DebugSession] = js.native
  val onDidChangeActiveDebugSession: vscodeLib.vscodeMod.Event[js.UndefOr[vscodeLib.vscodeMod.DebugSession]] = js.native
  val onDidReceiveDebugSessionCustomEvent: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.DebugSessionCustomEvent] = js.native
  val onDidStartDebugSession: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.DebugSession] = js.native
  val onDidTerminateDebugSession: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.DebugSession] = js.native
  def registerDebugConfigurationProvider(debugType: java.lang.String, provider: vscodeLib.vscodeMod.DebugConfigurationProvider): vscodeLib.vscodeMod.Disposable = js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: java.lang.String): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: vscodeLib.vscodeMod.DebugConfiguration): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(folder: vscodeLib.vscodeMod.WorkspaceFolder, nameOrConfiguration: java.lang.String): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(
    folder: vscodeLib.vscodeMod.WorkspaceFolder,
    nameOrConfiguration: vscodeLib.vscodeMod.DebugConfiguration
  ): vscodeLib.Thenable[scala.Boolean] = js.native
}


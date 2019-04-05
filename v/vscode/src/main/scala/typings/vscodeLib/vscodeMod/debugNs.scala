package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "debug")
@js.native
object debugNs extends js.Object {
  var activeDebugConsole: vscodeLib.vscodeMod.DebugConsole = js.native
  var activeDebugSession: js.UndefOr[vscodeLib.vscodeMod.DebugSession] = js.native
  var breakpoints: js.Array[vscodeLib.vscodeMod.Breakpoint] = js.native
  val onDidChangeActiveDebugSession: vscodeLib.vscodeMod.Event[js.UndefOr[vscodeLib.vscodeMod.DebugSession]] = js.native
  val onDidChangeBreakpoints: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.BreakpointsChangeEvent] = js.native
  val onDidReceiveDebugSessionCustomEvent: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.DebugSessionCustomEvent] = js.native
  val onDidStartDebugSession: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.DebugSession] = js.native
  val onDidTerminateDebugSession: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.DebugSession] = js.native
  def addBreakpoints(breakpoints: js.Array[vscodeLib.vscodeMod.Breakpoint]): scala.Unit = js.native
  def registerDebugAdapterDescriptorFactory(debugType: java.lang.String, factory: vscodeLib.vscodeMod.DebugAdapterDescriptorFactory): vscodeLib.vscodeMod.Disposable = js.native
  def registerDebugAdapterTrackerFactory(debugType: java.lang.String, factory: vscodeLib.vscodeMod.DebugAdapterTrackerFactory): vscodeLib.vscodeMod.Disposable = js.native
  def registerDebugConfigurationProvider(debugType: java.lang.String, provider: vscodeLib.vscodeMod.DebugConfigurationProvider): vscodeLib.vscodeMod.Disposable = js.native
  def removeBreakpoints(breakpoints: js.Array[vscodeLib.vscodeMod.Breakpoint]): scala.Unit = js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: java.lang.String): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: java.lang.String,
    parentSession: vscodeLib.vscodeMod.DebugSession
  ): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: vscodeLib.vscodeMod.DebugConfiguration): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: vscodeLib.vscodeMod.DebugConfiguration,
    parentSession: vscodeLib.vscodeMod.DebugSession
  ): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(folder: vscodeLib.vscodeMod.WorkspaceFolder, nameOrConfiguration: java.lang.String): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(
    folder: vscodeLib.vscodeMod.WorkspaceFolder,
    nameOrConfiguration: java.lang.String,
    parentSession: vscodeLib.vscodeMod.DebugSession
  ): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(
    folder: vscodeLib.vscodeMod.WorkspaceFolder,
    nameOrConfiguration: vscodeLib.vscodeMod.DebugConfiguration
  ): vscodeLib.Thenable[scala.Boolean] = js.native
  def startDebugging(
    folder: vscodeLib.vscodeMod.WorkspaceFolder,
    nameOrConfiguration: vscodeLib.vscodeMod.DebugConfiguration,
    parentSession: vscodeLib.vscodeMod.DebugSession
  ): vscodeLib.Thenable[scala.Boolean] = js.native
}


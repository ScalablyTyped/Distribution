package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "debug")
@js.native
object debug extends js.Object {
  var activeDebugConsole: DebugConsole = js.native
  var activeDebugSession: js.UndefOr[DebugSession] = js.native
  var breakpoints: js.Array[Breakpoint] = js.native
  val onDidChangeActiveDebugSession: Event[js.UndefOr[DebugSession]] = js.native
  val onDidChangeBreakpoints: Event[BreakpointsChangeEvent] = js.native
  val onDidReceiveDebugSessionCustomEvent: Event[DebugSessionCustomEvent] = js.native
  val onDidStartDebugSession: Event[DebugSession] = js.native
  val onDidTerminateDebugSession: Event[DebugSession] = js.native
  def addBreakpoints(breakpoints: js.Array[Breakpoint]): Unit = js.native
  def asDebugSourceUri(source: DebugProtocolSource): Uri = js.native
  def asDebugSourceUri(source: DebugProtocolSource, session: DebugSession): Uri = js.native
  def registerDebugAdapterDescriptorFactory(debugType: String, factory: DebugAdapterDescriptorFactory): Disposable = js.native
  def registerDebugAdapterTrackerFactory(debugType: String, factory: DebugAdapterTrackerFactory): Disposable = js.native
  def registerDebugConfigurationProvider(debugType: String, provider: DebugConfigurationProvider): Disposable = js.native
  def removeBreakpoints(breakpoints: js.Array[Breakpoint]): Unit = js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: String): Thenable[Boolean] = js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: String,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: String,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String): Thenable[Boolean] = js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSession): Thenable[Boolean] = js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = js.native
  def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = js.native
  def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = js.native
}


package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debug {
  
  @JSImport("vscode", "debug")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode", "debug.activeDebugConsole")
  @js.native
  def activeDebugConsole: DebugConsole = js.native
  @scala.inline
  def activeDebugConsole_=(x: DebugConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeDebugConsole")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "debug.activeDebugSession")
  @js.native
  def activeDebugSession: js.UndefOr[DebugSession] = js.native
  @scala.inline
  def activeDebugSession_=(x: js.UndefOr[DebugSession]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeDebugSession")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "debug.addBreakpoints")
  @js.native
  def addBreakpoints(breakpoints: js.Array[Breakpoint]): Unit = js.native
  
  @JSImport("vscode", "debug.asDebugSourceUri")
  @js.native
  def asDebugSourceUri(source: DebugProtocolSource): Uri = js.native
  @JSImport("vscode", "debug.asDebugSourceUri")
  @js.native
  def asDebugSourceUri(source: DebugProtocolSource, session: DebugSession): Uri = js.native
  
  @JSImport("vscode", "debug.breakpoints")
  @js.native
  def breakpoints: js.Array[Breakpoint] = js.native
  @scala.inline
  def breakpoints_=(x: js.Array[Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "debug.onDidChangeActiveDebugSession")
  @js.native
  val onDidChangeActiveDebugSession: Event[js.UndefOr[DebugSession]] = js.native
  
  @JSImport("vscode", "debug.onDidChangeBreakpoints")
  @js.native
  val onDidChangeBreakpoints: Event[BreakpointsChangeEvent] = js.native
  
  @JSImport("vscode", "debug.onDidReceiveDebugSessionCustomEvent")
  @js.native
  val onDidReceiveDebugSessionCustomEvent: Event[DebugSessionCustomEvent] = js.native
  
  @JSImport("vscode", "debug.onDidStartDebugSession")
  @js.native
  val onDidStartDebugSession: Event[DebugSession] = js.native
  
  @JSImport("vscode", "debug.onDidTerminateDebugSession")
  @js.native
  val onDidTerminateDebugSession: Event[DebugSession] = js.native
  
  @JSImport("vscode", "debug.registerDebugAdapterDescriptorFactory")
  @js.native
  def registerDebugAdapterDescriptorFactory(debugType: String, factory: DebugAdapterDescriptorFactory): Disposable = js.native
  
  @JSImport("vscode", "debug.registerDebugAdapterTrackerFactory")
  @js.native
  def registerDebugAdapterTrackerFactory(debugType: String, factory: DebugAdapterTrackerFactory): Disposable = js.native
  
  @JSImport("vscode", "debug.registerDebugConfigurationProvider")
  @js.native
  def registerDebugConfigurationProvider(debugType: String, provider: DebugConfigurationProvider): Disposable = js.native
  @JSImport("vscode", "debug.registerDebugConfigurationProvider")
  @js.native
  def registerDebugConfigurationProvider(
    debugType: String,
    provider: DebugConfigurationProvider,
    triggerKind: DebugConfigurationProviderTriggerKind
  ): Disposable = js.native
  
  @JSImport("vscode", "debug.removeBreakpoints")
  @js.native
  def removeBreakpoints(breakpoints: js.Array[Breakpoint]): Unit = js.native
  
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: String): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: String,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: String,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(folder: js.UndefOr[scala.Nothing], nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(
    folder: js.UndefOr[scala.Nothing],
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSession): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = js.native
  @JSImport("vscode", "debug.startDebugging")
  @js.native
  def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = js.native
  
  @JSImport("vscode", "debug.stopDebugging")
  @js.native
  def stopDebugging(): Thenable[Unit] = js.native
  @JSImport("vscode", "debug.stopDebugging")
  @js.native
  def stopDebugging(session: DebugSession): Thenable[Unit] = js.native
}

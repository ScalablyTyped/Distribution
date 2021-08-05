package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debug {
  
  @JSImport("vscode", "debug")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode", "debug.activeDebugConsole")
  @js.native
  def activeDebugConsole: DebugConsole = js.native
  inline def activeDebugConsole_=(x: DebugConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeDebugConsole")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode", "debug.activeDebugSession")
  @js.native
  def activeDebugSession: js.UndefOr[DebugSession] = js.native
  inline def activeDebugSession_=(x: js.UndefOr[DebugSession]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeDebugSession")(x.asInstanceOf[js.Any])
  
  inline def addBreakpoints(breakpoints: js.Array[Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreakpoints")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def asDebugSourceUri(source: DebugProtocolSource): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("asDebugSourceUri")(source.asInstanceOf[js.Any]).asInstanceOf[Uri]
  inline def asDebugSourceUri(source: DebugProtocolSource, session: DebugSession): Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("asDebugSourceUri")(source.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[Uri]
  
  @JSImport("vscode", "debug.breakpoints")
  @js.native
  def breakpoints: js.Array[Breakpoint] = js.native
  inline def breakpoints_=(x: js.Array[Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(x.asInstanceOf[js.Any])
  
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
  
  inline def registerDebugAdapterDescriptorFactory(debugType: String, factory: DebugAdapterDescriptorFactory): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugAdapterDescriptorFactory")(debugType.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDebugAdapterTrackerFactory(debugType: String, factory: DebugAdapterTrackerFactory): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugAdapterTrackerFactory")(debugType.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDebugConfigurationProvider(debugType: String, provider: DebugConfigurationProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugConfigurationProvider")(debugType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerDebugConfigurationProvider(
    debugType: String,
    provider: DebugConfigurationProvider,
    triggerKind: DebugConfigurationProviderTriggerKind
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugConfigurationProvider")(debugType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def removeBreakpoints(breakpoints: js.Array[Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBreakpoints")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startDebugging(folder: Unit, nameOrConfiguration: String): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: String, parentSessionOrOptions: DebugSession): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: String, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: DebugConfiguration, parentSessionOrOptions: DebugSession): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: DebugConfiguration, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSession): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  
  inline def stopDebugging(): Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopDebugging")().asInstanceOf[Thenable[Unit]]
  inline def stopDebugging(session: DebugSession): Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopDebugging")(session.asInstanceOf[js.Any]).asInstanceOf[Thenable[Unit]]
}

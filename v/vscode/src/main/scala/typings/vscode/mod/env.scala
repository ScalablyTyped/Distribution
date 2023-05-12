package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object env {
  
  @JSImport("vscode", "env")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode", "env.appHost")
  @js.native
  val appHost: String = js.native
  
  @JSImport("vscode", "env.appName")
  @js.native
  val appName: String = js.native
  
  @JSImport("vscode", "env.appRoot")
  @js.native
  val appRoot: String = js.native
  
  inline def asExternalUri(target: Uri): Thenable[Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("asExternalUri")(target.asInstanceOf[js.Any]).asInstanceOf[Thenable[Uri]]
  
  @JSImport("vscode", "env.clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  inline def createTelemetryLogger(sender: TelemetrySender): TelemetryLogger = ^.asInstanceOf[js.Dynamic].applyDynamic("createTelemetryLogger")(sender.asInstanceOf[js.Any]).asInstanceOf[TelemetryLogger]
  inline def createTelemetryLogger(sender: TelemetrySender, options: TelemetryLoggerOptions): TelemetryLogger = (^.asInstanceOf[js.Dynamic].applyDynamic("createTelemetryLogger")(sender.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TelemetryLogger]
  
  @JSImport("vscode", "env.isNewAppInstall")
  @js.native
  val isNewAppInstall: Boolean = js.native
  
  @JSImport("vscode", "env.isTelemetryEnabled")
  @js.native
  val isTelemetryEnabled: Boolean = js.native
  
  @JSImport("vscode", "env.language")
  @js.native
  val language: String = js.native
  
  @JSImport("vscode", "env.logLevel")
  @js.native
  val logLevel: LogLevel = js.native
  
  @JSImport("vscode", "env.machineId")
  @js.native
  val machineId: String = js.native
  
  @JSImport("vscode", "env.onDidChangeLogLevel")
  @js.native
  val onDidChangeLogLevel: Event[LogLevel] = js.native
  
  @JSImport("vscode", "env.onDidChangeTelemetryEnabled")
  @js.native
  val onDidChangeTelemetryEnabled: Event[Boolean] = js.native
  
  inline def openExternal(target: Uri): Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openExternal")(target.asInstanceOf[js.Any]).asInstanceOf[Thenable[Boolean]]
  
  @JSImport("vscode", "env.remoteName")
  @js.native
  val remoteName: js.UndefOr[String] = js.native
  
  @JSImport("vscode", "env.sessionId")
  @js.native
  val sessionId: String = js.native
  
  @JSImport("vscode", "env.shell")
  @js.native
  val shell: String = js.native
  
  @JSImport("vscode", "env.uiKind")
  @js.native
  val uiKind: UIKind = js.native
  
  @JSImport("vscode", "env.uriScheme")
  @js.native
  val uriScheme: String = js.native
}

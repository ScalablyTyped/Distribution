package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object env {
  
  @JSImport("vscode", "env.appName")
  @js.native
  val appName: String = js.native
  
  @JSImport("vscode", "env.appRoot")
  @js.native
  val appRoot: String = js.native
  
  @JSImport("vscode", "env.asExternalUri")
  @js.native
  def asExternalUri(target: Uri): Thenable[Uri] = js.native
  
  @JSImport("vscode", "env.clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSImport("vscode", "env.language")
  @js.native
  val language: String = js.native
  
  @JSImport("vscode", "env.machineId")
  @js.native
  val machineId: String = js.native
  
  @JSImport("vscode", "env.openExternal")
  @js.native
  def openExternal(target: Uri): Thenable[Boolean] = js.native
  
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

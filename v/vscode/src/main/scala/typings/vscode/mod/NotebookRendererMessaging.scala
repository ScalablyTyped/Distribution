package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookRendererMessaging extends StObject {
  
  /**
    * An event that fires when a message is received from a renderer.
    */
  def onDidReceiveMessage(listener: js.Function1[/* e */ Editor, Any]): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ Editor, Any], thisArgs: Any): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ Editor, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ Editor, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Send a message to one or all renderer.
    *
    * @param message Message to send
    * @param editor Editor to target with the message. If not provided, the
    * message is sent to all renderers.
    * @returns a boolean indicating whether the message was successfully
    * delivered to any renderer.
    */
  def postMessage(message: Any): Thenable[Boolean] = js.native
  def postMessage(message: Any, editor: NotebookEditor): Thenable[Boolean] = js.native
}

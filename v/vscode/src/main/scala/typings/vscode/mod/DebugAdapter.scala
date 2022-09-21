package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugAdapter extends Disposable {
  
  /**
    * Handle a Debug Adapter Protocol message.
    * Messages can be requests, responses, or events.
    * Results or errors are returned via onSendMessage events.
    * @param message A Debug Adapter Protocol message
    */
  def handleMessage(message: DebugProtocolMessage): Unit = js.native
  
  /**
    * An event which fires after the debug adapter has sent a Debug Adapter Protocol message to the editor.
    * Messages can be requests, responses, or events.
    */
  def onDidSendMessage(listener: js.Function1[/* e */ DebugProtocolMessage, Any]): Disposable = js.native
  def onDidSendMessage(listener: js.Function1[/* e */ DebugProtocolMessage, Any], thisArgs: Any): Disposable = js.native
  def onDidSendMessage(
    listener: js.Function1[/* e */ DebugProtocolMessage, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidSendMessage(
    listener: js.Function1[/* e */ DebugProtocolMessage, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}

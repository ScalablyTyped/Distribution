package typings.vscodeJsonrpc.messageReaderMod

import typings.std.Error
import typings.vscodeJsonrpc.eventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messageReader", "AbstractMessageReader")
@js.native
abstract class AbstractMessageReader () extends js.Object {
  
  var asError: js.Any = js.native
  
  var closeEmitter: js.Any = js.native
  
  def dispose(): Unit = js.native
  
  var errorEmitter: js.Any = js.native
  
  /* protected */ def fireClose(): Unit = js.native
  
  /* protected */ def fireError(error: js.Any): Unit = js.native
  
  /* protected */ def firePartialMessage(info: PartialMessageInfo): Unit = js.native
  
  def onClose: Event[Unit] = js.native
  
  def onError: Event[Error] = js.native
  
  def onPartialMessage: Event[PartialMessageInfo] = js.native
  
  var partialMessageEmitter: js.Any = js.native
}

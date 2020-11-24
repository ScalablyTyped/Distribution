package typings.vscodeJsonrpc.messageReaderMod

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messageReader", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends AbstractMessageReader
     with MessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: BufferEncoding) = this()
  
  var _partialMessageTimeout: js.Any = js.native
  
  var buffer: js.Any = js.native
  
  var callback: js.Any = js.native
  
  var clearPartialMessageTimer: js.Any = js.native
  
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  var messageToken: js.Any = js.native
  
  var nextMessageLength: js.Any = js.native
  
  var onData: js.Any = js.native
  
  def partialMessageTimeout: Double = js.native
  def partialMessageTimeout_=(timeout: Double): Unit = js.native
  
  var partialMessageTimer: js.Any = js.native
  
  var readable: js.Any = js.native
  
  var setPartialMessageTimer: js.Any = js.native
}

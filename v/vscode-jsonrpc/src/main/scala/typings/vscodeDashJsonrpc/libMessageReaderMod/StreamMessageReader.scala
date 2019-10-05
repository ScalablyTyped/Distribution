package typings.vscodeDashJsonrpc.libMessageReaderMod

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends AbstractMessageReader
     with MessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
  var _partialMessageTimeout: js.Any = js.native
  var buffer: js.Any = js.native
  var callback: js.Any = js.native
  var clearPartialMessageTimer: js.Any = js.native
  var messageToken: js.Any = js.native
  var nextMessageLength: js.Any = js.native
  var onData: js.Any = js.native
  var partialMessageTimeout: Double = js.native
  var partialMessageTimer: js.Any = js.native
  var readable: js.Any = js.native
  var setPartialMessageTimer: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ Error, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}


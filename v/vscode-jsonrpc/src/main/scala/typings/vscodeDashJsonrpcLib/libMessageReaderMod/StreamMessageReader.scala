package typings
package vscodeDashJsonrpcLib.libMessageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends AbstractMessageReader
     with MessageReader {
  def this(readable: nodeLib.NodeJSNs.ReadableStream) = this()
  def this(readable: nodeLib.NodeJSNs.ReadableStream, encoding: java.lang.String) = this()
  var _partialMessageTimeout: js.Any = js.native
  var buffer: js.Any = js.native
  var callback: js.Any = js.native
  var clearPartialMessageTimer: js.Any = js.native
  var messageToken: js.Any = js.native
  var nextMessageLength: js.Any = js.native
  var onData: js.Any = js.native
  var partialMessageTimeout: scala.Double = js.native
  var partialMessageTimer: js.Any = js.native
  var readable: js.Any = js.native
  var setPartialMessageTimer: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ stdLib.Error, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ stdLib.Error, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[/* e */ stdLib.Error, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}


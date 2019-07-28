package typings.vscodeDashJsonrpc.libMessageWriterMod

import typings.node.NodeJSNs.WritableStream
import typings.std.Error
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libMessagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends AbstractMessageWriter
     with MessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: String) = this()
  var encoding: js.Any = js.native
  var errorCount: js.Any = js.native
  var writable: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any
  ): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}


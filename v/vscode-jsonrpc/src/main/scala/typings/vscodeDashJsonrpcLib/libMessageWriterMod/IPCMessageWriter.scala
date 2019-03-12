package typings
package vscodeDashJsonrpcLib.libMessageWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends AbstractMessageWriter
     with MessageWriter {
  def this(process: nodeLib.NodeJSNs.Process) = this()
  def this(process: nodeLib.childUnderscoreProcessMod.ChildProcess) = this()
  var errorCount: js.Any = js.native
  var process: js.Any = js.native
  var queue: js.Any = js.native
  var sending: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  def doWriteMessage(msg: vscodeDashJsonrpcLib.libMessagesMod.Message): scala.Unit = js.native
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
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        stdLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        stdLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        stdLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}


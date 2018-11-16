package typings
package vscodeDashJsonrpcLib.libMessageWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "SocketMessageWriter")
@js.native
class SocketMessageWriter protected ()
  extends AbstractMessageWriter
     with MessageWriter {
  def this(socket: nodeLib.netMod.Socket) = this()
  def this(socket: nodeLib.netMod.Socket, encoding: java.lang.String) = this()
  var encoding: js.Any = js.native
  var errorCount: js.Any = js.native
  var handleError: js.Any = js.native
  var queue: js.Any = js.native
  var sending: js.Any = js.native
  var socket: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  def doWriteMessage(msg: vscodeDashJsonrpcLib.libMessagesMod.Message): scala.Unit = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /* InferMemberOverrides */
  override def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}


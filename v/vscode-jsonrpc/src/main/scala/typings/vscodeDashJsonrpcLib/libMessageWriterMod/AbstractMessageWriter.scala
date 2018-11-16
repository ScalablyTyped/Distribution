package typings
package vscodeDashJsonrpcLib.libMessageWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "AbstractMessageWriter")
@js.native
abstract class AbstractMessageWriter () extends js.Object {
  var asError: js.Any = js.native
  var closeEmitter: js.Any = js.native
  var errorEmitter: js.Any = js.native
  def dispose(): scala.Unit = js.native
  /* protected */ def fireClose(): scala.Unit = js.native
  /* protected */ def fireError(error: js.Any): scala.Unit = js.native
  /* protected */ def fireError(error: js.Any, message: vscodeDashJsonrpcLib.libMessagesMod.Message): scala.Unit = js.native
  /* protected */ def fireError(error: js.Any, message: vscodeDashJsonrpcLib.libMessagesMod.Message, count: scala.Double): scala.Unit = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  def onClose(
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
  def onError(
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
  def onError(
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
  def onError(
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


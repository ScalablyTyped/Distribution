package typings.tmiDotJs.strictDashEventDashEmitterDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverriddenMethods[TEmitter, TEventRecord, TEmitRecord] extends js.Object {
  def addEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def addEventListener[P /* <: String */, T](
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      Unit
    ]
  ): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.addEventListener, T, Unit] = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def addListener[P /* <: String */, T](
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      Unit
    ]
  ): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.addListener, T, Unit] = js.native
  def emit(event: js.Symbol, args: js.Any*): Unit = js.native
  def emit[P /* <: String */, T](
    event: P,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ListenerType<TEmitRecord[P]> is not an array type */ args: ListenerType[
      /* import warning: importer.ImportType#apply Failed type conversion: TEmitRecord[P] */ js.Any
    ]
  ): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.emit, T, Unit] = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def on[P /* <: String */, T](
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      Unit
    ]
  ): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.on, T, Unit] = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def once[P /* <: String */, T](
    event: P,
    listener: js.Function1[
      /* args */ ListenerType[
        /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
      ], 
      Unit
    ]
  ): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.once, T, Unit] = js.native
  def removeEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def removeEventListener[T](event: String, listener: js.Function1[/* repeated */ js.Any, _]): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.removeEventListener, T, Unit] = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def removeListener[T](event: String, listener: js.Function1[/* repeated */ js.Any, _]): EEMethodReturnType[TEmitter, typings.tmiDotJs.tmiDotJsStrings.removeListener, T, Unit] = js.native
}


package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vow {
  
  @JSImport("yandex-maps", "vow.Deferred")
  @js.native
  open class Deferred () extends StObject {
    
    def promise(): Promise = js.native
    
    def reject(reason: js.Object): Unit = js.native
    
    def resolve(value: js.Object): Unit = js.native
  }
  
  @JSImport("yandex-maps", "vow.Promise")
  @js.native
  open class Promise () extends StObject {
    def this(resolver: js.Function0[Unit]) = this()
    
    def done(): Unit = js.native
    def done(onFulfilled: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit]
    ): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: Unit,
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: Unit,
      onProgress: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: Unit,
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: Unit,
      onProgress: Unit,
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: Unit, onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit]): Unit = js.native
    def done(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def done(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: Unit,
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: Unit, onRejected: Unit, onProgress: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def done(
      onFulfilled: Unit,
      onRejected: Unit,
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: Unit, onRejected: Unit, onProgress: Unit, ctx: js.Object): Unit = js.native
    
    def spread(): Promise = js.native
    def spread(onFulfilled: js.Function1[/* repeated */ Any, Unit]): Promise = js.native
    def spread(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit]
    ): Promise = js.native
    def spread(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      ctx: js.Object
    ): Promise = js.native
    def spread(onFulfilled: js.Function1[/* repeated */ Any, Unit], onRejected: Unit, ctx: js.Object): Promise = js.native
    def spread(onFulfilled: Unit, onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit]): Promise = js.native
    def spread(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      ctx: js.Object
    ): Promise = js.native
    def spread(onFulfilled: Unit, onRejected: Unit, ctx: js.Object): Promise = js.native
    
    def `then`(): Promise = js.native
    def `then`(onFulfilled: js.Function1[/* repeated */ Any, Unit]): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: Unit,
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: Unit,
      onProgress: js.Function1[/* repeated */ Any, Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: Unit,
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ Any, Unit],
      onRejected: Unit,
      onProgress: Unit,
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: Unit, onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit]): Promise = js.native
    def `then`(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: Unit,
      onRejected: js.Function1[/* err */ js.UndefOr[js.Error | Any], Unit],
      onProgress: Unit,
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: Unit, onRejected: Unit, onProgress: js.Function1[/* repeated */ Any, Unit]): Promise = js.native
    def `then`(
      onFulfilled: Unit,
      onRejected: Unit,
      onProgress: js.Function1[/* repeated */ Any, Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: Unit, onRejected: Unit, onProgress: Unit, ctx: js.Object): Promise = js.native
  }
}

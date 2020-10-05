package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "vow")
@js.native
object vow extends js.Object {
  @js.native
  class Deferred () extends js.Object {
    def promise(): Promise = js.native
    def reject(reason: js.Object): Unit = js.native
    def resolve(value: js.Object): Unit = js.native
  }
  
  @js.native
  class Promise () extends js.Object {
    def this(resolver: js.Function0[Unit]) = this()
    def done(): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit]
    ): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function0[Unit]): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function0[Unit],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function0[Unit],
      onProgress: js.Function0[Unit]
    ): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function0[Unit],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: js.Function0[Unit]): Unit = js.native
    def done(
      onFulfilled: js.Function0[Unit],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Unit = js.native
    def done(
      onFulfilled: js.Function0[Unit],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit]
    ): Unit = js.native
    def done(
      onFulfilled: js.Function0[Unit],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: js.Function0[Unit], onRejected: js.Function0[Unit]): Unit = js.native
    def done(
      onFulfilled: js.Function0[Unit],
      onRejected: js.Function0[Unit],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Unit = js.native
    def done(onFulfilled: js.Function0[Unit], onRejected: js.Function0[Unit], onProgress: js.Function0[Unit]): Unit = js.native
    def done(
      onFulfilled: js.Function0[Unit],
      onRejected: js.Function0[Unit],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Unit = js.native
    def spread(): Promise = js.native
    def spread(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.UndefOr[scala.Nothing], ctx: js.Object): Promise = js.native
    def spread(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function0[Unit]): Promise = js.native
    def spread(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function0[Unit], ctx: js.Object): Promise = js.native
    def spread(onFulfilled: js.Function0[Unit]): Promise = js.native
    def spread(onFulfilled: js.Function0[Unit], onRejected: js.UndefOr[scala.Nothing], ctx: js.Object): Promise = js.native
    def spread(onFulfilled: js.Function0[Unit], onRejected: js.Function0[Unit]): Promise = js.native
    def spread(onFulfilled: js.Function0[Unit], onRejected: js.Function0[Unit], ctx: js.Object): Promise = js.native
    def `then`(): Promise = js.native
    def `then`(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function0[Unit]): Promise = js.native
    def `then`(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function0[Unit],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function0[Unit],
      onProgress: js.Function0[Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function0[Unit],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: js.Function0[Unit]): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[Unit],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[Unit],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[Unit],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: js.Function0[Unit], onRejected: js.Function0[Unit]): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[Unit],
      onRejected: js.Function0[Unit],
      onProgress: js.UndefOr[scala.Nothing],
      ctx: js.Object
    ): Promise = js.native
    def `then`(onFulfilled: js.Function0[Unit], onRejected: js.Function0[Unit], onProgress: js.Function0[Unit]): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[Unit],
      onRejected: js.Function0[Unit],
      onProgress: js.Function0[Unit],
      ctx: js.Object
    ): Promise = js.native
  }
  
}


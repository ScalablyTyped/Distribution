package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "vow")
@js.native
object vowNs extends js.Object {
  @js.native
  class Deferred () extends js.Object {
    def promise(): Promise = js.native
    def reject(reason: js.Object): scala.Unit = js.native
    def resolve(value: js.Object): scala.Unit = js.native
  }
  
  @js.native
  class Promise () extends js.Object {
    def this(resolver: js.Function0[scala.Unit]) = this()
    def done(): scala.Unit = js.native
    def done(onFulfilled: js.Function0[scala.Unit]): scala.Unit = js.native
    def done(onFulfilled: js.Function0[scala.Unit], onRejected: js.Function0[scala.Unit]): scala.Unit = js.native
    def done(
      onFulfilled: js.Function0[scala.Unit],
      onRejected: js.Function0[scala.Unit],
      onProgress: js.Function0[scala.Unit]
    ): scala.Unit = js.native
    def done(
      onFulfilled: js.Function0[scala.Unit],
      onRejected: js.Function0[scala.Unit],
      onProgress: js.Function0[scala.Unit],
      ctx: js.Object
    ): scala.Unit = js.native
    def spread(): Promise = js.native
    def spread(onFulfilled: js.Function0[scala.Unit]): Promise = js.native
    def spread(onFulfilled: js.Function0[scala.Unit], onRejected: js.Function0[scala.Unit]): Promise = js.native
    def spread(onFulfilled: js.Function0[scala.Unit], onRejected: js.Function0[scala.Unit], ctx: js.Object): Promise = js.native
    def `then`(): Promise = js.native
    def `then`(onFulfilled: js.Function0[scala.Unit]): Promise = js.native
    def `then`(onFulfilled: js.Function0[scala.Unit], onRejected: js.Function0[scala.Unit]): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[scala.Unit],
      onRejected: js.Function0[scala.Unit],
      onProgress: js.Function0[scala.Unit]
    ): Promise = js.native
    def `then`(
      onFulfilled: js.Function0[scala.Unit],
      onRejected: js.Function0[scala.Unit],
      onProgress: js.Function0[scala.Unit],
      ctx: js.Object
    ): Promise = js.native
  }
  
}


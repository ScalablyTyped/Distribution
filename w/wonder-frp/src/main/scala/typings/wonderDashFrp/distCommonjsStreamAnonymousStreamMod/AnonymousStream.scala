package typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/AnonymousStream", "AnonymousStream")
@js.native
class AnonymousStream protected () extends Stream {
  def this(subscribeFunc: js.Function) = this()
  def subscribe(observer: IObserver): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ js.Any, Unit]): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ js.Any, Unit], onError: js.Function1[/* e */ js.Any, Unit]): IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ js.Any, Unit],
    onError: js.Function1[/* e */ js.Any, Unit],
    onComplete: js.Function0[Unit]
  ): IDisposable = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/AnonymousStream", "AnonymousStream")
@js.native
object AnonymousStream extends js.Object {
  def create(subscribeFunc: js.Function): AnonymousStream = js.native
}


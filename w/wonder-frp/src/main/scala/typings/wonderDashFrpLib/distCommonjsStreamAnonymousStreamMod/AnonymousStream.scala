package typings
package wonderDashFrpLib.distCommonjsStreamAnonymousStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/AnonymousStream", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends wonderDashFrpLib.distCommonjsCoreStreamMod.Stream {
  def this(subscribeFunc: js.Function) = this()
  def subscribe(observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ js.Any, scala.Unit]): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ js.Any, scala.Unit],
    onError: js.Function1[/* e */ js.Any, scala.Unit]
  ): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ js.Any, scala.Unit],
    onError: js.Function1[/* e */ js.Any, scala.Unit],
    onComplete: js.Function0[scala.Unit]
  ): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/AnonymousStream", "AnonymousStream")
@js.native
object AnonymousStream extends js.Object {
  def create(subscribeFunc: js.Function): wonderDashFrpLib.distCommonjsStreamAnonymousStreamMod.AnonymousStream = js.native
}


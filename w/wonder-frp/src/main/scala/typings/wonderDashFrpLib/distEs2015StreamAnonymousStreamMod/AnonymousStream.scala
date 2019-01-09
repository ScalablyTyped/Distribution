package typings
package wonderDashFrpLib.distEs2015StreamAnonymousStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/AnonymousStream", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends wonderDashFrpLib.distEs2015CoreStreamMod.Stream {
  def this(subscribeFunc: js.Function) = this()
  def subscribe(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ js.Any, scala.Unit]): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ js.Any, scala.Unit],
    onError: js.Function1[/* e */ js.Any, scala.Unit]
  ): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ js.Any, scala.Unit],
    onError: js.Function1[/* e */ js.Any, scala.Unit],
    onComplete: js.Function0[scala.Unit]
  ): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/AnonymousStream", "AnonymousStream")
@js.native
object AnonymousStream extends js.Object {
  def create(subscribeFunc: js.Function): wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream = js.native
}


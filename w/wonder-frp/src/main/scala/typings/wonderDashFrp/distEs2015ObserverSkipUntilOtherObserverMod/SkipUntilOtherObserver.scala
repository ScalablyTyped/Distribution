package typings.wonderDashFrp.distEs2015ObserverSkipUntilOtherObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected () extends Observer {
  def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
  var _prevObserver: js.Any = js.native
  var _skipUntilStream: js.Any = js.native
  var otherDisposable: IDisposable = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilOtherObserver = js.native
}


package typings
package wonderDashFrpLib.distEs2015ObserverSkipUntilOtherObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, skipUntilStream: wonderDashFrpLib.distEs2015StreamSkipUntilStreamMod.SkipUntilStream) = this()
  var _prevObserver: js.Any = js.native
  var _skipUntilStream: js.Any = js.native
  var otherDisposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
}

@JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    skipUntilStream: wonderDashFrpLib.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
  ): wonderDashFrpLib.distEs2015ObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}


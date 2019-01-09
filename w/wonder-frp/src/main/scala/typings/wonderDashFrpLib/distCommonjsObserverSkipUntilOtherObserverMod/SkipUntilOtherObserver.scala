package typings
package wonderDashFrpLib.distCommonjsObserverSkipUntilOtherObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, skipUntilStream: wonderDashFrpLib.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream) = this()
  var _prevObserver: js.Any = js.native
  var _skipUntilStream: js.Any = js.native
  var otherDisposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
}

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    skipUntilStream: wonderDashFrpLib.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): wonderDashFrpLib.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}


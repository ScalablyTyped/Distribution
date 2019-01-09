package typings
package wonderDashFrpLib.distCommonjsObserverSkipUntilSourceObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, skipUntilStream: wonderDashFrpLib.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream) = this()
  var _prevObserver: js.Any = js.native
  var _skipUntilStream: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    skipUntilStream: wonderDashFrpLib.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): wonderDashFrpLib.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}


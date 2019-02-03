package typings
package wonderDashFrpLib.distEs2015ObserverSkipUntilSourceObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, skipUntilStream: wonderDashFrpLib.distEs2015StreamSkipUntilStreamMod.SkipUntilStream) = this()
  var _prevObserver: js.Any = js.native
  var _skipUntilStream: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    skipUntilStream: wonderDashFrpLib.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
  ): wonderDashFrpLib.distEs2015ObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}


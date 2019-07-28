package typings.wonderDashFrp.distCommonjsObserverSkipUntilSourceObserverMod

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected () extends Observer {
  def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
  var _prevObserver: js.Any = js.native
  var _skipUntilStream: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilSourceObserver = js.native
}


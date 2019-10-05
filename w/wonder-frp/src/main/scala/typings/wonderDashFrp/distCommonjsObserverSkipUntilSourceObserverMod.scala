package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typings.wonderDashFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver
import typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverSkipUntilSourceObserverMod extends js.Object {
  @js.native
  class SkipUntilSourceObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    var _prevObserver: js.Any = js.native
    var _skipUntilStream: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SkipUntilSourceObserver extends js.Object {
    def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilSourceObserver = js.native
  }
  
}


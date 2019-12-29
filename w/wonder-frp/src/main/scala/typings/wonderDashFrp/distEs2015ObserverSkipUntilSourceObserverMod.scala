package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SkipUntilSourceObserver", JSImport.Namespace)
@js.native
object distEs2015ObserverSkipUntilSourceObserverMod extends js.Object {
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


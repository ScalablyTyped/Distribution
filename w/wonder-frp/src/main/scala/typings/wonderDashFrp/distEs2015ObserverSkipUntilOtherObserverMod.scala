package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", JSImport.Namespace)
@js.native
object distEs2015ObserverSkipUntilOtherObserverMod extends js.Object {
  @js.native
  class SkipUntilOtherObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    var _prevObserver: js.Any = js.native
    var _skipUntilStream: js.Any = js.native
    var otherDisposable: IDisposable = js.native
  }
  
  /* static members */
  @js.native
  object SkipUntilOtherObserver extends js.Object {
    def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilOtherObserver = js.native
  }
  
}


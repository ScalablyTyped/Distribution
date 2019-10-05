package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typings.wonderDashFrp.distCommonjsSubjectSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/BaseStream", JSImport.Namespace)
@js.native
object distCommonjsStreamBaseStreamMod extends js.Object {
  @js.native
  abstract class BaseStream () extends Stream {
    def subscribe(arg1: js.Function, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribeCore(observer: IObserver): IDisposable = js.native
  }
  
}


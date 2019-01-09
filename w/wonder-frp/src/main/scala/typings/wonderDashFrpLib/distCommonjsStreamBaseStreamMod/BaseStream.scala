package typings
package wonderDashFrpLib.distCommonjsStreamBaseStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/BaseStream", "BaseStream")
@js.native
abstract class BaseStream ()
  extends wonderDashFrpLib.distCommonjsCoreStreamMod.Stream {
  def subscribe(arg1: js.Function, onError: js.Any): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Any, onCompleted: js.Any): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer, onError: js.Any): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer, onError: js.Any, onCompleted: js.Any): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distCommonjsSubjectSubjectMod.Subject, onError: js.Any): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distCommonjsSubjectSubjectMod.Subject, onError: js.Any, onCompleted: js.Any): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribeCore(observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
}


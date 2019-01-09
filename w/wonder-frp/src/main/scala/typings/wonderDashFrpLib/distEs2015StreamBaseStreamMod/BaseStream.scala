package typings
package wonderDashFrpLib.distEs2015StreamBaseStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/BaseStream", "BaseStream")
@js.native
abstract class BaseStream ()
  extends wonderDashFrpLib.distEs2015CoreStreamMod.Stream {
  def subscribe(arg1: js.Function, onError: js.Any): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Any, onCompleted: js.Any): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer, onError: js.Any): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer, onError: js.Any, onCompleted: js.Any): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject, onError: js.Any): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject, onError: js.Any, onCompleted: js.Any): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribeCore(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
}


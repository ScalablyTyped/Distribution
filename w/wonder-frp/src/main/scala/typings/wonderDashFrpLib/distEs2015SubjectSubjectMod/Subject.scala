package typings
package wonderDashFrpLib.distEs2015SubjectSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/subject/Subject", "Subject")
@js.native
class Subject ()
  extends wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver {
  var _observer: js.Any = js.native
  var _source: js.Any = js.native
  var source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  def remove(observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def subscribe(): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer, onError: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer,
    onError: js.Function,
    onCompleted: js.Function
  ): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
}

@JSImport("wonder-frp/dist/es2015/subject/Subject", "Subject")
@js.native
object Subject extends js.Object {
  def create(): wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject = js.native
}


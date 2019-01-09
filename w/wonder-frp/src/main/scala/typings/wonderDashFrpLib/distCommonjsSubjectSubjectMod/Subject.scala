package typings
package wonderDashFrpLib.distCommonjsSubjectSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/subject/Subject", "Subject")
@js.native
class Subject ()
  extends wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver {
  var _observer: js.Any = js.native
  var _source: js.Any = js.native
  var source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  def remove(observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def subscribe(): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Function): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer, onError: js.Function): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    arg1: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer,
    onError: js.Function,
    onCompleted: js.Function
  ): wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable = js.native
}

@JSImport("wonder-frp/dist/commonjs/subject/Subject", "Subject")
@js.native
object Subject extends js.Object {
  def create(): wonderDashFrpLib.distCommonjsSubjectSubjectMod.Subject = js.native
}


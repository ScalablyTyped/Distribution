package typings
package wonderDashFrpLib.distEs2015SubjectGeneratorSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", "GeneratorSubject")
@js.native
class GeneratorSubject ()
  extends wonderDashFrpLib.distEs2015CoreEntityMod.Entity
     with wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver {
  var _isStart: js.Any = js.native
  var isStart: scala.Boolean = js.native
  var observer: js.Any = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  def onAfterCompleted(): scala.Unit = js.native
  def onAfterError(error: js.Any): scala.Unit = js.native
  def onAfterNext(value: js.Any): scala.Unit = js.native
  def onBeforeCompleted(): scala.Unit = js.native
  def onBeforeError(error: js.Any): scala.Unit = js.native
  def onBeforeNext(value: js.Any): scala.Unit = js.native
  def onIsCompleted(value: js.Any): scala.Boolean = js.native
  def remove(observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
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
  def toStream(): js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", "GeneratorSubject")
@js.native
object GeneratorSubject extends js.Object {
  def create(): wonderDashFrpLib.distEs2015SubjectGeneratorSubjectMod.GeneratorSubject = js.native
}


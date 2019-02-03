package typings
package wonderDashFrpLib.distCommonjsSubjectGeneratorSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/subject/GeneratorSubject", "GeneratorSubject")
@js.native
class GeneratorSubject ()
  extends wonderDashFrpLib.distCommonjsCoreEntityMod.Entity
     with wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver {
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
  def remove(observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
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
  def toStream(): js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/subject/GeneratorSubject", "GeneratorSubject")
@js.native
object GeneratorSubject extends js.Object {
  def create(): wonderDashFrpLib.distCommonjsSubjectGeneratorSubjectMod.GeneratorSubject = js.native
}


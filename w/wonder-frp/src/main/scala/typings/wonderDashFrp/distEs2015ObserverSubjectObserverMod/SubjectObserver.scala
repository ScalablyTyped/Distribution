package typings.wonderDashFrp.distEs2015ObserverSubjectObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SubjectObserver", "SubjectObserver")
@js.native
class SubjectObserver () extends IObserver {
  var _disposable: js.Any = js.native
  var observers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<IObserver> */ js.Any = js.native
  def addChild(observer: Observer): Unit = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  def removeChild(observer: Observer): Unit = js.native
  def setDisposable(disposable: IDisposable): Unit = js.native
}


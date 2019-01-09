package typings
package wonderDashFrpLib.distEs2015ObserverSubjectObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/SubjectObserver", "SubjectObserver")
@js.native
class SubjectObserver ()
  extends wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver {
  var _disposable: js.Any = js.native
  var observers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<IObserver> */ js.Any = js.native
  def addChild(observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): scala.Unit = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  def removeChild(observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): scala.Unit = js.native
  def setDisposable(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): scala.Unit = js.native
}


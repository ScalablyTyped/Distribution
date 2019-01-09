package typings
package wonderDashFrpLib.distCommonjsObserverSubjectObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/SubjectObserver", "SubjectObserver")
@js.native
class SubjectObserver ()
  extends wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver {
  var _disposable: js.Any = js.native
  var observers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<IObserver> */ js.Any = js.native
  def addChild(observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer): scala.Unit = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  def removeChild(observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer): scala.Unit = js.native
  def setDisposable(disposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): scala.Unit = js.native
}


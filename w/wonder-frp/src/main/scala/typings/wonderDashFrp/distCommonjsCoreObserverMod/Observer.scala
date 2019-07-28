package typings.wonderDashFrp.distCommonjsCoreObserverMod

import typings.wonderDashFrp.distCommonjsCoreEntityMod.Entity
import typings.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/core/Observer", "Observer")
@js.native
abstract class Observer protected ()
  extends Entity
     with IObserver {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  var _disposable: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isStop: js.Any = js.native
  var isDisposed: Boolean = js.native
  var onUserCompleted: js.Function = js.native
  var onUserError: js.Function = js.native
  var onUserNext: js.Function = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  /* protected */ def onCompleted(): js.Any = js.native
  /* protected */ def onError(error: js.Any): js.Any = js.native
  /* protected */ def onNext(value: js.Any): js.Any = js.native
  def setDisposable(disposable: IDisposable): Unit = js.native
}


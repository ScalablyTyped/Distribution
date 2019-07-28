package typings.wonderDashFrp.distEs2015DisposableSingleDisposableMod

import typings.wonderDashFrp.distEs2015CoreEntityMod.Entity
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/SingleDisposable", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends Entity
     with IDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
  var _disposable: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def setDispose(disposable: IDisposable): Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/Disposable/SingleDisposable", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): SingleDisposable = js.native
  def create(dispose: js.Function): SingleDisposable = js.native
  def create(dispose: IDisposable): SingleDisposable = js.native
}


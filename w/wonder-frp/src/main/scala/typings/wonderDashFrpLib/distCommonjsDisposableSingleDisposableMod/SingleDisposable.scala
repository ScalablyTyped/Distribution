package typings
package wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/SingleDisposable", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends wonderDashFrpLib.distCommonjsCoreEntityMod.Entity
     with wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable) = this()
  var _disposable: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def setDispose(disposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): scala.Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/Disposable/SingleDisposable", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
}


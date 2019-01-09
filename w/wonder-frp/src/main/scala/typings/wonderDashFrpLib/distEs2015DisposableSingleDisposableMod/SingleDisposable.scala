package typings
package wonderDashFrpLib.distEs2015DisposableSingleDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/SingleDisposable", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends wonderDashFrpLib.distEs2015CoreEntityMod.Entity
     with wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable) = this()
  var _disposable: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def setDispose(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): scala.Unit = js.native
}

@JSImport("wonder-frp/dist/es2015/Disposable/SingleDisposable", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
}


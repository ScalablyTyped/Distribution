package typings
package wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/GroupDisposable", "GroupDisposable")
@js.native
class GroupDisposable ()
  extends wonderDashFrpLib.distCommonjsCoreEntityMod.Entity
     with wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable {
  def this(disposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable) = this()
  var _group: js.Any = js.native
  var _isDisposed: js.Any = js.native
  def add(disposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): this.type = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def getCount(): scala.Double = js.native
  def remove(disposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): this.type = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/Disposable/GroupDisposable", "GroupDisposable")
@js.native
object GroupDisposable extends js.Object {
  def create(): wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable = js.native
  def create(disposable: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable = js.native
}


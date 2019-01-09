package typings
package wonderDashFrpLib.distEs2015DisposableGroupDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", "GroupDisposable")
@js.native
class GroupDisposable ()
  extends wonderDashFrpLib.distEs2015CoreEntityMod.Entity
     with wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable {
  def this(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable) = this()
  var _group: js.Any = js.native
  var _isDisposed: js.Any = js.native
  def add(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): this.type = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def getCount(): scala.Double = js.native
  def remove(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): this.type = js.native
}

@JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", "GroupDisposable")
@js.native
object GroupDisposable extends js.Object {
  def create(): wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable = js.native
  def create(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable = js.native
}


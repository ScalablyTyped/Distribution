package typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod

import typings.wonderDashFrp.distEs2015CoreEntityMod.Entity
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", "GroupDisposable")
@js.native
class GroupDisposable ()
  extends Entity
     with IDisposable {
  def this(disposable: IDisposable) = this()
  var _group: js.Any = js.native
  var _isDisposed: js.Any = js.native
  def add(disposable: IDisposable): this.type = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def getCount(): Double = js.native
  def remove(disposable: IDisposable): this.type = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", "GroupDisposable")
@js.native
object GroupDisposable extends js.Object {
  def create(): GroupDisposable = js.native
  def create(disposable: IDisposable): GroupDisposable = js.native
}


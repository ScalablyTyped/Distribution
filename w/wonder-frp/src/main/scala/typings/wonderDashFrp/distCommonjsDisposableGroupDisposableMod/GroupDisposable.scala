package typings.wonderDashFrp.distCommonjsDisposableGroupDisposableMod

import typings.wonderDashFrp.distCommonjsCoreEntityMod.Entity
import typings.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/GroupDisposable", "GroupDisposable")
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
@JSImport("wonder-frp/dist/commonjs/Disposable/GroupDisposable", "GroupDisposable")
@js.native
object GroupDisposable extends js.Object {
  def create(): GroupDisposable = js.native
  def create(disposable: IDisposable): GroupDisposable = js.native
}


package typings.wonderFrp.es2015Mod

import typings.wonderFrp.disposableIdisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "GroupDisposable")
@js.native
class GroupDisposable ()
  extends typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable {
  def this(disposable: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "GroupDisposable")
@js.native
object GroupDisposable extends js.Object {
  def create(): typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable = js.native
  def create(disposable: IDisposable): typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable = js.native
}


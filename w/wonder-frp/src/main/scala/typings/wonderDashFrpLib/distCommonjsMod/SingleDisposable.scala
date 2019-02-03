package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable): wonderDashFrpLib.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
}


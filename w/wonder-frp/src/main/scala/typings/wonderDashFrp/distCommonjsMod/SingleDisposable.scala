package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typings.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typings.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typings.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typings.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
}


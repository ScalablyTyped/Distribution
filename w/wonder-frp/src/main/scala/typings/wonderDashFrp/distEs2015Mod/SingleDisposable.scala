package typings.wonderDashFrp.distEs2015Mod

import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typings.wonderDashFrp.distEs2015DisposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typings.wonderDashFrp.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typings.wonderDashFrp.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typings.wonderDashFrp.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
}


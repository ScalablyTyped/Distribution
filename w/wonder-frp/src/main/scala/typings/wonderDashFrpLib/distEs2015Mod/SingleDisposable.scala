package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): wonderDashFrpLib.distEs2015DisposableSingleDisposableMod.SingleDisposable = js.native
}


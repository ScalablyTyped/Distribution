package typings.wonderFrp.es2015Mod

import typings.wonderFrp.disposableIdisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable = js.native
}


package typings.targz.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("targz", "compress")
@js.native
object compress extends js.Object {
  def apply(): Unit = js.native
  def apply(opts: js.UndefOr[scala.Nothing], callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
  def apply(opts: options): Unit = js.native
  def apply(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
}


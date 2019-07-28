package typings.targz.targzMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("targz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(): Unit = js.native
  def compress(opts: options): Unit = js.native
  def compress(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
  def decompress(): Unit = js.native
  def decompress(opts: options): Unit = js.native
  def decompress(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
}


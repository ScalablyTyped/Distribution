package typings
package targzLib.targzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("targz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(): scala.Unit = js.native
  def compress(opts: options): scala.Unit = js.native
  def compress(
    opts: options,
    callback: js.Function1[/* error */ stdLib.Error | java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def decompress(): scala.Unit = js.native
  def decompress(opts: options): scala.Unit = js.native
  def decompress(
    opts: options,
    callback: js.Function1[/* error */ stdLib.Error | java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}


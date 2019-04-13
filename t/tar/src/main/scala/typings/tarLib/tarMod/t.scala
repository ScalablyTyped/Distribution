package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "t")
@js.native
object t extends js.Object {
  def apply(): nodeLib.streamMod.Writable = js.native
  def apply(options: tarLib.tarMod.ListOptions): nodeLib.streamMod.Writable = js.native
  def apply(options: tarLib.tarMod.ListOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def apply(
    options: tarLib.tarMod.ListOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
}


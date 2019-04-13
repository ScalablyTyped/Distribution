package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "x")
@js.native
object x extends js.Object {
  def apply(
    options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def apply(options: tarLib.tarMod.ExtractOptions): nodeLib.streamMod.Writable = js.native
  def apply(options: tarLib.tarMod.ExtractOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def apply(
    options: tarLib.tarMod.ExtractOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
}


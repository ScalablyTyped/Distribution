package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackErr extends js.Object {
  def apply(
    options: tarLib.tarMod.ExtractOptions with tarLib.tarMod.FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def apply(options: tarLib.tarMod.ExtractOptions): nodeLib.streamMod.Writable = js.native
  def apply(options: tarLib.tarMod.ExtractOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def apply(
    options: tarLib.tarMod.ExtractOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
}


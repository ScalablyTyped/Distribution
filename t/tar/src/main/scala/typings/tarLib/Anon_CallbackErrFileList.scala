package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackErrFileList extends js.Object {
  def apply(): nodeLib.streamMod.Writable = js.native
  def apply(options: tarLib.tarMod.ListOptions): nodeLib.streamMod.Writable = js.native
  def apply(options: tarLib.tarMod.ListOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Writable = js.native
  def apply(
    options: tarLib.tarMod.ListOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Writable = js.native
}


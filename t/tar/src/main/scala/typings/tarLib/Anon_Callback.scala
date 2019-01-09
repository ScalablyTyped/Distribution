package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def apply(options: tarLib.tarMod.CreateOptions, fileList: js.Array[java.lang.String]): nodeLib.streamMod.Readable = js.native
  def apply(
    options: tarLib.tarMod.CreateOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
}


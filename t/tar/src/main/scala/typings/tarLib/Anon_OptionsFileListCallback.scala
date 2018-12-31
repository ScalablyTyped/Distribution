package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptionsFileListCallback extends js.Object {
  def apply(options: tarLib.tarMod.ReplaceOptions): js.Promise[scala.Unit] = js.native
  def apply(options: tarLib.tarMod.ReplaceOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def apply(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def apply(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}


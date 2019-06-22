package typings
package targzLib.targzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var dest: java.lang.String
  var gz: js.UndefOr[nodeLib.zlibMod.ZlibOptions] = js.undefined
  var src: java.lang.String
  var tar: js.UndefOr[tarDashFsLib.tarDashFsMod.ExtractOptions] = js.undefined
}

object options {
  @scala.inline
  def apply(
    dest: java.lang.String,
    src: java.lang.String,
    gz: nodeLib.zlibMod.ZlibOptions = null,
    tar: tarDashFsLib.tarDashFsMod.ExtractOptions = null
  ): options = {
    val __obj = js.Dynamic.literal(dest = dest, src = src)
    if (gz != null) __obj.updateDynamic("gz")(gz)
    if (tar != null) __obj.updateDynamic("tar")(tar)
    __obj.asInstanceOf[options]
  }
}


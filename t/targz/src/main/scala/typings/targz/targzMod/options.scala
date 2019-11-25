package typings.targz.targzMod

import typings.node.zlibMod.ZlibOptions
import typings.tarDashFs.tarDashFsMod.ExtractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var dest: String
  var gz: js.UndefOr[ZlibOptions] = js.undefined
  var src: String
  var tar: js.UndefOr[ExtractOptions] = js.undefined
}

object options {
  @scala.inline
  def apply(dest: String, src: String, gz: ZlibOptions = null, tar: ExtractOptions = null): options = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (gz != null) __obj.updateDynamic("gz")(gz.asInstanceOf[js.Any])
    if (tar != null) __obj.updateDynamic("tar")(tar.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}


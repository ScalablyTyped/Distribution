package typings
package webpackDashPluginDashServeLib.webpackDashPluginDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticObject extends js.Object {
  var glob: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var options: js.UndefOr[fastDashGlobLib.fastDashGlobMod.Options] = js.undefined
}

object StaticObject {
  @scala.inline
  def apply(
    glob: java.lang.String | js.Array[java.lang.String] = null,
    options: fastDashGlobLib.fastDashGlobMod.Options = null
  ): StaticObject = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[StaticObject]
  }
}


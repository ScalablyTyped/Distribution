package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAcquisition
  extends /* option */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[java.lang.String] | scala.Boolean]] {
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var enableAutoDiscovery: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TypeAcquisition {
  @scala.inline
  def apply(
    StringDictionary: /* option */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[java.lang.String] | scala.Boolean]] = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    enableAutoDiscovery: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(enableAutoDiscovery)) __obj.updateDynamic("enableAutoDiscovery")(enableAutoDiscovery)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[TypeAcquisition]
  }
}


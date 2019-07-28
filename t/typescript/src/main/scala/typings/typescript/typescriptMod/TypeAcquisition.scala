package typings.typescript.typescriptMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAcquisition
  extends /* option */ StringDictionary[js.UndefOr[js.Array[String] | Boolean]] {
  var enable: js.UndefOr[Boolean] = js.undefined
  var enableAutoDiscovery: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
}

object TypeAcquisition {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.UndefOr[js.Array[String] | Boolean]] = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    enableAutoDiscovery: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    include: js.Array[String] = null
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


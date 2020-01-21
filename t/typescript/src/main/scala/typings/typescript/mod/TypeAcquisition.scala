package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAcquisition
  extends /* option */ StringDictionary[js.UndefOr[js.Array[java.lang.String] | Boolean]] {
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated typingOptions.enableAutoDiscovery
    * Use typeAcquisition.enable instead.
    */
  var enableAutoDiscovery: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TypeAcquisition {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.UndefOr[js.Array[java.lang.String] | Boolean]] = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    enableAutoDiscovery: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoDiscovery)) __obj.updateDynamic("enableAutoDiscovery")(enableAutoDiscovery.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAcquisition]
  }
}


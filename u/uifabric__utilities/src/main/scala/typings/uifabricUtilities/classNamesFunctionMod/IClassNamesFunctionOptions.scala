package typings.uifabricUtilities.classNamesFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassNamesFunctionOptions extends js.Object {
  /**
    * Size of the cache. It overwrites default cache size when defined.
    */
  var cacheSize: js.UndefOr[Double] = js.undefined
  /**
    * Disables class caching for scenarios where styleProp parts mutate frequently.
    */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true if component base styles are implemented in scss instead of css-in-js.
    */
  var useStaticStyles: js.UndefOr[Boolean] = js.undefined
}

object IClassNamesFunctionOptions {
  @scala.inline
  def apply(
    cacheSize: js.UndefOr[Double] = js.undefined,
    disableCaching: js.UndefOr[Boolean] = js.undefined,
    useStaticStyles: js.UndefOr[Boolean] = js.undefined
  ): IClassNamesFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useStaticStyles)) __obj.updateDynamic("useStaticStyles")(useStaticStyles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassNamesFunctionOptions]
  }
}


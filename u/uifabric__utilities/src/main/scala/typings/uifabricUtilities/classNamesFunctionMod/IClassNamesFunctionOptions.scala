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
}

object IClassNamesFunctionOptions {
  @scala.inline
  def apply(cacheSize: Int | Double = null, disableCaching: js.UndefOr[Boolean] = js.undefined): IClassNamesFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassNamesFunctionOptions]
  }
}


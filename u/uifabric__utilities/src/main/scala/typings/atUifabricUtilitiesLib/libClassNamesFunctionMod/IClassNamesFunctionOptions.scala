package typings
package atUifabricUtilitiesLib.libClassNamesFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassNamesFunctionOptions extends js.Object {
  /**
    * Disables class caching for scenarios where styleProp parts mutate frequently.
    */
  var disableCaching: js.UndefOr[scala.Boolean] = js.undefined
}

object IClassNamesFunctionOptions {
  @scala.inline
  def apply(disableCaching: js.UndefOr[scala.Boolean] = js.undefined): IClassNamesFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching)
    __obj.asInstanceOf[IClassNamesFunctionOptions]
  }
}


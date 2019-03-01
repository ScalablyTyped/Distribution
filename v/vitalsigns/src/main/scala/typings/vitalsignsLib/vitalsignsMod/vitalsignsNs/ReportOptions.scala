package typings
package vitalsignsLib.vitalsignsMod.vitalsignsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Report options.
  * @interface
  */
trait ReportOptions extends js.Object {
  /**
    * true to flatten the report object down to a single level by concatenating nested key names; false to keep the default hierarchical format.
    * @type {boolean}
    */
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If flatten is true, this string will be used to separate key names when they are concatenated together.
    * @type {boolean}
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(flatten: js.UndefOr[scala.Boolean] = js.undefined, separator: java.lang.String = null): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[ReportOptions]
  }
}


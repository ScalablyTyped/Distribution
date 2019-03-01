package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAdExtensionChild extends js.Object {
  var attributes: VastAdChildAttributes
  var name: js.UndefOr[java.lang.String]
  var value: java.lang.String | scala.Double
}

object VastAdExtensionChild {
  @scala.inline
  def apply(
    attributes: VastAdChildAttributes,
    value: java.lang.String | scala.Double,
    name: java.lang.String = null
  ): VastAdExtensionChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[VastAdExtensionChild]
  }
}


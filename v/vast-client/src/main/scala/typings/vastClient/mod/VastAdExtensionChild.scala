package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAdExtensionChild extends js.Object {
  var attributes: VastAdChildAttributes
  var name: js.UndefOr[String] = js.undefined
  var value: String | Double
}

object VastAdExtensionChild {
  @scala.inline
  def apply(attributes: VastAdChildAttributes, value: String | Double, name: String = null): VastAdExtensionChild = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdExtensionChild]
  }
}


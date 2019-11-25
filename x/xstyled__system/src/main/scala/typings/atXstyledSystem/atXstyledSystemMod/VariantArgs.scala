package typings.atXstyledSystem.atXstyledSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantArgs extends js.Object {
  var default: js.UndefOr[String | Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var prop: js.UndefOr[String] = js.undefined
  var variants: js.UndefOr[js.Object] = js.undefined
}

object VariantArgs {
  @scala.inline
  def apply(
    default: String | Double = null,
    key: String = null,
    prop: String = null,
    variants: js.Object = null
  ): VariantArgs = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantArgs]
  }
}


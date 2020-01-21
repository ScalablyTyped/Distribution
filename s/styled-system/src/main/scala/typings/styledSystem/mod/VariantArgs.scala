package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantArgs extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  /** Component prop, defaults to "variant" */
  var prop: js.UndefOr[String] = js.undefined
  /** theme key for variant definitions */
  var scale: js.UndefOr[String] = js.undefined
  /** inline theme aware variants definitions  */
  var variants: js.UndefOr[js.Object] = js.undefined
}

object VariantArgs {
  @scala.inline
  def apply(key: String = null, prop: String = null, scale: String = null, variants: js.Object = null): VariantArgs = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantArgs]
  }
}


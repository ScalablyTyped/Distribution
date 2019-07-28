package typings.uikit.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  /**
    * Delay time after stop typing
    * @default 300
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Min. input length before triggering autocomplete
    * @default 3
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * Query name when sending ajax request
    * @default search
    */
  var param: js.UndefOr[String] = js.undefined
  /**
    * Data source
    * @default []
    */
  var source: js.UndefOr[String | js.Array[String] | CallbackAutoComplete] = js.undefined
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    minLength: Int | Double = null,
    param: String = null,
    source: String | js.Array[String] | CallbackAutoComplete = null
  ): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteOptions]
  }
}


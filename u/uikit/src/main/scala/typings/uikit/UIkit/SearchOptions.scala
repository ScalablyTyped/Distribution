package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /**
    * Delay time after stop typing
    * @default 300
    * <h2>Possible value</h2>
    * integer
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Min. input length before triggering autocomplete
    * @default 3
    * <h2>Possible value</h2>
    * integer
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * Query name when sending ajax request
    * @default search
    * <h2>Possible value</h2>
    * string
    */
  var param: js.UndefOr[String] = js.undefined
  /**
    * Data source url
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var source: js.UndefOr[String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    minLength: Int | Double = null,
    param: String = null,
    source: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}


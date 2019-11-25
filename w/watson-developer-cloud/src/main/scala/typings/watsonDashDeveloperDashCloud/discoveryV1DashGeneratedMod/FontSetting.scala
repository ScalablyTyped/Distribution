package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FontSetting. */
trait FontSetting extends js.Object {
  /** When `true`, the font is matched if it is bold. */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** When `true`, the font is matched if it is italic. */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** The HTML heading level that any content with the matching font will be converted to. */
  var level: js.UndefOr[Double] = js.undefined
  /** The maximum size of the font to match. */
  var max_size: js.UndefOr[Double] = js.undefined
  /** The minimum size of the font to match. */
  var min_size: js.UndefOr[Double] = js.undefined
  /** The name of the font. */
  var name: js.UndefOr[String] = js.undefined
}

object FontSetting {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null,
    max_size: Int | Double = null,
    min_size: Int | Double = null,
    name: String = null
  ): FontSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (max_size != null) __obj.updateDynamic("max_size")(max_size.asInstanceOf[js.Any])
    if (min_size != null) __obj.updateDynamic("min_size")(min_size.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSetting]
  }
}


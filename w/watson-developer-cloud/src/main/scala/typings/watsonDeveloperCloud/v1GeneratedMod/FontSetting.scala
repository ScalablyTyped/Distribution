package typings.watsonDeveloperCloud.v1GeneratedMod

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
    level: js.UndefOr[Double] = js.undefined,
    max_size: js.UndefOr[Double] = js.undefined,
    min_size: js.UndefOr[Double] = js.undefined,
    name: String = null
  ): FontSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_size)) __obj.updateDynamic("max_size")(max_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_size)) __obj.updateDynamic("min_size")(min_size.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSetting]
  }
}


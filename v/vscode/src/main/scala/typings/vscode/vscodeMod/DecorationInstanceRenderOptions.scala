package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationInstanceRenderOptions extends ThemableDecorationInstanceRenderOptions {
  /**
  		 * Overwrite options for dark themes.
  		 */
  var dark: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.undefined
  /**
  		 * Overwrite options for light themes.
  		 */
  var light: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.undefined
}

object DecorationInstanceRenderOptions {
  @scala.inline
  def apply(
    after: ThemableDecorationAttachmentRenderOptions = null,
    before: ThemableDecorationAttachmentRenderOptions = null,
    dark: ThemableDecorationInstanceRenderOptions = null,
    light: ThemableDecorationInstanceRenderOptions = null
  ): DecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationInstanceRenderOptions]
  }
}


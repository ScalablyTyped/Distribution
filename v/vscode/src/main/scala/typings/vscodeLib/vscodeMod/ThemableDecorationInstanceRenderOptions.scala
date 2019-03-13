package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemableDecorationInstanceRenderOptions extends js.Object {
  /**
  		 * Defines the rendering options of the attachment that is inserted after the decorated text
  		 */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  /**
  		 * Defines the rendering options of the attachment that is inserted before the decorated text
  		 */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
}

object ThemableDecorationInstanceRenderOptions {
  @scala.inline
  def apply(
    after: ThemableDecorationAttachmentRenderOptions = null,
    before: ThemableDecorationAttachmentRenderOptions = null
  ): ThemableDecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[ThemableDecorationInstanceRenderOptions]
  }
}


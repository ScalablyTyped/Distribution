package typings.svgDashSpriteDashLoader.pluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Render plain sprite without styles and usages */
  var plainSprite: js.UndefOr[Boolean] = js.undefined
  /** Custom tag attributes for the svg */
  var spriteAttrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Options {
  @scala.inline
  def apply(plainSprite: js.UndefOr[Boolean] = js.undefined, spriteAttrs: StringDictionary[js.Any] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plainSprite)) __obj.updateDynamic("plainSprite")(plainSprite.asInstanceOf[js.Any])
    if (spriteAttrs != null) __obj.updateDynamic("spriteAttrs")(spriteAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


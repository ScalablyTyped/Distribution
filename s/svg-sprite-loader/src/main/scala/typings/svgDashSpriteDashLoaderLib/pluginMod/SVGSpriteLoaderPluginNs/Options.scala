package typings
package svgDashSpriteDashLoaderLib.pluginMod.SVGSpriteLoaderPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Render plain sprite without styles and usages */
  var plainSprite: js.UndefOr[scala.Boolean] = js.undefined
  /** Custom tag attributes for the svg */
  var spriteAttrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    plainSprite: js.UndefOr[scala.Boolean] = js.undefined,
    spriteAttrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plainSprite)) __obj.updateDynamic("plainSprite")(plainSprite)
    if (spriteAttrs != null) __obj.updateDynamic("spriteAttrs")(spriteAttrs)
    __obj.asInstanceOf[Options]
  }
}


package typings
package svgDashSpriteLib.svgDashSpriteMod.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingConfiguration extends js.Object {
  /**
    * HTML document destination
    * @default "sprite.<mode>.html"
    */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTML document Mustache template
    * @default "tmpl/<mode>/sprite.html"
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object RenderingConfiguration {
  @scala.inline
  def apply(dest: java.lang.String = null, template: java.lang.String = null): RenderingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[RenderingConfiguration]
  }
}


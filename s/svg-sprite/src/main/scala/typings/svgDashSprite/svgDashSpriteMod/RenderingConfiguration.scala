package typings.svgDashSprite.svgDashSpriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingConfiguration extends js.Object {
  /**
    * HTML document destination
    * @default "sprite.<mode>.html"
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * HTML document Mustache template
    * @default "tmpl/<mode>/sprite.html"
    */
  var template: js.UndefOr[String] = js.undefined
}

object RenderingConfiguration {
  @scala.inline
  def apply(dest: String = null, template: String = null): RenderingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingConfiguration]
  }
}


package typings.wordpressBlocks.anon

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.Category> */
trait PartialCategory extends js.Object {
  var icon: js.UndefOr[Element | Icon] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialCategory {
  @scala.inline
  def apply(icon: Element | Icon = null, slug: String = null, title: String = null): PartialCategory = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCategory]
  }
}


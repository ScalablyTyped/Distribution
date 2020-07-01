package typings.wordpressBlocks.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockIconNormalized extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var foreground: js.UndefOr[String] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var src: Icon | ReactElement | ComponentType[js.Object]
}

object BlockIconNormalized {
  @scala.inline
  def apply(
    src: Icon | ReactElement | ComponentType[js.Object],
    background: String = null,
    foreground: String = null,
    shadowColor: String = null
  ): BlockIconNormalized = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (foreground != null) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockIconNormalized]
  }
}


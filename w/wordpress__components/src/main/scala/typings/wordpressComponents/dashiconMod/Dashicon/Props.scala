package typings.wordpressComponents.dashiconMod.Dashicon

import typings.react.mod.ClassAttributes
import typings.react.mod.SVGAttributes
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends SVGAttributes[SVGSVGElement]
     with ClassAttributes[SVGSVGElement] {
  /**
    * ID of the dashicon to use.
    */
  var icon: Icon
  /**
    * Width of the icon (in pixels).
    * @defaultValue 20
    */
  var size: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    icon: Icon,
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    size: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


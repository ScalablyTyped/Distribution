package typings.three.textGeometryMod

import typings.three.fontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextGeometryParameters extends js.Object {
  var bevelEnabled: js.UndefOr[Boolean] = js.undefined
  var bevelOffset: js.UndefOr[Double] = js.undefined
  var bevelSegments: js.UndefOr[Double] = js.undefined
  var bevelSize: js.UndefOr[Double] = js.undefined
  var bevelThickness: js.UndefOr[Double] = js.undefined
  var curveSegments: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object TextGeometryParameters {
  @scala.inline
  def apply(
    bevelEnabled: js.UndefOr[Boolean] = js.undefined,
    bevelOffset: Int | Double = null,
    bevelSegments: Int | Double = null,
    bevelSize: Int | Double = null,
    bevelThickness: Int | Double = null,
    curveSegments: Int | Double = null,
    font: Font = null,
    height: Int | Double = null,
    size: Int | Double = null
  ): TextGeometryParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled.asInstanceOf[js.Any])
    if (bevelOffset != null) __obj.updateDynamic("bevelOffset")(bevelOffset.asInstanceOf[js.Any])
    if (bevelSegments != null) __obj.updateDynamic("bevelSegments")(bevelSegments.asInstanceOf[js.Any])
    if (bevelSize != null) __obj.updateDynamic("bevelSize")(bevelSize.asInstanceOf[js.Any])
    if (bevelThickness != null) __obj.updateDynamic("bevelThickness")(bevelThickness.asInstanceOf[js.Any])
    if (curveSegments != null) __obj.updateDynamic("curveSegments")(curveSegments.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGeometryParameters]
  }
}


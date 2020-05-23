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
    bevelOffset: js.UndefOr[Double] = js.undefined,
    bevelSegments: js.UndefOr[Double] = js.undefined,
    bevelSize: js.UndefOr[Double] = js.undefined,
    bevelThickness: js.UndefOr[Double] = js.undefined,
    curveSegments: js.UndefOr[Double] = js.undefined,
    font: Font = null,
    height: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): TextGeometryParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelOffset)) __obj.updateDynamic("bevelOffset")(bevelOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelSegments)) __obj.updateDynamic("bevelSegments")(bevelSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelSize)) __obj.updateDynamic("bevelSize")(bevelSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelThickness)) __obj.updateDynamic("bevelThickness")(bevelThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(curveSegments)) __obj.updateDynamic("curveSegments")(curveSegments.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGeometryParameters]
  }
}


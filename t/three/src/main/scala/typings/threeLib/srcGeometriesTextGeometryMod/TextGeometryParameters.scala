package typings
package threeLib.srcGeometriesTextGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextGeometryParameters extends js.Object {
  var bevelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var bevelOffset: js.UndefOr[scala.Double] = js.undefined
  var bevelSegments: js.UndefOr[scala.Double] = js.undefined
  var bevelSize: js.UndefOr[scala.Double] = js.undefined
  var bevelThickness: js.UndefOr[scala.Double] = js.undefined
  var curveSegments: js.UndefOr[scala.Double] = js.undefined
  var font: js.UndefOr[threeLib.srcExtrasCoreFontMod.Font] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object TextGeometryParameters {
  @scala.inline
  def apply(
    bevelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    bevelOffset: scala.Int | scala.Double = null,
    bevelSegments: scala.Int | scala.Double = null,
    bevelSize: scala.Int | scala.Double = null,
    bevelThickness: scala.Int | scala.Double = null,
    curveSegments: scala.Int | scala.Double = null,
    font: threeLib.srcExtrasCoreFontMod.Font = null,
    height: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): TextGeometryParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled)
    if (bevelOffset != null) __obj.updateDynamic("bevelOffset")(bevelOffset.asInstanceOf[js.Any])
    if (bevelSegments != null) __obj.updateDynamic("bevelSegments")(bevelSegments.asInstanceOf[js.Any])
    if (bevelSize != null) __obj.updateDynamic("bevelSize")(bevelSize.asInstanceOf[js.Any])
    if (bevelThickness != null) __obj.updateDynamic("bevelThickness")(bevelThickness.asInstanceOf[js.Any])
    if (curveSegments != null) __obj.updateDynamic("curveSegments")(curveSegments.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGeometryParameters]
  }
}


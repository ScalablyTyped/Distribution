package typings.three

import typings.three.fontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBevelEnabled extends js.Object {
  var bevelEnabled: Boolean
  var bevelOffset: Double
  var bevelSegments: Double
  var bevelSize: Double
  var bevelThickness: Double
  var curveSegments: Double
  var font: Font
  var height: Double
  var size: Double
}

object AnonBevelEnabled {
  @scala.inline
  def apply(
    bevelEnabled: Boolean,
    bevelOffset: Double,
    bevelSegments: Double,
    bevelSize: Double,
    bevelThickness: Double,
    curveSegments: Double,
    font: Font,
    height: Double,
    size: Double
  ): AnonBevelEnabled = {
    val __obj = js.Dynamic.literal(bevelEnabled = bevelEnabled.asInstanceOf[js.Any], bevelOffset = bevelOffset.asInstanceOf[js.Any], bevelSegments = bevelSegments.asInstanceOf[js.Any], bevelSize = bevelSize.asInstanceOf[js.Any], bevelThickness = bevelThickness.asInstanceOf[js.Any], curveSegments = curveSegments.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBevelEnabled]
  }
}


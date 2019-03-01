package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BevelEnabled extends js.Object {
  var bevelEnabled: scala.Boolean
  var bevelSegments: scala.Double
  var bevelSize: scala.Double
  var bevelThickness: scala.Double
  var curveSegments: scala.Double
  var font: threeLib.threeDashCoreMod.Font
  var height: scala.Double
  var size: scala.Double
}

object Anon_BevelEnabled {
  @scala.inline
  def apply(
    bevelEnabled: scala.Boolean,
    bevelSegments: scala.Double,
    bevelSize: scala.Double,
    bevelThickness: scala.Double,
    curveSegments: scala.Double,
    font: threeLib.threeDashCoreMod.Font,
    height: scala.Double,
    size: scala.Double
  ): Anon_BevelEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bevelEnabled")(bevelEnabled)
    __obj.updateDynamic("bevelSegments")(bevelSegments)
    __obj.updateDynamic("bevelSize")(bevelSize)
    __obj.updateDynamic("bevelThickness")(bevelThickness)
    __obj.updateDynamic("curveSegments")(curveSegments)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_BevelEnabled]
  }
}


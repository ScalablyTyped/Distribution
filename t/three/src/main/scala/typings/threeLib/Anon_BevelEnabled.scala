package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BevelEnabled extends js.Object {
  var bevelEnabled: scala.Boolean
  var bevelOffset: scala.Double
  var bevelSegments: scala.Double
  var bevelSize: scala.Double
  var bevelThickness: scala.Double
  var curveSegments: scala.Double
  var font: threeLib.srcExtrasCoreFontMod.Font
  var height: scala.Double
  var size: scala.Double
}

object Anon_BevelEnabled {
  @scala.inline
  def apply(
    bevelEnabled: scala.Boolean,
    bevelOffset: scala.Double,
    bevelSegments: scala.Double,
    bevelSize: scala.Double,
    bevelThickness: scala.Double,
    curveSegments: scala.Double,
    font: threeLib.srcExtrasCoreFontMod.Font,
    height: scala.Double,
    size: scala.Double
  ): Anon_BevelEnabled = {
    val __obj = js.Dynamic.literal(bevelEnabled = bevelEnabled, bevelOffset = bevelOffset, bevelSegments = bevelSegments, bevelSize = bevelSize, bevelThickness = bevelThickness, curveSegments = curveSegments, font = font, height = height, size = size)
  
    __obj.asInstanceOf[Anon_BevelEnabled]
  }
}


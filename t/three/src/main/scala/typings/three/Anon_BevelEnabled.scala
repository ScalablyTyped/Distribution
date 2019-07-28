package typings.three

import typings.three.srcExtrasCoreFontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BevelEnabled extends js.Object {
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

object Anon_BevelEnabled {
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
  ): Anon_BevelEnabled = {
    val __obj = js.Dynamic.literal(bevelEnabled = bevelEnabled, bevelOffset = bevelOffset, bevelSegments = bevelSegments, bevelSize = bevelSize, bevelThickness = bevelThickness, curveSegments = curveSegments, font = font, height = height, size = size)
  
    __obj.asInstanceOf[Anon_BevelEnabled]
  }
}


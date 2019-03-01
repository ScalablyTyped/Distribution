package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Glyph extends js.Object {
  var glyph: vexflowLib.VexNs.FlowNs.Glyph
  var num: scala.Double
}

object Anon_Glyph {
  @scala.inline
  def apply(glyph: vexflowLib.VexNs.FlowNs.Glyph, num: scala.Double): Anon_Glyph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("glyph")(glyph)
    __obj.updateDynamic("num")(num)
    __obj.asInstanceOf[Anon_Glyph]
  }
}


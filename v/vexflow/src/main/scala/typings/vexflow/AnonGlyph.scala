package typings.vexflow

import typings.vexflow.Vex.Flow.Glyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlyph extends js.Object {
  var glyph: Glyph
  var num: Double
}

object AnonGlyph {
  @scala.inline
  def apply(glyph: Glyph, num: Double): AnonGlyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlyph]
  }
}


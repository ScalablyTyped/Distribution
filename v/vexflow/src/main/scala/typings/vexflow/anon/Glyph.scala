package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Glyph extends js.Object {
  var glyph: typings.vexflow.Vex.Flow.Glyph
  var num: Double
}

object Glyph {
  @scala.inline
  def apply(glyph: typings.vexflow.Vex.Flow.Glyph, num: Double): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
}


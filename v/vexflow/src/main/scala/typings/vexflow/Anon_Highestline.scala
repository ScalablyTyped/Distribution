package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Highestline extends js.Object {
  var highest_line: Double
  var lowest_line: Double
  var y_bottom: Double
  var y_top: Double
}

object Anon_Highestline {
  @scala.inline
  def apply(highest_line: Double, lowest_line: Double, y_bottom: Double, y_top: Double): Anon_Highestline = {
    val __obj = js.Dynamic.literal(highest_line = highest_line, lowest_line = lowest_line, y_bottom = y_bottom, y_top = y_top)
  
    __obj.asInstanceOf[Anon_Highestline]
  }
}


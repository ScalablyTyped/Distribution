package typings.tokenizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: Double
  var len: Double
  var line: Double
  var pos: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: Double, len: Double, line: Double, pos: Double): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, len = len, line = line, pos = pos)
  
    __obj.asInstanceOf[Anon_Column]
  }
}


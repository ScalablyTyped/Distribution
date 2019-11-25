package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: Double
  var filename: String
  var lineno: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: Double, filename: String, lineno: Double): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column]
  }
}


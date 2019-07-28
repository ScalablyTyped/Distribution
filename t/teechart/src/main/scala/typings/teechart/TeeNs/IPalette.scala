package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPalette extends js.Object {
  var colors: js.Array[String]
  def get(index: Double): String
}

object IPalette {
  @scala.inline
  def apply(colors: js.Array[String], get: Double => String): IPalette = {
    val __obj = js.Dynamic.literal(colors = colors, get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[IPalette]
  }
}


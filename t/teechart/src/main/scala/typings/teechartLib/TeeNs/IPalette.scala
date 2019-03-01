package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPalette extends js.Object {
  var colors: js.Array[java.lang.String]
  def get(index: scala.Double): java.lang.String
}

object IPalette {
  @scala.inline
  def apply(colors: js.Array[java.lang.String], get: js.Function1[scala.Double, java.lang.String]): IPalette = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[IPalette]
  }
}


package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var sets: js.Array[java.lang.String]
  var size: scala.Double
}

object Area {
  @scala.inline
  def apply(sets: js.Array[java.lang.String], size: scala.Double): Area = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sets")(sets)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Area]
  }
}


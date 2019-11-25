package typings.venn.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var sets: js.Array[String]
  var size: Double
}

object Area {
  @scala.inline
  def apply(sets: js.Array[String], size: Double): Area = {
    val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Area]
  }
}


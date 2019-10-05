package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegObj extends js.Object {
  var x: Double
  var y: Double
}

object RegObj {
  @scala.inline
  def apply(x: Double, y: Double): RegObj = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[RegObj]
  }
}


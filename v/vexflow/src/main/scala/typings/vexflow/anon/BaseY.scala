package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseY extends js.Object {
  var baseY: Double
  var topY: Double
}

object BaseY {
  @scala.inline
  def apply(baseY: Double, topY: Double): BaseY = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], topY = topY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseY]
  }
}


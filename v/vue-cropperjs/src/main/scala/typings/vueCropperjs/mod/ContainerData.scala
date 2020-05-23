package typings.vueCropperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerData extends js.Object {
  /**
    * the current height of the container
    */
  var height: Double
  /**
    * the current width of the container
    */
  var width: Double
}

object ContainerData {
  @scala.inline
  def apply(height: Double, width: Double): ContainerData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerData]
  }
}


package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var image: Blob
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, image: Blob, width: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}


package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompressed extends js.Object {
  var compressed: Boolean
  var maxDuration: Double
  var sourceType: js.Array[String]
}

object AnonCompressed {
  @scala.inline
  def apply(compressed: Boolean, maxDuration: Double, sourceType: js.Array[String]): AnonCompressed = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompressed]
  }
}


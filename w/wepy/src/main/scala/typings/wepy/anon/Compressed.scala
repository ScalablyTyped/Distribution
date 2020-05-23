package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compressed extends js.Object {
  var compressed: Boolean
  var maxDuration: Double
  var sourceType: js.Array[String]
}

object Compressed {
  @scala.inline
  def apply(compressed: Boolean, maxDuration: Double, sourceType: js.Array[String]): Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compressed]
  }
}


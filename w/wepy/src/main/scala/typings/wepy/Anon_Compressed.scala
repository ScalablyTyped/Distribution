package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressed extends js.Object {
  var compressed: Boolean
  var maxDuration: Double
  var sourceType: js.Array[String]
}

object Anon_Compressed {
  @scala.inline
  def apply(compressed: Boolean, maxDuration: Double, sourceType: js.Array[String]): Anon_Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Compressed]
  }
}


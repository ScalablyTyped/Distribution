package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressed extends js.Object {
  var compressed: scala.Boolean
  var maxDuration: scala.Double
  var sourceType: js.Array[java.lang.String]
}

object Anon_Compressed {
  @scala.inline
  def apply(compressed: scala.Boolean, maxDuration: scala.Double, sourceType: js.Array[java.lang.String]): Anon_Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed, maxDuration = maxDuration, sourceType = sourceType)
  
    __obj.asInstanceOf[Anon_Compressed]
  }
}


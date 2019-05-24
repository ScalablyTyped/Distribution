package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  var color: java.lang.String
  var offset: scala.Double
}

object GradientStop {
  @scala.inline
  def apply(color: java.lang.String, offset: scala.Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color, offset = offset)
  
    __obj.asInstanceOf[GradientStop]
  }
}


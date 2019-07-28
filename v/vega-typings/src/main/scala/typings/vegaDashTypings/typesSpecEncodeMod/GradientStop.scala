package typings.vegaDashTypings.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  var color: String
  var offset: Double
}

object GradientStop {
  @scala.inline
  def apply(color: String, offset: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color, offset = offset)
  
    __obj.asInstanceOf[GradientStop]
  }
}


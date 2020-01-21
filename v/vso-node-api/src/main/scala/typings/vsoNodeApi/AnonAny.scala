package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAny extends js.Object {
  var any: Double
  var file: Double
  var folder: Double
}

object AnonAny {
  @scala.inline
  def apply(any: Double, file: Double, folder: Double): AnonAny = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAny]
  }
}


package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFolder extends js.Object {
  var folder: Double
  var invalid: Double
  var ref: Double
}

object AnonFolder {
  @scala.inline
  def apply(folder: Double, invalid: Double, ref: Double): AnonFolder = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFolder]
  }
}


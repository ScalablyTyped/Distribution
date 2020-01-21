package typings.typescriptCompare.mod.Compare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options_ extends js.Object {
  var broaderLeft: js.Any
  var broaderRight: js.Any
  var equal: js.Any
  var mismatch: js.Any
}

object Options_ {
  @scala.inline
  def apply(broaderLeft: js.Any, broaderRight: js.Any, equal: js.Any, mismatch: js.Any): Options_ = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options_]
  }
}


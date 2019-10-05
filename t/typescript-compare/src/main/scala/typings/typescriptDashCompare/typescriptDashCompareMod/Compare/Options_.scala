package typings.typescriptDashCompare.typescriptDashCompareMod.Compare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Options")
trait Options_ extends js.Object {
  var broaderLeft: js.Any
  var broaderRight: js.Any
  var equal: js.Any
  var mismatch: js.Any
}

object Options_ {
  @scala.inline
  def apply(broaderLeft: js.Any, broaderRight: js.Any, equal: js.Any, mismatch: js.Any): Options_ = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft, broaderRight = broaderRight, equal = equal, mismatch = mismatch)
  
    __obj.asInstanceOf[Options_]
  }
}


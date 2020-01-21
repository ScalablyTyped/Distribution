package typings.winrt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var returnValue: Boolean
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, returnValue: Boolean): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex]
  }
}


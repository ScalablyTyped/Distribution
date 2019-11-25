package typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.WhyDidYouRender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookDifference extends js.Object {
  var diffType: String
  var nextValue: js.Any
  var pathString: String
  var prevValue: js.Any
}

object HookDifference {
  @scala.inline
  def apply(diffType: String, nextValue: js.Any, pathString: String, prevValue: js.Any): HookDifference = {
    val __obj = js.Dynamic.literal(diffType = diffType.asInstanceOf[js.Any], nextValue = nextValue.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookDifference]
  }
}


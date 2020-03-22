package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnValueNumber extends js.Object {
  var items: js.Array[ResourceQualifier]
  var returnValue: Double
}

object AnonReturnValueNumber {
  @scala.inline
  def apply(items: js.Array[ResourceQualifier], returnValue: Double): AnonReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnValueNumber]
  }
}


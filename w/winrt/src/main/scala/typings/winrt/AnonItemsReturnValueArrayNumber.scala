package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueArrayNumber extends js.Object {
  var items: js.Array[ResourceQualifier]
  var returnValue: Double
}

object AnonItemsReturnValueArrayNumber {
  @scala.inline
  def apply(items: js.Array[ResourceQualifier], returnValue: Double): AnonItemsReturnValueArrayNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueArrayNumber]
  }
}


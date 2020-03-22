package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsArrayReturnValueNumber extends js.Object {
  var items: js.Array[ResourceCandidate]
  var returnValue: Double
}

object AnonItemsArrayReturnValueNumber {
  @scala.inline
  def apply(items: js.Array[ResourceCandidate], returnValue: Double): AnonItemsArrayReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsArrayReturnValueNumber]
  }
}


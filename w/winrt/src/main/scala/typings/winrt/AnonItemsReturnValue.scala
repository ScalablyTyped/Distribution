package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValue extends js.Object {
  var items: js.Array[IKeyValuePair[String, NamedResource]]
  var returnValue: Double
}

object AnonItemsReturnValue {
  @scala.inline
  def apply(items: js.Array[IKeyValuePair[String, NamedResource]], returnValue: Double): AnonItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsReturnValue]
  }
}


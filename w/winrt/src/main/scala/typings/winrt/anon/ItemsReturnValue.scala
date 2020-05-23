package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsReturnValue extends js.Object {
  var items: js.Array[IKeyValuePair[String, NamedResource]]
  var returnValue: Double
}

object ItemsReturnValue {
  @scala.inline
  def apply(items: js.Array[IKeyValuePair[String, NamedResource]], returnValue: Double): ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsReturnValue]
  }
}


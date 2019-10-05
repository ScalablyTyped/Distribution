package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArray extends js.Object {
  var items: js.Array[IKeyValuePair[String, NamedResource]]
  var returnValue: Double
}

object Anon_ItemsReturnValueArray {
  @scala.inline
  def apply(items: js.Array[IKeyValuePair[String, NamedResource]], returnValue: Double): Anon_ItemsReturnValueArray = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArray]
  }
}


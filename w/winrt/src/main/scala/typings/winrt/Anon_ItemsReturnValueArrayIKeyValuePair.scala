package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayIKeyValuePair extends js.Object {
  var items: js.Array[IKeyValuePair[String, ResourceMap]]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayIKeyValuePair {
  @scala.inline
  def apply(items: js.Array[IKeyValuePair[String, ResourceMap]], returnValue: Double): Anon_ItemsReturnValueArrayIKeyValuePair = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayIKeyValuePair]
  }
}


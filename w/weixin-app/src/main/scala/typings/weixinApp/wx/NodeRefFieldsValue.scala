package typings.weixinApp.wx

import typings.weixinApp.anon.Bottom
import typings.weixinApp.anon.Dataset
import typings.weixinApp.anon.Height
import typings.weixinApp.anon.Id
import typings.weixinApp.anon.PropertiesAny
import typings.weixinApp.anon.ScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: Dataset
  var id: Id
  var properties: PropertiesAny
  var rect: Bottom
  var scrollOffset: ScrollLeft
  var size: Height
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: Dataset,
    id: Id,
    properties: PropertiesAny,
    rect: Bottom,
    scrollOffset: ScrollLeft,
    size: Height
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}


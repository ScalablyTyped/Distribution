package typings.weixinApp.wx

import typings.weixinApp.AnonBottom
import typings.weixinApp.AnonDataset
import typings.weixinApp.AnonHeight
import typings.weixinApp.AnonId
import typings.weixinApp.AnonPropertiesAny
import typings.weixinApp.AnonScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: AnonDataset
  var id: AnonId
  var properties: AnonPropertiesAny
  var rect: AnonBottom
  var scrollOffset: AnonScrollLeft
  var size: AnonHeight
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: AnonDataset,
    id: AnonId,
    properties: AnonPropertiesAny,
    rect: AnonBottom,
    scrollOffset: AnonScrollLeft,
    size: AnonHeight
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}


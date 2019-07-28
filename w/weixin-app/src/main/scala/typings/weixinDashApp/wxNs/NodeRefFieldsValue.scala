package typings.weixinDashApp.wxNs

import typings.weixinDashApp.Anon_Bottom
import typings.weixinDashApp.Anon_Dataset
import typings.weixinDashApp.Anon_Height
import typings.weixinDashApp.Anon_Id
import typings.weixinDashApp.Anon_PropertiesAny
import typings.weixinDashApp.Anon_ScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: Anon_Dataset
  var id: Anon_Id
  var properties: Anon_PropertiesAny
  var rect: Anon_Bottom
  var scrollOffset: Anon_ScrollLeft
  var size: Anon_Height
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: Anon_Dataset,
    id: Anon_Id,
    properties: Anon_PropertiesAny,
    rect: Anon_Bottom,
    scrollOffset: Anon_ScrollLeft,
    size: Anon_Height
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset, id = id, properties = properties, rect = rect, scrollOffset = scrollOffset, size = size)
  
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}


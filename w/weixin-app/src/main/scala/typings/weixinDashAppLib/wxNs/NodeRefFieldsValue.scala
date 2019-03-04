package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: weixinDashAppLib.Anon_Dataset
  var id: weixinDashAppLib.Anon_Id
  var properties: weixinDashAppLib.Anon_PropertiesAny
  var rect: weixinDashAppLib.Anon_Bottom
  var scrollOffset: weixinDashAppLib.Anon_ScrollLeft
  var size: weixinDashAppLib.Anon_Height
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: weixinDashAppLib.Anon_Dataset,
    id: weixinDashAppLib.Anon_Id,
    properties: weixinDashAppLib.Anon_PropertiesAny,
    rect: weixinDashAppLib.Anon_Bottom,
    scrollOffset: weixinDashAppLib.Anon_ScrollLeft,
    size: weixinDashAppLib.Anon_Height
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset, id = id, properties = properties, rect = rect, scrollOffset = scrollOffset, size = size)
  
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}


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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("rect")(rect)
    __obj.updateDynamic("scrollOffset")(scrollOffset)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}


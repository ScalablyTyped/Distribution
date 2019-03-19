package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesRef extends js.Object {
  /**
    * 添加节点的布局位置的查询请求，相对于显示区域，以像素为单位
    */
  def boundingClientRect(callback: js.Function1[/* result */ NodeRect, scala.Unit]): scala.Unit
  /**
    * 获取节点的相关信息，需要获取的字段在fields中指定
    */
  def fields(fields: NodeField, callback: js.Function1[/* result */ NodeRect, scala.Unit]): SelectorQuery
  /**
    * 添加节点的滚动位置查询请求，以像素为单位
    */
  def scrollOffset(callback: js.Function1[/* result */ NodeRect, scala.Unit]): SelectorQuery
}

object NodesRef {
  @scala.inline
  def apply(
    boundingClientRect: js.Function1[/* result */ NodeRect, scala.Unit] => scala.Unit,
    fields: (NodeField, js.Function1[/* result */ NodeRect, scala.Unit]) => SelectorQuery,
    scrollOffset: js.Function1[/* result */ NodeRect, scala.Unit] => SelectorQuery
  ): NodesRef = {
    val __obj = js.Dynamic.literal(boundingClientRect = js.Any.fromFunction1(boundingClientRect), fields = js.Any.fromFunction2(fields), scrollOffset = js.Any.fromFunction1(scrollOffset))
  
    __obj.asInstanceOf[NodesRef]
  }
}


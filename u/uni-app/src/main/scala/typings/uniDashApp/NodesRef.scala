package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesRef extends js.Object {
  /**
    * 添加节点的布局位置的查询请求，相对于显示区域，以像素为单位
    */
  def boundingClientRect(): SelectorQuery = js.native
  def boundingClientRect(callback: js.Function1[/* result */ NodeInfo, Unit]): SelectorQuery = js.native
  /**
    * 添加节点的 Context 对象查询请求
    */
  def context(): SelectorQuery = js.native
  def context(callback: js.Function1[/* result */ NodeInfo, Unit]): SelectorQuery = js.native
  /**
    * 获取节点的相关信息，需要获取的字段在fields中指定
    */
  def fields(): SelectorQuery = js.native
  def fields(fields: NodeField): SelectorQuery = js.native
  def fields(fields: NodeField, callback: js.Function1[/* result */ NodeInfo, Unit]): SelectorQuery = js.native
  /**
    * 添加节点的滚动位置查询请求，以像素为单位
    */
  def scrollOffset(): SelectorQuery = js.native
  def scrollOffset(callback: js.Function1[/* result */ NodeInfo, Unit]): SelectorQuery = js.native
}


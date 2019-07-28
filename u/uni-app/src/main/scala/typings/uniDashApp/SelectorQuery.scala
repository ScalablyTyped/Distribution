package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorQuery extends js.Object {
  /**
    * 执行所有的请求
    */
  def exec(): NodesRef = js.native
  def exec(callback: js.Function0[Unit]): NodesRef = js.native
  /**
    * 将选择器的选取范围更改为自定义组件component内
    */
  def in(): SelectorQuery = js.native
  def in(component: js.Any): SelectorQuery = js.native
  /**
    * 在当前页面下选择第一个匹配选择器selector的节点
    */
  def select(): NodesRef = js.native
  def select(selector: String): NodesRef = js.native
  /**
    * 在当前页面下选择匹配选择器selector的所有节点
    */
  def selectAll(): NodesRef = js.native
  def selectAll(selector: String): NodesRef = js.native
  /**
    * 选择显示区域
    */
  def selectViewport(): NodesRef = js.native
  def selectViewport(selector: String): NodesRef = js.native
}


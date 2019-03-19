package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorQuery extends js.Object {
  /**
    * 执行所有的请求
    */
  def exec(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 将选择器的选取范围更改为自定义组件component内
    */
  def in(component: js.Any): scala.Unit
  /**
    * 在当前页面下选择第一个匹配选择器selector的节点
    */
  def select(selector: java.lang.String): NodesRef
  /**
    * 在当前页面下选择匹配选择器selector的所有节点
    */
  def selectAll(selector: java.lang.String): NodesRef
  /**
    * 选择显示区域
    */
  def selectViewport(selector: java.lang.String): NodesRef
}

object SelectorQuery {
  @scala.inline
  def apply(
    exec: js.Function0[scala.Unit] => scala.Unit,
    in: js.Any => scala.Unit,
    select: java.lang.String => NodesRef,
    selectAll: java.lang.String => NodesRef,
    selectViewport: java.lang.String => NodesRef
  ): SelectorQuery = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), in = js.Any.fromFunction1(in), select = js.Any.fromFunction1(select), selectAll = js.Any.fromFunction1(selectAll), selectViewport = js.Any.fromFunction1(selectViewport))
  
    __obj.asInstanceOf[SelectorQuery]
  }
}


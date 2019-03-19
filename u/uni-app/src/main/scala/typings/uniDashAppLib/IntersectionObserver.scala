package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserver extends js.Object {
  /**
    * 停止监听
    */
  def disconnect(): scala.Unit
  /**
    * 指定目标节点并开始监听相交状态变化情况
    */
  def observe(targetSelector: java.lang.String, callback: js.Function1[/* result */ ObserveResult, scala.Unit]): scala.Unit
  /**
    * 使用选择器指定一个节点，作为参照区域之一
    */
  def relativeTo(selector: java.lang.String, margins: js.Array[_]): scala.Unit
  /**
    * 指定页面显示区域作为参照区域之一
    */
  def relativeToViewport(margins: js.Array[_]): scala.Unit
}

object IntersectionObserver {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    observe: (java.lang.String, js.Function1[/* result */ ObserveResult, scala.Unit]) => scala.Unit,
    relativeTo: (java.lang.String, js.Array[_]) => scala.Unit,
    relativeToViewport: js.Array[_] => scala.Unit
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction2(observe), relativeTo = js.Any.fromFunction2(relativeTo), relativeToViewport = js.Any.fromFunction1(relativeToViewport))
  
    __obj.asInstanceOf[IntersectionObserver]
  }
}


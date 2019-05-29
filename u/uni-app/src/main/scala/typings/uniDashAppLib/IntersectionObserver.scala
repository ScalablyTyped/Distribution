package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionObserver extends js.Object {
  /**
    * 停止监听
    */
  def disconnect(): scala.Unit = js.native
  /**
    * 指定目标节点并开始监听相交状态变化情况
    */
  def observe(): scala.Unit = js.native
  def observe(targetSelector: java.lang.String): scala.Unit = js.native
  def observe(targetSelector: java.lang.String, callback: js.Function1[/* result */ ObserveResult, scala.Unit]): scala.Unit = js.native
  /**
    * 使用选择器指定一个节点，作为参照区域之一
    */
  def relativeTo(): scala.Unit = js.native
  def relativeTo(selector: java.lang.String): scala.Unit = js.native
  def relativeTo(selector: java.lang.String, margins: js.Array[_]): scala.Unit = js.native
  /**
    * 指定页面显示区域作为参照区域之一
    */
  def relativeToViewport(): scala.Unit = js.native
  def relativeToViewport(margins: js.Array[_]): scala.Unit = js.native
}


package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserver extends js.Object {
  
  /**
    * 停止监听
    */
  def disconnect(): Unit = js.native
  
  /**
    * 指定目标节点并开始监听相交状态变化情况
    */
  def observe(): Unit = js.native
  def observe(
    targetSelector: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ ObserveResult, Unit]
  ): Unit = js.native
  def observe(targetSelector: String): Unit = js.native
  def observe(targetSelector: String, callback: js.Function1[/* result */ ObserveResult, Unit]): Unit = js.native
  
  /**
    * 使用选择器指定一个节点，作为参照区域之一
    */
  def relativeTo(): Unit = js.native
  def relativeTo(selector: js.UndefOr[scala.Nothing], margins: js.Array[_]): Unit = js.native
  def relativeTo(selector: String): Unit = js.native
  def relativeTo(selector: String, margins: js.Array[_]): Unit = js.native
  
  /**
    * 指定页面显示区域作为参照区域之一
    */
  def relativeToViewport(): Unit = js.native
  def relativeToViewport(margins: js.Array[_]): Unit = js.native
}

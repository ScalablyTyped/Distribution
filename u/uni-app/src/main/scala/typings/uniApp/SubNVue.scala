package typings.uniApp

import typings.uniApp.uniAppStrings.`fade-in`
import typings.uniApp.uniAppStrings.`fade-out`
import typings.uniApp.uniAppStrings.`pop-in`
import typings.uniApp.uniAppStrings.`pop-out`
import typings.uniApp.uniAppStrings.`slide-in-bottom`
import typings.uniApp.uniAppStrings.`slide-in-left`
import typings.uniApp.uniAppStrings.`slide-in-right`
import typings.uniApp.uniAppStrings.`slide-in-top`
import typings.uniApp.uniAppStrings.`slide-out-bottom`
import typings.uniApp.uniAppStrings.`slide-out-left`
import typings.uniApp.uniAppStrings.`slide-out-right`
import typings.uniApp.uniAppStrings.`slide-out-top`
import typings.uniApp.uniAppStrings.`zoom-fade-in`
import typings.uniApp.uniAppStrings.`zoom-fade-out`
import typings.uniApp.uniAppStrings.`zoom-in`
import typings.uniApp.uniAppStrings.`zoom-out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubNVue extends StObject {
  
  /**
    * 隐藏原生子窗体
    */
  def hide(): Unit = js.native
  def hide(
    options: `slide-out-right` | `slide-out-left` | `slide-out-top` | `slide-out-bottom` | `fade-out` | `zoom-in` | `zoom-fade-in` | `pop-out`
  ): Unit = js.native
  
  /**
    * 监听消息
    */
  def onMessage(): Unit = js.native
  def onMessage(success: js.Function0[Unit]): Unit = js.native
  
  /**
    * 发送消息
    */
  def postMessage(): Unit = js.native
  
  /**
    * 设置原生子窗体的样式
    */
  def setStyle(): Unit = js.native
  def setStyle(options: SubNVuesSetStyleOptions): Unit = js.native
  
  /**
    * 显示原生子窗体
    */
  def show(): Unit = js.native
  def show(
    options: `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
  ): Unit = js.native
}

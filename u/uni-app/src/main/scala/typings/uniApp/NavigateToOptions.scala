package typings.uniApp

import typings.uniApp.uniAppStrings.`fade-in`
import typings.uniApp.uniAppStrings.`pop-in`
import typings.uniApp.uniAppStrings.`slide-in-bottom`
import typings.uniApp.uniAppStrings.`slide-in-left`
import typings.uniApp.uniAppStrings.`slide-in-right`
import typings.uniApp.uniAppStrings.`slide-in-top`
import typings.uniApp.uniAppStrings.`zoom-fade-out`
import typings.uniApp.uniAppStrings.`zoom-out`
import typings.uniApp.uniAppStrings.auto
import typings.uniApp.uniAppStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToOptions extends StObject {
  
  /**
    * 窗口显示动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * 窗口显示的动画类型
    * - auto: 自动选择动画效果
    * - none: 无动画效果
    * - slide-in-right: 从右侧横向滑动效果
    * - slide-in-left: 左侧横向滑动效果
    * - slide-in-top: 从上侧竖向滑动效果
    * - slide-in-bottom: 从下侧竖向滑动效果
    * - fade-in: 从透明到不透明逐渐显示效果
    * - zoom-out: 从小到大逐渐放大显示效果
    * - zoom-fade-out: 从小到大逐渐放大并且从透明到不透明逐渐显示效果
    * - pop-in: 从右侧平移入栈动画效果
    */
  var animationType: js.UndefOr[
    auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
  ] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 需要跳转的应用内非 tabBar 的页面的路径 , 路径后可以带参数
    */
  var url: js.UndefOr[String] = js.undefined
}
object NavigateToOptions {
  
  inline def apply(): NavigateToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateToOptions]
  }
  
  extension [Self <: NavigateToOptions](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationType(
      value: auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
    ): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

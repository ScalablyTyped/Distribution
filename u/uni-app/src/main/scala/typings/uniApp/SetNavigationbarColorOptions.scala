package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetNavigationbarColorOptions extends StObject {
  
  /**
    * 动画效果
    */
  var animation: js.UndefOr[NavigationBarAnimation] = js.undefined
  
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色
    */
  var frontColor: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SetNavigationbarColorOptions {
  
  @scala.inline
  def apply(): SetNavigationbarColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNavigationbarColorOptions]
  }
  
  @scala.inline
  implicit class SetNavigationbarColorOptionsMutableBuilder[Self <: SetNavigationbarColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: NavigationBarAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFrontColor(value: String): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColorUndefined: Self = StObject.set(x, "frontColor", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

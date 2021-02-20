package typings.weixinApp.wx

import typings.weixinApp.anon.Duration
import typings.weixinApp.weixinAppStrings.Numbersign000000
import typings.weixinApp.weixinAppStrings.Numbersignffffff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 动画效果
    */
  var animation: js.UndefOr[Duration] = js.native
  
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: String = js.native
  
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
    */
  var frontColor: Numbersignffffff | Numbersign000000 = js.native
}
object SetNavigationBarColorOptions {
  
  @scala.inline
  def apply(backgroundColor: String, frontColor: Numbersignffffff | Numbersign000000): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
  
  @scala.inline
  implicit class SetNavigationBarColorOptionsMutableBuilder[Self <: SetNavigationBarColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Duration): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColor(value: Numbersignffffff | Numbersign000000): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
  }
}

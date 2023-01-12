package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabDataSource
  extends StObject
     with ViewProps {
  
  /**
    * @language zh-CN
    * @description 是否可以点击切换 Tab
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Can I click switch tab
    * @defaultValue undefined
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 标签里的文本
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Text in tab
    * @defaultValue undefined
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义 Tab 渲染
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom tab rendering
    * @defaultValue undefined
    */
  var renderTab: js.UndefOr[
    js.Function3[/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object, ReactNode]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 索引值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Index
    * @defaultValue undefined
    */
  var value: String
}
object TabDataSource {
  
  inline def apply(value: String): TabDataSource = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabDataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabDataSource] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRenderTab(value: (/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object) => ReactNode): Self = StObject.set(x, "renderTab", js.Any.fromFunction3(value))
    
    inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

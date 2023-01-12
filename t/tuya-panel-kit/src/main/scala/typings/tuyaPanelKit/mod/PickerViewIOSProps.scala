package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.tuyaPanelKit.anon.DividerColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerIOSProps * / any */ trait PickerViewIOSProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 自定义内容
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description customized contend
    * @defaultValue undefined
    */
  var children: ReactNode
  
  /**
    * @language zh-CN
    * @description Picker是否循环滚动
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to simulate an endless loop
    * @defaultValue false
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue {}
    */
  var theme: js.UndefOr[DividerColor] = js.undefined
}
object PickerViewIOSProps {
  
  inline def apply(): PickerViewIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerViewIOSProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickerViewIOSProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setTheme(value: DividerColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

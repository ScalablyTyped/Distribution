package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabPaneProps
  extends StObject
     with TabProps {
  
  /**
    * @language zh-CN
    * @description Tab 上文字或者自定义的元素
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Text or custom elements on tab
    * @defaultValue undefined
    */
  var tab: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 每个 tab 的宽度
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Width of each tab
    * @defaultValue undefined
    */
  var tabWidth: js.UndefOr[Double] = js.undefined
}
object TabPaneProps {
  
  inline def apply(): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPaneProps]
  }
  
  extension [Self <: TabPaneProps](x: Self) {
    
    inline def setTab(value: ReactNode): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
    
    inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
  }
}

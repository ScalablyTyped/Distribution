package typings.tuyaPanelKit.mod

import typings.reactNative.mod.DefaultSectionT
import typings.reactNative.mod.SectionListData
import typings.reactNative.mod.SectionListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TYSectionListProps
  extends StObject
     with SectionListProps[SectionDataProps, DefaultSectionT] {
  
  /**
    * @language zh-CN
    * @description 头部样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Header style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项实例
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description List item instance
    * @defaultValue null
    */
  var sectionListRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分割线样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Separator style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var separatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 ART 实现版本
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to use ART implementation version
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
}
object TYSectionListProps {
  
  inline def apply(sections: js.Array[SectionListData[SectionDataProps, DefaultSectionT]]): TYSectionListProps = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYSectionListProps]
  }
  
  extension [Self <: TYSectionListProps](x: Self) {
    
    inline def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setSectionListRef(value: () => Unit): Self = StObject.set(x, "sectionListRef", js.Any.fromFunction0(value))
    
    inline def setSectionListRefUndefined: Self = StObject.set(x, "sectionListRef", js.undefined)
    
    inline def setSeparatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
    
    inline def setSeparatorStyleNull: Self = StObject.set(x, "separatorStyle", null)
    
    inline def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
  }
}

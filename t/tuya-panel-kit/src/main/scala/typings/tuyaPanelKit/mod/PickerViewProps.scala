package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.DividerColor
import typings.tuyaPanelKit.tuyaPanelKitStrings.`DIN Alternate`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`PingFangHK-Medium`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`PingFangHK-Regular`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`Times New Roman`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`flex-end`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`flex-start`
import typings.tuyaPanelKit.tuyaPanelKitStrings.baseline
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerIOSProps * / any, 'onValueChange' | 'selectedValue'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerIOSProps * / any[P]}
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerProps * / any */ trait PickerViewProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标示
    * @defaultValue 'PickerView'
    */
  /**
    * @language en-US
    * @description Test Flag
    * @defaultValue 'PickerView'
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
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
    * @description 分割线颜色
    * @defaultValue '#cccccc'
    */
  /**
    * @language en-US
    * @description Divider color of the Picker option
    * @defaultValue '#cccccc'
    */
  var dividerColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体
    * @defaultValue 'DIN Alternate'
    * @platform IOS only
    */
  /**
    * @language en-US
    * @description fontFamily
    * @defaultValue 'DIN Alternate'
    * @platform IOS only
    */
  var fontFamily: js.UndefOr[
    (`DIN Alternate`) | (`Times New Roman`) | `PingFangHK-Regular` | `PingFangHK-Medium` | String
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体粗细
    * @defaultValue 'normal'
    * @platform IOS only
    */
  /**
    * @language en-US
    * @description font weight
    * @defaultValue 'normal'
    * @platform IOS only
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 项目对齐方式
    * @defaultValue 'center'
    */
  /**
    * @language en-US
    * @description Alignment method of items
    * @defaultValue 'center'
    */
  var itemAlign: js.UndefOr[`flex-end` | center | `flex-start` | baseline | stretch] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文本上下边界大小
    * @defaultValue 14
    * @platform IOS only
    */
  /**
    * @language en-US
    * @description 文本上下边界大小
    * @defaultValue 14
    * @platform IOS only
    */
  var itemPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选项的文字颜色
    * @defaultValue '#cccccc'
    */
  /**
    * @language en-US
    * @description Text color for Item
    * @defaultValue '#cccccc'
    */
  var itemTextColor: js.UndefOr[String] = js.undefined
  
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
    * @description 数值改变回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback for when an item is selected.
    * @defaultValue () => {}
    */
  var onValueChange: js.UndefOr[js.Function2[/* value */ String | Double, /* index */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选项选中的文字颜色
    * @defaultValue 'black'
    */
  /**
    * @language en-US
    * @description The color of the text selected
    * @defaultValue 'black'
    */
  var selectedItemTextColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选中的数值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Value matching value of one of the items
    * @defaultValue undefined
    */
  var selectedValue: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 项目文字大小
    * @defaultValue 20
    */
  /**
    * @language en-US
    * @description Text size of items
    * @defaultValue 20
    */
  var textSize: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[DividerColor] = js.undefined
  
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
  /**
    * @language zh-CN
    * @description 是否使用 App 3.28.0 支持的插件 Picker
    * @defaultValue false
    * @platform IOS only
    */
  /**
    * @language en-US
    * @description Whether to use the plugin Picker supported by App 3.28.0
    * @defaultValue false
    * @platform IOS only
    */
  var useTYRCTPicker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 可视区域项目个数（仅安卓）
    * @defaultValue 8
    */
  /**
    * @language en-US
    * @description The number of items in the visible area(Android only)
    * @defaultValue 8
    */
  var visibleItemCount: js.UndefOr[Double] = js.undefined
}
object PickerViewProps {
  
  inline def apply(): PickerViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerViewProps]
  }
  
  extension [Self <: PickerViewProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
    
    inline def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
    
    inline def setFontFamily(
      value: (`DIN Alternate`) | (`Times New Roman`) | `PingFangHK-Regular` | `PingFangHK-Medium` | String
    ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setItemAlign(value: `flex-end` | center | `flex-start` | baseline | stretch): Self = StObject.set(x, "itemAlign", value.asInstanceOf[js.Any])
    
    inline def setItemAlignUndefined: Self = StObject.set(x, "itemAlign", js.undefined)
    
    inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
    
    inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
    
    inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemTextColorUndefined: Self = StObject.set(x, "itemTextColor", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnValueChange(value: (/* value */ String | Double, /* index */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setSelectedItemTextColor(value: String): Self = StObject.set(x, "selectedItemTextColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemTextColorUndefined: Self = StObject.set(x, "selectedItemTextColor", js.undefined)
    
    inline def setSelectedValue(value: String): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    inline def setTheme(value: DividerColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseTYRCTPicker(value: Boolean): Self = StObject.set(x, "useTYRCTPicker", value.asInstanceOf[js.Any])
    
    inline def setUseTYRCTPickerUndefined: Self = StObject.set(x, "useTYRCTPicker", js.undefined)
    
    inline def setVisibleItemCount(value: Double): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleItemCountUndefined: Self = StObject.set(x, "visibleItemCount", js.undefined)
  }
}

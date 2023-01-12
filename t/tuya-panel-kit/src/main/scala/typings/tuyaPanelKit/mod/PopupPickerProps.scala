package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof tuya-panel-kit.tuya-panel-kit.PopupProps, 'onConfirm'> ]: tuya-panel-kit.tuya-panel-kit.PopupProps[P]}
- Dropped {[ P in std.Exclude<keyof tuya-panel-kit.tuya-panel-kit.PickerViewProps, 'theme' | 'children'> ]: tuya-panel-kit.tuya-panel-kit.PickerViewProps[P]} */ trait PopupPickerProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 值更改回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Value change callback
    * @defaultValue () => {}
    */
  var _onDataChange: js.UndefOr[js.Function2[/* newValue */ String | Double, /* idx */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 数据源
    * @types <a targe="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L3022">PickerDataProps[][] | PickerDataProps[]</a>
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description DataSource
    * @types <a targe="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L3022">PickerDataProps[][] | PickerDataProps[]</a>
    * @defaultValue []
    */
  var dataSource: js.UndefOr[js.Array[js.Array[PickerDataProps] | PickerDataProps]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位标志
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description Picker label
    * @defaultValue []
    */
  var label: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位标志相对位置
    * @defaultValue 22
    */
  /**
    * @language en-US
    * @description The offset of the label from picker
    * @defaultValue 22
    */
  var labelOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 确认回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Confirm callback
    * @defaultValue () => {}
    */
  var onConfirm: js.UndefOr[js.Function3[/* data */ Any, /* idx */ Double, /* args */ `10`, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 值更改回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Value change callback
    * @defaultValue () => {}
    */
  var onValueChange: js.UndefOr[js.Function2[/* newValue */ String | Double, /* idx */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker字体颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Picker font color
    * @defaultValue null
    */
  var pickerFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Picker style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 单位颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Picker unit color
    * @defaultValue null
    */
  var pickerUnitColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 弹框样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Picker wrapper style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var pickerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否只需要一个 picker
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is only one picker needed
    * @defaultValue true
    */
  var singlePicker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 弹框边距
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The spacing on both sides of the picker
    * @defaultValue 0
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 具体值
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description Value
    * @defaultValue []
    */
  var value: js.UndefOr[String | Double | Boolean | js.Array[String]] = js.undefined
}
object PopupPickerProps {
  
  inline def apply(): PopupPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupPickerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupPickerProps] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: js.Array[js.Array[PickerDataProps] | PickerDataProps]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: (js.Array[PickerDataProps] | PickerDataProps)*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setLabel(value: String | js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setOnConfirm(value: (/* data */ Any, /* idx */ Double, /* args */ `10`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction3(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setOnValueChange(value: (/* newValue */ String | Double, /* idx */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setPickerFontColor(value: String): Self = StObject.set(x, "pickerFontColor", value.asInstanceOf[js.Any])
    
    inline def setPickerFontColorUndefined: Self = StObject.set(x, "pickerFontColor", js.undefined)
    
    inline def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
    
    inline def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
    
    inline def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
    
    inline def setPickerUnitColor(value: String): Self = StObject.set(x, "pickerUnitColor", value.asInstanceOf[js.Any])
    
    inline def setPickerUnitColorUndefined: Self = StObject.set(x, "pickerUnitColor", js.undefined)
    
    inline def setPickerWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setPickerWrapperStyleNull: Self = StObject.set(x, "pickerWrapperStyle", null)
    
    inline def setPickerWrapperStyleUndefined: Self = StObject.set(x, "pickerWrapperStyle", js.undefined)
    
    inline def setSinglePicker(value: Boolean): Self = StObject.set(x, "singlePicker", value.asInstanceOf[js.Any])
    
    inline def setSinglePickerUndefined: Self = StObject.set(x, "singlePicker", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setValue(value: String | Double | Boolean | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def set_onDataChange(value: (/* newValue */ String | Double, /* idx */ Double) => Unit): Self = StObject.set(x, "_onDataChange", js.Any.fromFunction2(value))
    
    inline def set_onDataChangeUndefined: Self = StObject.set(x, "_onDataChange", js.undefined)
  }
}

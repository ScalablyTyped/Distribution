package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.divide
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import typings.tuyaPanelKit.tuyaPanelKitStrings.swiper
import typings.tuyaPanelKit.tuyaPanelKitStrings.warp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarGroupProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 子元素
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Sub element
    * @defaultValue undefined
    */
  var children: ReactNode
  
  /**
    * @language zh-CN
    * @description 按钮的大小
    * @defaultValue  'normal'
    */
  /**
    * @language en-US
    * @description The size of the button
    * @defaultValue  'normal'
    */
  var size: js.UndefOr[large | normal | small | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 组合底部栏的容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Container styles for combining bottom columns
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当 type 为 'swiper' 时的配置参数
    * @types <a target='_blank' href='https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/index.d.ts#L119'>CarouselProps</a>
    * @defaultValue { selectIndex: 0 }
    */
  /**
    * @language en-US
    * @description When type is swiper, this is the configuration of swiper.
    * @types <a target='_blank' href='https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/index.d.ts#L119'>CarouselProps</a>
    * @defaultValue { selectIndex: 0 }
    */
  var swiperConfig: js.UndefOr[CarouselProps] = js.undefined
  
  /**
    * @language zh-CN
    * @description 组合底部栏的类型
    * @defaultValue 'warp'
    */
  /**
    * @language en-US
    * @description Type of the bottom column of the group
    * @defaultValue 'warp'
    */
  var `type`: js.UndefOr[warp | swiper | divide] = js.undefined
}
object BarGroupProps {
  
  inline def apply(): BarGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupProps]
  }
  
  extension [Self <: BarGroupProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwiperConfig(value: CarouselProps): Self = StObject.set(x, "swiperConfig", value.asInstanceOf[js.Any])
    
    inline def setSwiperConfigUndefined: Self = StObject.set(x, "swiperConfig", js.undefined)
    
    inline def setType(value: warp | swiper | divide): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

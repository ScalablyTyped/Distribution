package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`11`
import typings.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typings.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typings.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标志
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Test flag
    * @defaultValue ''
    */
  var confirmAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 确认文字
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Confirmation text
    * @defaultValue ''
    */
  var confirmText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 确认文字样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Confirmation text style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue ''
    */
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description content 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description  Content container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Footer 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Footer container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 头部样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Header style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画配置
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2227'>MotionFadeProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2231'>MotionPullUpProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2235'>MotionScaleFadeInProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2243'>MotionScalePullDownProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2248'>MotionPushDownProps</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Animation configuration
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2227'>MotionFadeProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2231'>MotionPullUpProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2235'>MotionScaleFadeInProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2243'>MotionScalePullDownProps</a> | <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/9c5d06d5adde673df002d70c2c51a6f63213a282/types/tuya-panel-kit/index.d.ts#L2248'>MotionPushDownProps</a>
    * @defaultValue null
    */
  var motionConfig: js.UndefOr[
    MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画类型
    * @defaultValue 'ScaleFadeIn'
    */
  /**
    * @language en-US
    * @description Animation type
    * @defaultValue 'ScaleFadeIn'
    */
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown] = js.undefined
  
  /**
    * @language zh-CN
    * @description 确认点击回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of clicking the confirm button
    * @defaultValue () => {}
    */
  var onConfirm: js.UndefOr[js.Function2[/* data */ Any, /* args */ `11`, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Subtitle
    * @defaultValue undefined
    */
  var subTitle: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Subtitle style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var subTitleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 标题
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Title
    * @defaultValue undefined
    */
  var title: String
  
  /**
    * @language zh-CN
    * @description 标题超过多少行显示省略号
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description An ellipsis is shown if the title exceeds the specified number of lines
    * @defaultValue 2
    */
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 标题样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Title style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var titleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object DialogProps {
  
  inline def apply(title: String): DialogProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  extension [Self <: DialogProps](x: Self) {
    
    inline def setConfirmAccessibilityLabel(value: String): Self = StObject.set(x, "confirmAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setConfirmAccessibilityLabelUndefined: Self = StObject.set(x, "confirmAccessibilityLabel", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    inline def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    inline def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    inline def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setMotionConfig(
      value: MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    inline def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    inline def setOnConfirm(value: (/* data */ Any, /* args */ `11`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "subTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleStyleNull: Self = StObject.set(x, "subTitleStyle", null)
    
    inline def setSubTitleStyleUndefined: Self = StObject.set(x, "subTitleStyle", js.undefined)
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
  }
}

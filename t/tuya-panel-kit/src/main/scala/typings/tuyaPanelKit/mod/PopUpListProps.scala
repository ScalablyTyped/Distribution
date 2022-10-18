package typings.tuyaPanelKit.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.anon.AutoscrollToTopThreshold
import typings.reactNative.anon.AverageItemLength
import typings.reactNative.anon.Changed
import typings.reactNative.anon.DistanceFromEnd
import typings.reactNative.anon.Length
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PointProp
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNative.mod.ViewabilityConfigCallbackPair
import typings.reactNative.mod.ViewabilityConfigCallbackPairs
import typings.tuyaPanelKit.anon.BackIconColor
import typings.tuyaPanelKit.anon.Content
import typings.tuyaPanelKit.anon.`11`
import typings.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typings.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`landscape-left`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`landscape-right`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`on-drag`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`portrait-upside-down`
import typings.tuyaPanelKit.tuyaPanelKitStrings.always
import typings.tuyaPanelKit.tuyaPanelKitStrings.arrow
import typings.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.automatic
import typings.tuyaPanelKit.tuyaPanelKitStrings.black
import typings.tuyaPanelKit.tuyaPanelKitStrings.both
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.default
import typings.tuyaPanelKit.tuyaPanelKitStrings.end
import typings.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typings.tuyaPanelKit.tuyaPanelKitStrings.fast
import typings.tuyaPanelKit.tuyaPanelKitStrings.formSheet
import typings.tuyaPanelKit.tuyaPanelKitStrings.fullScreen
import typings.tuyaPanelKit.tuyaPanelKitStrings.handled
import typings.tuyaPanelKit.tuyaPanelKitStrings.interactive
import typings.tuyaPanelKit.tuyaPanelKitStrings.landscape
import typings.tuyaPanelKit.tuyaPanelKitStrings.never
import typings.tuyaPanelKit.tuyaPanelKitStrings.no
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.overFullScreen
import typings.tuyaPanelKit.tuyaPanelKitStrings.pageSheet
import typings.tuyaPanelKit.tuyaPanelKitStrings.polite
import typings.tuyaPanelKit.tuyaPanelKitStrings.portrait
import typings.tuyaPanelKit.tuyaPanelKitStrings.radio
import typings.tuyaPanelKit.tuyaPanelKitStrings.scrollableAxes
import typings.tuyaPanelKit.tuyaPanelKitStrings.singleCancel
import typings.tuyaPanelKit.tuyaPanelKitStrings.singleConfirm
import typings.tuyaPanelKit.tuyaPanelKitStrings.start
import typings.tuyaPanelKit.tuyaPanelKitStrings.switch
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import typings.tuyaPanelKit.tuyaPanelKitStrings.white
import typings.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent tuya-panel-kit.tuya-panel-kit.PopupProps */
/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.TYFlatListProps<{}>, 'renderItem' | 'data'> */
trait PopUpListProps extends StObject {
  
  var CellRendererComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var ItemSeparatorComponent: js.UndefOr[ComponentType[Any] | Null] = js.undefined
  
  var ListEmptyComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
  var ListFooterComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
  var ListFooterComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var ListHeaderComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
  var ListHeaderComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var StickyHeaderComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 值改变的回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of value change
    * @defaultValue () => {}
    */
  var _onDataChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | js.Array[String]], Unit]] = js.undefined
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var activeIdx: js.UndefOr[Double] = js.undefined
  
  var alignContainer: js.UndefOr[top | center | bottom] = js.undefined
  
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
  
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var animationType: js.UndefOr[fade_ | none_] = js.undefined
  
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  
  var automaticallyAdjustKeyboardInsets: js.UndefOr[Boolean] = js.undefined
  
  var automaticallyAdjustsScrollIndicatorInsets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 返回 Icon 颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Back icon color
    * @defaultValue null
    */
  var backIconColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 返回按钮
    * @defaultValue 'Back'
    */
  /**
    * @language en-US
    * @description Back Text
    * @defaultValue 'Back'
    */
  var backText: js.UndefOr[String] = js.undefined
  
  var bounces: js.UndefOr[Boolean] = js.undefined
  
  var bouncesZoom: js.UndefOr[Boolean] = js.undefined
  
  var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 取消文案
    * @defaultValue "Cancel"
    */
  /**
    * @language en-US
    * @description Cancel Text
    * @defaultValue "Cancel"
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 取消文案样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Cancellation text style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var centerContent: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 确认文案
    * @defaultValue "Confirm"
    */
  /**
    * @language en-US
    * @description Confirm Text
    * @defaultValue "Confirm"
    */
  var confirmText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 确认文案样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Confirmation text style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容是否居中
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Whether the content is centered
    * @defaultValue null
    */
  var contentCenter: js.UndefOr[Boolean] = js.undefined
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var contentInset: js.UndefOr[Insets] = js.undefined
  
  var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
  
  var contentOffset: js.UndefOr[PointProp] = js.undefined
  
  /**
    * @language zh-CN
    * @description 数据源
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2770">ListDate[]</a>
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description DataSource
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2770">ListDate[]</a>
    * @defaultValue []
    */
  var dataSource: js.UndefOr[js.Array[ListDate]] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var decelerationRate: js.UndefOr[fast | normal | Double] = js.undefined
  
  var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
  
  var disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined
  
  var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined
  
  var disableVirtualization: js.UndefOr[Boolean] = js.undefined
  
  var endFillColor: js.UndefOr[ColorValue] = js.undefined
  
  var extraData: js.UndefOr[Any] = js.undefined
  
  var fadingEdgeLength: js.UndefOr[Double] = js.undefined
  
  var flatListRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义底部
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom footer
    * @defaultValue null
    */
  var footer: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description footer 容器显示状态，显示全部、只显示确认、只显示取消
    * @defaultValue 'both'
    */
  /**
    * @language en-US
    * @description footer container display status.
    * @defaultValue 'both'
    */
  var footerType: js.UndefOr[both | singleConfirm | singleCancel] = js.undefined
  
  /**
    * @language zh-CN
    * @description 底部样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Footer container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var getItem: js.UndefOr[js.Function2[/* data */ Any, /* index */ Double, js.Object]] = js.undefined
  
  var getItemCount: js.UndefOr[js.Function1[/* data */ Any, Double]] = js.undefined
  
  var getItemLayout: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Array[js.Object] | Null], /* index */ Double, Length]
  ] = js.undefined
  
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var horizontal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置 type 为 radio 时选中图标的颜色
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Color of the icon selected when type is set to radio
    * @defaultValue ''
    */
  var iconTintColor: js.UndefOr[String] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var indicatorStyle: js.UndefOr[default | black | white] = js.undefined
  
  var initialNumToRender: js.UndefOr[Double] = js.undefined
  
  var initialScrollIndex: js.UndefOr[Double | Null] = js.undefined
  
  var invertStickyHeaders: js.UndefOr[Boolean] = js.undefined
  
  var inverted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否垂直居中
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is it vertically centered
    * @defaultValue false
    */
  var isAlign: js.UndefOr[Boolean] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var keyExtractor: js.UndefOr[js.Function2[/* item */ js.Object, /* index */ Double, String]] = js.undefined
  
  var keyboardDismissMode: js.UndefOr[none_ | interactive | `on-drag`] = js.undefined
  
  var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.undefined
  
  var legacyImplementation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表弹窗样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description List pop up style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var listItemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var listKey: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表弹窗样式
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description List pop up style
    * @defaultValue null
    */
  var listWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.undefined
  
  var mask: js.UndefOr[Boolean] = js.undefined
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最大列表数量
    * @defaultValue 5
    */
  /**
    * @language en-US
    * @description Maximum number of lists
    * @defaultValue 5
    */
  var maxItemNum: js.UndefOr[Double] = js.undefined
  
  var maxToRenderPerBatch: js.UndefOr[Double] = js.undefined
  
  var maximumZoomScale: js.UndefOr[Double] = js.undefined
  
  var minimumZoomScale: js.UndefOr[Double] = js.undefined
  
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画配置
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2438">MotionScaleFadeInProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2430">MotionFadeProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2434">MotionPullUpProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2446">MotionScalePullDownProps</a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Painting configuration
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2438">MotionScaleFadeInProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2430">MotionFadeProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2434">MotionPullUpProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2446">MotionScalePullDownProps</a>
    * @defaultValue {}
    */
  var motionConfig: js.UndefOr[
    MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画类型
    * @defaultValue "PullUp"
    */
  /**
    * @language en-US
    * @description Animation type
    * @defaultValue "PullUp"
    */
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  var nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var numColumns: js.UndefOr[Double] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 返回回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of back
    * @defaultValue () => {}
    */
  var onBack: js.UndefOr[js.Function1[/* args */ `11`, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 取消点击回调
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Callback of clicking the cancel button
    * @defaultValue null
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.undefined
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
  
  var onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 遮罩层点击
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Mask layer Click
    * @defaultValue () => {}
    */
  var onMaskPress: js.UndefOr[js.Function1[/* args */ `11`, Unit]] = js.undefined
  
  var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onOrientationChange: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]] = js.undefined
  
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  
  var onRequestClose: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]] = js.undefined
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.undefined
  
  var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选中的回调函数
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of selecting the event
    * @defaultValue () => {}
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ String | Double, /* params */ js.UndefOr[`11`], Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 头部栏开关切换回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of switching the header bar button
    * @defaultValue () => {}
    */
  var onSwitchValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.undefined
  
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.undefined
  
  var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
  
  var pagingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var persistentScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  var pointerEvents: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.undefined
  
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  
  var progressViewOffset: js.UndefOr[Double] = js.undefined
  
  var refreshControl: js.UndefOr[ReactElement] = js.undefined
  
  var refreshing: js.UndefOr[Boolean | Null] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollEventThrottle: js.UndefOr[Double] = js.undefined
  
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
  
  var scrollPerfTag: js.UndefOr[String] = js.undefined
  
  var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置type为radio时选中的图标
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The icon selected when type is set to radio
    * @defaultValue null
    */
  var selectedIcon: js.UndefOr[ReactNode] = js.undefined
  
  var separatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示返回按钮
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is the return button displayed
    * @defaultValue false
    */
  var showBack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示头部栏与内容框的分割线
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to show the split line between the header bar and the content box
    * @defaultValue true
    */
  var showTitleDivider: js.UndefOr[Boolean] = js.undefined
  
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  var snapToAlignment: js.UndefOr[start | center | end] = js.undefined
  
  var snapToEnd: js.UndefOr[Boolean] = js.undefined
  
  var snapToInterval: js.UndefOr[Double] = js.undefined
  
  var snapToOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var snapToStart: js.UndefOr[Boolean] = js.undefined
  
  var statusBarTranslucent: js.UndefOr[Boolean] = js.undefined
  
  var stickyHeaderHiddenOnScroll: js.UndefOr[Boolean] = js.undefined
  
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 各部分的样式
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2969">styles</a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Style of each part
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2969">styles</a>
    * @defaultValue {}
    */
  var styles: js.UndefOr[Content] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description SubTitle
    * @defaultValue ''
    */
  var subTitle: js.UndefOr[String] = js.undefined
  
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 头部栏开关状态，若该值存在则头部栏将会显示 Switch 按钮
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The status of the header bar button. If the value exists, the header bar will display the Switch button.
    * @defaultValue undefined
    */
  var switchValue: js.UndefOr[Boolean] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 样式配置
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2925">theme</a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Style configuration
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2925">theme</a>
    * @defaultValue {}
    */
  var theme: js.UndefOr[BackIconColor] = js.undefined
  
  /**
    * @language zh-CN
    * @description Popup 头部标题
    * @defaultValue "Modal"
    */
  /**
    * @language en-US
    * @description Popup header title
    * @defaultValue "Modal"
    */
  var title: js.UndefOr[String | js.Array[String] | ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description Popup 头部标题样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Popup header title style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Popup 头部样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Popup header style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var titleWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表选择弹出层的类型
    * @defaultValue 'radio'
    */
  /**
    * @language en-US
    * @description List selection popup type
    * @defaultValue 'radio'
    */
  var `type`: js.UndefOr[radio | switch | arrow] = js.undefined
  
  var updateCellsBatchingPeriod: js.UndefOr[Double] = js.undefined
  
  var useART: js.UndefOr[Boolean] = js.undefined
  
  var useKeyboardView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选中的值
    * @defaultValue -1
    */
  /**
    * @language en-US
    * @description The selected value. Multiple selection type is array, and single selection is string or number
    * @defaultValue -1
    */
  var value: js.UndefOr[String | Double | (js.Array[Double | String])] = js.undefined
  
  var viewabilityConfig: js.UndefOr[Any] = js.undefined
  
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var windowSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var wrapperStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var zoomScale: js.UndefOr[Double] = js.undefined
}
object PopUpListProps {
  
  inline def apply(): PopUpListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopUpListProps]
  }
  
  extension [Self <: PopUpListProps](x: Self) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setActiveIdx(value: Double): Self = StObject.set(x, "activeIdx", value.asInstanceOf[js.Any])
    
    inline def setActiveIdxUndefined: Self = StObject.set(x, "activeIdx", js.undefined)
    
    inline def setAlignContainer(value: top | center | bottom): Self = StObject.set(x, "alignContainer", value.asInstanceOf[js.Any])
    
    inline def setAlignContainerUndefined: Self = StObject.set(x, "alignContainer", js.undefined)
    
    inline def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
    
    inline def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimationType(value: fade_ | none_): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
    
    inline def setAutomaticallyAdjustKeyboardInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustKeyboardInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", js.undefined)
    
    inline def setAutomaticallyAdjustsScrollIndicatorInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustsScrollIndicatorInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", js.undefined)
    
    inline def setBackIconColor(value: String): Self = StObject.set(x, "backIconColor", value.asInstanceOf[js.Any])
    
    inline def setBackIconColorUndefined: Self = StObject.set(x, "backIconColor", js.undefined)
    
    inline def setBackText(value: String): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
    
    inline def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
    
    inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    inline def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
    
    inline def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
    
    inline def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
    
    inline def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelTextStyle", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyleNull: Self = StObject.set(x, "cancelTextStyle", null)
    
    inline def setCancelTextStyleUndefined: Self = StObject.set(x, "cancelTextStyle", js.undefined)
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setCellRendererComponent(value: ComponentType[Any]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    inline def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
    
    inline def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
    
    inline def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
    
    inline def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    inline def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setContentCenter(value: Boolean): Self = StObject.set(x, "contentCenter", value.asInstanceOf[js.Any])
    
    inline def setContentCenterUndefined: Self = StObject.set(x, "contentCenter", js.undefined)
    
    inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    inline def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setContentOffset(value: PointProp): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    inline def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    inline def setDataSource(value: js.Array[ListDate]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: ListDate*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
    
    inline def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
    
    inline def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
    
    inline def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    inline def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
    
    inline def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
    
    inline def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
    
    inline def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
    
    inline def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
    
    inline def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
    
    inline def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
    
    inline def setFlatListRef(value: () => Unit): Self = StObject.set(x, "flatListRef", js.Any.fromFunction0(value))
    
    inline def setFlatListRefUndefined: Self = StObject.set(x, "flatListRef", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterType(value: both | singleConfirm | singleCancel): Self = StObject.set(x, "footerType", value.asInstanceOf[js.Any])
    
    inline def setFooterTypeUndefined: Self = StObject.set(x, "footerType", js.undefined)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    inline def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    inline def setGetItem(value: (/* data */ Any, /* index */ Double) => js.Object): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
    
    inline def setGetItemCount(value: /* data */ Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
    
    inline def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
    
    inline def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[js.Object] | Null], /* index */ Double) => Length): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    inline def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    inline def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
    
    inline def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
    
    inline def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setIconTintColor(value: String): Self = StObject.set(x, "iconTintColor", value.asInstanceOf[js.Any])
    
    inline def setIconTintColorUndefined: Self = StObject.set(x, "iconTintColor", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIndicatorStyle(value: default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    inline def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
    
    inline def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
    
    inline def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
    
    inline def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
    
    inline def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
    
    inline def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedNull: Self = StObject.set(x, "inverted", null)
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    inline def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setItemSeparatorComponent(value: ComponentType[Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    inline def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    inline def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    inline def setKeyExtractor(value: (/* item */ js.Object, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
    
    inline def setKeyboardDismissMode(value: none_ | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
    
    inline def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    inline def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    inline def setListEmptyComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    inline def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
    
    inline def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
    
    inline def setListFooterComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    inline def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
    
    inline def setListFooterComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    inline def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
    
    inline def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
    
    inline def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
    
    inline def setListHeaderComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
    
    inline def setListHeaderComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    inline def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
    
    inline def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
    
    inline def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
    
    inline def setListItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listItemStyle", value.asInstanceOf[js.Any])
    
    inline def setListItemStyleNull: Self = StObject.set(x, "listItemStyle", null)
    
    inline def setListItemStyleUndefined: Self = StObject.set(x, "listItemStyle", js.undefined)
    
    inline def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    inline def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    inline def setListWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setListWrapperStyleNull: Self = StObject.set(x, "listWrapperStyle", null)
    
    inline def setListWrapperStyleUndefined: Self = StObject.set(x, "listWrapperStyle", js.undefined)
    
    inline def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    inline def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
    
    inline def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    inline def setMaskStyleNull: Self = StObject.set(x, "maskStyle", null)
    
    inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaxItemNum(value: Double): Self = StObject.set(x, "maxItemNum", value.asInstanceOf[js.Any])
    
    inline def setMaxItemNumUndefined: Self = StObject.set(x, "maxItemNum", js.undefined)
    
    inline def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    inline def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
    
    inline def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
    
    inline def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
    
    inline def setModalChildStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalChildStyle", value.asInstanceOf[js.Any])
    
    inline def setModalChildStyleNull: Self = StObject.set(x, "modalChildStyle", null)
    
    inline def setModalChildStyleUndefined: Self = StObject.set(x, "modalChildStyle", js.undefined)
    
    inline def setMotionConfig(value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    inline def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
    
    inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBack(value: /* args */ `11` => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
    
    inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnConfirm(value: (/* data */ Any, /* args */ `11`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
    
    inline def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
    
    inline def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    inline def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
    
    inline def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
    
    inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMaskPress(value: /* args */ `11` => Unit): Self = StObject.set(x, "onMaskPress", js.Any.fromFunction1(value))
    
    inline def setOnMaskPressUndefined: Self = StObject.set(x, "onMaskPress", js.undefined)
    
    inline def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    inline def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnOrientationChange(value: /* event */ NativeSyntheticEvent[Any] => Unit): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1(value))
    
    inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
    
    inline def setOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    inline def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setOnRequestClose(value: /* event */ NativeSyntheticEvent[Any] => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    inline def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
    
    inline def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
    
    inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    inline def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
    
    inline def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
    
    inline def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
    
    inline def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSelect(value: (/* value */ String | Double, /* params */ js.UndefOr[`11`]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnShow(value: /* event */ NativeSyntheticEvent[Any] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnSwitchValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onSwitchValueChange", js.Any.fromFunction1(value))
    
    inline def setOnSwitchValueChangeUndefined: Self = StObject.set(x, "onSwitchValueChange", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
    
    inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    inline def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
    
    inline def setOnlyLastModalVisible(value: Boolean): Self = StObject.set(x, "onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    inline def setOnlyLastModalVisibleUndefined: Self = StObject.set(x, "onlyLastModalVisible", js.undefined)
    
    inline def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
    
    inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
    
    inline def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    inline def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
    
    inline def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
    
    inline def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
    
    inline def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    inline def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
    
    inline def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
    
    inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
    
    inline def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    inline def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    inline def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
    
    inline def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
    
    inline def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
    
    inline def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    inline def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    inline def setSelectedIcon(value: ReactNode): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    inline def setSeparatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
    
    inline def setSeparatorStyleNull: Self = StObject.set(x, "separatorStyle", null)
    
    inline def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setShowBack(value: Boolean): Self = StObject.set(x, "showBack", value.asInstanceOf[js.Any])
    
    inline def setShowBackUndefined: Self = StObject.set(x, "showBack", js.undefined)
    
    inline def setShowTitleDivider(value: Boolean): Self = StObject.set(x, "showTitleDivider", value.asInstanceOf[js.Any])
    
    inline def setShowTitleDividerUndefined: Self = StObject.set(x, "showTitleDivider", js.undefined)
    
    inline def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
    inline def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
    
    inline def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
    
    inline def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
    
    inline def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
    
    inline def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
    
    inline def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
    
    inline def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
    
    inline def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
    
    inline def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value*))
    
    inline def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
    
    inline def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
    
    inline def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
    
    inline def setStatusBarTranslucentUndefined: Self = StObject.set(x, "statusBarTranslucent", js.undefined)
    
    inline def setStickyHeaderComponent(value: ComponentType[Any]): Self = StObject.set(x, "StickyHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderComponentUndefined: Self = StObject.set(x, "StickyHeaderComponent", js.undefined)
    
    inline def setStickyHeaderHiddenOnScroll(value: Boolean): Self = StObject.set(x, "stickyHeaderHiddenOnScroll", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderHiddenOnScrollUndefined: Self = StObject.set(x, "stickyHeaderHiddenOnScroll", js.undefined)
    
    inline def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
    
    inline def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value*))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: Content): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
    
    inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
    
    inline def setSupportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
    
    inline def setSwitchValue(value: Boolean): Self = StObject.set(x, "switchValue", value.asInstanceOf[js.Any])
    
    inline def setSwitchValueUndefined: Self = StObject.set(x, "switchValue", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: BackIconColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String | js.Array[String] | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyleNull: Self = StObject.set(x, "titleTextStyle", null)
    
    inline def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleWrapperStyleNull: Self = StObject.set(x, "titleWrapperStyle", null)
    
    inline def setTitleWrapperStyleUndefined: Self = StObject.set(x, "titleWrapperStyle", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setType(value: radio | switch | arrow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setUseKeyboardView(value: Boolean): Self = StObject.set(x, "useKeyboardView", value.asInstanceOf[js.Any])
    
    inline def setUseKeyboardViewUndefined: Self = StObject.set(x, "useKeyboardView", js.undefined)
    
    inline def setValue(value: String | Double | (js.Array[Double | String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setViewabilityConfig(value: Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
    
    inline def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value*))
    
    inline def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    
    inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    
    inline def set_onDataChange(value: /* value */ js.UndefOr[String | js.Array[String]] => Unit): Self = StObject.set(x, "_onDataChange", js.Any.fromFunction1(value))
    
    inline def set_onDataChangeUndefined: Self = StObject.set(x, "_onDataChange", js.undefined)
  }
}

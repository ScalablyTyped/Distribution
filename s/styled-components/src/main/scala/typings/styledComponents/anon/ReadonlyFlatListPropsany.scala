package typings.styledComponents.anon

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.anon.AutoscrollToTopThreshold
import typings.reactNative.anon.AverageItemLength
import typings.reactNative.anon.Changed
import typings.reactNative.anon.DistanceFromEnd
import typings.reactNative.anon.Index
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.ListRenderItem
import typings.reactNative.mod.ListRenderItemInfo
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PointPropType
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNative.mod.ViewabilityConfigCallbackPair
import typings.reactNative.mod.ViewabilityConfigCallbackPairs
import typings.styledComponents.styledComponentsStrings.`box-none`
import typings.styledComponents.styledComponentsStrings.`box-only`
import typings.styledComponents.styledComponentsStrings.`no-hide-descendants`
import typings.styledComponents.styledComponentsStrings.`on-drag`
import typings.styledComponents.styledComponentsStrings.always
import typings.styledComponents.styledComponentsStrings.assertive
import typings.styledComponents.styledComponentsStrings.auto
import typings.styledComponents.styledComponentsStrings.automatic
import typings.styledComponents.styledComponentsStrings.black
import typings.styledComponents.styledComponentsStrings.button
import typings.styledComponents.styledComponentsStrings.center
import typings.styledComponents.styledComponentsStrings.default
import typings.styledComponents.styledComponentsStrings.end
import typings.styledComponents.styledComponentsStrings.fast
import typings.styledComponents.styledComponentsStrings.handled
import typings.styledComponents.styledComponentsStrings.interactive
import typings.styledComponents.styledComponentsStrings.never
import typings.styledComponents.styledComponentsStrings.no
import typings.styledComponents.styledComponentsStrings.none
import typings.styledComponents.styledComponentsStrings.normal
import typings.styledComponents.styledComponentsStrings.polite
import typings.styledComponents.styledComponentsStrings.radiobutton_checked
import typings.styledComponents.styledComponentsStrings.radiobutton_unchecked
import typings.styledComponents.styledComponentsStrings.scrollableAxes
import typings.styledComponents.styledComponentsStrings.start
import typings.styledComponents.styledComponentsStrings.white
import typings.styledComponents.styledComponentsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.FlatListProps</ * import warning: RewrittenClass.unapply cls was tparam ItemT * / any>> */
trait ReadonlyFlatListPropsany extends StObject {
  
  val CellRendererComponent: js.UndefOr[ComponentType[js.Any]] = js.undefined
  
  val ItemSeparatorComponent: js.UndefOr[ComponentType[js.Any] | Null] = js.undefined
  
  val ListEmptyComponent: js.UndefOr[ComponentType[js.Any] | ReactElement | Null] = js.undefined
  
  val ListFooterComponent: js.UndefOr[ComponentType[js.Any] | ReactElement | Null] = js.undefined
  
  val ListFooterComponentStyle: js.UndefOr[ViewStyle | Null] = js.undefined
  
  val ListHeaderComponent: js.UndefOr[ComponentType[js.Any] | ReactElement | Null] = js.undefined
  
  val ListHeaderComponentStyle: js.UndefOr[ViewStyle | Null] = js.undefined
  
  val accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  val accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  
  val accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  val accessibilityHint: js.UndefOr[String] = js.undefined
  
  val accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  val accessibilityLabel: js.UndefOr[String] = js.undefined
  
  val accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  val accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  val accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  val accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  
  val accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  val accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  val accessible: js.UndefOr[Boolean] = js.undefined
  
  val alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
  
  val alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
  
  val automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  
  val bounces: js.UndefOr[Boolean] = js.undefined
  
  val bouncesZoom: js.UndefOr[Boolean] = js.undefined
  
  val canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
  
  val centerContent: js.UndefOr[Boolean] = js.undefined
  
  val collapsable: js.UndefOr[Boolean] = js.undefined
  
  val columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  val contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  val contentInset: js.UndefOr[Insets] = js.undefined
  
  val contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
  
  val contentOffset: js.UndefOr[PointPropType] = js.undefined
  
  val data: js.UndefOr[
    (js.Array[/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any]) | Null
  ] = js.undefined
  
  val debug: js.UndefOr[Boolean] = js.undefined
  
  val decelerationRate: js.UndefOr[fast | normal | Double] = js.undefined
  
  val directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
  
  val disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined
  
  val disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined
  
  val disableVirtualization: js.UndefOr[Boolean] = js.undefined
  
  val endFillColor: js.UndefOr[ColorValue] = js.undefined
  
  val extraData: js.UndefOr[js.Any] = js.undefined
  
  val fadingEdgeLength: js.UndefOr[Double] = js.undefined
  
  val focusable: js.UndefOr[Boolean] = js.undefined
  
  val getItem: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ Double, 
      /* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any
    ]
  ] = js.undefined
  
  val getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, Double]] = js.undefined
  
  val getItemLayout: js.UndefOr[
    js.Function2[
      /* data */ js.UndefOr[
        (js.Array[/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any]) | Null
      ], 
      /* index */ Double, 
      Index
    ]
  ] = js.undefined
  
  val hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  val hitSlop: js.UndefOr[Insets] = js.undefined
  
  val horizontal: js.UndefOr[Boolean | Null] = js.undefined
  
  val importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  val indicatorStyle: js.UndefOr[default | black | white] = js.undefined
  
  val initialNumToRender: js.UndefOr[Double] = js.undefined
  
  val initialScrollIndex: js.UndefOr[Double | Null] = js.undefined
  
  val invertStickyHeaders: js.UndefOr[Boolean] = js.undefined
  
  val inverted: js.UndefOr[Boolean | Null] = js.undefined
  
  val isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  val keyExtractor: js.UndefOr[
    js.Function2[
      /* import warning: RewrittenClass.unapply cls was tparam ItemT */ /* item */ js.Any, 
      /* index */ Double, 
      String
    ]
  ] = js.undefined
  
  val keyboardDismissMode: js.UndefOr[none | interactive | `on-drag`] = js.undefined
  
  val keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.undefined
  
  val legacyImplementation: js.UndefOr[Boolean] = js.undefined
  
  val listKey: js.UndefOr[String] = js.undefined
  
  val maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.undefined
  
  val maxToRenderPerBatch: js.UndefOr[Double] = js.undefined
  
  val maximumZoomScale: js.UndefOr[Double] = js.undefined
  
  val minimumZoomScale: js.UndefOr[Double] = js.undefined
  
  val nativeID: js.UndefOr[String] = js.undefined
  
  val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  val nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  val numColumns: js.UndefOr[Double] = js.undefined
  
  val onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  val onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.undefined
  
  val onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
  
  val onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
  
  val onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  val onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  val onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  val onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  val onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  val onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  
  val onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  val onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  val onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  val onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  val onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.undefined
  
  val onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  val onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  val onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  val onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  val onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.undefined
  
  val overScrollMode: js.UndefOr[auto | always | never] = js.undefined
  
  val pagingEnabled: js.UndefOr[Boolean] = js.undefined
  
  val persistentScrollbar: js.UndefOr[Boolean] = js.undefined
  
  val pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  val pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  val progressViewOffset: js.UndefOr[Double] = js.undefined
  
  val refreshControl: js.UndefOr[ReactElement] = js.undefined
  
  val refreshing: js.UndefOr[Boolean | Null] = js.undefined
  
  val removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  val renderItem: js.UndefOr[
    (ListRenderItem[/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any]) | Null
  ] = js.undefined
  
  val renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.undefined
  
  val renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  val scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  val scrollEventThrottle: js.UndefOr[Double] = js.undefined
  
  val scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
  
  val scrollPerfTag: js.UndefOr[String] = js.undefined
  
  val scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
  
  val scrollsToTop: js.UndefOr[Boolean] = js.undefined
  
  val shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  val showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  val showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  val snapToAlignment: js.UndefOr[start | center | end] = js.undefined
  
  val snapToEnd: js.UndefOr[Boolean] = js.undefined
  
  val snapToInterval: js.UndefOr[Double] = js.undefined
  
  val snapToOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  val snapToStart: js.UndefOr[Boolean] = js.undefined
  
  val stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  val testID: js.UndefOr[String] = js.undefined
  
  val tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  val tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  val tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  val tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  val tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  
  val updateCellsBatchingPeriod: js.UndefOr[Double] = js.undefined
  
  val viewabilityConfig: js.UndefOr[js.Any] = js.undefined
  
  val viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
  
  val windowSize: js.UndefOr[Double] = js.undefined
  
  val zoomScale: js.UndefOr[Double] = js.undefined
}
object ReadonlyFlatListPropsany {
  
  @scala.inline
  def apply(): ReadonlyFlatListPropsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyFlatListPropsany]
  }
  
  @scala.inline
  implicit class ReadonlyFlatListPropsanyMutableBuilder[Self <: ReadonlyFlatListPropsany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
    
    @scala.inline
    def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
    
    @scala.inline
    def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    @scala.inline
    def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
    
    @scala.inline
    def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
    
    @scala.inline
    def setCellRendererComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
    
    @scala.inline
    def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
    
    @scala.inline
    def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    @scala.inline
    def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
    
    @scala.inline
    def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
    
    @scala.inline
    def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    @scala.inline
    def setContentOffset(value: PointPropType): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any)*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
    
    @scala.inline
    def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
    
    @scala.inline
    def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
    
    @scala.inline
    def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
    
    @scala.inline
    def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
    
    @scala.inline
    def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setGetItem(
      value: (/* data */ js.Any, /* index */ Double) => /* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any
    ): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemCount(value: /* data */ js.Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
    
    @scala.inline
    def setGetItemLayout(
      value: (/* data */ js.UndefOr[
          (js.Array[/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any]) | Null
        ], /* index */ Double) => Index
    ): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    @scala.inline
    def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    @scala.inline
    def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
    
    @scala.inline
    def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
    
    @scala.inline
    def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
    
    @scala.inline
    def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertedNull: Self = StObject.set(x, "inverted", null)
    
    @scala.inline
    def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    @scala.inline
    def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setKeyExtractor(
      value: (/* import warning: RewrittenClass.unapply cls was tparam ItemT */ /* item */ js.Any, /* index */ Double) => String
    ): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    @scala.inline
    def setListEmptyComponent(value: ComponentType[js.Any] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
    
    @scala.inline
    def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
    
    @scala.inline
    def setListFooterComponent(value: ComponentType[js.Any] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
    
    @scala.inline
    def setListFooterComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
    
    @scala.inline
    def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
    
    @scala.inline
    def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
    
    @scala.inline
    def setListHeaderComponent(value: ComponentType[js.Any] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
    
    @scala.inline
    def setListHeaderComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
    
    @scala.inline
    def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
    
    @scala.inline
    def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
    
    @scala.inline
    def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    @scala.inline
    def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
    
    @scala.inline
    def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
    
    @scala.inline
    def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
    
    @scala.inline
    def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
    
    @scala.inline
    def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
    
    @scala.inline
    def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
    
    @scala.inline
    def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
    
    @scala.inline
    def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
    
    @scala.inline
    def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
    
    @scala.inline
    def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    @scala.inline
    def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
    
    @scala.inline
    def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    @scala.inline
    def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
    
    @scala.inline
    def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
    
    @scala.inline
    def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderItem(
      value: /* info */ ListRenderItemInfo[/* import warning: RewrittenClass.unapply cls was tparam ItemT */ js.Any] => ReactElement | Null
    ): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderItemNull: Self = StObject.set(x, "renderItem", null)
    
    @scala.inline
    def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    
    @scala.inline
    def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    @scala.inline
    def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    @scala.inline
    def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
    
    @scala.inline
    def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
    @scala.inline
    def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
    
    @scala.inline
    def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
    
    @scala.inline
    def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
    
    @scala.inline
    def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
    
    @scala.inline
    def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value :_*))
    
    @scala.inline
    def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
    
    @scala.inline
    def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
    
    @scala.inline
    def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
    
    @scala.inline
    def setViewabilityConfig(value: js.Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
    
    @scala.inline
    def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value :_*))
    
    @scala.inline
    def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
    
    @scala.inline
    def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    
    @scala.inline
    def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
  }
}

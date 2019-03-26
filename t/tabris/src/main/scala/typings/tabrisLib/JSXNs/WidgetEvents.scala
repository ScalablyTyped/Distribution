package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetEvents extends NativeObjectEvents {
  /**
    * Fired when the [*background*](#background) property has changed.
    * @param value The new value of [*background*](#background).
    */
  var onBackgroundChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Color], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*backgroundImage*](#backgroundImage) property has changed.
    * @param value The new value of [*backgroundImage*](#backgroundImage).
    */
  var onBackgroundImageChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Image], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*baseline*](#baseline) property has changed.
    * @param value The new value of [*baseline*](#baseline).
    */
  var onBaselineChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Widget | tabrisLib.Selector], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*bottom*](#bottom) property has changed.
    * @param value The new value of [*bottom*](#bottom).
    */
  var onBottomChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*bounds*](#bounds) property has changed.
    * @param value The new value of [*bounds*](#bounds).
    */
  var onBoundsChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Bounds], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*centerX*](#centerX) property has changed.
    * @param value The new value of [*centerX*](#centerX).
    */
  var onCenterXChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*centerY*](#centerY) property has changed.
    * @param value The new value of [*centerY*](#centerY).
    */
  var onCenterYChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*class*](#class) property has changed.
    * @param value The new value of [*class*](#class).
    */
  var onClassChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*classList*](#classList) property has changed.
    * @param value The new value of [*classList*](#classList).
    */
  var onClassListChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Array[java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*cornerRadius*](#cornerRadius) property has changed.
    * @param value The new value of [*cornerRadius*](#cornerRadius).
    */
  var onCornerRadiusChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*data*](#data) property has changed.
    * @param value The new value of [*data*](#data).
    */
  var onDataChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the widget is about to be disposed. At this point the widget and its children are still
    * accessible.
    */
  var onDispose: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.Widget], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*elevation*](#elevation) property has changed.
    * @param value The new value of [*elevation*](#elevation).
    */
  var onElevationChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*enabled*](#enabled) property has changed.
    * @param value The new value of [*enabled*](#enabled).
    */
  var onEnabledChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*font*](#font) property has changed.
    * @param value The new value of [*font*](#font).
    */
  var onFontChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Font], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*height*](#height) property has changed.
    * @param value The new value of [*height*](#height).
    */
  var onHeightChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*highlightOnTouch*](#highlightOnTouch) property has changed.
    * @param value The new value of [*highlightOnTouch*](#highlightOnTouch).
    */
  var onHighlightOnTouchChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*id*](#id) property has changed.
    * @param value The new value of [*id*](#id).
    */
  var onIdChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*layoutData*](#layoutData) property has changed.
    * @param value The new value of [*layoutData*](#layoutData).
    */
  var onLayoutDataChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.LayoutData], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*left*](#left) property has changed.
    * @param value The new value of [*left*](#left).
    */
  var onLeftChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired after pressing a widget for a specific amount of time (about a second), and again on lifting
    * the finger.
    */
  var onLongpress: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetLongpressEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*opacity*](#opacity) property has changed.
    * @param value The new value of [*opacity*](#opacity).
    */
  var onOpacityChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired continuously after a finger touching the widget moved for a certain distance.
    */
  var onPan: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving down.
    */
  var onPanDown: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving left or right.
    */
  var onPanHorizontal: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving left.
    */
  var onPanLeft: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving right.
    */
  var onPanRight: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving up.
    */
  var onPanUp: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving up or down.
    */
  var onPanVertical: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the widget's size has changed. You can use this event to apply new
    * [*layoutData*](#layoutdata).
    */
  var onResize: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetResizeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*right*](#right) property has changed.
    * @param value The new value of [*right*](#right).
    */
  var onRightChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when a finger moves down quickly.
    */
  var onSwipeDown: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger moves left quickly.
    */
  var onSwipeLeft: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger moves right quickly.
    */
  var onSwipeRight: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger moves up quickly.
    */
  var onSwipeUp: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired once when a finger briefly touched the widget.
    */
  var onTap: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetTapEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*top*](#top) property has changed.
    * @param value The new value of [*top*](#top).
    */
  var onTopChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired instead of touchEnd when the touch ends on another widget than it started on.
    */
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a touch ends on the same widget than it started on.
    */
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired repeatedly while swiping across the screen.
    */
  var onTouchMove: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a widget is touched. See [Touch Events](../touch.md).
    */
  var onTouchStart: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*transform*](#transform) property has changed.
    * @param value The new value of [*transform*](#transform).
    */
  var onTransformChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Transformation], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*visible*](#visible) property has changed.
    * @param value The new value of [*visible*](#visible).
    */
  var onVisibleChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*width*](#width) property has changed.
    * @param value The new value of [*width*](#width).
    */
  var onWidthChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*win_theme*](#win_theme) property has changed.
    * @param value The new value of [*win_theme*](#win_theme).
    */
  var onWin_themeChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
}

object WidgetEvents {
  @scala.inline
  def apply(
    onBackgroundChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Color] => scala.Unit = null,
    onBackgroundImageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Image] => scala.Unit = null,
    onBaselineChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Widget | tabrisLib.Selector] => scala.Unit = null,
    onBottomChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onBoundsChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Bounds] => scala.Unit = null,
    onCenterXChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset] => scala.Unit = null,
    onCenterYChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset] => scala.Unit = null,
    onClassChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null,
    onClassListChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Array[java.lang.String]] => scala.Unit = null,
    onCornerRadiusChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onDataChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Object] => scala.Unit = null,
    onDispose: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.Widget] => scala.Unit = null,
    onElevationChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onEnabledChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onFontChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Font] => scala.Unit = null,
    onHeightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension] => scala.Unit = null,
    onHighlightOnTouchChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onIdChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null,
    onLayoutDataChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.LayoutData] => scala.Unit = null,
    onLeftChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onLongpress: /* event */ tabrisLib.tabrisMod.WidgetLongpressEvent => scala.Unit = null,
    onOpacityChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onPan: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanDown: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanHorizontal: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanLeft: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanRight: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanUp: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanVertical: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onResize: /* event */ tabrisLib.tabrisMod.WidgetResizeEvent => scala.Unit = null,
    onRightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onSwipeDown: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onSwipeLeft: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onSwipeRight: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onSwipeUp: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onTap: /* event */ tabrisLib.tabrisMod.WidgetTapEvent => scala.Unit = null,
    onTopChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onTouchCancel: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTouchEnd: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTouchMove: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTouchStart: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTransformChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Transformation] => scala.Unit = null,
    onVisibleChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onWidthChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension] => scala.Unit = null,
    onWin_themeChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null
  ): WidgetEvents = {
    val __obj = js.Dynamic.literal()
    if (onBackgroundChanged != null) __obj.updateDynamic("onBackgroundChanged")(js.Any.fromFunction1(onBackgroundChanged))
    if (onBackgroundImageChanged != null) __obj.updateDynamic("onBackgroundImageChanged")(js.Any.fromFunction1(onBackgroundImageChanged))
    if (onBaselineChanged != null) __obj.updateDynamic("onBaselineChanged")(js.Any.fromFunction1(onBaselineChanged))
    if (onBottomChanged != null) __obj.updateDynamic("onBottomChanged")(js.Any.fromFunction1(onBottomChanged))
    if (onBoundsChanged != null) __obj.updateDynamic("onBoundsChanged")(js.Any.fromFunction1(onBoundsChanged))
    if (onCenterXChanged != null) __obj.updateDynamic("onCenterXChanged")(js.Any.fromFunction1(onCenterXChanged))
    if (onCenterYChanged != null) __obj.updateDynamic("onCenterYChanged")(js.Any.fromFunction1(onCenterYChanged))
    if (onClassChanged != null) __obj.updateDynamic("onClassChanged")(js.Any.fromFunction1(onClassChanged))
    if (onClassListChanged != null) __obj.updateDynamic("onClassListChanged")(js.Any.fromFunction1(onClassListChanged))
    if (onCornerRadiusChanged != null) __obj.updateDynamic("onCornerRadiusChanged")(js.Any.fromFunction1(onCornerRadiusChanged))
    if (onDataChanged != null) __obj.updateDynamic("onDataChanged")(js.Any.fromFunction1(onDataChanged))
    if (onDispose != null) __obj.updateDynamic("onDispose")(js.Any.fromFunction1(onDispose))
    if (onElevationChanged != null) __obj.updateDynamic("onElevationChanged")(js.Any.fromFunction1(onElevationChanged))
    if (onEnabledChanged != null) __obj.updateDynamic("onEnabledChanged")(js.Any.fromFunction1(onEnabledChanged))
    if (onFontChanged != null) __obj.updateDynamic("onFontChanged")(js.Any.fromFunction1(onFontChanged))
    if (onHeightChanged != null) __obj.updateDynamic("onHeightChanged")(js.Any.fromFunction1(onHeightChanged))
    if (onHighlightOnTouchChanged != null) __obj.updateDynamic("onHighlightOnTouchChanged")(js.Any.fromFunction1(onHighlightOnTouchChanged))
    if (onIdChanged != null) __obj.updateDynamic("onIdChanged")(js.Any.fromFunction1(onIdChanged))
    if (onLayoutDataChanged != null) __obj.updateDynamic("onLayoutDataChanged")(js.Any.fromFunction1(onLayoutDataChanged))
    if (onLeftChanged != null) __obj.updateDynamic("onLeftChanged")(js.Any.fromFunction1(onLeftChanged))
    if (onLongpress != null) __obj.updateDynamic("onLongpress")(js.Any.fromFunction1(onLongpress))
    if (onOpacityChanged != null) __obj.updateDynamic("onOpacityChanged")(js.Any.fromFunction1(onOpacityChanged))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onPanDown != null) __obj.updateDynamic("onPanDown")(js.Any.fromFunction1(onPanDown))
    if (onPanHorizontal != null) __obj.updateDynamic("onPanHorizontal")(js.Any.fromFunction1(onPanHorizontal))
    if (onPanLeft != null) __obj.updateDynamic("onPanLeft")(js.Any.fromFunction1(onPanLeft))
    if (onPanRight != null) __obj.updateDynamic("onPanRight")(js.Any.fromFunction1(onPanRight))
    if (onPanUp != null) __obj.updateDynamic("onPanUp")(js.Any.fromFunction1(onPanUp))
    if (onPanVertical != null) __obj.updateDynamic("onPanVertical")(js.Any.fromFunction1(onPanVertical))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onRightChanged != null) __obj.updateDynamic("onRightChanged")(js.Any.fromFunction1(onRightChanged))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction1(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction1(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction1(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction1(onSwipeUp))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (onTopChanged != null) __obj.updateDynamic("onTopChanged")(js.Any.fromFunction1(onTopChanged))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransformChanged != null) __obj.updateDynamic("onTransformChanged")(js.Any.fromFunction1(onTransformChanged))
    if (onVisibleChanged != null) __obj.updateDynamic("onVisibleChanged")(js.Any.fromFunction1(onVisibleChanged))
    if (onWidthChanged != null) __obj.updateDynamic("onWidthChanged")(js.Any.fromFunction1(onWidthChanged))
    if (onWin_themeChanged != null) __obj.updateDynamic("onWin_themeChanged")(js.Any.fromFunction1(onWin_themeChanged))
    __obj.asInstanceOf[WidgetEvents]
  }
}


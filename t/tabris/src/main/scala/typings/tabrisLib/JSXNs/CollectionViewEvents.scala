package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionViewEvents extends WidgetEvents {
  /**
    * Fired when the [*cellHeight*](#cellHeight) property has changed.
    * @param value The new value of [*cellHeight*](#cellHeight).
    */
  var onCellHeightChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[
        tabrisLib.tabrisMod.CollectionView, 
        scala.Double | tabrisLib.tabrisLibStrings.auto | (js.Function2[
          /* index */ scala.Double, 
          /* cellType */ java.lang.String, 
          scala.Double | tabrisLib.tabrisLibStrings.auto
        ])
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*cellType*](#cellType) property has changed.
    * @param value The new value of [*cellType*](#cellType).
    */
  var onCellTypeChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[
        tabrisLib.tabrisMod.CollectionView, 
        java.lang.String | (js.Function1[/* index */ scala.Double, java.lang.String]) | scala.Null
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*columnCount*](#columnCount) property has changed.
    * @param value The new value of [*columnCount*](#columnCount).
    */
  var onColumnCountChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*firstVisibleIndex*](#firstVisibleIndex) property has changed.
    * @param value The new value of [*firstVisibleIndex*](#firstVisibleIndex).
    */
  var onFirstVisibleIndexChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*itemCount*](#itemCount) property has changed.
    * @param value The new value of [*itemCount*](#itemCount).
    */
  var onItemCountChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*lastVisibleIndex*](#lastVisibleIndex) property has changed.
    * @param value The new value of [*lastVisibleIndex*](#lastVisibleIndex).
    */
  var onLastVisibleIndexChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the user requested a refresh. An event listener should reset the *refreshIndicator*
    * property when refresh is finished.
    */
  var onRefresh: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.CollectionView], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*refreshEnabled*](#refreshEnabled) property has changed.
    * @param value The new value of [*refreshEnabled*](#refreshEnabled).
    */
  var onRefreshEnabledChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*refreshIndicator*](#refreshIndicator) property has changed.
    * @param value The new value of [*refreshIndicator*](#refreshIndicator).
    */
  var onRefreshIndicatorChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*refreshMessage*](#refreshMessage) property has changed.
    * @param value The new value of [*refreshMessage*](#refreshMessage).
    */
  var onRefreshMessageChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired while the collection view is scrolling.
    */
  var onScroll: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.CollectionViewScrollEvent, scala.Unit]
  ] = js.undefined
  /**
    * Fired when a cell is selected.
    */
  var onSelect: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.CollectionViewSelectEvent, scala.Unit]
  ] = js.undefined
}

object CollectionViewEvents {
  @scala.inline
  def apply(
    onBackgroundChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Color] => scala.Unit = null,
    onBackgroundImageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Image] => scala.Unit = null,
    onBaselineChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Widget | tabrisLib.Selector] => scala.Unit = null,
    onBottomChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onBoundsChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Bounds] => scala.Unit = null,
    onCellHeightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[
      tabrisLib.tabrisMod.CollectionView, 
      scala.Double | tabrisLib.tabrisLibStrings.auto | (js.Function2[
        /* index */ scala.Double, 
        /* cellType */ java.lang.String, 
        scala.Double | tabrisLib.tabrisLibStrings.auto
      ])
    ] => scala.Unit = null,
    onCellTypeChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[
      tabrisLib.tabrisMod.CollectionView, 
      java.lang.String | (js.Function1[/* index */ scala.Double, java.lang.String]) | scala.Null
    ] => scala.Unit = null,
    onCenterXChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset] => scala.Unit = null,
    onCenterYChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset] => scala.Unit = null,
    onClassChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null,
    onClassListChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Array[java.lang.String]] => scala.Unit = null,
    onColumnCountChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double] => scala.Unit = null,
    onCornerRadiusChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onDataChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Object] => scala.Unit = null,
    onDispose: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.Widget] => scala.Unit = null,
    onElevationChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onEnabledChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onFirstVisibleIndexChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double] => scala.Unit = null,
    onFontChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Font] => scala.Unit = null,
    onHeightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension] => scala.Unit = null,
    onHighlightOnTouchChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onIdChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null,
    onItemCountChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double] => scala.Unit = null,
    onLastVisibleIndexChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Double] => scala.Unit = null,
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
    onRefresh: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.CollectionView] => scala.Unit = null,
    onRefreshEnabledChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Boolean] => scala.Unit = null,
    onRefreshIndicatorChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, scala.Boolean] => scala.Unit = null,
    onRefreshMessageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.CollectionView, java.lang.String] => scala.Unit = null,
    onResize: /* event */ tabrisLib.tabrisMod.WidgetResizeEvent => scala.Unit = null,
    onRightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onScroll: /* event */ tabrisLib.tabrisMod.CollectionViewScrollEvent => scala.Unit = null,
    onSelect: /* event */ tabrisLib.tabrisMod.CollectionViewSelectEvent => scala.Unit = null,
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
  ): CollectionViewEvents = {
    val __obj = js.Dynamic.literal()
    if (onBackgroundChanged != null) __obj.updateDynamic("onBackgroundChanged")(js.Any.fromFunction1(onBackgroundChanged))
    if (onBackgroundImageChanged != null) __obj.updateDynamic("onBackgroundImageChanged")(js.Any.fromFunction1(onBackgroundImageChanged))
    if (onBaselineChanged != null) __obj.updateDynamic("onBaselineChanged")(js.Any.fromFunction1(onBaselineChanged))
    if (onBottomChanged != null) __obj.updateDynamic("onBottomChanged")(js.Any.fromFunction1(onBottomChanged))
    if (onBoundsChanged != null) __obj.updateDynamic("onBoundsChanged")(js.Any.fromFunction1(onBoundsChanged))
    if (onCellHeightChanged != null) __obj.updateDynamic("onCellHeightChanged")(js.Any.fromFunction1(onCellHeightChanged))
    if (onCellTypeChanged != null) __obj.updateDynamic("onCellTypeChanged")(js.Any.fromFunction1(onCellTypeChanged))
    if (onCenterXChanged != null) __obj.updateDynamic("onCenterXChanged")(js.Any.fromFunction1(onCenterXChanged))
    if (onCenterYChanged != null) __obj.updateDynamic("onCenterYChanged")(js.Any.fromFunction1(onCenterYChanged))
    if (onClassChanged != null) __obj.updateDynamic("onClassChanged")(js.Any.fromFunction1(onClassChanged))
    if (onClassListChanged != null) __obj.updateDynamic("onClassListChanged")(js.Any.fromFunction1(onClassListChanged))
    if (onColumnCountChanged != null) __obj.updateDynamic("onColumnCountChanged")(js.Any.fromFunction1(onColumnCountChanged))
    if (onCornerRadiusChanged != null) __obj.updateDynamic("onCornerRadiusChanged")(js.Any.fromFunction1(onCornerRadiusChanged))
    if (onDataChanged != null) __obj.updateDynamic("onDataChanged")(js.Any.fromFunction1(onDataChanged))
    if (onDispose != null) __obj.updateDynamic("onDispose")(js.Any.fromFunction1(onDispose))
    if (onElevationChanged != null) __obj.updateDynamic("onElevationChanged")(js.Any.fromFunction1(onElevationChanged))
    if (onEnabledChanged != null) __obj.updateDynamic("onEnabledChanged")(js.Any.fromFunction1(onEnabledChanged))
    if (onFirstVisibleIndexChanged != null) __obj.updateDynamic("onFirstVisibleIndexChanged")(js.Any.fromFunction1(onFirstVisibleIndexChanged))
    if (onFontChanged != null) __obj.updateDynamic("onFontChanged")(js.Any.fromFunction1(onFontChanged))
    if (onHeightChanged != null) __obj.updateDynamic("onHeightChanged")(js.Any.fromFunction1(onHeightChanged))
    if (onHighlightOnTouchChanged != null) __obj.updateDynamic("onHighlightOnTouchChanged")(js.Any.fromFunction1(onHighlightOnTouchChanged))
    if (onIdChanged != null) __obj.updateDynamic("onIdChanged")(js.Any.fromFunction1(onIdChanged))
    if (onItemCountChanged != null) __obj.updateDynamic("onItemCountChanged")(js.Any.fromFunction1(onItemCountChanged))
    if (onLastVisibleIndexChanged != null) __obj.updateDynamic("onLastVisibleIndexChanged")(js.Any.fromFunction1(onLastVisibleIndexChanged))
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
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction1(onRefresh))
    if (onRefreshEnabledChanged != null) __obj.updateDynamic("onRefreshEnabledChanged")(js.Any.fromFunction1(onRefreshEnabledChanged))
    if (onRefreshIndicatorChanged != null) __obj.updateDynamic("onRefreshIndicatorChanged")(js.Any.fromFunction1(onRefreshIndicatorChanged))
    if (onRefreshMessageChanged != null) __obj.updateDynamic("onRefreshMessageChanged")(js.Any.fromFunction1(onRefreshMessageChanged))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onRightChanged != null) __obj.updateDynamic("onRightChanged")(js.Any.fromFunction1(onRightChanged))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
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
    __obj.asInstanceOf[CollectionViewEvents]
  }
}


package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.mod.AnimationOptions
import typings.tabris.mod.Bounds
import typings.tabris.mod.BoxDimensions
import typings.tabris.mod.ChangeListeners
import typings.tabris.mod.CheckBox
import typings.tabris.mod.CheckBoxSelectEvent
import typings.tabris.mod.ColorValue
import typings.tabris.mod.Composite
import typings.tabris.mod.ConstraintValue
import typings.tabris.mod.Dimension
import typings.tabris.mod.EventObject
import typings.tabris.mod.FontValue
import typings.tabris.mod.ImageValue
import typings.tabris.mod.JSXAttributes
import typings.tabris.mod.LayoutDataValue
import typings.tabris.mod.LinearGradientValue
import typings.tabris.mod.Listeners
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Offset
import typings.tabris.mod.Omit
import typings.tabris.mod.Properties
import typings.tabris.mod.Selector
import typings.tabris.mod.SiblingReferenceValue
import typings.tabris.mod.Transformation
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import typings.tabris.mod.WidgetLongPressEvent
import typings.tabris.mod.WidgetPanEvent
import typings.tabris.mod.WidgetResizeEvent
import typings.tabris.mod.WidgetSwipeEvent
import typings.tabris.mod.WidgetTapEvent
import typings.tabris.mod.WidgetTouchEvent
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.`class`
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.background
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.bounds
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.checked
import typings.tabris.tabrisStrings.checkedTintColor
import typings.tabris.tabrisStrings.classList
import typings.tabris.tabrisStrings.cornerRadius
import typings.tabris.tabrisStrings.elevation
import typings.tabris.tabrisStrings.enabled
import typings.tabris.tabrisStrings.excludeFromLayout
import typings.tabris.tabrisStrings.font
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.highlightOnTouch
import typings.tabris.tabrisStrings.id
import typings.tabris.tabrisStrings.layoutData
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.opacity
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.text
import typings.tabris.tabrisStrings.textColor
import typings.tabris.tabrisStrings.tintColor
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.transform
import typings.tabris.tabrisStrings.visible
import typings.tabris.tabrisStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tabris.tabris.Omit<tabris.tabris.CheckBox, 'set'> */
@js.native
trait OmitCheckBoxset extends js.Object {
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, _] = js.native
  @JSName("$props")
  var $props: js.Any = js.native
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ js.Any, Unit] = js.native
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit] = js.native
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit] = js.native
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, _] = js.native
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit] = js.native
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, _] = js.native
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit] = js.native
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, _]]] = js.native
  @JSName("_getXMLContent")
  var _getXMLContent_Original: js.Function0[js.Array[String]] = js.native
  @JSName("_getXMLElementName")
  var _getXMLElementName_Original: js.Function0[String] = js.native
  @JSName("_getXMLFooter")
  var _getXMLFooter_Original: js.Function1[/* hasChild */ Boolean, String] = js.native
  @JSName("_getXMLHeader")
  var _getXMLHeader_Original: js.Function1[/* hasChild */ Boolean, String] = js.native
  var _isDisposed: js.UndefOr[`true`] = js.native
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean] = js.native
  @JSName("_listen")
  var _listen_Original: js.Function2[/* eventName */ String, /* listening */ Boolean, Unit] = js.native
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, _] = js.native
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[js.Any]], Unit] = js.native
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function1[/* eventType */ String, Unit] = js.native
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, Unit] = js.native
  var _nativeType: String = js.native
  @JSName("_onoff")
  var _onoff_Original: js.Function3[/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function, Unit] = js.native
  @JSName("_register")
  var _register_Original: js.Function0[Unit] = js.native
  @JSName("_release")
  var _release_Original: js.Function0[Unit] = js.native
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]] = js.native
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget], /* index */ js.UndefOr[Double], Unit] = js.native
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ js.Any, Unit] = js.native
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ js.Any, Unit] = js.native
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean] = js.native
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean] = js.native
  var absoluteBounds: Bounds = js.native
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ AnonOpacity, /* options */ AnimationOptions, js.Promise[Unit]] = js.native
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget], CheckBox] = js.native
  var background: LinearGradientValue | ColorValue | ImageValue = js.native
  var baseline: SiblingReferenceValue | auto | `true` = js.native
  var bottom: ConstraintValue = js.native
  var bounds: Bounds = js.native
  var centerX: Offset | auto | `true` = js.native
  var centerY: Offset | auto | `true` = js.native
  var checked: Boolean = js.native
  var checkedTintColor: ColorValue = js.native
  var cid: String = js.native
  var `class`: String = js.native
  var classList: js.Array[String] = js.native
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[CheckBox, Omit[CheckBox, set]]], js.Any] = js.native
  var cornerRadius: Double = js.native
  var data: StringDictionary[js.Any] = js.native
  var defineChangeEvent: js.Any = js.native
  var defineEvent: js.Any = js.native
  var defineEvents: js.Any = js.native
  var defineProperties: js.Any = js.native
  var defineProperty: js.Any = js.native
  @JSName("detach")
  var detach_Original: js.Function0[CheckBox] = js.native
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit] = js.native
  var elevation: Double = js.native
  var enabled: Boolean = js.native
  var excludeFromLayout: Boolean = js.native
  var extend: js.Any = js.native
  var font: FontValue = js.native
  var height: Dimension | auto = js.native
  var highlightOnTouch: Boolean = js.native
  var id: String = js.native
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget, CheckBox] = js.native
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget, CheckBox] = js.native
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean] = js.native
  var jsxAttributes: (JSXAttributes[CheckBox, Omit[CheckBox, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildrenString = js.native
  var layoutData: LayoutDataValue = js.native
  var left: ConstraintValue = js.native
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    CheckBox
  ] = js.native
  var onBackgroundChanged: ChangeListeners[CheckBox, background] = js.native
  var onBaselineChanged: ChangeListeners[CheckBox, baseline] = js.native
  var onBottomChanged: ChangeListeners[CheckBox, bottom] = js.native
  var onBoundsChanged: ChangeListeners[CheckBox, bounds] = js.native
  var onCenterXChanged: ChangeListeners[CheckBox, centerX] = js.native
  var onCenterYChanged: ChangeListeners[CheckBox, centerY] = js.native
  var onCheckedChanged: ChangeListeners[CheckBox, checked] = js.native
  var onCheckedTintColorChanged: ChangeListeners[CheckBox, checkedTintColor] = js.native
  var onClassChanged: ChangeListeners[CheckBox, `class`] = js.native
  var onClassListChanged: ChangeListeners[CheckBox, classList] = js.native
  var onCornerRadiusChanged: ChangeListeners[CheckBox, cornerRadius] = js.native
  var onDispose: Listeners[EventObject[CheckBox]] = js.native
  var onElevationChanged: ChangeListeners[CheckBox, elevation] = js.native
  var onEnabledChanged: ChangeListeners[CheckBox, enabled] = js.native
  var onExcludeFromLayoutChanged: ChangeListeners[CheckBox, excludeFromLayout] = js.native
  var onFontChanged: ChangeListeners[CheckBox, font] = js.native
  var onHeightChanged: ChangeListeners[CheckBox, height] = js.native
  var onHighlightOnTouchChanged: ChangeListeners[CheckBox, highlightOnTouch] = js.native
  var onIdChanged: ChangeListeners[CheckBox, id] = js.native
  var onLayoutDataChanged: ChangeListeners[CheckBox, layoutData] = js.native
  var onLeftChanged: ChangeListeners[CheckBox, left] = js.native
  var onLongPress: Listeners[WidgetLongPressEvent[CheckBox]] = js.native
  var onOpacityChanged: ChangeListeners[CheckBox, opacity] = js.native
  var onPan: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onPanDown: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onPanHorizontal: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onPanLeft: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onPanRight: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onPanUp: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onPanVertical: Listeners[WidgetPanEvent[CheckBox]] = js.native
  var onResize: Listeners[WidgetResizeEvent[CheckBox]] = js.native
  var onRightChanged: ChangeListeners[CheckBox, right] = js.native
  var onSelect: Listeners[CheckBoxSelectEvent[CheckBox]] = js.native
  var onSwipeDown: Listeners[WidgetSwipeEvent[CheckBox]] = js.native
  var onSwipeLeft: Listeners[WidgetSwipeEvent[CheckBox]] = js.native
  var onSwipeRight: Listeners[WidgetSwipeEvent[CheckBox]] = js.native
  var onSwipeUp: Listeners[WidgetSwipeEvent[CheckBox]] = js.native
  var onTap: Listeners[WidgetTapEvent[CheckBox]] = js.native
  var onTextChanged: ChangeListeners[CheckBox, text] = js.native
  var onTextColorChanged: ChangeListeners[CheckBox, textColor] = js.native
  var onTintColorChanged: ChangeListeners[CheckBox, tintColor] = js.native
  var onTopChanged: ChangeListeners[CheckBox, top] = js.native
  var onTouchCancel: Listeners[WidgetTouchEvent[CheckBox]] = js.native
  var onTouchEnd: Listeners[WidgetTouchEvent[CheckBox]] = js.native
  var onTouchMove: Listeners[WidgetTouchEvent[CheckBox]] = js.native
  var onTouchStart: Listeners[WidgetTouchEvent[CheckBox]] = js.native
  var onTransformChanged: ChangeListeners[CheckBox, transform] = js.native
  var onVisibleChanged: ChangeListeners[CheckBox, visible] = js.native
  var onWidthChanged: ChangeListeners[CheckBox, width] = js.native
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    CheckBox
  ] = js.native
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    CheckBox
  ] = js.native
  var opacity: Double = js.native
  var padding: js.UndefOr[BoxDimensions] = js.native
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget]] = js.native
  var right: ConstraintValue = js.native
  @JSName("siblings")
  var siblings_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  var text: String = js.native
  var textColor: ColorValue = js.native
  var tintColor: ColorValue = js.native
  var top: ConstraintValue = js.native
  var transform: Transformation = js.native
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[CheckBox]] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, CheckBox] = js.native
  var visible: Boolean = js.native
  var width: Dimension | auto = js.native
  @JSName("$getProperty")
  def $getProperty(name: String): js.Any = js.native
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): js.Any = js.native
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): js.Any = js.native
  @JSName("$setProperty")
  def $setProperty(name: String, value: js.Any): Unit = js.native
  @JSName("$trigger")
  def $trigger(eventType: String): Unit = js.native
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit = js.native
  def _checkDisposed(): Unit = js.native
  def _decodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  def _dispose(): Unit = js.native
  def _dispose(skipNative: Boolean): Unit = js.native
  def _encodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  def _getDefaultPropertyValue(propertyName: String): Unit = js.native
  def _getStoredProperty(propertyName: String): js.Any = js.native
  def _getTypeDef(propertyName: String): js.Any = js.native
  def _getXMLAttributes(): js.Array[js.Tuple2[String, _]] = js.native
  def _getXMLContent(): js.Array[String] = js.native
  def _getXMLElementName(): String = js.native
  def _getXMLFooter(hasChild: Boolean): String = js.native
  def _getXMLHeader(hasChild: Boolean): String = js.native
  def _isListening(eventType: String): Boolean = js.native
  def _listen(eventName: String, listening: Boolean): Unit = js.native
  def _nativeCall(methodName: String, parameters: js.Object): js.Any = js.native
  def _nativeCreate(): Unit = js.native
  def _nativeCreate(param: StringDictionary[js.Any]): Unit = js.native
  def _nativeGet(propertyName: String): js.Any = js.native
  def _nativeListen(eventType: String): Unit = js.native
  def _nativeSet(propertyName: String, value: js.Any): Unit = js.native
  def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit = js.native
  def _register(): Unit = js.native
  def _release(): Unit = js.native
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String] = js.native
  def _setParent(parent: Composite[Widget]): Unit = js.native
  def _setParent(parent: Composite[Widget], index: Double): Unit = js.native
  def _storeProperty(propertyName: String, encodedValue: js.Any): Unit = js.native
  def _trigger(eventType: String): Boolean = js.native
  def _trigger(eventType: String, eventData: js.Object): Boolean = js.native
  def _triggerChangeEvent(propertyName: String, newEncodedValue: js.Any): Unit = js.native
  def _wasSet(propertyName: String): Boolean = js.native
  def animate(properties: AnonOpacity, options: AnimationOptions): js.Promise[Unit] = js.native
  def appendTo(parent: Composite[Widget]): CheckBox = js.native
  def detach(): CheckBox = js.native
  def dispose(): Unit = js.native
  def insertAfter(widget: Widget): CheckBox = js.native
  def insertBefore(widget: Widget): CheckBox = js.native
  def isDisposed(): Boolean = js.native
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): CheckBox = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): CheckBox = js.native
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): CheckBox = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): CheckBox = js.native
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): CheckBox = js.native
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): CheckBox = js.native
  def parent(): Composite[Widget] = js.native
  def siblings[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def siblings[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def trigger(`type`: String): CheckBox = js.native
  def triggerAsync(`type`: String): js.Promise[CheckBox] = js.native
}


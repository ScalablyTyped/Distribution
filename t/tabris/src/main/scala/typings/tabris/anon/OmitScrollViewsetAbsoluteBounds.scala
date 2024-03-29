package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.mod.AnimationOptions
import typings.tabris.mod.Bounds
import typings.tabris.mod.BoxDimensions
import typings.tabris.mod.ChangeListeners
import typings.tabris.mod.ColorValue
import typings.tabris.mod.Composite
import typings.tabris.mod.CompositeAddChildEvent
import typings.tabris.mod.CompositeRemoveChildEvent
import typings.tabris.mod.ConstraintValue
import typings.tabris.mod.Dimension
import typings.tabris.mod.EventObject
import typings.tabris.mod.ImageValue
import typings.tabris.mod.JSXCompositeAttributes
import typings.tabris.mod.LayoutDataValue
import typings.tabris.mod.LinearGradientValue
import typings.tabris.mod.Listeners
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Omit
import typings.tabris.mod.Properties
import typings.tabris.mod.RuleSet
import typings.tabris.mod.ScrollViewScrollEvent
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
import typings.tabris.mod.widgets.ScrollView
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.`class`
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.background
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.bounds
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.classList
import typings.tabris.tabrisStrings.cornerRadius
import typings.tabris.tabrisStrings.data
import typings.tabris.tabrisStrings.drag
import typings.tabris.tabrisStrings.elevation
import typings.tabris.tabrisStrings.enabled
import typings.tabris.tabrisStrings.excludeFromLayout
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.highlightOnTouch
import typings.tabris.tabrisStrings.horizontal
import typings.tabris.tabrisStrings.id
import typings.tabris.tabrisStrings.layoutData
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.offsetX
import typings.tabris.tabrisStrings.offsetY
import typings.tabris.tabrisStrings.opacity
import typings.tabris.tabrisStrings.rest
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.scroll
import typings.tabris.tabrisStrings.scrollXState
import typings.tabris.tabrisStrings.scrollYState
import typings.tabris.tabrisStrings.scrollbarVisible
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.transform
import typings.tabris.tabrisStrings.vertical
import typings.tabris.tabrisStrings.visible
import typings.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.widgets.ScrollView, 'set'> */
trait OmitScrollViewsetAbsoluteBounds extends StObject {
  
  @JSName("$children")
  var $children: js.Array[Widget[Any]]
  
  @JSName("$flushChildren")
  def $flushChildren(): Unit
  @JSName("$flushChildren")
  var $flushChildren_Original: js.Function0[Unit]
  
  @JSName("$getProperty")
  def $getProperty(name: String): Any
  
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): Any
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, Any]
  
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): Any
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, Any]
  
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, Any]
  
  @JSName("$props")
  var $props: Any
  
  @JSName("$setProperty")
  def $setProperty(name: String, value: Any): Unit
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ Any, Unit]
  
  @JSName("$trigger")
  def $trigger(eventType: String): Unit
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit]
  
  def _acceptChild(child: Widget[Any]): Boolean
  @JSName("_acceptChild")
  var _acceptChild_Original: js.Function1[/* child */ Widget[Any], Boolean]
  
  def _addChild(child: Widget[Any]): Unit
  def _addChild(child: Widget[Any], index: Double): Unit
  @JSName("_addChild")
  var _addChild_Original: js.Function2[/* child */ Widget[Any], /* index */ js.UndefOr[Double], Unit]
  
  def _apply[Target](options: `26`[Target], rules: RuleSet[typings.tabris.global.tabris.widgets.ScrollView]): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("_apply")
  var _apply_Original: js.Function2[
    /* options */ `26`[typings.tabris.global.tabris.widgets.ScrollView], 
    /* rules */ RuleSet[typings.tabris.global.tabris.widgets.ScrollView], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  def _checkDisposed(): Unit
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit]
  
  def _checkLayout(value: typings.tabris.mod.Layout): Unit
  @JSName("_checkLayout")
  var _checkLayout_Original: js.Function1[/* value */ typings.tabris.mod.Layout, Unit]
  
  def _children[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def _children[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("_children")
  var _children_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  def _decodeProperty(propertyName: String, value: Any): Any
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ Any, Any]
  
  def _dispose(): Unit
  def _dispose(skipNative: Boolean): Unit
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit]
  
  def _encodeProperty(propertyName: String, value: Any): Any
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ Any, Any]
  
  def _find[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def _find[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("_find")
  var _find_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  def _getDefaultPropertyValue(propertyName: String): Unit
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit]
  
  def _getStoredProperty(propertyName: String): Any
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, Any]
  
  def _getTypeDef(propertyName: String): Any
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, Any]
  
  def _getXMLAttributes(): js.Array[js.Tuple2[String, Any]]
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, Any]]]
  
  def _getXMLContent(): js.Array[String]
  @JSName("_getXMLContent")
  var _getXMLContent_Original: js.Function0[js.Array[String]]
  
  def _getXMLElementName(): String
  @JSName("_getXMLElementName")
  var _getXMLElementName_Original: js.Function0[String]
  
  def _getXMLFooter(hasChild: Boolean): String
  @JSName("_getXMLFooter")
  var _getXMLFooter_Original: js.Function1[/* hasChild */ Boolean, String]
  
  def _getXMLHeader(hasChild: Boolean): String
  @JSName("_getXMLHeader")
  var _getXMLHeader_Original: js.Function1[/* hasChild */ Boolean, String]
  
  def _initLayout(): Unit
  def _initLayout(props: Layout): Unit
  @JSName("_initLayout")
  var _initLayout_Original: js.Function1[/* props */ js.UndefOr[Layout], Unit]
  
  var _isDisposed: js.UndefOr[`true`] = js.undefined
  
  def _isListening(eventType: String): Boolean
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean]
  
  var _layout: typings.tabris.mod.Layout
  
  def _listen(eventName: String, listening: Boolean): Unit
  @JSName("_listen")
  var _listen_Original: js.Function2[/* eventName */ String, /* listening */ Boolean, Unit]
  
  def _nativeCall(methodName: String, parameters: js.Object): Any
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, Any]
  
  def _nativeCreate(): Unit
  def _nativeCreate(param: StringDictionary[Any]): Unit
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[Any]], Unit]
  
  def _nativeGet(propertyName: String): Any
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, Any]
  
  def _nativeListen(eventType: String, listen: Boolean): Unit
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function2[/* eventType */ String, /* listen */ Boolean, Unit]
  
  def _nativeSet(propertyName: String, value: Any): Unit
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ Any, Unit]
  
  def _nativeType(): String
  @JSName("_nativeType")
  var _nativeType_Original: js.Function0[String]
  
  def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit
  @JSName("_onoff")
  var _onoff_Original: js.Function3[/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function, Unit]
  
  def _register(): Unit
  @JSName("_register")
  var _register_Original: js.Function0[Unit]
  
  def _release(): Unit
  @JSName("_release")
  var _release_Original: js.Function0[Unit]
  
  def _removeChild(child: Widget[Any]): Unit
  @JSName("_removeChild")
  var _removeChild_Original: js.Function1[/* child */ Widget[Any], Unit]
  
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String]
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]]
  
  def _scheduleRenderChildren(): Unit
  @JSName("_scheduleRenderChildren")
  var _scheduleRenderChildren_Original: js.Function0[Unit]
  
  def _setParent(parent: Composite[Widget[Any]]): Unit
  def _setParent(parent: Composite[Widget[Any]], index: Double): Unit
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double], Unit]
  
  def _storeProperty(propertyName: String, encodedValue: Any): Unit
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ Any, Unit]
  
  def _trigger(eventType: String): Boolean
  def _trigger(eventType: String, eventData: js.Object): Boolean
  
  def _triggerChangeEvent(propertyName: String, newEncodedValue: Any): Unit
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ Any, Unit]
  
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean]
  
  def _wasSet(propertyName: String): Boolean
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean]
  
  var absoluteBounds: Bounds
  
  def animate(properties: Opacity, options: AnimationOptions): js.Promise[Unit]
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ Opacity, /* options */ AnimationOptions, js.Promise[Unit]]
  
  def append(widgets: Widget[Any]*): typings.tabris.global.tabris.widgets.ScrollView
  
  def appendTo(parent: Composite[Widget[Any]]): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("appendTo")
  var appendTo_Original: js.Function1[
    /* parent */ Composite[Widget[Any]], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  @JSName("append")
  var append_Original: js.Function1[/* repeated */ Widget[Any], typings.tabris.global.tabris.widgets.ScrollView]
  
  @JSName("apply")
  def apply[Target](options: `26`[Target], rules: RuleSet[typings.tabris.global.tabris.widgets.ScrollView]): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("apply")
  var apply_Original: js.Function2[
    /* options */ `26`[typings.tabris.global.tabris.widgets.ScrollView], 
    /* rules */ RuleSet[typings.tabris.global.tabris.widgets.ScrollView], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  var background: LinearGradientValue | ColorValue | ImageValue
  
  var baseline: SiblingReferenceValue | auto | `true`
  
  var bottom: ConstraintValue
  
  var bounds: Bounds
  
  var centerX: typings.tabris.mod.Offset | auto | `true`
  
  var centerY: typings.tabris.mod.Offset | auto | `true`
  
  def children[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def children[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("children")
  var children_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var cid: String
  
  var `class`: String
  
  var classList: js.Array[String]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[ScrollView, Omit[ScrollView, set]]], Any]
  
  var cornerRadius: Double
  
  var data: Any
  
  var defineChangeEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvents: js.UndefOr[Any] = js.undefined
  
  var defineProperties: js.UndefOr[Any] = js.undefined
  
  var defineProperty: js.UndefOr[Any] = js.undefined
  
  def detach(): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("detach")
  var detach_Original: js.Function0[typings.tabris.global.tabris.widgets.ScrollView]
  
  var direction: horizontal | vertical
  
  def dispose(): Unit
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit]
  
  var elevation: Double
  
  var enabled: Boolean
  
  var excludeFromLayout: Boolean
  
  var extend: js.UndefOr[Any] = js.undefined
  
  def find[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def find[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("find")
  var find_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var height: Dimension | auto
  
  var highlightOnTouch: Boolean
  
  var id: String
  
  def insertAfter(widget: Widget[Any]): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget[Any], typings.tabris.global.tabris.widgets.ScrollView]
  
  def insertBefore(widget: Widget[Any]): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget[Any], typings.tabris.global.tabris.widgets.ScrollView]
  
  def isDisposed(): Boolean
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean]
  
  var jsxAttributes: JSXCompositeAttributes[typings.tabris.global.tabris.widgets.ScrollView, Widget[Any]]
  
  var layout: js.UndefOr[typings.tabris.mod.Layout | Null] = js.undefined
  
  var layoutData: LayoutDataValue
  
  var left: ConstraintValue
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): typings.tabris.global.tabris.widgets.ScrollView
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  var offsetX: Double
  
  var offsetY: Double
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): typings.tabris.global.tabris.widgets.ScrollView
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): typings.tabris.global.tabris.widgets.ScrollView
  
  var onAddChild: Listeners[CompositeAddChildEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onBackgroundChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, background]
  
  var onBaselineChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, baseline]
  
  var onBottomChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, bottom]
  
  var onBoundsChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, bounds]
  
  var onCenterXChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, centerX]
  
  var onCenterYChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, centerY]
  
  var onClassChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, `class`]
  
  var onClassListChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, classList]
  
  var onCornerRadiusChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, cornerRadius]
  
  var onDataChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, data]
  
  var onDispose: Listeners[EventObject[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onElevationChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, elevation]
  
  var onEnabledChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, enabled]
  
  var onExcludeFromLayoutChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, excludeFromLayout]
  
  var onHeightChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, height]
  
  var onHighlightOnTouchChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, highlightOnTouch]
  
  var onIdChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, id]
  
  var onLayoutDataChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, layoutData]
  
  var onLeftChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, left]
  
  var onLongPress: Listeners[WidgetLongPressEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onOffsetXChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, offsetX]
  
  var onOffsetYChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, offsetY]
  
  var onOpacityChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, opacity]
  
  var onPan: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onPanDown: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onPanHorizontal: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onPanLeft: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onPanRight: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onPanUp: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onPanVertical: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onRemoveChild: Listeners[CompositeRemoveChildEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onResize: Listeners[WidgetResizeEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onRightChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, right]
  
  var onScrollX: Listeners[ScrollViewScrollEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onScrollXStateChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollXState]
  
  var onScrollY: Listeners[ScrollViewScrollEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onScrollYStateChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollYState]
  
  var onScrollbarVisibleChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollbarVisible]
  
  var onSwipeDown: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onSwipeLeft: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onSwipeRight: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onSwipeUp: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onTap: Listeners[WidgetTapEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onTopChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, top]
  
  var onTouchCancel: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onTouchEnd: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onTouchMove: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onTouchStart: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]
  
  var onTransformChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, transform]
  
  var onVisibleChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, visible]
  
  var onWidthChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, width]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): typings.tabris.global.tabris.widgets.ScrollView
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  var opacity: Double
  
  var padding: js.UndefOr[BoxDimensions | Null] = js.undefined
  
  def parent(): Composite[Widget[Any]]
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget[Any]]]
  
  var right: ConstraintValue
  
  def scrollToX(offset: Double): typings.tabris.global.tabris.widgets.ScrollView
  def scrollToX(offset: Double, options: `7`): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("scrollToX")
  var scrollToX_Original: js.Function2[
    /* offset */ Double, 
    /* options */ js.UndefOr[`7`], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  def scrollToY(offset: Double): typings.tabris.global.tabris.widgets.ScrollView
  def scrollToY(offset: Double, options: `7`): typings.tabris.global.tabris.widgets.ScrollView
  @JSName("scrollToY")
  var scrollToY_Original: js.Function2[
    /* offset */ Double, 
    /* options */ js.UndefOr[`7`], 
    typings.tabris.global.tabris.widgets.ScrollView
  ]
  
  var scrollXState: drag | rest | scroll
  
  var scrollYState: drag | rest | scroll
  
  var scrollbarVisible: Boolean
  
  def siblings[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def siblings[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("siblings")
  var siblings_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var top: ConstraintValue
  
  var transform: Transformation
  
  def trigger(`type`: String): typings.tabris.global.tabris.widgets.ScrollView
  
  def triggerAsync(`type`: String): js.Promise[typings.tabris.global.tabris.widgets.ScrollView]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[typings.tabris.global.tabris.widgets.ScrollView]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, typings.tabris.global.tabris.widgets.ScrollView]
  
  var visible: Boolean
  
  var width: Dimension | auto
}
object OmitScrollViewsetAbsoluteBounds {
  
  inline def apply(
    $children: js.Array[Widget[Any]],
    $flushChildren: () => Unit,
    $getProperty: /* name */ String => Any,
    $getPropertyGetter: /* propertyName */ String => Any,
    $getPropertySetter: /* propertyName */ String => Any,
    $props: Any,
    $setProperty: (/* name */ String, /* value */ Any) => Unit,
    $trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Unit,
    _acceptChild: /* child */ Widget[Any] => Boolean,
    _addChild: (/* child */ Widget[Any], /* index */ js.UndefOr[Double]) => Unit,
    _apply: (/* options */ `26`[typings.tabris.global.tabris.widgets.ScrollView], /* rules */ RuleSet[typings.tabris.global.tabris.widgets.ScrollView]) => typings.tabris.global.tabris.widgets.ScrollView,
    _checkDisposed: () => Unit,
    _checkLayout: /* value */ typings.tabris.mod.Layout => Unit,
    _children: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    _decodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _dispose: /* skipNative */ js.UndefOr[Boolean] => Unit,
    _encodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _find: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    _getDefaultPropertyValue: /* propertyName */ String => Unit,
    _getStoredProperty: /* propertyName */ String => Any,
    _getTypeDef: /* propertyName */ String => Any,
    _getXMLAttributes: () => js.Array[js.Tuple2[String, Any]],
    _getXMLContent: () => js.Array[String],
    _getXMLElementName: () => String,
    _getXMLFooter: /* hasChild */ Boolean => String,
    _getXMLHeader: /* hasChild */ Boolean => String,
    _initLayout: /* props */ js.UndefOr[Layout] => Unit,
    _isListening: /* eventType */ String => Boolean,
    _layout: typings.tabris.mod.Layout,
    _listen: (/* eventName */ String, /* listening */ Boolean) => Unit,
    _nativeCall: (/* methodName */ String, /* parameters */ js.Object) => Any,
    _nativeCreate: /* param */ js.UndefOr[StringDictionary[Any]] => Unit,
    _nativeGet: /* propertyName */ String => Any,
    _nativeListen: (/* eventType */ String, /* listen */ Boolean) => Unit,
    _nativeSet: (/* propertyName */ String, /* value */ Any) => Unit,
    _nativeType: () => String,
    _onoff: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Unit,
    _register: () => Unit,
    _release: () => Unit,
    _removeChild: /* child */ Widget[Any] => Unit,
    _reorderProperties: /* propertyNames */ js.Array[String] => js.Array[String],
    _scheduleRenderChildren: () => Unit,
    _setParent: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Unit,
    _storeProperty: (/* propertyName */ String, /* encodedValue */ Any) => Unit,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ Any) => Unit,
    _wasSet: /* propertyName */ String => Boolean,
    absoluteBounds: Bounds,
    animate: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit],
    append: /* repeated */ Widget[Any] => typings.tabris.global.tabris.widgets.ScrollView,
    appendTo: /* parent */ Composite[Widget[Any]] => typings.tabris.global.tabris.widgets.ScrollView,
    apply: (/* options */ `26`[typings.tabris.global.tabris.widgets.ScrollView], /* rules */ RuleSet[typings.tabris.global.tabris.widgets.ScrollView]) => typings.tabris.global.tabris.widgets.ScrollView,
    baseline: SiblingReferenceValue | auto | `true`,
    bottom: ConstraintValue,
    bounds: Bounds,
    centerX: typings.tabris.mod.Offset | auto | `true`,
    centerY: typings.tabris.mod.Offset | auto | `true`,
    children: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    cid: String,
    `class`: String,
    classList: js.Array[String],
    constructor: /* properties */ js.UndefOr[Properties[ScrollView, Omit[ScrollView, set]]] => Any,
    cornerRadius: Double,
    data: Any,
    detach: () => typings.tabris.global.tabris.widgets.ScrollView,
    direction: horizontal | vertical,
    dispose: () => Unit,
    elevation: Double,
    enabled: Boolean,
    excludeFromLayout: Boolean,
    find: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    height: Dimension | auto,
    highlightOnTouch: Boolean,
    id: String,
    insertAfter: /* widget */ Widget[Any] => typings.tabris.global.tabris.widgets.ScrollView,
    insertBefore: /* widget */ Widget[Any] => typings.tabris.global.tabris.widgets.ScrollView,
    isDisposed: () => Boolean,
    jsxAttributes: JSXCompositeAttributes[typings.tabris.global.tabris.widgets.ScrollView, Widget[Any]],
    layoutData: LayoutDataValue,
    left: ConstraintValue,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => typings.tabris.global.tabris.widgets.ScrollView,
    offsetX: Double,
    offsetY: Double,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typings.tabris.global.tabris.widgets.ScrollView,
    onAddChild: Listeners[CompositeAddChildEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onBackgroundChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, background],
    onBaselineChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, baseline],
    onBottomChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, bottom],
    onBoundsChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, bounds],
    onCenterXChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, centerX],
    onCenterYChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, centerY],
    onClassChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, `class`],
    onClassListChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, classList],
    onCornerRadiusChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, cornerRadius],
    onDataChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, data],
    onDispose: Listeners[EventObject[typings.tabris.global.tabris.widgets.ScrollView]],
    onElevationChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, elevation],
    onEnabledChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, enabled],
    onExcludeFromLayoutChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, excludeFromLayout],
    onHeightChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, height],
    onHighlightOnTouchChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, highlightOnTouch],
    onIdChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, id],
    onLayoutDataChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, layoutData],
    onLeftChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, left],
    onLongPress: Listeners[WidgetLongPressEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onOffsetXChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, offsetX],
    onOffsetYChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, offsetY],
    onOpacityChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, opacity],
    onPan: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onPanDown: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onPanHorizontal: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onPanLeft: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onPanRight: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onPanUp: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onPanVertical: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onRemoveChild: Listeners[CompositeRemoveChildEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onResize: Listeners[WidgetResizeEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onRightChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, right],
    onScrollX: Listeners[ScrollViewScrollEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onScrollXStateChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollXState],
    onScrollY: Listeners[ScrollViewScrollEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onScrollYStateChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollYState],
    onScrollbarVisibleChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollbarVisible],
    onSwipeDown: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onSwipeLeft: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onSwipeRight: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onSwipeUp: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onTap: Listeners[WidgetTapEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onTopChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, top],
    onTouchCancel: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onTouchEnd: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onTouchMove: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onTouchStart: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]],
    onTransformChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, transform],
    onVisibleChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, visible],
    onWidthChanged: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, width],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typings.tabris.global.tabris.widgets.ScrollView,
    opacity: Double,
    parent: () => Composite[Widget[Any]],
    right: ConstraintValue,
    scrollToX: (/* offset */ Double, /* options */ js.UndefOr[`7`]) => typings.tabris.global.tabris.widgets.ScrollView,
    scrollToY: (/* offset */ Double, /* options */ js.UndefOr[`7`]) => typings.tabris.global.tabris.widgets.ScrollView,
    scrollXState: drag | rest | scroll,
    scrollYState: drag | rest | scroll,
    scrollbarVisible: Boolean,
    siblings: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    top: ConstraintValue,
    transform: Transformation,
    trigger: /* type */ String => typings.tabris.global.tabris.widgets.ScrollView,
    triggerAsync: /* type */ String => js.Promise[typings.tabris.global.tabris.widgets.ScrollView],
    visible: Boolean,
    width: Dimension | auto
  ): OmitScrollViewsetAbsoluteBounds = {
    val __obj = js.Dynamic.literal($children = $children.asInstanceOf[js.Any], $flushChildren = js.Any.fromFunction0($flushChildren), $getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2($setProperty), $trigger = js.Any.fromFunction2($trigger), _acceptChild = js.Any.fromFunction1(_acceptChild), _addChild = js.Any.fromFunction2(_addChild), _apply = js.Any.fromFunction2(_apply), _checkDisposed = js.Any.fromFunction0(_checkDisposed), _checkLayout = js.Any.fromFunction1(_checkLayout), _children = js.Any.fromFunction1(_children), _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1(_dispose), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _find = js.Any.fromFunction1(_find), _getDefaultPropertyValue = js.Any.fromFunction1(_getDefaultPropertyValue), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = js.Any.fromFunction0(_getXMLAttributes), _getXMLContent = js.Any.fromFunction0(_getXMLContent), _getXMLElementName = js.Any.fromFunction0(_getXMLElementName), _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _initLayout = js.Any.fromFunction1(_initLayout), _isListening = js.Any.fromFunction1(_isListening), _layout = _layout.asInstanceOf[js.Any], _listen = js.Any.fromFunction2(_listen), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1(_nativeCreate), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2(_nativeListen), _nativeSet = js.Any.fromFunction2(_nativeSet), _nativeType = js.Any.fromFunction0(_nativeType), _onoff = js.Any.fromFunction3(_onoff), _register = js.Any.fromFunction0(_register), _release = js.Any.fromFunction0(_release), _removeChild = js.Any.fromFunction1(_removeChild), _reorderProperties = js.Any.fromFunction1(_reorderProperties), _scheduleRenderChildren = js.Any.fromFunction0(_scheduleRenderChildren), _setParent = js.Any.fromFunction2(_setParent), _storeProperty = js.Any.fromFunction2(_storeProperty), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2(_triggerChangeEvent), _wasSet = js.Any.fromFunction1(_wasSet), absoluteBounds = absoluteBounds.asInstanceOf[js.Any], animate = js.Any.fromFunction2(animate), append = js.Any.fromFunction1(append), appendTo = js.Any.fromFunction1(appendTo), apply = js.Any.fromFunction2(apply), baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), cid = cid.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), direction = direction.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], excludeFromLayout = excludeFromLayout.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), height = height.asInstanceOf[js.Any], highlightOnTouch = highlightOnTouch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = js.Any.fromFunction1(insertAfter), insertBefore = js.Any.fromFunction1(insertBefore), isDisposed = js.Any.fromFunction0(isDisposed), jsxAttributes = jsxAttributes.asInstanceOf[js.Any], layoutData = layoutData.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], on = js.Any.fromFunction3(on), onAddChild = onAddChild.asInstanceOf[js.Any], onBackgroundChanged = onBackgroundChanged.asInstanceOf[js.Any], onBaselineChanged = onBaselineChanged.asInstanceOf[js.Any], onBottomChanged = onBottomChanged.asInstanceOf[js.Any], onBoundsChanged = onBoundsChanged.asInstanceOf[js.Any], onCenterXChanged = onCenterXChanged.asInstanceOf[js.Any], onCenterYChanged = onCenterYChanged.asInstanceOf[js.Any], onClassChanged = onClassChanged.asInstanceOf[js.Any], onClassListChanged = onClassListChanged.asInstanceOf[js.Any], onCornerRadiusChanged = onCornerRadiusChanged.asInstanceOf[js.Any], onDataChanged = onDataChanged.asInstanceOf[js.Any], onDispose = onDispose.asInstanceOf[js.Any], onElevationChanged = onElevationChanged.asInstanceOf[js.Any], onEnabledChanged = onEnabledChanged.asInstanceOf[js.Any], onExcludeFromLayoutChanged = onExcludeFromLayoutChanged.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onHighlightOnTouchChanged = onHighlightOnTouchChanged.asInstanceOf[js.Any], onIdChanged = onIdChanged.asInstanceOf[js.Any], onLayoutDataChanged = onLayoutDataChanged.asInstanceOf[js.Any], onLeftChanged = onLeftChanged.asInstanceOf[js.Any], onLongPress = onLongPress.asInstanceOf[js.Any], onOffsetXChanged = onOffsetXChanged.asInstanceOf[js.Any], onOffsetYChanged = onOffsetYChanged.asInstanceOf[js.Any], onOpacityChanged = onOpacityChanged.asInstanceOf[js.Any], onPan = onPan.asInstanceOf[js.Any], onPanDown = onPanDown.asInstanceOf[js.Any], onPanHorizontal = onPanHorizontal.asInstanceOf[js.Any], onPanLeft = onPanLeft.asInstanceOf[js.Any], onPanRight = onPanRight.asInstanceOf[js.Any], onPanUp = onPanUp.asInstanceOf[js.Any], onPanVertical = onPanVertical.asInstanceOf[js.Any], onRemoveChild = onRemoveChild.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onRightChanged = onRightChanged.asInstanceOf[js.Any], onScrollX = onScrollX.asInstanceOf[js.Any], onScrollXStateChanged = onScrollXStateChanged.asInstanceOf[js.Any], onScrollY = onScrollY.asInstanceOf[js.Any], onScrollYStateChanged = onScrollYStateChanged.asInstanceOf[js.Any], onScrollbarVisibleChanged = onScrollbarVisibleChanged.asInstanceOf[js.Any], onSwipeDown = onSwipeDown.asInstanceOf[js.Any], onSwipeLeft = onSwipeLeft.asInstanceOf[js.Any], onSwipeRight = onSwipeRight.asInstanceOf[js.Any], onSwipeUp = onSwipeUp.asInstanceOf[js.Any], onTap = onTap.asInstanceOf[js.Any], onTopChanged = onTopChanged.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransformChanged = onTransformChanged.asInstanceOf[js.Any], onVisibleChanged = onVisibleChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), opacity = opacity.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), right = right.asInstanceOf[js.Any], scrollToX = js.Any.fromFunction2(scrollToX), scrollToY = js.Any.fromFunction2(scrollToY), scrollXState = scrollXState.asInstanceOf[js.Any], scrollYState = scrollYState.asInstanceOf[js.Any], scrollbarVisible = scrollbarVisible.asInstanceOf[js.Any], siblings = js.Any.fromFunction1(siblings), top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], background = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitScrollViewsetAbsoluteBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitScrollViewsetAbsoluteBounds] (val x: Self) extends AnyVal {
    
    inline def set$children(value: js.Array[Widget[Any]]): Self = StObject.set(x, "$children", value.asInstanceOf[js.Any])
    
    inline def set$childrenVarargs(value: Widget[Any]*): Self = StObject.set(x, "$children", js.Array(value*))
    
    inline def set$flushChildren(value: () => Unit): Self = StObject.set(x, "$flushChildren", js.Any.fromFunction0(value))
    
    inline def set$getProperty(value: /* name */ String => Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    inline def set$getPropertyGetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    inline def set$getPropertySetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    inline def set$props(value: Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$setProperty(value: (/* name */ String, /* value */ Any) => Unit): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2(value))
    
    inline def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Unit): Self = StObject.set(x, "$trigger", js.Any.fromFunction2(value))
    
    inline def setAbsoluteBounds(value: Bounds): Self = StObject.set(x, "absoluteBounds", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit]): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
    
    inline def setAppend(value: /* repeated */ Widget[Any] => typings.tabris.global.tabris.widgets.ScrollView): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setAppendTo(value: /* parent */ Composite[Widget[Any]] => typings.tabris.global.tabris.widgets.ScrollView): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setApply(
      value: (/* options */ `26`[typings.tabris.global.tabris.widgets.ScrollView], /* rules */ RuleSet[typings.tabris.global.tabris.widgets.ScrollView]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    inline def setBackground(value: LinearGradientValue | ColorValue | ImageValue): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBaseline(value: SiblingReferenceValue | auto | `true`): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: ConstraintValue): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: typings.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: typings.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setChildren(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    inline def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value*))
    
    inline def setConstructor(value: /* properties */ js.UndefOr[Properties[ScrollView, Omit[ScrollView, set]]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDefineChangeEvent(value: Any): Self = StObject.set(x, "defineChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setDefineChangeEventUndefined: Self = StObject.set(x, "defineChangeEvent", js.undefined)
    
    inline def setDefineEvent(value: Any): Self = StObject.set(x, "defineEvent", value.asInstanceOf[js.Any])
    
    inline def setDefineEventUndefined: Self = StObject.set(x, "defineEvent", js.undefined)
    
    inline def setDefineEvents(value: Any): Self = StObject.set(x, "defineEvents", value.asInstanceOf[js.Any])
    
    inline def setDefineEventsUndefined: Self = StObject.set(x, "defineEvents", js.undefined)
    
    inline def setDefineProperties(value: Any): Self = StObject.set(x, "defineProperties", value.asInstanceOf[js.Any])
    
    inline def setDefinePropertiesUndefined: Self = StObject.set(x, "defineProperties", js.undefined)
    
    inline def setDefineProperty(value: Any): Self = StObject.set(x, "defineProperty", value.asInstanceOf[js.Any])
    
    inline def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    inline def setDetach(value: () => typings.tabris.global.tabris.widgets.ScrollView): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setFind(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Dimension | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnTouch(value: Boolean): Self = StObject.set(x, "highlightOnTouch", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsertAfter(value: /* widget */ Widget[Any] => typings.tabris.global.tabris.widgets.ScrollView): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertBefore(value: /* widget */ Widget[Any] => typings.tabris.global.tabris.widgets.ScrollView): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setIsDisposed(value: () => Boolean): Self = StObject.set(x, "isDisposed", js.Any.fromFunction0(value))
    
    inline def setJsxAttributes(value: JSXCompositeAttributes[typings.tabris.global.tabris.widgets.ScrollView, Widget[Any]]): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: typings.tabris.mod.Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    inline def setLayoutNull: Self = StObject.set(x, "layout", null)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLeft(value: ConstraintValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnAddChild(value: Listeners[CompositeAddChildEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onAddChild", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, background]): Self = StObject.set(x, "onBackgroundChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBaselineChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, baseline]): Self = StObject.set(x, "onBaselineChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBottomChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, bottom]): Self = StObject.set(x, "onBottomChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBoundsChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, bounds]): Self = StObject.set(x, "onBoundsChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterXChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, centerX]): Self = StObject.set(x, "onCenterXChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterYChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, centerY]): Self = StObject.set(x, "onCenterYChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, `class`]): Self = StObject.set(x, "onClassChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassListChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, classList]): Self = StObject.set(x, "onClassListChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCornerRadiusChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, cornerRadius]): Self = StObject.set(x, "onCornerRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDataChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, data]): Self = StObject.set(x, "onDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: Listeners[EventObject[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onDispose", value.asInstanceOf[js.Any])
    
    inline def setOnElevationChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, elevation]): Self = StObject.set(x, "onElevationChanged", value.asInstanceOf[js.Any])
    
    inline def setOnEnabledChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, enabled]): Self = StObject.set(x, "onEnabledChanged", value.asInstanceOf[js.Any])
    
    inline def setOnExcludeFromLayoutChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, excludeFromLayout]): Self = StObject.set(x, "onExcludeFromLayoutChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHeightChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHighlightOnTouchChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, highlightOnTouch]): Self = StObject.set(x, "onHighlightOnTouchChanged", value.asInstanceOf[js.Any])
    
    inline def setOnIdChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, id]): Self = StObject.set(x, "onIdChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutDataChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, layoutData]): Self = StObject.set(x, "onLayoutDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLeftChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, left]): Self = StObject.set(x, "onLeftChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLongPress(value: Listeners[WidgetLongPressEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnOffsetXChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, offsetX]): Self = StObject.set(x, "onOffsetXChanged", value.asInstanceOf[js.Any])
    
    inline def setOnOffsetYChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, offsetY]): Self = StObject.set(x, "onOffsetYChanged", value.asInstanceOf[js.Any])
    
    inline def setOnOpacityChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, opacity]): Self = StObject.set(x, "onOpacityChanged", value.asInstanceOf[js.Any])
    
    inline def setOnPan(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPan", value.asInstanceOf[js.Any])
    
    inline def setOnPanDown(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPanDown", value.asInstanceOf[js.Any])
    
    inline def setOnPanHorizontal(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPanHorizontal", value.asInstanceOf[js.Any])
    
    inline def setOnPanLeft(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPanLeft", value.asInstanceOf[js.Any])
    
    inline def setOnPanRight(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPanRight", value.asInstanceOf[js.Any])
    
    inline def setOnPanUp(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPanUp", value.asInstanceOf[js.Any])
    
    inline def setOnPanVertical(value: Listeners[WidgetPanEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onPanVertical", value.asInstanceOf[js.Any])
    
    inline def setOnRemoveChild(value: Listeners[CompositeRemoveChildEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onRemoveChild", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: Listeners[WidgetResizeEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnRightChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, right]): Self = StObject.set(x, "onRightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnScrollX(value: Listeners[ScrollViewScrollEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onScrollX", value.asInstanceOf[js.Any])
    
    inline def setOnScrollXStateChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollXState]): Self = StObject.set(x, "onScrollXStateChanged", value.asInstanceOf[js.Any])
    
    inline def setOnScrollY(value: Listeners[ScrollViewScrollEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onScrollY", value.asInstanceOf[js.Any])
    
    inline def setOnScrollYStateChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollYState]): Self = StObject.set(x, "onScrollYStateChanged", value.asInstanceOf[js.Any])
    
    inline def setOnScrollbarVisibleChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, scrollbarVisible]): Self = StObject.set(x, "onScrollbarVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeDown(value: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onSwipeDown", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeLeft(value: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onSwipeLeft", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeRight(value: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onSwipeRight", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeUp(value: Listeners[WidgetSwipeEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onSwipeUp", value.asInstanceOf[js.Any])
    
    inline def setOnTap(value: Listeners[WidgetTapEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    inline def setOnTopChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, top]): Self = StObject.set(x, "onTopChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancel(value: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEnd(value: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMove(value: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStart(value: Listeners[WidgetTouchEvent[typings.tabris.global.tabris.widgets.ScrollView]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTransformChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, transform]): Self = StObject.set(x, "onTransformChanged", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, visible]): Self = StObject.set(x, "onVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOnWidthChanged(value: ChangeListeners[typings.tabris.global.tabris.widgets.ScrollView, width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: BoxDimensions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setParent(value: () => Composite[Widget[Any]]): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    inline def setRight(value: ConstraintValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setScrollToX(
      value: (/* offset */ Double, /* options */ js.UndefOr[`7`]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "scrollToX", js.Any.fromFunction2(value))
    
    inline def setScrollToY(
      value: (/* offset */ Double, /* options */ js.UndefOr[`7`]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "scrollToY", js.Any.fromFunction2(value))
    
    inline def setScrollXState(value: drag | rest | scroll): Self = StObject.set(x, "scrollXState", value.asInstanceOf[js.Any])
    
    inline def setScrollYState(value: drag | rest | scroll): Self = StObject.set(x, "scrollYState", value.asInstanceOf[js.Any])
    
    inline def setScrollbarVisible(value: Boolean): Self = StObject.set(x, "scrollbarVisible", value.asInstanceOf[js.Any])
    
    inline def setSiblings(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "siblings", js.Any.fromFunction1(value))
    
    inline def setTop(value: ConstraintValue): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: /* type */ String => typings.tabris.global.tabris.widgets.ScrollView): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    inline def setTriggerAsync(value: /* type */ String => js.Promise[typings.tabris.global.tabris.widgets.ScrollView]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Dimension | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def set_acceptChild(value: /* child */ Widget[Any] => Boolean): Self = StObject.set(x, "_acceptChild", js.Any.fromFunction1(value))
    
    inline def set_addChild(value: (/* child */ Widget[Any], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "_addChild", js.Any.fromFunction2(value))
    
    inline def set_apply(
      value: (/* options */ `26`[typings.tabris.global.tabris.widgets.ScrollView], /* rules */ RuleSet[typings.tabris.global.tabris.widgets.ScrollView]) => typings.tabris.global.tabris.widgets.ScrollView
    ): Self = StObject.set(x, "_apply", js.Any.fromFunction2(value))
    
    inline def set_checkDisposed(value: () => Unit): Self = StObject.set(x, "_checkDisposed", js.Any.fromFunction0(value))
    
    inline def set_checkLayout(value: /* value */ typings.tabris.mod.Layout => Unit): Self = StObject.set(x, "_checkLayout", js.Any.fromFunction1(value))
    
    inline def set_children(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "_children", js.Any.fromFunction1(value))
    
    inline def set_decodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_decodeProperty", js.Any.fromFunction2(value))
    
    inline def set_dispose(value: /* skipNative */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "_dispose", js.Any.fromFunction1(value))
    
    inline def set_encodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_encodeProperty", js.Any.fromFunction2(value))
    
    inline def set_find(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "_find", js.Any.fromFunction1(value))
    
    inline def set_getDefaultPropertyValue(value: /* propertyName */ String => Unit): Self = StObject.set(x, "_getDefaultPropertyValue", js.Any.fromFunction1(value))
    
    inline def set_getStoredProperty(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getStoredProperty", js.Any.fromFunction1(value))
    
    inline def set_getTypeDef(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getTypeDef", js.Any.fromFunction1(value))
    
    inline def set_getXMLAttributes(value: () => js.Array[js.Tuple2[String, Any]]): Self = StObject.set(x, "_getXMLAttributes", js.Any.fromFunction0(value))
    
    inline def set_getXMLContent(value: () => js.Array[String]): Self = StObject.set(x, "_getXMLContent", js.Any.fromFunction0(value))
    
    inline def set_getXMLElementName(value: () => String): Self = StObject.set(x, "_getXMLElementName", js.Any.fromFunction0(value))
    
    inline def set_getXMLFooter(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLFooter", js.Any.fromFunction1(value))
    
    inline def set_getXMLHeader(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLHeader", js.Any.fromFunction1(value))
    
    inline def set_initLayout(value: /* props */ js.UndefOr[Layout] => Unit): Self = StObject.set(x, "_initLayout", js.Any.fromFunction1(value))
    
    inline def set_isDisposed(value: `true`): Self = StObject.set(x, "_isDisposed", value.asInstanceOf[js.Any])
    
    inline def set_isDisposedUndefined: Self = StObject.set(x, "_isDisposed", js.undefined)
    
    inline def set_isListening(value: /* eventType */ String => Boolean): Self = StObject.set(x, "_isListening", js.Any.fromFunction1(value))
    
    inline def set_layout(value: typings.tabris.mod.Layout): Self = StObject.set(x, "_layout", value.asInstanceOf[js.Any])
    
    inline def set_listen(value: (/* eventName */ String, /* listening */ Boolean) => Unit): Self = StObject.set(x, "_listen", js.Any.fromFunction2(value))
    
    inline def set_nativeCall(value: (/* methodName */ String, /* parameters */ js.Object) => Any): Self = StObject.set(x, "_nativeCall", js.Any.fromFunction2(value))
    
    inline def set_nativeCreate(value: /* param */ js.UndefOr[StringDictionary[Any]] => Unit): Self = StObject.set(x, "_nativeCreate", js.Any.fromFunction1(value))
    
    inline def set_nativeGet(value: /* propertyName */ String => Any): Self = StObject.set(x, "_nativeGet", js.Any.fromFunction1(value))
    
    inline def set_nativeListen(value: (/* eventType */ String, /* listen */ Boolean) => Unit): Self = StObject.set(x, "_nativeListen", js.Any.fromFunction2(value))
    
    inline def set_nativeSet(value: (/* propertyName */ String, /* value */ Any) => Unit): Self = StObject.set(x, "_nativeSet", js.Any.fromFunction2(value))
    
    inline def set_nativeType(value: () => String): Self = StObject.set(x, "_nativeType", js.Any.fromFunction0(value))
    
    inline def set_onoff(value: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Unit): Self = StObject.set(x, "_onoff", js.Any.fromFunction3(value))
    
    inline def set_register(value: () => Unit): Self = StObject.set(x, "_register", js.Any.fromFunction0(value))
    
    inline def set_release(value: () => Unit): Self = StObject.set(x, "_release", js.Any.fromFunction0(value))
    
    inline def set_removeChild(value: /* child */ Widget[Any] => Unit): Self = StObject.set(x, "_removeChild", js.Any.fromFunction1(value))
    
    inline def set_reorderProperties(value: /* propertyNames */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "_reorderProperties", js.Any.fromFunction1(value))
    
    inline def set_scheduleRenderChildren(value: () => Unit): Self = StObject.set(x, "_scheduleRenderChildren", js.Any.fromFunction0(value))
    
    inline def set_setParent(value: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "_setParent", js.Any.fromFunction2(value))
    
    inline def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ Any) => Unit): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2(value))
    
    inline def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    inline def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ Any) => Unit): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2(value))
    
    inline def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}

package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.global.tabris.widgets.WebView
import typings.tabris.mod.AnimationOptions
import typings.tabris.mod.Bounds
import typings.tabris.mod.BoxDimensions
import typings.tabris.mod.ChangeListeners
import typings.tabris.mod.ColorValue
import typings.tabris.mod.Composite
import typings.tabris.mod.ConstraintValue
import typings.tabris.mod.Dimension
import typings.tabris.mod.EventObject
import typings.tabris.mod.ImageValue
import typings.tabris.mod.JSXAttributes
import typings.tabris.mod.LayoutDataValue
import typings.tabris.mod.LinearGradientValue
import typings.tabris.mod.Listeners
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Omit
import typings.tabris.mod.Properties
import typings.tabris.mod.Selector
import typings.tabris.mod.SiblingReferenceValue
import typings.tabris.mod.Transformation
import typings.tabris.mod.WebViewDownloadEvent
import typings.tabris.mod.WebViewMessageEvent
import typings.tabris.mod.WebViewNavigateEvent
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
import typings.tabris.tabrisStrings.canGoBack
import typings.tabris.tabrisStrings.canGoForward
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.classList
import typings.tabris.tabrisStrings.cornerRadius
import typings.tabris.tabrisStrings.data
import typings.tabris.tabrisStrings.elevation
import typings.tabris.tabrisStrings.enabled
import typings.tabris.tabrisStrings.excludeFromLayout
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.highlightOnTouch
import typings.tabris.tabrisStrings.html
import typings.tabris.tabrisStrings.id
import typings.tabris.tabrisStrings.jsxAttributes
import typings.tabris.tabrisStrings.layoutData
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.opacity
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.transform
import typings.tabris.tabrisStrings.url
import typings.tabris.tabrisStrings.visible
import typings.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.Omit<tabris.tabris.widgets.WebView, 'canGoBack' | 'canGoForward'>, 'set'> */
trait OmitOmitWebViewcanGoBackcAppendTo extends StObject {
  
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
  
  def _checkDisposed(): Unit
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit]
  
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
  
  var _isDisposed: js.UndefOr[`true`] = js.undefined
  
  def _isListening(eventType: String): Boolean
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean]
  
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
  
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String]
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]]
  
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
  
  def appendTo(parent: Composite[Widget[Any]]): WebView
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget[Any]], WebView]
  
  var background: LinearGradientValue | ColorValue | ImageValue
  
  var baseline: SiblingReferenceValue | auto | `true`
  
  var bottom: ConstraintValue
  
  var bounds: Bounds
  
  var centerX: typings.tabris.mod.Offset | auto | `true`
  
  var centerY: typings.tabris.mod.Offset | auto | `true`
  
  var cid: String
  
  var `class`: String
  
  var classList: js.Array[String]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[
    /* properties */ js.UndefOr[
      Properties[OmitWebViewcanGoBackcanGoAppendTo, Omit[OmitWebViewcanGoBackcanGoAppendTo, set]]
    ], 
    Any
  ]
  
  var cornerRadius: Double
  
  var data: Any
  
  var defineChangeEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvents: js.UndefOr[Any] = js.undefined
  
  var defineProperties: js.UndefOr[Any] = js.undefined
  
  var defineProperty: js.UndefOr[Any] = js.undefined
  
  def detach(): WebView
  @JSName("detach")
  var detach_Original: js.Function0[WebView]
  
  def dispose(): Unit
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit]
  
  var elevation: Double
  
  var enabled: Boolean
  
  var excludeFromLayout: Boolean
  
  var extend: js.UndefOr[Any] = js.undefined
  
  def goBack(): Unit
  @JSName("goBack")
  var goBack_Original: js.Function0[Unit]
  
  def goForward(): Unit
  @JSName("goForward")
  var goForward_Original: js.Function0[Unit]
  
  var height: Dimension | auto
  
  var highlightOnTouch: Boolean
  
  var html: String
  
  var id: String
  
  var initScript: String
  
  def insertAfter(widget: Widget[Any]): WebView
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget[Any], WebView]
  
  def insertBefore(widget: Widget[Any]): WebView
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget[Any], WebView]
  
  def isDisposed(): Boolean
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean]
  
  var jsxAttributes: (JSXAttributes[WebView, Omit[WebView, set | typings.tabris.tabrisStrings.jsxAttributes]]) & js.Object
  
  var layoutData: LayoutDataValue
  
  var left: ConstraintValue
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): WebView
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): WebView
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    WebView
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): WebView
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): WebView
  
  var onBackgroundChanged: ChangeListeners[WebView, background]
  
  var onBaselineChanged: ChangeListeners[WebView, baseline]
  
  var onBottomChanged: ChangeListeners[WebView, bottom]
  
  var onBoundsChanged: ChangeListeners[WebView, bounds]
  
  var onCanGoBackChanged: ChangeListeners[WebView, canGoBack]
  
  var onCanGoForwardChanged: ChangeListeners[WebView, canGoForward]
  
  var onCenterXChanged: ChangeListeners[WebView, centerX]
  
  var onCenterYChanged: ChangeListeners[WebView, centerY]
  
  var onClassChanged: ChangeListeners[WebView, `class`]
  
  var onClassListChanged: ChangeListeners[WebView, classList]
  
  var onCornerRadiusChanged: ChangeListeners[WebView, cornerRadius]
  
  var onDataChanged: ChangeListeners[WebView, data]
  
  var onDispose: Listeners[EventObject[WebView]]
  
  var onDownload: Listeners[WebViewDownloadEvent[WebView]]
  
  var onElevationChanged: ChangeListeners[WebView, elevation]
  
  var onEnabledChanged: ChangeListeners[WebView, enabled]
  
  var onExcludeFromLayoutChanged: ChangeListeners[WebView, excludeFromLayout]
  
  var onHeightChanged: ChangeListeners[WebView, height]
  
  var onHighlightOnTouchChanged: ChangeListeners[WebView, highlightOnTouch]
  
  var onHtmlChanged: ChangeListeners[WebView, html]
  
  var onIdChanged: ChangeListeners[WebView, id]
  
  var onLayoutDataChanged: ChangeListeners[WebView, layoutData]
  
  var onLeftChanged: ChangeListeners[WebView, left]
  
  var onLoad: Listeners[EventObject[WebView]]
  
  var onLongPress: Listeners[WidgetLongPressEvent[WebView]]
  
  var onMessage: Listeners[WebViewMessageEvent[WebView]]
  
  var onNavigate: Listeners[WebViewNavigateEvent[WebView]]
  
  var onOpacityChanged: ChangeListeners[WebView, opacity]
  
  var onPan: Listeners[WidgetPanEvent[WebView]]
  
  var onPanDown: Listeners[WidgetPanEvent[WebView]]
  
  var onPanHorizontal: Listeners[WidgetPanEvent[WebView]]
  
  var onPanLeft: Listeners[WidgetPanEvent[WebView]]
  
  var onPanRight: Listeners[WidgetPanEvent[WebView]]
  
  var onPanUp: Listeners[WidgetPanEvent[WebView]]
  
  var onPanVertical: Listeners[WidgetPanEvent[WebView]]
  
  var onResize: Listeners[WidgetResizeEvent[WebView]]
  
  var onRightChanged: ChangeListeners[WebView, right]
  
  var onSwipeDown: Listeners[WidgetSwipeEvent[WebView]]
  
  var onSwipeLeft: Listeners[WidgetSwipeEvent[WebView]]
  
  var onSwipeRight: Listeners[WidgetSwipeEvent[WebView]]
  
  var onSwipeUp: Listeners[WidgetSwipeEvent[WebView]]
  
  var onTap: Listeners[WidgetTapEvent[WebView]]
  
  var onTopChanged: ChangeListeners[WebView, top]
  
  var onTouchCancel: Listeners[WidgetTouchEvent[WebView]]
  
  var onTouchEnd: Listeners[WidgetTouchEvent[WebView]]
  
  var onTouchMove: Listeners[WidgetTouchEvent[WebView]]
  
  var onTouchStart: Listeners[WidgetTouchEvent[WebView]]
  
  var onTransformChanged: ChangeListeners[WebView, transform]
  
  var onUrlChanged: ChangeListeners[WebView, url]
  
  var onVisibleChanged: ChangeListeners[WebView, visible]
  
  var onWidthChanged: ChangeListeners[WebView, width]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    WebView
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): WebView
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): WebView
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    WebView
  ]
  
  var opacity: Double
  
  var padding: js.UndefOr[BoxDimensions | Null] = js.undefined
  
  def parent(): Composite[Widget[Any]]
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget[Any]]]
  
  def postMessage(message: String, targetOrigin: String): WebView
  @JSName("postMessage")
  var postMessage_Original: js.Function2[/* message */ String, /* targetOrigin */ String, WebView]
  
  var right: ConstraintValue
  
  def siblings[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def siblings[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("siblings")
  var siblings_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var top: ConstraintValue
  
  var transform: Transformation
  
  def trigger(`type`: String): WebView
  
  def triggerAsync(`type`: String): js.Promise[WebView]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[WebView]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, WebView]
  
  var url: String
  
  var visible: Boolean
  
  var width: Dimension | auto
}
object OmitOmitWebViewcanGoBackcAppendTo {
  
  inline def apply(
    $getProperty: /* name */ String => Any,
    $getPropertyGetter: /* propertyName */ String => Any,
    $getPropertySetter: /* propertyName */ String => Any,
    $props: Any,
    $setProperty: (/* name */ String, /* value */ Any) => Unit,
    $trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Unit,
    _checkDisposed: () => Unit,
    _decodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _dispose: /* skipNative */ js.UndefOr[Boolean] => Unit,
    _encodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _getDefaultPropertyValue: /* propertyName */ String => Unit,
    _getStoredProperty: /* propertyName */ String => Any,
    _getTypeDef: /* propertyName */ String => Any,
    _getXMLAttributes: () => js.Array[js.Tuple2[String, Any]],
    _getXMLContent: () => js.Array[String],
    _getXMLElementName: () => String,
    _getXMLFooter: /* hasChild */ Boolean => String,
    _getXMLHeader: /* hasChild */ Boolean => String,
    _isListening: /* eventType */ String => Boolean,
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
    _reorderProperties: /* propertyNames */ js.Array[String] => js.Array[String],
    _setParent: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Unit,
    _storeProperty: (/* propertyName */ String, /* encodedValue */ Any) => Unit,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ Any) => Unit,
    _wasSet: /* propertyName */ String => Boolean,
    absoluteBounds: Bounds,
    animate: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit],
    appendTo: /* parent */ Composite[Widget[Any]] => WebView,
    baseline: SiblingReferenceValue | auto | `true`,
    bottom: ConstraintValue,
    bounds: Bounds,
    centerX: typings.tabris.mod.Offset | auto | `true`,
    centerY: typings.tabris.mod.Offset | auto | `true`,
    cid: String,
    `class`: String,
    classList: js.Array[String],
    constructor: /* properties */ js.UndefOr[
      Properties[OmitWebViewcanGoBackcanGoAppendTo, Omit[OmitWebViewcanGoBackcanGoAppendTo, set]]
    ] => Any,
    cornerRadius: Double,
    data: Any,
    detach: () => WebView,
    dispose: () => Unit,
    elevation: Double,
    enabled: Boolean,
    excludeFromLayout: Boolean,
    goBack: () => Unit,
    goForward: () => Unit,
    height: Dimension | auto,
    highlightOnTouch: Boolean,
    html: String,
    id: String,
    initScript: String,
    insertAfter: /* widget */ Widget[Any] => WebView,
    insertBefore: /* widget */ Widget[Any] => WebView,
    isDisposed: () => Boolean,
    jsxAttributes: (JSXAttributes[WebView, Omit[WebView, set | jsxAttributes]]) & js.Object,
    layoutData: LayoutDataValue,
    left: ConstraintValue,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => WebView,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => WebView,
    onBackgroundChanged: ChangeListeners[WebView, background],
    onBaselineChanged: ChangeListeners[WebView, baseline],
    onBottomChanged: ChangeListeners[WebView, bottom],
    onBoundsChanged: ChangeListeners[WebView, bounds],
    onCanGoBackChanged: ChangeListeners[WebView, canGoBack],
    onCanGoForwardChanged: ChangeListeners[WebView, canGoForward],
    onCenterXChanged: ChangeListeners[WebView, centerX],
    onCenterYChanged: ChangeListeners[WebView, centerY],
    onClassChanged: ChangeListeners[WebView, `class`],
    onClassListChanged: ChangeListeners[WebView, classList],
    onCornerRadiusChanged: ChangeListeners[WebView, cornerRadius],
    onDataChanged: ChangeListeners[WebView, data],
    onDispose: Listeners[EventObject[WebView]],
    onDownload: Listeners[WebViewDownloadEvent[WebView]],
    onElevationChanged: ChangeListeners[WebView, elevation],
    onEnabledChanged: ChangeListeners[WebView, enabled],
    onExcludeFromLayoutChanged: ChangeListeners[WebView, excludeFromLayout],
    onHeightChanged: ChangeListeners[WebView, height],
    onHighlightOnTouchChanged: ChangeListeners[WebView, highlightOnTouch],
    onHtmlChanged: ChangeListeners[WebView, html],
    onIdChanged: ChangeListeners[WebView, id],
    onLayoutDataChanged: ChangeListeners[WebView, layoutData],
    onLeftChanged: ChangeListeners[WebView, left],
    onLoad: Listeners[EventObject[WebView]],
    onLongPress: Listeners[WidgetLongPressEvent[WebView]],
    onMessage: Listeners[WebViewMessageEvent[WebView]],
    onNavigate: Listeners[WebViewNavigateEvent[WebView]],
    onOpacityChanged: ChangeListeners[WebView, opacity],
    onPan: Listeners[WidgetPanEvent[WebView]],
    onPanDown: Listeners[WidgetPanEvent[WebView]],
    onPanHorizontal: Listeners[WidgetPanEvent[WebView]],
    onPanLeft: Listeners[WidgetPanEvent[WebView]],
    onPanRight: Listeners[WidgetPanEvent[WebView]],
    onPanUp: Listeners[WidgetPanEvent[WebView]],
    onPanVertical: Listeners[WidgetPanEvent[WebView]],
    onResize: Listeners[WidgetResizeEvent[WebView]],
    onRightChanged: ChangeListeners[WebView, right],
    onSwipeDown: Listeners[WidgetSwipeEvent[WebView]],
    onSwipeLeft: Listeners[WidgetSwipeEvent[WebView]],
    onSwipeRight: Listeners[WidgetSwipeEvent[WebView]],
    onSwipeUp: Listeners[WidgetSwipeEvent[WebView]],
    onTap: Listeners[WidgetTapEvent[WebView]],
    onTopChanged: ChangeListeners[WebView, top],
    onTouchCancel: Listeners[WidgetTouchEvent[WebView]],
    onTouchEnd: Listeners[WidgetTouchEvent[WebView]],
    onTouchMove: Listeners[WidgetTouchEvent[WebView]],
    onTouchStart: Listeners[WidgetTouchEvent[WebView]],
    onTransformChanged: ChangeListeners[WebView, transform],
    onUrlChanged: ChangeListeners[WebView, url],
    onVisibleChanged: ChangeListeners[WebView, visible],
    onWidthChanged: ChangeListeners[WebView, width],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => WebView,
    opacity: Double,
    parent: () => Composite[Widget[Any]],
    postMessage: (/* message */ String, /* targetOrigin */ String) => WebView,
    right: ConstraintValue,
    siblings: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    top: ConstraintValue,
    transform: Transformation,
    trigger: /* type */ String => WebView,
    triggerAsync: /* type */ String => js.Promise[WebView],
    url: String,
    visible: Boolean,
    width: Dimension | auto
  ): OmitOmitWebViewcanGoBackcAppendTo = {
    val __obj = js.Dynamic.literal($getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2($setProperty), $trigger = js.Any.fromFunction2($trigger), _checkDisposed = js.Any.fromFunction0(_checkDisposed), _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1(_dispose), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _getDefaultPropertyValue = js.Any.fromFunction1(_getDefaultPropertyValue), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = js.Any.fromFunction0(_getXMLAttributes), _getXMLContent = js.Any.fromFunction0(_getXMLContent), _getXMLElementName = js.Any.fromFunction0(_getXMLElementName), _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _isListening = js.Any.fromFunction1(_isListening), _listen = js.Any.fromFunction2(_listen), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1(_nativeCreate), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2(_nativeListen), _nativeSet = js.Any.fromFunction2(_nativeSet), _nativeType = js.Any.fromFunction0(_nativeType), _onoff = js.Any.fromFunction3(_onoff), _register = js.Any.fromFunction0(_register), _release = js.Any.fromFunction0(_release), _reorderProperties = js.Any.fromFunction1(_reorderProperties), _setParent = js.Any.fromFunction2(_setParent), _storeProperty = js.Any.fromFunction2(_storeProperty), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2(_triggerChangeEvent), _wasSet = js.Any.fromFunction1(_wasSet), absoluteBounds = absoluteBounds.asInstanceOf[js.Any], animate = js.Any.fromFunction2(animate), appendTo = js.Any.fromFunction1(appendTo), baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), dispose = js.Any.fromFunction0(dispose), elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], excludeFromLayout = excludeFromLayout.asInstanceOf[js.Any], goBack = js.Any.fromFunction0(goBack), goForward = js.Any.fromFunction0(goForward), height = height.asInstanceOf[js.Any], highlightOnTouch = highlightOnTouch.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initScript = initScript.asInstanceOf[js.Any], insertAfter = js.Any.fromFunction1(insertAfter), insertBefore = js.Any.fromFunction1(insertBefore), isDisposed = js.Any.fromFunction0(isDisposed), jsxAttributes = jsxAttributes.asInstanceOf[js.Any], layoutData = layoutData.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onBackgroundChanged = onBackgroundChanged.asInstanceOf[js.Any], onBaselineChanged = onBaselineChanged.asInstanceOf[js.Any], onBottomChanged = onBottomChanged.asInstanceOf[js.Any], onBoundsChanged = onBoundsChanged.asInstanceOf[js.Any], onCanGoBackChanged = onCanGoBackChanged.asInstanceOf[js.Any], onCanGoForwardChanged = onCanGoForwardChanged.asInstanceOf[js.Any], onCenterXChanged = onCenterXChanged.asInstanceOf[js.Any], onCenterYChanged = onCenterYChanged.asInstanceOf[js.Any], onClassChanged = onClassChanged.asInstanceOf[js.Any], onClassListChanged = onClassListChanged.asInstanceOf[js.Any], onCornerRadiusChanged = onCornerRadiusChanged.asInstanceOf[js.Any], onDataChanged = onDataChanged.asInstanceOf[js.Any], onDispose = onDispose.asInstanceOf[js.Any], onDownload = onDownload.asInstanceOf[js.Any], onElevationChanged = onElevationChanged.asInstanceOf[js.Any], onEnabledChanged = onEnabledChanged.asInstanceOf[js.Any], onExcludeFromLayoutChanged = onExcludeFromLayoutChanged.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onHighlightOnTouchChanged = onHighlightOnTouchChanged.asInstanceOf[js.Any], onHtmlChanged = onHtmlChanged.asInstanceOf[js.Any], onIdChanged = onIdChanged.asInstanceOf[js.Any], onLayoutDataChanged = onLayoutDataChanged.asInstanceOf[js.Any], onLeftChanged = onLeftChanged.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLongPress = onLongPress.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onNavigate = onNavigate.asInstanceOf[js.Any], onOpacityChanged = onOpacityChanged.asInstanceOf[js.Any], onPan = onPan.asInstanceOf[js.Any], onPanDown = onPanDown.asInstanceOf[js.Any], onPanHorizontal = onPanHorizontal.asInstanceOf[js.Any], onPanLeft = onPanLeft.asInstanceOf[js.Any], onPanRight = onPanRight.asInstanceOf[js.Any], onPanUp = onPanUp.asInstanceOf[js.Any], onPanVertical = onPanVertical.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onRightChanged = onRightChanged.asInstanceOf[js.Any], onSwipeDown = onSwipeDown.asInstanceOf[js.Any], onSwipeLeft = onSwipeLeft.asInstanceOf[js.Any], onSwipeRight = onSwipeRight.asInstanceOf[js.Any], onSwipeUp = onSwipeUp.asInstanceOf[js.Any], onTap = onTap.asInstanceOf[js.Any], onTopChanged = onTopChanged.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransformChanged = onTransformChanged.asInstanceOf[js.Any], onUrlChanged = onUrlChanged.asInstanceOf[js.Any], onVisibleChanged = onVisibleChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), opacity = opacity.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), postMessage = js.Any.fromFunction2(postMessage), right = right.asInstanceOf[js.Any], siblings = js.Any.fromFunction1(siblings), top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), url = url.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], background = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitOmitWebViewcanGoBackcAppendTo]
  }
  
  extension [Self <: OmitOmitWebViewcanGoBackcAppendTo](x: Self) {
    
    inline def set$getProperty(value: /* name */ String => Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    inline def set$getPropertyGetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    inline def set$getPropertySetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    inline def set$props(value: Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$setProperty(value: (/* name */ String, /* value */ Any) => Unit): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2(value))
    
    inline def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Unit): Self = StObject.set(x, "$trigger", js.Any.fromFunction2(value))
    
    inline def setAbsoluteBounds(value: Bounds): Self = StObject.set(x, "absoluteBounds", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit]): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
    
    inline def setAppendTo(value: /* parent */ Composite[Widget[Any]] => WebView): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setBackground(value: LinearGradientValue | ColorValue | ImageValue): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBaseline(value: SiblingReferenceValue | auto | `true`): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: ConstraintValue): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: typings.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: typings.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    inline def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value*))
    
    inline def setConstructor(
      value: /* properties */ js.UndefOr[
          Properties[OmitWebViewcanGoBackcanGoAppendTo, Omit[OmitWebViewcanGoBackcanGoAppendTo, set]]
        ] => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
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
    
    inline def setDetach(value: () => WebView): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setGoBack(value: () => Unit): Self = StObject.set(x, "goBack", js.Any.fromFunction0(value))
    
    inline def setGoForward(value: () => Unit): Self = StObject.set(x, "goForward", js.Any.fromFunction0(value))
    
    inline def setHeight(value: Dimension | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnTouch(value: Boolean): Self = StObject.set(x, "highlightOnTouch", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitScript(value: String): Self = StObject.set(x, "initScript", value.asInstanceOf[js.Any])
    
    inline def setInsertAfter(value: /* widget */ Widget[Any] => WebView): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertBefore(value: /* widget */ Widget[Any] => WebView): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setIsDisposed(value: () => Boolean): Self = StObject.set(x, "isDisposed", js.Any.fromFunction0(value))
    
    inline def setJsxAttributes(value: (JSXAttributes[WebView, Omit[WebView, set | jsxAttributes]]) & js.Object): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: ConstraintValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => WebView
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    inline def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => WebView
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnBackgroundChanged(value: ChangeListeners[WebView, background]): Self = StObject.set(x, "onBackgroundChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBaselineChanged(value: ChangeListeners[WebView, baseline]): Self = StObject.set(x, "onBaselineChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBottomChanged(value: ChangeListeners[WebView, bottom]): Self = StObject.set(x, "onBottomChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBoundsChanged(value: ChangeListeners[WebView, bounds]): Self = StObject.set(x, "onBoundsChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCanGoBackChanged(value: ChangeListeners[WebView, canGoBack]): Self = StObject.set(x, "onCanGoBackChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCanGoForwardChanged(value: ChangeListeners[WebView, canGoForward]): Self = StObject.set(x, "onCanGoForwardChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterXChanged(value: ChangeListeners[WebView, centerX]): Self = StObject.set(x, "onCenterXChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterYChanged(value: ChangeListeners[WebView, centerY]): Self = StObject.set(x, "onCenterYChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassChanged(value: ChangeListeners[WebView, `class`]): Self = StObject.set(x, "onClassChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassListChanged(value: ChangeListeners[WebView, classList]): Self = StObject.set(x, "onClassListChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCornerRadiusChanged(value: ChangeListeners[WebView, cornerRadius]): Self = StObject.set(x, "onCornerRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDataChanged(value: ChangeListeners[WebView, data]): Self = StObject.set(x, "onDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: Listeners[EventObject[WebView]]): Self = StObject.set(x, "onDispose", value.asInstanceOf[js.Any])
    
    inline def setOnDownload(value: Listeners[WebViewDownloadEvent[WebView]]): Self = StObject.set(x, "onDownload", value.asInstanceOf[js.Any])
    
    inline def setOnElevationChanged(value: ChangeListeners[WebView, elevation]): Self = StObject.set(x, "onElevationChanged", value.asInstanceOf[js.Any])
    
    inline def setOnEnabledChanged(value: ChangeListeners[WebView, enabled]): Self = StObject.set(x, "onEnabledChanged", value.asInstanceOf[js.Any])
    
    inline def setOnExcludeFromLayoutChanged(value: ChangeListeners[WebView, excludeFromLayout]): Self = StObject.set(x, "onExcludeFromLayoutChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHeightChanged(value: ChangeListeners[WebView, height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHighlightOnTouchChanged(value: ChangeListeners[WebView, highlightOnTouch]): Self = StObject.set(x, "onHighlightOnTouchChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHtmlChanged(value: ChangeListeners[WebView, html]): Self = StObject.set(x, "onHtmlChanged", value.asInstanceOf[js.Any])
    
    inline def setOnIdChanged(value: ChangeListeners[WebView, id]): Self = StObject.set(x, "onIdChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutDataChanged(value: ChangeListeners[WebView, layoutData]): Self = StObject.set(x, "onLayoutDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLeftChanged(value: ChangeListeners[WebView, left]): Self = StObject.set(x, "onLeftChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLoad(value: Listeners[EventObject[WebView]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLongPress(value: Listeners[WidgetLongPressEvent[WebView]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: Listeners[WebViewMessageEvent[WebView]]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    inline def setOnNavigate(value: Listeners[WebViewNavigateEvent[WebView]]): Self = StObject.set(x, "onNavigate", value.asInstanceOf[js.Any])
    
    inline def setOnOpacityChanged(value: ChangeListeners[WebView, opacity]): Self = StObject.set(x, "onOpacityChanged", value.asInstanceOf[js.Any])
    
    inline def setOnPan(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPan", value.asInstanceOf[js.Any])
    
    inline def setOnPanDown(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPanDown", value.asInstanceOf[js.Any])
    
    inline def setOnPanHorizontal(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPanHorizontal", value.asInstanceOf[js.Any])
    
    inline def setOnPanLeft(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPanLeft", value.asInstanceOf[js.Any])
    
    inline def setOnPanRight(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPanRight", value.asInstanceOf[js.Any])
    
    inline def setOnPanUp(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPanUp", value.asInstanceOf[js.Any])
    
    inline def setOnPanVertical(value: Listeners[WidgetPanEvent[WebView]]): Self = StObject.set(x, "onPanVertical", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: Listeners[WidgetResizeEvent[WebView]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnRightChanged(value: ChangeListeners[WebView, right]): Self = StObject.set(x, "onRightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeDown(value: Listeners[WidgetSwipeEvent[WebView]]): Self = StObject.set(x, "onSwipeDown", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeLeft(value: Listeners[WidgetSwipeEvent[WebView]]): Self = StObject.set(x, "onSwipeLeft", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeRight(value: Listeners[WidgetSwipeEvent[WebView]]): Self = StObject.set(x, "onSwipeRight", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeUp(value: Listeners[WidgetSwipeEvent[WebView]]): Self = StObject.set(x, "onSwipeUp", value.asInstanceOf[js.Any])
    
    inline def setOnTap(value: Listeners[WidgetTapEvent[WebView]]): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    inline def setOnTopChanged(value: ChangeListeners[WebView, top]): Self = StObject.set(x, "onTopChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancel(value: Listeners[WidgetTouchEvent[WebView]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEnd(value: Listeners[WidgetTouchEvent[WebView]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMove(value: Listeners[WidgetTouchEvent[WebView]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStart(value: Listeners[WidgetTouchEvent[WebView]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTransformChanged(value: ChangeListeners[WebView, transform]): Self = StObject.set(x, "onTransformChanged", value.asInstanceOf[js.Any])
    
    inline def setOnUrlChanged(value: ChangeListeners[WebView, url]): Self = StObject.set(x, "onUrlChanged", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChanged(value: ChangeListeners[WebView, visible]): Self = StObject.set(x, "onVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOnWidthChanged(value: ChangeListeners[WebView, width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => WebView
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: BoxDimensions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setParent(value: () => Composite[Widget[Any]]): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    inline def setPostMessage(value: (/* message */ String, /* targetOrigin */ String) => WebView): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
    
    inline def setRight(value: ConstraintValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSiblings(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "siblings", js.Any.fromFunction1(value))
    
    inline def setTop(value: ConstraintValue): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: /* type */ String => WebView): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    inline def setTriggerAsync(value: /* type */ String => js.Promise[WebView]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Dimension | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def set_checkDisposed(value: () => Unit): Self = StObject.set(x, "_checkDisposed", js.Any.fromFunction0(value))
    
    inline def set_decodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_decodeProperty", js.Any.fromFunction2(value))
    
    inline def set_dispose(value: /* skipNative */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "_dispose", js.Any.fromFunction1(value))
    
    inline def set_encodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_encodeProperty", js.Any.fromFunction2(value))
    
    inline def set_getDefaultPropertyValue(value: /* propertyName */ String => Unit): Self = StObject.set(x, "_getDefaultPropertyValue", js.Any.fromFunction1(value))
    
    inline def set_getStoredProperty(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getStoredProperty", js.Any.fromFunction1(value))
    
    inline def set_getTypeDef(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getTypeDef", js.Any.fromFunction1(value))
    
    inline def set_getXMLAttributes(value: () => js.Array[js.Tuple2[String, Any]]): Self = StObject.set(x, "_getXMLAttributes", js.Any.fromFunction0(value))
    
    inline def set_getXMLContent(value: () => js.Array[String]): Self = StObject.set(x, "_getXMLContent", js.Any.fromFunction0(value))
    
    inline def set_getXMLElementName(value: () => String): Self = StObject.set(x, "_getXMLElementName", js.Any.fromFunction0(value))
    
    inline def set_getXMLFooter(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLFooter", js.Any.fromFunction1(value))
    
    inline def set_getXMLHeader(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLHeader", js.Any.fromFunction1(value))
    
    inline def set_isDisposed(value: `true`): Self = StObject.set(x, "_isDisposed", value.asInstanceOf[js.Any])
    
    inline def set_isDisposedUndefined: Self = StObject.set(x, "_isDisposed", js.undefined)
    
    inline def set_isListening(value: /* eventType */ String => Boolean): Self = StObject.set(x, "_isListening", js.Any.fromFunction1(value))
    
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
    
    inline def set_reorderProperties(value: /* propertyNames */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "_reorderProperties", js.Any.fromFunction1(value))
    
    inline def set_setParent(value: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "_setParent", js.Any.fromFunction2(value))
    
    inline def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ Any) => Unit): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2(value))
    
    inline def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    inline def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ Any) => Unit): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2(value))
    
    inline def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}

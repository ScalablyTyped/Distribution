package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.Blob
import typings.tabris.mod.AnimationOptions
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
import typings.tabris.mod.PdfViewLoadEvent
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
import typings.tabris.mod.widgets.PdfView
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
import typings.tabris.tabrisStrings.elevation
import typings.tabris.tabrisStrings.enabled
import typings.tabris.tabrisStrings.excludeFromLayout
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.highlightOnTouch
import typings.tabris.tabrisStrings.id
import typings.tabris.tabrisStrings.jsxAttributes
import typings.tabris.tabrisStrings.layoutData
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.opacity
import typings.tabris.tabrisStrings.pageBackground
import typings.tabris.tabrisStrings.pageElevation
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.spacing
import typings.tabris.tabrisStrings.src
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.transform
import typings.tabris.tabrisStrings.visible
import typings.tabris.tabrisStrings.width
import typings.tabris.tabrisStrings.zoomEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.widgets.PdfView, 'set'> */
trait OmitPdfViewset extends StObject {
  
  @JSName("$getProperty")
  def $getProperty(name: String): js.Any
  
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): js.Any
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, js.Any]
  
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): js.Any
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, js.Any]
  
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, js.Any]
  
  @JSName("$props")
  var $props: js.Any
  
  @JSName("$setProperty")
  def $setProperty(name: String, value: js.Any): Unit
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ js.Any, Unit]
  
  @JSName("$trigger")
  def $trigger(eventType: String): Unit
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit]
  
  def _checkDisposed(): Unit
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit]
  
  def _decodeProperty(propertyName: String, value: js.Any): js.Any
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, js.Any]
  
  def _dispose(): Unit
  def _dispose(skipNative: Boolean): Unit
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit]
  
  def _encodeProperty(propertyName: String, value: js.Any): js.Any
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, js.Any]
  
  def _getDefaultPropertyValue(propertyName: String): Unit
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit]
  
  def _getStoredProperty(propertyName: String): js.Any
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, js.Any]
  
  def _getTypeDef(propertyName: String): js.Any
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, js.Any]
  
  def _getXMLAttributes(): js.Array[js.Tuple2[String, js.Any]]
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, js.Any]]]
  
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
  
  def _nativeCall(methodName: String, parameters: js.Object): js.Any
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, js.Any]
  
  def _nativeCreate(): Unit
  def _nativeCreate(param: StringDictionary[js.Any]): Unit
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[js.Any]], Unit]
  
  def _nativeGet(propertyName: String): js.Any
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, js.Any]
  
  def _nativeListen(eventType: String, listen: Boolean): Unit
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function2[/* eventType */ String, /* listen */ Boolean, Unit]
  
  def _nativeSet(propertyName: String, value: js.Any): Unit
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, Unit]
  
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
  
  def _setParent(parent: Composite[Widget]): Unit
  def _setParent(parent: Composite[Widget], index: Double): Unit
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget], /* index */ js.UndefOr[Double], Unit]
  
  def _storeProperty(propertyName: String, encodedValue: js.Any): Unit
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ js.Any, Unit]
  
  def _trigger(eventType: String): Boolean
  def _trigger(eventType: String, eventData: js.Object): Boolean
  
  def _triggerChangeEvent(propertyName: String, newEncodedValue: js.Any): Unit
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ js.Any, Unit]
  
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean]
  
  def _wasSet(propertyName: String): Boolean
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean]
  
  var absoluteBounds: typings.tabris.mod.Bounds
  
  def animate(properties: Opacity, options: AnimationOptions): js.Promise[Unit]
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ Opacity, /* options */ AnimationOptions, js.Promise[Unit]]
  
  def appendTo(parent: Composite[Widget]): PdfView
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget], PdfView]
  
  var background: LinearGradientValue | ColorValue | ImageValue
  
  var baseline: SiblingReferenceValue | auto | `true`
  
  var bottom: ConstraintValue
  
  var bounds: typings.tabris.mod.Bounds
  
  var centerX: typings.tabris.mod.Offset | auto | `true`
  
  var centerY: typings.tabris.mod.Offset | auto | `true`
  
  var cid: String
  
  var `class`: String
  
  var classList: js.Array[String]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[PdfView, Omit[PdfView, set]]], js.Any]
  
  var cornerRadius: Double
  
  var data: StringDictionary[js.Any]
  
  var defineChangeEvent: js.UndefOr[js.Any] = js.undefined
  
  var defineEvent: js.UndefOr[js.Any] = js.undefined
  
  var defineEvents: js.UndefOr[js.Any] = js.undefined
  
  var defineProperties: js.UndefOr[js.Any] = js.undefined
  
  var defineProperty: js.UndefOr[js.Any] = js.undefined
  
  def detach(): PdfView
  @JSName("detach")
  var detach_Original: js.Function0[PdfView]
  
  def dispose(): Unit
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit]
  
  var elevation: Double
  
  var enabled: Boolean
  
  var excludeFromLayout: Boolean
  
  var extend: js.UndefOr[js.Any] = js.undefined
  
  var height: Dimension | auto
  
  var highlightOnTouch: Boolean
  
  var id: String
  
  def insertAfter(widget: Widget): PdfView
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget, PdfView]
  
  def insertBefore(widget: Widget): PdfView
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget, PdfView]
  
  def isDisposed(): Boolean
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean]
  
  var jsxAttributes: (JSXAttributes[PdfView, Omit[PdfView, set | typings.tabris.tabrisStrings.jsxAttributes]]) & `2`
  
  var layoutData: LayoutDataValue
  
  var left: ConstraintValue
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): PdfView
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): PdfView
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    PdfView
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], js.Any]): PdfView
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], js.Any],
    context: js.Object
  ): PdfView
  
  var onBackgroundChanged: ChangeListeners[PdfView, background]
  
  var onBaselineChanged: ChangeListeners[PdfView, baseline]
  
  var onBottomChanged: ChangeListeners[PdfView, bottom]
  
  var onBoundsChanged: ChangeListeners[PdfView, bounds]
  
  var onCenterXChanged: ChangeListeners[PdfView, centerX]
  
  var onCenterYChanged: ChangeListeners[PdfView, centerY]
  
  var onClassChanged: ChangeListeners[PdfView, `class`]
  
  var onClassListChanged: ChangeListeners[PdfView, classList]
  
  var onCornerRadiusChanged: ChangeListeners[PdfView, cornerRadius]
  
  var onDataChanged: ChangeListeners[PdfView, data]
  
  var onDispose: Listeners[EventObject[PdfView]]
  
  var onElevationChanged: ChangeListeners[PdfView, elevation]
  
  var onEnabledChanged: ChangeListeners[PdfView, enabled]
  
  var onExcludeFromLayoutChanged: ChangeListeners[PdfView, excludeFromLayout]
  
  var onHeightChanged: ChangeListeners[PdfView, height]
  
  var onHighlightOnTouchChanged: ChangeListeners[PdfView, highlightOnTouch]
  
  var onIdChanged: ChangeListeners[PdfView, id]
  
  var onLayoutDataChanged: ChangeListeners[PdfView, layoutData]
  
  var onLeftChanged: ChangeListeners[PdfView, left]
  
  var onLoad: Listeners[PdfViewLoadEvent[PdfView]]
  
  var onLongPress: Listeners[WidgetLongPressEvent[PdfView]]
  
  var onOpacityChanged: ChangeListeners[PdfView, opacity]
  
  var onPageBackgroundChanged: ChangeListeners[PdfView, pageBackground]
  
  var onPageElevationChanged: ChangeListeners[PdfView, pageElevation]
  
  var onPan: Listeners[WidgetPanEvent[PdfView]]
  
  var onPanDown: Listeners[WidgetPanEvent[PdfView]]
  
  var onPanHorizontal: Listeners[WidgetPanEvent[PdfView]]
  
  var onPanLeft: Listeners[WidgetPanEvent[PdfView]]
  
  var onPanRight: Listeners[WidgetPanEvent[PdfView]]
  
  var onPanUp: Listeners[WidgetPanEvent[PdfView]]
  
  var onPanVertical: Listeners[WidgetPanEvent[PdfView]]
  
  var onResize: Listeners[WidgetResizeEvent[PdfView]]
  
  var onRightChanged: ChangeListeners[PdfView, right]
  
  var onSpacingChanged: ChangeListeners[PdfView, spacing]
  
  var onSrcChanged: ChangeListeners[PdfView, src]
  
  var onSwipeDown: Listeners[WidgetSwipeEvent[PdfView]]
  
  var onSwipeLeft: Listeners[WidgetSwipeEvent[PdfView]]
  
  var onSwipeRight: Listeners[WidgetSwipeEvent[PdfView]]
  
  var onSwipeUp: Listeners[WidgetSwipeEvent[PdfView]]
  
  var onTap: Listeners[WidgetTapEvent[PdfView]]
  
  var onTopChanged: ChangeListeners[PdfView, top]
  
  var onTouchCancel: Listeners[WidgetTouchEvent[PdfView]]
  
  var onTouchEnd: Listeners[WidgetTouchEvent[PdfView]]
  
  var onTouchMove: Listeners[WidgetTouchEvent[PdfView]]
  
  var onTouchStart: Listeners[WidgetTouchEvent[PdfView]]
  
  var onTransformChanged: ChangeListeners[PdfView, transform]
  
  var onVisibleChanged: ChangeListeners[PdfView, visible]
  
  var onWidthChanged: ChangeListeners[PdfView, width]
  
  var onZoomEnabledChanged: ChangeListeners[PdfView, zoomEnabled]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], 
    /* context */ js.UndefOr[js.Object], 
    PdfView
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], js.Any]): PdfView
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], js.Any],
    context: js.Object
  ): PdfView
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], 
    /* context */ js.UndefOr[js.Object], 
    PdfView
  ]
  
  var opacity: Double
  
  var padding: js.UndefOr[BoxDimensions | Null] = js.undefined
  
  var pageBackground: ColorValue
  
  var pageElevation: Double
  
  def parent(): Composite[Widget]
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget]]
  
  var right: ConstraintValue
  
  def siblings[Result /* <: Widget */](): WidgetCollection[Result]
  def siblings[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result]
  @JSName("siblings")
  var siblings_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]]
  
  var spacing: Dimension
  
  var src: js.UndefOr[String | Blob | Null] = js.undefined
  
  var top: ConstraintValue
  
  var transform: Transformation
  
  def trigger(`type`: String): PdfView
  
  def triggerAsync(`type`: String): js.Promise[PdfView]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[PdfView]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, PdfView]
  
  var visible: Boolean
  
  var width: Dimension | auto
  
  var zoomEnabled: Boolean
}
object OmitPdfViewset {
  
  @scala.inline
  def apply(
    $getProperty: /* name */ String => js.Any,
    $getPropertyGetter: /* propertyName */ String => js.Any,
    $getPropertySetter: /* propertyName */ String => js.Any,
    $props: js.Any,
    $setProperty: (/* name */ String, /* value */ js.Any) => Unit,
    $trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Unit,
    _checkDisposed: () => Unit,
    _decodeProperty: (/* propertyName */ String, /* value */ js.Any) => js.Any,
    _dispose: /* skipNative */ js.UndefOr[Boolean] => Unit,
    _encodeProperty: (/* propertyName */ String, /* value */ js.Any) => js.Any,
    _getDefaultPropertyValue: /* propertyName */ String => Unit,
    _getStoredProperty: /* propertyName */ String => js.Any,
    _getTypeDef: /* propertyName */ String => js.Any,
    _getXMLAttributes: () => js.Array[js.Tuple2[String, js.Any]],
    _getXMLContent: () => js.Array[String],
    _getXMLElementName: () => String,
    _getXMLFooter: /* hasChild */ Boolean => String,
    _getXMLHeader: /* hasChild */ Boolean => String,
    _isListening: /* eventType */ String => Boolean,
    _listen: (/* eventName */ String, /* listening */ Boolean) => Unit,
    _nativeCall: (/* methodName */ String, /* parameters */ js.Object) => js.Any,
    _nativeCreate: /* param */ js.UndefOr[StringDictionary[js.Any]] => Unit,
    _nativeGet: /* propertyName */ String => js.Any,
    _nativeListen: (/* eventType */ String, /* listen */ Boolean) => Unit,
    _nativeSet: (/* propertyName */ String, /* value */ js.Any) => Unit,
    _nativeType: () => String,
    _onoff: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Unit,
    _register: () => Unit,
    _release: () => Unit,
    _reorderProperties: /* propertyNames */ js.Array[String] => js.Array[String],
    _setParent: (/* parent */ Composite[Widget], /* index */ js.UndefOr[Double]) => Unit,
    _storeProperty: (/* propertyName */ String, /* encodedValue */ js.Any) => Unit,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ js.Any) => Unit,
    _wasSet: /* propertyName */ String => Boolean,
    absoluteBounds: typings.tabris.mod.Bounds,
    animate: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit],
    appendTo: /* parent */ Composite[Widget] => PdfView,
    baseline: SiblingReferenceValue | auto | `true`,
    bottom: ConstraintValue,
    bounds: typings.tabris.mod.Bounds,
    centerX: typings.tabris.mod.Offset | auto | `true`,
    centerY: typings.tabris.mod.Offset | auto | `true`,
    cid: String,
    `class`: String,
    classList: js.Array[String],
    constructor: /* properties */ js.UndefOr[Properties[PdfView, Omit[PdfView, set]]] => js.Any,
    cornerRadius: Double,
    data: StringDictionary[js.Any],
    detach: () => PdfView,
    dispose: () => Unit,
    elevation: Double,
    enabled: Boolean,
    excludeFromLayout: Boolean,
    height: Dimension | auto,
    highlightOnTouch: Boolean,
    id: String,
    insertAfter: /* widget */ Widget => PdfView,
    insertBefore: /* widget */ Widget => PdfView,
    isDisposed: () => Boolean,
    jsxAttributes: (JSXAttributes[PdfView, Omit[PdfView, set | jsxAttributes]]) & `2`,
    layoutData: LayoutDataValue,
    left: ConstraintValue,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => PdfView,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PdfView,
    onBackgroundChanged: ChangeListeners[PdfView, background],
    onBaselineChanged: ChangeListeners[PdfView, baseline],
    onBottomChanged: ChangeListeners[PdfView, bottom],
    onBoundsChanged: ChangeListeners[PdfView, bounds],
    onCenterXChanged: ChangeListeners[PdfView, centerX],
    onCenterYChanged: ChangeListeners[PdfView, centerY],
    onClassChanged: ChangeListeners[PdfView, `class`],
    onClassListChanged: ChangeListeners[PdfView, classList],
    onCornerRadiusChanged: ChangeListeners[PdfView, cornerRadius],
    onDataChanged: ChangeListeners[PdfView, data],
    onDispose: Listeners[EventObject[PdfView]],
    onElevationChanged: ChangeListeners[PdfView, elevation],
    onEnabledChanged: ChangeListeners[PdfView, enabled],
    onExcludeFromLayoutChanged: ChangeListeners[PdfView, excludeFromLayout],
    onHeightChanged: ChangeListeners[PdfView, height],
    onHighlightOnTouchChanged: ChangeListeners[PdfView, highlightOnTouch],
    onIdChanged: ChangeListeners[PdfView, id],
    onLayoutDataChanged: ChangeListeners[PdfView, layoutData],
    onLeftChanged: ChangeListeners[PdfView, left],
    onLoad: Listeners[PdfViewLoadEvent[PdfView]],
    onLongPress: Listeners[WidgetLongPressEvent[PdfView]],
    onOpacityChanged: ChangeListeners[PdfView, opacity],
    onPageBackgroundChanged: ChangeListeners[PdfView, pageBackground],
    onPageElevationChanged: ChangeListeners[PdfView, pageElevation],
    onPan: Listeners[WidgetPanEvent[PdfView]],
    onPanDown: Listeners[WidgetPanEvent[PdfView]],
    onPanHorizontal: Listeners[WidgetPanEvent[PdfView]],
    onPanLeft: Listeners[WidgetPanEvent[PdfView]],
    onPanRight: Listeners[WidgetPanEvent[PdfView]],
    onPanUp: Listeners[WidgetPanEvent[PdfView]],
    onPanVertical: Listeners[WidgetPanEvent[PdfView]],
    onResize: Listeners[WidgetResizeEvent[PdfView]],
    onRightChanged: ChangeListeners[PdfView, right],
    onSpacingChanged: ChangeListeners[PdfView, spacing],
    onSrcChanged: ChangeListeners[PdfView, src],
    onSwipeDown: Listeners[WidgetSwipeEvent[PdfView]],
    onSwipeLeft: Listeners[WidgetSwipeEvent[PdfView]],
    onSwipeRight: Listeners[WidgetSwipeEvent[PdfView]],
    onSwipeUp: Listeners[WidgetSwipeEvent[PdfView]],
    onTap: Listeners[WidgetTapEvent[PdfView]],
    onTopChanged: ChangeListeners[PdfView, top],
    onTouchCancel: Listeners[WidgetTouchEvent[PdfView]],
    onTouchEnd: Listeners[WidgetTouchEvent[PdfView]],
    onTouchMove: Listeners[WidgetTouchEvent[PdfView]],
    onTouchStart: Listeners[WidgetTouchEvent[PdfView]],
    onTransformChanged: ChangeListeners[PdfView, transform],
    onVisibleChanged: ChangeListeners[PdfView, visible],
    onWidthChanged: ChangeListeners[PdfView, width],
    onZoomEnabledChanged: ChangeListeners[PdfView, zoomEnabled],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PdfView,
    opacity: Double,
    pageElevation: Double,
    parent: () => Composite[Widget],
    right: ConstraintValue,
    siblings: /* selector */ js.UndefOr[Selector[Widget, Widget]] => WidgetCollection[Widget],
    spacing: Dimension,
    top: ConstraintValue,
    transform: Transformation,
    trigger: /* type */ String => PdfView,
    triggerAsync: /* type */ String => js.Promise[PdfView],
    visible: Boolean,
    width: Dimension | auto,
    zoomEnabled: Boolean
  ): OmitPdfViewset = {
    val __obj = js.Dynamic.literal($getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2($setProperty), $trigger = js.Any.fromFunction2($trigger), _checkDisposed = js.Any.fromFunction0(_checkDisposed), _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1(_dispose), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _getDefaultPropertyValue = js.Any.fromFunction1(_getDefaultPropertyValue), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = js.Any.fromFunction0(_getXMLAttributes), _getXMLContent = js.Any.fromFunction0(_getXMLContent), _getXMLElementName = js.Any.fromFunction0(_getXMLElementName), _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _isListening = js.Any.fromFunction1(_isListening), _listen = js.Any.fromFunction2(_listen), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1(_nativeCreate), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2(_nativeListen), _nativeSet = js.Any.fromFunction2(_nativeSet), _nativeType = js.Any.fromFunction0(_nativeType), _onoff = js.Any.fromFunction3(_onoff), _register = js.Any.fromFunction0(_register), _release = js.Any.fromFunction0(_release), _reorderProperties = js.Any.fromFunction1(_reorderProperties), _setParent = js.Any.fromFunction2(_setParent), _storeProperty = js.Any.fromFunction2(_storeProperty), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2(_triggerChangeEvent), _wasSet = js.Any.fromFunction1(_wasSet), absoluteBounds = absoluteBounds.asInstanceOf[js.Any], animate = js.Any.fromFunction2(animate), appendTo = js.Any.fromFunction1(appendTo), baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), dispose = js.Any.fromFunction0(dispose), elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], excludeFromLayout = excludeFromLayout.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highlightOnTouch = highlightOnTouch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = js.Any.fromFunction1(insertAfter), insertBefore = js.Any.fromFunction1(insertBefore), isDisposed = js.Any.fromFunction0(isDisposed), jsxAttributes = jsxAttributes.asInstanceOf[js.Any], layoutData = layoutData.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onBackgroundChanged = onBackgroundChanged.asInstanceOf[js.Any], onBaselineChanged = onBaselineChanged.asInstanceOf[js.Any], onBottomChanged = onBottomChanged.asInstanceOf[js.Any], onBoundsChanged = onBoundsChanged.asInstanceOf[js.Any], onCenterXChanged = onCenterXChanged.asInstanceOf[js.Any], onCenterYChanged = onCenterYChanged.asInstanceOf[js.Any], onClassChanged = onClassChanged.asInstanceOf[js.Any], onClassListChanged = onClassListChanged.asInstanceOf[js.Any], onCornerRadiusChanged = onCornerRadiusChanged.asInstanceOf[js.Any], onDataChanged = onDataChanged.asInstanceOf[js.Any], onDispose = onDispose.asInstanceOf[js.Any], onElevationChanged = onElevationChanged.asInstanceOf[js.Any], onEnabledChanged = onEnabledChanged.asInstanceOf[js.Any], onExcludeFromLayoutChanged = onExcludeFromLayoutChanged.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onHighlightOnTouchChanged = onHighlightOnTouchChanged.asInstanceOf[js.Any], onIdChanged = onIdChanged.asInstanceOf[js.Any], onLayoutDataChanged = onLayoutDataChanged.asInstanceOf[js.Any], onLeftChanged = onLeftChanged.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLongPress = onLongPress.asInstanceOf[js.Any], onOpacityChanged = onOpacityChanged.asInstanceOf[js.Any], onPageBackgroundChanged = onPageBackgroundChanged.asInstanceOf[js.Any], onPageElevationChanged = onPageElevationChanged.asInstanceOf[js.Any], onPan = onPan.asInstanceOf[js.Any], onPanDown = onPanDown.asInstanceOf[js.Any], onPanHorizontal = onPanHorizontal.asInstanceOf[js.Any], onPanLeft = onPanLeft.asInstanceOf[js.Any], onPanRight = onPanRight.asInstanceOf[js.Any], onPanUp = onPanUp.asInstanceOf[js.Any], onPanVertical = onPanVertical.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onRightChanged = onRightChanged.asInstanceOf[js.Any], onSpacingChanged = onSpacingChanged.asInstanceOf[js.Any], onSrcChanged = onSrcChanged.asInstanceOf[js.Any], onSwipeDown = onSwipeDown.asInstanceOf[js.Any], onSwipeLeft = onSwipeLeft.asInstanceOf[js.Any], onSwipeRight = onSwipeRight.asInstanceOf[js.Any], onSwipeUp = onSwipeUp.asInstanceOf[js.Any], onTap = onTap.asInstanceOf[js.Any], onTopChanged = onTopChanged.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransformChanged = onTransformChanged.asInstanceOf[js.Any], onVisibleChanged = onVisibleChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], onZoomEnabledChanged = onZoomEnabledChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), opacity = opacity.asInstanceOf[js.Any], pageElevation = pageElevation.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), right = right.asInstanceOf[js.Any], siblings = js.Any.fromFunction1(siblings), spacing = spacing.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoomEnabled = zoomEnabled.asInstanceOf[js.Any], background = null, pageBackground = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPdfViewset]
  }
  
  @scala.inline
  implicit class OmitPdfViewsetMutableBuilder[Self <: OmitPdfViewset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$getProperty(value: /* name */ String => js.Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def set$getPropertyGetter(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def set$getPropertySetter(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def set$props(value: js.Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setProperty(value: (/* name */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Unit): Self = StObject.set(x, "$trigger", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAbsoluteBounds(value: typings.tabris.mod.Bounds): Self = StObject.set(x, "absoluteBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit]): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppendTo(value: /* parent */ Composite[Widget] => PdfView): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackground(value: LinearGradientValue | ColorValue | ImageValue): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    @scala.inline
    def setBaseline(value: SiblingReferenceValue | auto | `true`): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: ConstraintValue): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: typings.tabris.mod.Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterX(value: typings.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: typings.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value :_*))
    
    @scala.inline
    def setConstructor(value: /* properties */ js.UndefOr[Properties[PdfView, Omit[PdfView, set]]] => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineChangeEvent(value: js.Any): Self = StObject.set(x, "defineChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineChangeEventUndefined: Self = StObject.set(x, "defineChangeEvent", js.undefined)
    
    @scala.inline
    def setDefineEvent(value: js.Any): Self = StObject.set(x, "defineEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineEventUndefined: Self = StObject.set(x, "defineEvent", js.undefined)
    
    @scala.inline
    def setDefineEvents(value: js.Any): Self = StObject.set(x, "defineEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineEventsUndefined: Self = StObject.set(x, "defineEvents", js.undefined)
    
    @scala.inline
    def setDefineProperties(value: js.Any): Self = StObject.set(x, "defineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinePropertiesUndefined: Self = StObject.set(x, "defineProperties", js.undefined)
    
    @scala.inline
    def setDefineProperty(value: js.Any): Self = StObject.set(x, "defineProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    @scala.inline
    def setDetach(value: () => PdfView): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: js.Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setHeight(value: Dimension | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightOnTouch(value: Boolean): Self = StObject.set(x, "highlightOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAfter(value: /* widget */ Widget => PdfView): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertBefore(value: /* widget */ Widget => PdfView): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDisposed(value: () => Boolean): Self = StObject.set(x, "isDisposed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJsxAttributes(value: (JSXAttributes[PdfView, Omit[PdfView, set | jsxAttributes]]) & `2`): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: ConstraintValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => PdfView
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PdfView
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnBackgroundChanged(value: ChangeListeners[PdfView, background]): Self = StObject.set(x, "onBackgroundChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBaselineChanged(value: ChangeListeners[PdfView, baseline]): Self = StObject.set(x, "onBaselineChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBottomChanged(value: ChangeListeners[PdfView, bottom]): Self = StObject.set(x, "onBottomChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBoundsChanged(value: ChangeListeners[PdfView, bounds]): Self = StObject.set(x, "onBoundsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCenterXChanged(value: ChangeListeners[PdfView, centerX]): Self = StObject.set(x, "onCenterXChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCenterYChanged(value: ChangeListeners[PdfView, centerY]): Self = StObject.set(x, "onCenterYChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClassChanged(value: ChangeListeners[PdfView, `class`]): Self = StObject.set(x, "onClassChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClassListChanged(value: ChangeListeners[PdfView, classList]): Self = StObject.set(x, "onClassListChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCornerRadiusChanged(value: ChangeListeners[PdfView, cornerRadius]): Self = StObject.set(x, "onCornerRadiusChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDataChanged(value: ChangeListeners[PdfView, data]): Self = StObject.set(x, "onDataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDispose(value: Listeners[EventObject[PdfView]]): Self = StObject.set(x, "onDispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnElevationChanged(value: ChangeListeners[PdfView, elevation]): Self = StObject.set(x, "onElevationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnabledChanged(value: ChangeListeners[PdfView, enabled]): Self = StObject.set(x, "onEnabledChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExcludeFromLayoutChanged(value: ChangeListeners[PdfView, excludeFromLayout]): Self = StObject.set(x, "onExcludeFromLayoutChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHeightChanged(value: ChangeListeners[PdfView, height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHighlightOnTouchChanged(value: ChangeListeners[PdfView, highlightOnTouch]): Self = StObject.set(x, "onHighlightOnTouchChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIdChanged(value: ChangeListeners[PdfView, id]): Self = StObject.set(x, "onIdChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLayoutDataChanged(value: ChangeListeners[PdfView, layoutData]): Self = StObject.set(x, "onLayoutDataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLeftChanged(value: ChangeListeners[PdfView, left]): Self = StObject.set(x, "onLeftChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoad(value: Listeners[PdfViewLoadEvent[PdfView]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLongPress(value: Listeners[WidgetLongPressEvent[PdfView]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpacityChanged(value: ChangeListeners[PdfView, opacity]): Self = StObject.set(x, "onOpacityChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPageBackgroundChanged(value: ChangeListeners[PdfView, pageBackground]): Self = StObject.set(x, "onPageBackgroundChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPageElevationChanged(value: ChangeListeners[PdfView, pageElevation]): Self = StObject.set(x, "onPageElevationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPan(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanDown(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPanDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanHorizontal(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPanHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanLeft(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPanLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanRight(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPanRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanUp(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPanUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanVertical(value: Listeners[WidgetPanEvent[PdfView]]): Self = StObject.set(x, "onPanVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResize(value: Listeners[WidgetResizeEvent[PdfView]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRightChanged(value: ChangeListeners[PdfView, right]): Self = StObject.set(x, "onRightChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSpacingChanged(value: ChangeListeners[PdfView, spacing]): Self = StObject.set(x, "onSpacingChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSrcChanged(value: ChangeListeners[PdfView, src]): Self = StObject.set(x, "onSrcChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSwipeDown(value: Listeners[WidgetSwipeEvent[PdfView]]): Self = StObject.set(x, "onSwipeDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSwipeLeft(value: Listeners[WidgetSwipeEvent[PdfView]]): Self = StObject.set(x, "onSwipeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSwipeRight(value: Listeners[WidgetSwipeEvent[PdfView]]): Self = StObject.set(x, "onSwipeRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSwipeUp(value: Listeners[WidgetSwipeEvent[PdfView]]): Self = StObject.set(x, "onSwipeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTap(value: Listeners[WidgetTapEvent[PdfView]]): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTopChanged(value: ChangeListeners[PdfView, top]): Self = StObject.set(x, "onTopChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancel(value: Listeners[WidgetTouchEvent[PdfView]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEnd(value: Listeners[WidgetTouchEvent[PdfView]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMove(value: Listeners[WidgetTouchEvent[PdfView]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStart(value: Listeners[WidgetTouchEvent[PdfView]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransformChanged(value: ChangeListeners[PdfView, transform]): Self = StObject.set(x, "onTransformChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVisibleChanged(value: ChangeListeners[PdfView, visible]): Self = StObject.set(x, "onVisibleChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWidthChanged(value: ChangeListeners[PdfView, width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnZoomEnabledChanged(value: ChangeListeners[PdfView, zoomEnabled]): Self = StObject.set(x, "onZoomEnabledChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PdfView
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: BoxDimensions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPageBackground(value: ColorValue): Self = StObject.set(x, "pageBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBackgroundNull: Self = StObject.set(x, "pageBackground", null)
    
    @scala.inline
    def setPageElevation(value: Double): Self = StObject.set(x, "pageElevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: () => Composite[Widget]): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRight(value: ConstraintValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblings(value: /* selector */ js.UndefOr[Selector[Widget, Widget]] => WidgetCollection[Widget]): Self = StObject.set(x, "siblings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpacing(value: Dimension): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String | Blob): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcNull: Self = StObject.set(x, "src", null)
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setTop(value: ConstraintValue): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: /* type */ String => PdfView): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerAsync(value: /* type */ String => js.Promise[PdfView]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Dimension | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_checkDisposed(value: () => Unit): Self = StObject.set(x, "_checkDisposed", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_decodeProperty(value: (/* propertyName */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "_decodeProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_dispose(value: /* skipNative */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "_dispose", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_encodeProperty(value: (/* propertyName */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "_encodeProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_getDefaultPropertyValue(value: /* propertyName */ String => Unit): Self = StObject.set(x, "_getDefaultPropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getStoredProperty(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "_getStoredProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getTypeDef(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "_getTypeDef", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getXMLAttributes(value: () => js.Array[js.Tuple2[String, js.Any]]): Self = StObject.set(x, "_getXMLAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_getXMLContent(value: () => js.Array[String]): Self = StObject.set(x, "_getXMLContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_getXMLElementName(value: () => String): Self = StObject.set(x, "_getXMLElementName", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_getXMLFooter(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getXMLHeader(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isDisposed(value: `true`): Self = StObject.set(x, "_isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isDisposedUndefined: Self = StObject.set(x, "_isDisposed", js.undefined)
    
    @scala.inline
    def set_isListening(value: /* eventType */ String => Boolean): Self = StObject.set(x, "_isListening", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_listen(value: (/* eventName */ String, /* listening */ Boolean) => Unit): Self = StObject.set(x, "_listen", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_nativeCall(value: (/* methodName */ String, /* parameters */ js.Object) => js.Any): Self = StObject.set(x, "_nativeCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_nativeCreate(value: /* param */ js.UndefOr[StringDictionary[js.Any]] => Unit): Self = StObject.set(x, "_nativeCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_nativeGet(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "_nativeGet", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_nativeListen(value: (/* eventType */ String, /* listen */ Boolean) => Unit): Self = StObject.set(x, "_nativeListen", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_nativeSet(value: (/* propertyName */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "_nativeSet", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_nativeType(value: () => String): Self = StObject.set(x, "_nativeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_onoff(value: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Unit): Self = StObject.set(x, "_onoff", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_register(value: () => Unit): Self = StObject.set(x, "_register", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_release(value: () => Unit): Self = StObject.set(x, "_release", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_reorderProperties(value: /* propertyNames */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "_reorderProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_setParent(value: (/* parent */ Composite[Widget], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "_setParent", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ js.Any) => Unit): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ js.Any) => Unit): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}

package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.mod.ChangeListeners
import typings.tabris.mod.Dimension
import typings.tabris.mod.EventObject
import typings.tabris.mod.JSXAttributes
import typings.tabris.mod.Listeners
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Omit
import typings.tabris.mod.Popover
import typings.tabris.mod.Properties
import typings.tabris.mod.Widget
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.anchor
import typings.tabris.tabrisStrings.contentView
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.jsxAttributes
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.Omit<tabris.tabris.Popover, 'contentView'>, 'set'> */
trait OmitOmitPopovercontentVie extends StObject {
  
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
  
  var anchor: Widget
  
  var cid: String
  
  def close(): Popover
  @JSName("close")
  var close_Original: js.Function0[Popover]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[
    /* properties */ js.UndefOr[Properties[Omit[Popover, contentView], Omit[Omit[Popover, contentView], set]]], 
    js.Any
  ]
  
  var defineChangeEvent: js.UndefOr[js.Any] = js.undefined
  
  var defineEvent: js.UndefOr[js.Any] = js.undefined
  
  var defineEvents: js.UndefOr[js.Any] = js.undefined
  
  var defineProperties: js.UndefOr[js.Any] = js.undefined
  
  var defineProperty: js.UndefOr[js.Any] = js.undefined
  
  var extend: js.UndefOr[js.Any] = js.undefined
  
  var height: Dimension
  
  var jsxAttributes: (JSXAttributes[Popover, Omit[Popover, set | typings.tabris.tabrisStrings.jsxAttributes]]) & ContentView
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): Popover
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): Popover
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    Popover
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], js.Any]): Popover
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], js.Any],
    context: js.Object
  ): Popover
  
  var onAnchorChanged: ChangeListeners[Popover, anchor]
  
  var onClose: Listeners[EventObject[Popover]]
  
  var onHeightChanged: ChangeListeners[Popover, height]
  
  var onWidthChanged: ChangeListeners[Popover, width]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], 
    /* context */ js.UndefOr[js.Object], 
    Popover
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], js.Any]): Popover
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], js.Any],
    context: js.Object
  ): Popover
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], 
    /* context */ js.UndefOr[js.Object], 
    Popover
  ]
  
  def open(): Popover
  @JSName("open")
  var open_Original: js.Function0[Popover]
  
  def trigger(`type`: String): Popover
  
  def triggerAsync(`type`: String): js.Promise[Popover]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[Popover]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, Popover]
  
  var width: Dimension
}
object OmitOmitPopovercontentVie {
  
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
    _storeProperty: (/* propertyName */ String, /* encodedValue */ js.Any) => Unit,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ js.Any) => Unit,
    _wasSet: /* propertyName */ String => Boolean,
    anchor: Widget,
    cid: String,
    close: () => Popover,
    constructor: /* properties */ js.UndefOr[Properties[Omit[Popover, contentView], Omit[Omit[Popover, contentView], set]]] => js.Any,
    height: Dimension,
    jsxAttributes: (JSXAttributes[Popover, Omit[Popover, set | jsxAttributes]]) & ContentView,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => Popover,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => Popover,
    onAnchorChanged: ChangeListeners[Popover, anchor],
    onClose: Listeners[EventObject[Popover]],
    onHeightChanged: ChangeListeners[Popover, height],
    onWidthChanged: ChangeListeners[Popover, width],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => Popover,
    open: () => Popover,
    trigger: /* type */ String => Popover,
    triggerAsync: /* type */ String => js.Promise[Popover],
    width: Dimension
  ): OmitOmitPopovercontentVie = {
    val __obj = js.Dynamic.literal($getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2($setProperty), $trigger = js.Any.fromFunction2($trigger), _checkDisposed = js.Any.fromFunction0(_checkDisposed), _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1(_dispose), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _getDefaultPropertyValue = js.Any.fromFunction1(_getDefaultPropertyValue), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = js.Any.fromFunction0(_getXMLAttributes), _getXMLContent = js.Any.fromFunction0(_getXMLContent), _getXMLElementName = js.Any.fromFunction0(_getXMLElementName), _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _isListening = js.Any.fromFunction1(_isListening), _listen = js.Any.fromFunction2(_listen), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1(_nativeCreate), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2(_nativeListen), _nativeSet = js.Any.fromFunction2(_nativeSet), _nativeType = js.Any.fromFunction0(_nativeType), _onoff = js.Any.fromFunction3(_onoff), _register = js.Any.fromFunction0(_register), _release = js.Any.fromFunction0(_release), _reorderProperties = js.Any.fromFunction1(_reorderProperties), _storeProperty = js.Any.fromFunction2(_storeProperty), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2(_triggerChangeEvent), _wasSet = js.Any.fromFunction1(_wasSet), anchor = anchor.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), constructor = js.Any.fromFunction1(constructor), height = height.asInstanceOf[js.Any], jsxAttributes = jsxAttributes.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onAnchorChanged = onAnchorChanged.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), open = js.Any.fromFunction0(open), trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitOmitPopovercontentVie]
  }
  
  @scala.inline
  implicit class OmitOmitPopovercontentVieMutableBuilder[Self <: OmitOmitPopovercontentVie] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Widget): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Popover): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConstructor(
      value: /* properties */ js.UndefOr[Properties[Omit[Popover, contentView], Omit[Omit[Popover, contentView], set]]] => js.Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
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
    def setExtend(value: js.Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setHeight(value: Dimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxAttributes(value: (JSXAttributes[Popover, Omit[Popover, set | jsxAttributes]]) & ContentView): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => Popover
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => Popover
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnAnchorChanged(value: ChangeListeners[Popover, anchor]): Self = StObject.set(x, "onAnchorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: Listeners[EventObject[Popover]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHeightChanged(value: ChangeListeners[Popover, height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWidthChanged(value: ChangeListeners[Popover, width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => Popover
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpen(value: () => Popover): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrigger(value: /* type */ String => Popover): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerAsync(value: /* type */ String => js.Promise[Popover]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
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
    def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ js.Any) => Unit): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ js.Any) => Unit): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}

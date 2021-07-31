package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "NativeObject")
@js.native
class NativeObject protected () extends StObject {
  protected def this(properties: StringDictionary[js.Any]) = this()
  
  @JSName("$getProperty")
  /* private */ def $getProperty(name: String): js.Any = js.native
  
  @JSName("$getPropertyGetter")
  /* private */ def $getPropertyGetter(propertyName: String): js.Any = js.native
  
  @JSName("$getPropertySetter")
  /* private */ def $getPropertySetter(propertyName: String): js.Any = js.native
  
  @JSName("$props")
  var $props: js.Any = js.native
  
  @JSName("$setProperty")
  /* private */ def $setProperty(name: String, value: js.Any): Unit = js.native
  
  @JSName("$trigger")
  /* private */ def $trigger(eventType: String): Unit = js.native
  @JSName("$trigger")
  /* private */ def $trigger(eventType: String, eventData: js.Object): Unit = js.native
  
  /**
    * A helper function that throws if the instance has already been marked as disposed.
    */
  /* protected */ def _checkDisposed(): Unit = js.native
  
  /* private */ def _decodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  
  /**
    * Called by the framework to dispose a `NativeObject` instance. (The `dispose` is only used by
    * application code.) The method should never be called directly, but it may be overwritten to prevent
    * dispose for objects that are not disposable.
    * @param skipNative
    */
  /* protected */ def _dispose(): Unit = js.native
  /* protected */ def _dispose(skipNative: Boolean): Unit = js.native
  
  /* private */ def _encodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  
  /* private */ def _getDefaultPropertyValue(propertyName: String): Unit = js.native
  
  /**
    * Returns a value stored via `_storeProperty`, or undefined.
    * @param propertyName
    */
  /* protected */ def _getStoredProperty(propertyName: String): js.Any = js.native
  
  /* private */ def _getTypeDef(propertyName: String): js.Any = js.native
  
  /**
    * Used by `console.dirxml()` to produce part of the XML representation of this object. May be
    * overwritten to modify the output. The return value should be an array of tuples consisting of the
    * attribute name and string representation. The new implementation may make a super call to obtain the
    * default list of attributes printed for this object.
    */
  /* protected */ def _getXMLAttributes(): js.Array[js.Tuple2[String, js.Any]] = js.native
  
  /**
    * Used by `console.dirxml()` to produce part of the XML representation of this object. May be
    * overwritten to modify the output. The return value should be an array of strings each representing on
    * of the children of this instance.
    */
  /* protected */ def _getXMLContent(): js.Array[String] = js.native
  
  /**
    * Used by `console.dirxml()` to produce part of the XML representation of this object. May be
    * overwritten to modify the output. The default implementation returns the name of the constructor of
    * this object.
    */
  /* protected */ def _getXMLElementName(): String = js.native
  
  /**
    * Used by `console.dirxml()` to produce part of the XML representation of this object. May be
    * overwritten to modify the output. The default implementation the closing tag if `hasChild` is true,
    * otherwise returns an empty string. The `hasChild` parameter is `true` if `_getXMLContent` returns a
    * non-empty array. It is usually not necessary to call or override this method.
    * @param hasChild
    */
  /* protected */ def _getXMLFooter(hasChild: Boolean): String = js.native
  
  /**
    * Used by `console.dirxml()` to produce part of the XML representation of this object. May be
    * overwritten to modify the output. The default implementation crates the opening tag including the
    * element name given by `_getXMLElementName` and attributes given by `_getXMLAttributes`. The
    * `hasChild` parameter is `true` if `_getXMLContent` returns a non-empty array in which case the tag is
    * not self-closing. It is preferable to override these individual method instead of this one.
    * @param hasChild
    */
  /* protected */ def _getXMLHeader(hasChild: Boolean): String = js.native
  
  var _isDisposed: js.UndefOr[`true`] = js.native
  
  /**
    * Returns `true` if there is currently one or more listeners registers for the given event type.
    * @param eventType
    */
  /* protected */ def _isListening(eventType: String): Boolean = js.native
  
  /**
    * Called by the framework when the first listener of a given event type is registered on the instance
    * (`listening` is `true`), and when the last listener of a given event type is removed (`listening` is
    * `false`). Typically overwritten to make calls to `_nativeListen` when the given event type is issues
    * by native code. The new implementation must make a super call if it does not handle the given event
    * type itself.
    * @param eventName
    * @param listening
    */
  /* protected */ def _listen(eventName: String, listening: Boolean): Unit = js.native
  
  /**
    * Sends a 'call' operation to the native client and returns the result.
    * @param methodName
    * @param parameters
    */
  /* protected */ def _nativeCall(methodName: String, parameters: js.Object): js.Any = js.native
  
  /**
    * Sends a 'create' operation to the native client. Called once by the constructor and should not be
    * called again. May be overwritten to check the constructor parameter or perform any kind of
    * initialization code prior to creating the native object. The new implementation must make a super
    * call.
    * @param param The first argument (if any) given in the constructor call. Will be forwarded to the `set` method after the native object was created.
    */
  /* protected */ def _nativeCreate(): Unit = js.native
  /* protected */ def _nativeCreate(param: StringDictionary[js.Any]): Unit = js.native
  
  /**
    * Sends a 'get' operation to the native client and returns the result.
    * @param propertyName
    */
  /* protected */ def _nativeGet(propertyName: String): js.Any = js.native
  
  /**
    * Sends a 'listen' operation to the native client.
    * @param eventType
    * @param listen
    */
  /* protected */ def _nativeListen(eventType: String, listen: Boolean): Unit = js.native
  
  /**
    * Sends a 'set' operation to the native client.
    * @param propertyName
    * @param value
    */
  /* protected */ def _nativeSet(propertyName: String, value: js.Any): Unit = js.native
  
  /* protected */ def _nativeType: String = js.native
  
  /**
    * A helper function that register the given listener if `listening` is true and de-registers it if
    * `listening` is false.
    * @param eventType
    * @param listening
    * @param listener
    */
  /* protected */ def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit = js.native
  
  /* private */ def _register(): Unit = js.native
  
  /**
    * Called during the dispose process, after the 'dispose' event has fired, but before the native code
    * has be executed. Native operations (`_nativeSet`, `_nativeGet`, `_nativeCall`, `_nativeListen`) on
    * this object are still possible at this point. May be overwritten to perform any kind of clean-up
    * code. The new implementation must perform a super call at some point, typically at the last command.
    */
  /* protected */ def _release(): Unit = js.native
  
  /**
    * Used by the `set` method to determined in which order the given property values are applied. May be
    * overwritten, but the new implementation must pass the propertyNames through a super call at one
    * point.
    * @param propertyNames List of properties to be set to a new value
    */
  /* protected */ def _reorderProperties(propertyNames: js.Array[String]): js.Array[String] = js.native
  
  /**
    * Stores the given value internally and triggers a matching change event.
    * @param propertyName
    * @param encodedValue
    */
  /* protected */ def _storeProperty(propertyName: String, encodedValue: js.Any): Unit = js.native
  
  /**
    * Called by the native client to trigger a JavaScript event on this instance. May be overwritten to
    * pre-process the eventData object. The return value indicates whether `defaultPrevented` on the event
    * object was set to `true`. The new implementation must forward the parameters to a super call and
    * return that calls return value.
    * @param eventType
    * @param eventData
    */
  /* protected */ def _trigger(eventType: String): Boolean = js.native
  /* protected */ def _trigger(eventType: String, eventData: js.Object): Boolean = js.native
  
  /* private */ def _triggerChangeEvent(propertyName: String, newEncodedValue: js.Any): Unit = js.native
  
  /**
    * Returns `true` if _storeProperty was ever called with the given property propertyName
    * @param propertyName
    */
  /* protected */ def _wasSet(propertyName: String): Boolean = js.native
  
  /**
    * An application-wide unique identifier automatically assigned to all native objects on creation. It
    * follows the pattern '$<number>', where the number is incremented for each new NativeObject instance.
    * @constant
    */
  val cid: String = js.native
  
  /**
    * When using JSX with TypeScript (`.tsx` files), the type of this property determines which JSX
    * attributes are valid for this object.
    * @constant
    */
  val jsxAttributes: JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]] = js.native
  
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * In TypeScript you should use the alternative `Listeners` API, e.g. `widget.onResize.off(listener);`
    * instead of `widget.off({resize: listener});` The former provides more type information.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: StringDictionary[js.Function1[/* event */ EventObject[NativeObject], Unit]]): this.type = js.native
  /**
    * Removes all occurrences of *listener* that are bound to *type* and *context* from this widget.
    * In TypeScript you should use the alternative `Listeners` API, e.g. `widget.onResize.off(listener);`
    * instead of `widget.off('resize', listener});` The former provides more type information.
    * @param type The type of events to remove listeners for.
    * @param listener The listener function to remove.
    * @param context The context of the bound listener to remove.
    */
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[this.type], Unit]): this.type = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[this.type], Unit],
    context: js.Object
  ): this.type = js.native
  
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * In TypeScript you should use the alternative `Listeners` API, e.g. `widget.onResize(listener);`
    * instead of `widget.on('resize', listener);` The former provides more type information.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: StringDictionary[js.Function1[/* event */ EventObject[NativeObject], Unit]]): this.type = js.native
  /**
    * Registers a *listener* function to be notified of events of the given *type*.
    * @param type The type of events to listen for.
    * @param listener The listener function to register. This function will be called with an [event object](./EventObject.md).
    In TypeScript you should use the alternative `Listeners` API, e.g. `widget.onResize(listener);` instead of `widget.on({resize: listener});` The former provides more type information.
    * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
    */
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[this.type], js.Any]): this.type = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[this.type], js.Any],
    context: js.Object
  ): this.type = js.native
  
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * In TypeScript you should use the alternative `Listeners` API, e.g. `widget.onResize.once(listener);`
    * instead of `widget.once({resize: listener});` The former provides more type information.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: StringDictionary[js.Function1[/* event */ EventObject[NativeObject], Unit]]): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * In TypeScript you should use the alternative `Listeners` API, e.g. `widget.onResize.once(listener);`
    * instead of `widget.once('resize', listener);` The former provides more type information.
    * @param type The type of the event to listen for.
    * @param listener The listener function to register. This function will be called with an [event object](./EventObject.md).
    * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
    */
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[this.type], js.Any]): this.type = js.native
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[this.type], js.Any],
    context: js.Object
  ): this.type = js.native
  
  /**
    * Sets all key-value pairs in the properties object as widget properties.
    * **TypeScript note:** When called on `this` from within a subclass constructor (i.e. a custom
    * component/widget) you may have to use the generic version of this method:
    * `this.set<MySubclass>(...);`
    * @param properties
    */
  @JSName("set")
  def set_set[T /* <: NativeObject */](properties: Properties[T, Omit[T, set]]): this.type = js.native
  
  /**
    * Notifies all registered listeners for the given *type*.
    * In TypeScript you should use the alternative `Listeners` API, e.g. `widget.myEvent.trigger();`
    * instead of `widget.trigger('myEvent');` The former provides more type information.
    * @param type The type of event to trigger
    */
  def trigger(`type`: String): this.type = js.native
  /**
    * Passes the fields of the given *object* to all listeners registered for this event *type*.
    * In TypeScript you should use the alternative `Listeners` API, e.g.
    * `widget.myEvent.trigger(eventData);` instead of `widget.trigger('myEvent', eventData});` The former
    * provides more type information.
    * @param type The type of event to trigger
    * @param eventData The data to pass to listener functions.
    */
  def trigger(`type`: String, eventData: js.Object): this.type = js.native
  /**
    * Initializes the given *eventObject* and passes it to all listeners registered for this event *type*.
    * If *eventObject* was already initialized its fields are copied to a new event object.
    * In TypeScript you should use the alternative `Listeners` API, e.g.
    * `widget.myEvent.trigger(eventObject);` instead of `widget.trigger('myEvent', eventObject});` The
    * former provides more type information.
    * @param type The type of event to trigger
    * @param eventObject An instance of `EventObject` (or a subclass) to pass to listener functions.
    */
  def trigger(`type`: String, eventObject: EventObject[this.type]): this.type = js.native
  
  /**
    * Like `trigger`, but returns a promise. The promise will resolve when all asynchronous listeners (if
    * any) have resolved. If none of the listeners are asynchronous (return a promise) this method works
    * just like `trigger()`. Useful for unit testing.
    * @param type The type of event to trigger
    */
  def triggerAsync(`type`: String): js.Promise[this.type] = js.native
  /**
    * Notifies all registered listeners for the given *type* with the given `EventObject`. Unlike `trigger`
    * each asynchronous listener will be awaited, meaning that if a listener returns a promise that will
    * pause event processing until it resolves. Returns a promise that resolves once all listeners have
    * been notified. If any listener returns a rejecting promise the even processing is aborted and the
    * returned promise rejects with the error value. If none of the listeners return a promise this method
    * works just like `trigger()`. 
    * In TypeScript you should use `widget.myEvent.triggerAsync();` instead
    * @param type The type of event to trigger
    * @param eventObject An instance of `EventObject` (or a subclass) to pass to listener functions.
    */
  def triggerAsync(`type`: String, eventObject: EventObject[this.type]): js.Promise[this.type] = js.native
  /**
    * Notifies all registered listeners for the given *type* with the given data. Unlike `trigger` each
    * asynchronous listener will be awaited, meaning that if a listener returns a promise that will pause
    * event processing until it resolves. Returns a promise that resolves once all listeners have been
    * notified. If any listener returns a rejecting promise the even processing is aborted and the returned
    * promise rejects with the error value. If none of the listeners return a promise this method works
    * just like `trigger()`. 
    * In TypeScript you should use `widget.myEvent.triggerAsync();` instead
    * @param type The type of event to trigger
    * @param object The data to pass to listener functions.
    */
  def triggerAsync(`type`: String, `object`: js.Object): js.Promise[this.type] = js.native
}
/* static members */
object NativeObject {
  
  @JSImport("tabris", "NativeObject")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defineChangeEvent(target: js.Object, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineChangeEvent")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defineEvent(target: js.Object, eventType: String, definition: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineEvent")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defineEvents(target: js.Object, definitions: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineEvents")(target.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defineProperties(target: js.Object, definitions: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defineProperty(target: js.Object, propertyName: String, definition: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def extend(nativeType: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(nativeType.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def extend(nativeType: String, superType: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(nativeType.asInstanceOf[js.Any], superType.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}

package typings
package wolfy87DashEventemitterLib.wolfy87DashEventemitterMod.Wolfy87EventEmitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  /**
    * Adds a listener function to the specified event.
    * The listener will not be added if it is a duplicate.
    * If the listener returns true then it will be removed after it is called.
    * If you pass a regular expression as the event name then the listener will be added to all events that match it.
    *
    * @param {string|RegExp} event Name of the event to attach the listener to.
    * @param {Function} listener Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addListener(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  /**
    * Adds a listener function to the specified event.
    * The listener will not be added if it is a duplicate.
    * If the listener returns true then it will be removed after it is called.
    * If you pass a regular expression as the event name then the listener will be added to all events that match it.
    *
    * @param {string|RegExp} event Name of the event to attach the listener to.
    * @param {Function} listener Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addListener(event: stdLib.RegExp, listener: js.Function): EventEmitter = js.native
  /**
    * Adds listeners in bulk using the manipulateListeners method.
    * If you pass an object as the second argument you can add to multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be added.
    * You can also pass it a regular expression to add the array of listeners to all events that match it.
    * Yeah, this function does quite a bit. That's probably a bad thing.
    *
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to add to multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to add.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addListeners(event: java.lang.String, listeners: js.Array[js.Function]): EventEmitter = js.native
  /**
    * Adds listeners in bulk using the manipulateListeners method.
    * If you pass an object as the second argument you can add to multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be added.
    * You can also pass it a regular expression to add the array of listeners to all events that match it.
    * Yeah, this function does quite a bit. That's probably a bad thing.
    *
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to add to multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to add.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addListeners(event: stdLib.RegExp, listeners: js.Array[js.Function]): EventEmitter = js.native
  /**
    * Adds listeners in bulk using the manipulateListeners method.
    * If you pass an object as the second argument you can add to multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be added.
    * You can also pass it a regular expression to add the array of listeners to all events that match it.
    * Yeah, this function does quite a bit. That's probably a bad thing.
    *
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to add to multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to add.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addListeners(event: MultipleEvents): EventEmitter = js.native
  /**
    * Semi-alias of addListener. It will add a listener that will be
    * automatically removed after it's first execution.
    *
    * @param event {string|RegExp} Name of the event to attach the listener to.
    * @param listener {Function} Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addOnceListener(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  /**
    * Semi-alias of addListener. It will add a listener that will be
    * automatically removed after it's first execution.
    *
    * @param event {string|RegExp} Name of the event to attach the listener to.
    * @param listener {Function} Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def addOnceListener(event: stdLib.RegExp, listener: js.Function): EventEmitter = js.native
  /**
    * Defines an event name.
    * This is required if you want to use a regex to add a listener to multiple events at once.
    * If you don't do this then how do you expect it to know what event to add to?
    * Should it just add to every possible match for a regex? No. That is scary and bad.
    * You need to tell it what event names should be matched by a regex.
    *
    * @param {string} event Name of the event to create.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def defineEvent(event: java.lang.String): EventEmitter = js.native
  /**
    * Defines an event name.
    * This is required if you want to use a regex to add a listener to multiple events at once.
    * If you don't do this then how do you expect it to know what event to add to?
    * Should it just add to every possible match for a regex? No. That is scary and bad.
    * You need to tell it what event names should be matched by a regex.
    *
    * @param {string[]} events Name of the event to create.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def defineEvents(events: js.Array[java.lang.String]): EventEmitter = js.native
  /**
    * Subtly different from emitEvent in that it will pass its arguments on to the listeners,
    * as opposed to taking a single array of arguments to pass on.
    * As with emitEvent, you can pass a regex in place of the event name to emit to all events that match it.
    *
    * @param {String|RegExp} event Name of the event to emit and execute listeners for.
    * @param {... any[]} args Optional additional arguments to be passed to each listener.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def emit(event: java.lang.String, args: js.Any*): EventEmitter = js.native
  /**
    * Subtly different from emitEvent in that it will pass its arguments on to the listeners,
    * as opposed to taking a single array of arguments to pass on.
    * As with emitEvent, you can pass a regex in place of the event name to emit to all events that match it.
    *
    * @param {String|RegExp} event Name of the event to emit and execute listeners for.
    * @param {... any[]} args Optional additional arguments to be passed to each listener.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def emit(event: stdLib.RegExp, args: js.Any*): EventEmitter = js.native
  /**
    * Emits an event of your choice.
    * When emitted, every listener attached to that event will be executed.
    * If you pass the optional argument array then those arguments will be passed to every listener upon execution.
    * Because it uses `apply`, your array of arguments will be passed as if you wrote them out separately.
    * So they will not arrive within the array on the other side, they will be separate.
    * You can also pass a regular expression to emit to all events that match it.
    *
    * @param {String|RegExp} event Name of the event to emit and execute listeners for.
    * @param {Array} [args] Optional array of arguments to be passed to each listener.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def emitEvent(event: java.lang.String, args: js.Any*): EventEmitter = js.native
  /**
    * Emits an event of your choice.
    * When emitted, every listener attached to that event will be executed.
    * If you pass the optional argument array then those arguments will be passed to every listener upon execution.
    * Because it uses `apply`, your array of arguments will be passed as if you wrote them out separately.
    * So they will not arrive within the array on the other side, they will be separate.
    * You can also pass a regular expression to emit to all events that match it.
    *
    * @param {String|RegExp} event Name of the event to emit and execute listeners for.
    * @param {Array} [args] Optional array of arguments to be passed to each listener.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def emitEvent(event: stdLib.RegExp, args: js.Any*): EventEmitter = js.native
  /**
    * Takes a list of listener objects and flattens it into a list of listener functions.
    *
    * @param {Object[]} listeners Raw listener objects.
    * @return {Function[]} Just the listener functions.
    */
  def flattenListeners(listeners: js.Array[wolfy87DashEventemitterLib.Anon_Listener]): js.Array[js.Function] = js.native
  /**
    * Returns the listener array for the specified event.
    * Will initialise the event object and listener arrays if required.
    * Will return an object if you use a regex search. The object contains keys for each matched event.
    * So /ba[rz]/ might return an object containing bar and baz.
    * But only if you have either defined them with defineEvent or added some listeners to them.
    * Each property in the object response is an array of listener functions.
    *
    * @param {string|RegExp} event Name of the event to return the listeners from.
    * @return {Function[|Object]} All listener functions for the event.
    */
  def getListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /**
    * Returns the listener array for the specified event.
    * Will initialise the event object and listener arrays if required.
    * Will return an object if you use a regex search. The object contains keys for each matched event.
    * So /ba[rz]/ might return an object containing bar and baz.
    * But only if you have either defined them with defineEvent or added some listeners to them.
    * Each property in the object response is an array of listener functions.
    *
    * @param {string|RegExp} event Name of the event to return the listeners from.
    * @return {Function[]|Object} All listener functions for the event.
    */
  def getListeners(event: stdLib.RegExp): org.scalablytyped.runtime.StringDictionary[js.Function] = js.native
  /**
    * Fetches the requested listeners via getListeners but will always return the results inside an object.
    * This is mainly for internal use but others may find it useful.
    *
    * @param event {string|RegExp} Name of the event to return the listeners from.
    * @return {Object} All listener functions for an event in object
    */
  def getListenersAsObject(event: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Function] = js.native
  /**
    * Fetches the requested listeners via getListeners but will always return the results inside an object.
    * This is mainly for internal use but others may find it useful.
    *
    * @param event {string|RegExp} Name of the event to return the listeners from.
    * @return {Object} All listener functions for an event in object
    */
  def getListenersAsObject(event: stdLib.RegExp): org.scalablytyped.runtime.StringDictionary[js.Function] = js.native
  /**
    * Edits listeners in bulk. The addListeners and removeListeners methods both use this to do their job.
    * You should really use those instead, this is a little lower level.
    * The first argument will determine if the listeners are removed (true) or added (false).
    * If you pass an object as the second argument you can add/remove from multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be added/removed.
    * You can also pass it a regular expression to manipulate the listeners of all events that match it.
    *
    * @param {Boolean} remove True if you want to remove listeners, false if you want to add.
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to add/remove from multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to add/remove.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def manipulateListeners(remove: scala.Boolean, event: java.lang.String, listeners: js.Array[js.Function]): EventEmitter = js.native
  /**
    * Edits listeners in bulk. The addListeners and removeListeners methods both use this to do their job.
    * You should really use those instead, this is a little lower level.
    * The first argument will determine if the listeners are removed (true) or added (false).
    * If you pass an object as the second argument you can add/remove from multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be added/removed.
    * You can also pass it a regular expression to manipulate the listeners of all events that match it.
    *
    * @param {Boolean} remove True if you want to remove listeners, false if you want to add.
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to add/remove from multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to add/remove.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def manipulateListeners(remove: scala.Boolean, event: stdLib.RegExp, listeners: js.Array[js.Function]): EventEmitter = js.native
  /**
    * Edits listeners in bulk. The addListeners and removeListeners methods both use this to do their job.
    * You should really use those instead, this is a little lower level.
    * The first argument will determine if the listeners are removed (true) or added (false).
    * If you pass an object as the second argument you can add/remove from multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be added/removed.
    * You can also pass it a regular expression to manipulate the listeners of all events that match it.
    *
    * @param {Boolean} remove True if you want to remove listeners, false if you want to add.
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to add/remove from multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to add/remove.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def manipulateListeners(remove: scala.Boolean, event: MultipleEvents): EventEmitter = js.native
  /**
    * Removes a listener function from the specified event.
    * When passed a regular expression as the event name, it will remove the listener from all events that match it.
    *
    * @param {String|RegExp} event Name of the event to remove the listener from.
    * @param {Function} listener Method to remove from the event.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def off(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  /**
    * Removes a listener function from the specified event.
    * When passed a regular expression as the event name, it will remove the listener from all events that match it.
    *
    * @param {String|RegExp} event Name of the event to remove the listener from.
    * @param {Function} listener Method to remove from the event.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def off(event: stdLib.RegExp, listener: js.Function): EventEmitter = js.native
  /**
    * Adds a listener function to the specified event.
    * The listener will not be added if it is a duplicate.
    * If the listener returns true then it will be removed after it is called.
    * If you pass a regular expression as the event name then the listener will be added to all events that match it.
    *
    * @param {string|RegExp} event Name of the event to attach the listener to.
    * @param {Function} listener Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def on(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  /**
    * Adds a listener function to the specified event.
    * The listener will not be added if it is a duplicate.
    * If the listener returns true then it will be removed after it is called.
    * If you pass a regular expression as the event name then the listener will be added to all events that match it.
    *
    * @param {string|RegExp} event Name of the event to attach the listener to.
    * @param {Function} listener Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def on(event: stdLib.RegExp, listener: js.Function): EventEmitter = js.native
  /**
    * Semi-alias of addListener. It will add a listener that will be
    * automatically removed after it's first execution.
    *
    * @param event {string|RegExp} Name of the event to attach the listener to.
    * @param listener {Function} Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def once(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  /**
    * Semi-alias of addListener. It will add a listener that will be
    * automatically removed after it's first execution.
    *
    * @param event {string|RegExp} Name of the event to attach the listener to.
    * @param listener {Function} Method to be called when the event is emitted.
    * If the function returns true then it will be removed after calling.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def once(event: stdLib.RegExp, listener: js.Function): EventEmitter = js.native
  /**
    * Alias of removeEvent.
    *
    * Added to mirror the node API.
    */
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(event: java.lang.String): EventEmitter = js.native
  def removeAllListeners(event: stdLib.RegExp): EventEmitter = js.native
  /**
    * Removes all listeners from a specified event.
    * If you do not specify an event then all listeners will be removed.
    * That means every event will be emptied.
    * You can also pass a regex to remove all events that match it.
    *
    * @param {String|RegExp} [event] Optional name of the event to remove all listeners for.
    * Will remove from every event if not passed.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def removeEvent(): EventEmitter = js.native
  def removeEvent(event: java.lang.String): EventEmitter = js.native
  def removeEvent(event: stdLib.RegExp): EventEmitter = js.native
  /**
    * Removes a listener function from the specified event.
    * When passed a regular expression as the event name, it will remove the listener from all events that match it.
    *
    * @param {String|RegExp} event Name of the event to remove the listener from.
    * @param {Function} listener Method to remove from the event.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def removeListener(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  /**
    * Removes a listener function from the specified event.
    * When passed a regular expression as the event name, it will remove the listener from all events that match it.
    *
    * @param {String|RegExp} event Name of the event to remove the listener from.
    * @param {Function} listener Method to remove from the event.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def removeListener(event: stdLib.RegExp, listener: js.Function): EventEmitter = js.native
  /**
    * Removes listeners in bulk using the manipulateListeners method.
    * If you pass an object as the second argument you can remove from multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be removed.
    * You can also pass it a regular expression to remove the listeners from all events that match it.
    *
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to remove from multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to remove.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def removeListeners(event: java.lang.String, listeners: js.Array[js.Function]): EventEmitter = js.native
  /**
    * Removes listeners in bulk using the manipulateListeners method.
    * If you pass an object as the second argument you can remove from multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be removed.
    * You can also pass it a regular expression to remove the listeners from all events that match it.
    *
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to remove from multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to remove.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def removeListeners(event: stdLib.RegExp, listeners: js.Array[js.Function]): EventEmitter = js.native
  /**
    * Removes listeners in bulk using the manipulateListeners method.
    * If you pass an object as the second argument you can remove from multiple events at once.
    * The object should contain key value pairs of events and listeners or listener arrays.
    * You can also pass it an event name and an array of listeners to be removed.
    * You can also pass it a regular expression to remove the listeners from all events that match it.
    *
    * @param {String|Object|RegExp} event An event name if you will pass an array of listeners next.
    * An object if you wish to remove from multiple events at once.
    * @param {Function[]} [listeners] An optional array of listener functions to remove.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def removeListeners(event: MultipleEvents): EventEmitter = js.native
  /**
    * Sets the current value to check against when executing listeners. If a
    * listeners return value matches the one set here then it will be removed
    * after execution. This value defaults to true.
    *
    * @param {any} value The new value to check for when executing listeners.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def setOnceReturnValue(value: js.Any): EventEmitter = js.native
  /**
    * Emits an event of your choice.
    * When emitted, every listener attached to that event will be executed.
    * If you pass the optional argument array then those arguments will be passed to every listener upon execution.
    * Because it uses `apply`, your array of arguments will be passed as if you wrote them out separately.
    * So they will not arrive within the array on the other side, they will be separate.
    * You can also pass a regular expression to emit to all events that match it.
    *
    * @param {String|RegExp} event Name of the event to emit and execute listeners for.
    * @param {Array} [args] Optional array of arguments to be passed to each listener.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def trigger(event: java.lang.String, args: js.Any*): EventEmitter = js.native
  /**
    * Emits an event of your choice.
    * When emitted, every listener attached to that event will be executed.
    * If you pass the optional argument array then those arguments will be passed to every listener upon execution.
    * Because it uses `apply`, your array of arguments will be passed as if you wrote them out separately.
    * So they will not arrive within the array on the other side, they will be separate.
    * You can also pass a regular expression to emit to all events that match it.
    *
    * @param {String|RegExp} event Name of the event to emit and execute listeners for.
    * @param {Array} [args] Optional array of arguments to be passed to each listener.
    * @return {EventEmitter} Current instance of EventEmitter for chaining.
    */
  def trigger(event: stdLib.RegExp, args: js.Any*): EventEmitter = js.native
}


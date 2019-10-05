package typings.winjs.WinJS.Utilities

import typings.std.Array
import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of a query selector, and provides various operations that perform actions over the elements of the collection.
  **/
@JSGlobal("WinJS.Utilities.QueryCollection")
@js.native
class QueryCollection[T] () extends Array[T] {
  //#region Methods
  /**
    * Adds the specified class to all the elements in the collection.
    * @param name The name of the class to add.
    * @returns This QueryCollection object.
    **/
  def addClass(name: String): QueryCollection[T] = js.native
  /**
    * Clears the specified style property for all the elements in the collection.
    * @param name The name of the style property to be cleared.
    * @returns This QueryCollection object.
    **/
  def clearStyle(name: String): QueryCollection[T] = js.native
  //#region Array<T>.prototype
  /**
    * Combines two or more arrays.
    * @param items Additional items to add to the end of array1.
    **/
  @JSName("concat")
  def concat_U_ArrayT[U /* <: js.Array[T] */](items: U*): js.Array[T] = js.native
  /**
    * Creates controls that are attached to the elements in this QueryCollection, if the ctor parameter is a function, or configures the controls that are attached to the elements in this QueryCollection, if the ctor parameter is an object.
    * @param ctor If this parameter is a function, it is a constructor function that is used to create controls to attach to the elements. If it is an object, it is the set of options passed to the controls.
    * @param options The options passed to the newly-created controls.
    * @returns This QueryCollection object.
    **/
  def control(ctor: js.Any): QueryCollection[T] = js.native
  def control(ctor: js.Any, options: js.Any): QueryCollection[T] = js.native
  /**
    * Gets an item from the QueryCollection.
    * @param index The index of the item to return.
    * @returns A single item from the collection.
    **/
  def get(index: Double): T = js.native
  /**
    * Gets an attribute value from the first element in the collection.
    * @param name The name of the attribute.
    * @returns The value of the attribute.
    **/
  def getAttribute(name: String): js.Any = js.native
  /**
    * Determines whether the specified class exists on the first element of the collection.
    * @param name The name of the class.
    * @returns true if the element has the specified class; otherwise, false.
    **/
  def hasClass(name: String): Boolean = js.native
  /**
    * Adds a set of items to this QueryCollection.
    * @param items The items to add to the QueryCollection. This may be an array-like object, a document fragment, or a single item.
    **/
  def include(items: T): Unit = js.native
  /**
    * Adds a set of items to this QueryCollection.
    * @param items The items to add to the QueryCollection. This may be an array-like object, a document fragment, or a single item.
    **/
  def include(items: js.Array[T]): Unit = js.native
  /**
    * Adds a set of items to this QueryCollection.
    * @param items The items to add to the QueryCollection. This may be an array-like object, a document fragment, or a single item.
    **/
  def include(items: HTMLCollection): Unit = js.native
  /**
    * Registers the listener for the specified event on all the elements in the collection.
    * @param eventType The name of the event.
    * @param listener The event handler function to be called when the event occurs.
    * @param capture true if capture == true is to be passed to addEventListener; otherwise, false.
    **/
  def listen(eventType: String, listener: js.Function): Unit = js.native
  def listen(eventType: String, listener: js.Function, capture: Boolean): Unit = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](
    `this`: js.Tuple2[T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]
  ): js.Tuple2[U, U] = js.native
  def map[U](
    `this`: js.Tuple2[T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): js.Tuple2[U, U] = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](
    `this`: js.Tuple3[T, T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]
  ): js.Tuple3[U, U, U] = js.native
  def map[U](
    `this`: js.Tuple3[T, T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): js.Tuple3[U, U, U] = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](
    `this`: js.Tuple4[T, T, T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]
  ): js.Tuple4[U, U, U, U] = js.native
  def map[U](
    `this`: js.Tuple4[T, T, T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): js.Tuple4[U, U, U, U] = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](
    `this`: js.Tuple5[T, T, T, T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]
  ): js.Tuple5[U, U, U, U, U] = js.native
  def map[U](
    `this`: js.Tuple5[T, T, T, T, T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): js.Tuple5[U, U, U, U, U] = js.native
  /**
    * Executes a query selector on all the elements in the collection and aggregates the result into a QueryCollection.
    * @param query The query selector string.
    * @returns A QueryCollection object containing the aggregate results of executing the query on all the elements in the collection.
    **/
  def query(query: js.Any): QueryCollection[T] = js.native
  /**
    * Removes the specified class from all the elements in the collection.
    * @param name The name of the class to be removed.
    * @returns This QueryCollection object.
    **/
  def removeClass(name: String): QueryCollection[T] = js.native
  /**
    * Unregisters the listener for the specified event on all the elements in the collection.
    * @param eventType The name of the event.
    * @param listener The event handler function.
    * @param capture true if capture == true; otherwise, false.
    * @returns This QueryCollection object.
    **/
  def removeEventListener(eventType: String, listener: js.Function): QueryCollection[T] = js.native
  def removeEventListener(eventType: String, listener: js.Function, capture: Boolean): QueryCollection[T] = js.native
  /**
    * Sets an attribute value on all the items in the collection.
    * @param name The name of the attribute to be set.
    * @param value The value of the attribute to be set.
    * @returns This QueryCollection object.
    **/
  def setAttribute(name: String, value: js.Any): QueryCollection[T] = js.native
  /**
    * Sets the specified style property for all the elements in the collection.
    * @param name The name of the style property.
    * @param value The value for the property.
    * @returns This QueryCollection object.
    **/
  def setStyle(name: String, value: js.Any): QueryCollection[T] = js.native
  /**
    * Renders a template that is bound to the given data and parented to the elements included in the QueryCollection. If the QueryCollection contains multiple elements, the template is rendered multiple times, once at each element in the QueryCollection per item of data passed.
    * @param templateElement The DOM element to which the template control is attached.
    * @param data The data to render. If the data is an array (or any other object that has a forEach method) then the template is rendered multiple times, once for each item in the collection.
    * @param renderDonePromiseCallback If supplied, this function is called each time the template gets rendered, and is passed a promise that is fulfilled when the template rendering is complete.
    * @returns The QueryCollection.
    **/
  def template(templateElement: HTMLElement, data: js.Any): QueryCollection[T] = js.native
  def template(templateElement: HTMLElement, data: js.Any, renderDonePromiseCallback: js.Function): QueryCollection[T] = js.native
  /**
    * Toggles (adds or removes) the specified class on all the elements in the collection. If the class is present, it is removed; if it is absent, it is added.
    * @param name The name of the class to be toggled.
    * @returns This QueryCollection object.
    **/
  def toggleClass(name: String): QueryCollection[T] = js.native
}

/* static members */
@JSGlobal("WinJS.Utilities.QueryCollection")
@js.native
object QueryCollection extends js.Object {
  //#endregion Methods
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}


package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding")
@js.native
object BindingNsMembers extends js.Object {
  //#region Properties
  //#endregion Properties
  //#region Objects
  /**
       * Allows you to add bindable properties dynamically.
      **/
  var dynamicObservableMixin: winjsLib.Anon_NotifyName = js.native
  /**
       * Provides a standard implementation of the bindable contract, as well as a basic storage mechanism that participates in change notification and an asynchronous notification implementation.
      **/
  var mixin: winjsLib.Anon_NotifyNameNewValue = js.native
  /**
       * Provides functions that can make an object observable.
      **/
  var observableMixin: winjsLib.Anon_Notify = js.native
  //#endregion Objects
  //#region Functions
  /**
       * Adds a CSS class from the specified path of the source object to a destination object.
       * @param source The source object that has the class to copy.
       * @param sourceProperties The path on the source object to the source class.
       * @param dest The destination object.
      **/
  def addClassOneTime(source: js.Any, sourceProperties: js.Array[_], dest: stdLib.HTMLElement): scala.Unit = js.native
  /**
       * Returns an observable object. This may be an observable proxy for the specified object, an existing proxy, or the specified object itself if it directly supports observation.
       * @param data The object to observe.
       * @returns The observable object.
      **/
  def as[U](data: U): U = js.native
  /**
       * Binds to one or more properties on the observable object or or on child values of that object.
       * @param observable The object to bind to.
       * @param bindingDescriptor An object literal containing the binding declarations. Binding declarations take the form: { propertyName: (function | bindingDeclaration), ... }.
       * @returns An object that contains at least a "cancel" field, which is a function that removes all bindings associated with this bind request.
      **/
  def bind(observable: js.Any, bindingDescriptor: js.Any): js.Any = js.native
  /**
       * Creates a default binding initializer for binding between a source property and a destination property with the specified converter function that is executed on the value of the source property.
       * @param convert The conversion function that takes the source property and produces a value that is set to the destination property. This function must be accessible from the global namespace.
       * @returns The binding initializer.
      **/
  def converter(convert: js.Function): js.Function = js.native
  /**
       * Creates a one-way binding between the source object and the destination object. Warning Do not attempt to bind data to the ID of an HTML element.
       * @param source The source object.
       * @param sourceProperties The path on the source object to the source property.
       * @param dest The destination object.
       * @param destProperties The path on the destination object to the destination property.
       * @returns An object with a cancel method that is used to coalesce bindings.
      **/
  def defaultBind(source: js.Any, sourceProperties: js.Any, dest: js.Any, destProperties: js.Any): js.Any = js.native
  /**
       * Creates a new constructor function that supports observability with the specified set of properties.
       * @param data The object to use as the pattern for defining the set of properties.
       * @returns A constructor function with 1 optional argument that is the initial state of the properties.
      **/
  def define(data: js.Any): js.Function = js.native
  /**
       * Wraps the specified object so that all its properties are instrumented for binding. This is meant to be used in conjunction with the binding mixin.
       * @param shape The specification for the bindable object.
       * @returns An object with a set of properties all of which are wired for binding.
      **/
  def expandProperties(shape: js.Any): js.Any = js.native
  /**
       * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
      **/
  def getValue(obj: js.Any): js.Any = js.native
  /**
       * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
      **/
  def getValue(obj: js.Any, path: js.Any): js.Any = js.native
  /**
       * Marks a custom initializer function as being compatible with declarative data binding.
       * @param customInitializer The custom initializer to be marked as compatible with declarative data binding.
       * @returns The input customInitializer.
      **/
  def initializer(customInitializer: js.Function): js.Function = js.native
  /**
       * Sets the destination property to the value of the source property.
       * @param source The source object.
       * @param sourceProperties The path on the source object to the source property.
       * @param dest The destination object.
       * @param destProperties The path on the destination object to the destination property.
       * @returns An object with a cancel method that is used to coalesce bindings.
      **/
  def oneTime(source: js.Any, sourceProperties: js.Any, dest: js.Any, destProperties: js.Any): js.Any = js.native
  /**
       * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
       * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
       * @param dataContext The object that contains the values to which the DOM element should be bound.
       * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
       * @param bindingCache The cached binding data.
       * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
       * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
      **/
  def processAll(): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
       * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
       * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
       * @param dataContext The object that contains the values to which the DOM element should be bound.
       * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
       * @param bindingCache The cached binding data.
       * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
       * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
      **/
  def processAll(rootElement: winjsLib.Element): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
       * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
       * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
       * @param dataContext The object that contains the values to which the DOM element should be bound.
       * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
       * @param bindingCache The cached binding data.
       * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
       * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
      **/
  def processAll(rootElement: winjsLib.Element, dataContext: js.Any): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
       * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
       * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
       * @param dataContext The object that contains the values to which the DOM element should be bound.
       * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
       * @param bindingCache The cached binding data.
       * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
       * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
      **/
  def processAll(rootElement: winjsLib.Element, dataContext: js.Any, skipRoot: scala.Boolean): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
       * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
       * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
       * @param dataContext The object that contains the values to which the DOM element should be bound.
       * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
       * @param bindingCache The cached binding data.
       * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
       * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
      **/
  def processAll(rootElement: winjsLib.Element, dataContext: js.Any, skipRoot: scala.Boolean, bindingCache: js.Any): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
       * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
       * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
       * @param dataContext The object that contains the values to which the DOM element should be bound.
       * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
       * @param bindingCache The cached binding data.
       * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
       * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
      **/
  def processAll(
    rootElement: winjsLib.Element,
    dataContext: js.Any,
    skipRoot: scala.Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
       * Creates a one-way binding between the source object and an attribute on the destination element.
       * @param source The source object.
       * @param sourceProperties The path on the source object to the source property.
       * @param dest The destination object.
       * @param destProperties The path on the destination object to the destination property. This must be a single name.
       * @returns An object with a cancel() method that is used to coalesce bindings.
      **/
  def setAttribute(source: js.Any, sourceProperties: js.Array[_], dest: winjsLib.Element, destProperties: js.Array[_]): js.Any = js.native
  /**
       * Sets an attribute on the destination element to the value of the source property.
       * @param source The source object.
       * @param sourceProperties The path on the source object to the source property.
       * @param dest The destination object.
       * @param destProperties The path on the destination object to the destination property. This must be a single name.
      **/
  def setAttributeOneTime(source: js.Any, sourceProperties: js.Array[_], dest: winjsLib.Element, destProperties: js.Array[_]): scala.Unit = js.native
  /**
       * Returns the original (non-observable) object is returned if the specified object is an observable proxy,
       * @param data The object for which to retrieve the original value.
       * @returns If the specified object is an observable proxy, the original object is returned, otherwise the same object is returned.
      **/
  def unwrap(data: js.Any): js.Any = js.native
}


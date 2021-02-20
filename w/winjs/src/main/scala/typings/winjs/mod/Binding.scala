package typings.winjs.mod

import typings.std.HTMLElement
import typings.winjs.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functionality for data and template binding.
**/
object Binding {
  
  /**
    * Represents a list of objects that can be accessed by index or by a string key. Provides methods to search, sort, filter, and manipulate the data.
    **/
  @JSImport("winjs", "Binding.List")
  @js.native
  //#region Constructors
  /**
    * Creates a List object.
    * @constructor
    * @param list The array containing the elements to initalize the list.
    * @param options You can set two Boolean options: binding and proxy. If options.binding is true, the list contains the result of calling as on the element values. If options.proxy is true, the list specified as the first parameter is used as the storage for the List. This option should be used with care, because uncoordinated edits to the data storage may result in errors.
    **/
  class List[T] ()
    extends typings.winjs.WinJS.Binding.List[T] {
    def this(list: js.Array[T]) = this()
    def this(list: js.UndefOr[scala.Nothing], options: js.Any) = this()
    def this(list: js.Array[T], options: js.Any) = this()
  }
  object List {
    
    @JSImport("winjs", "Binding.List")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    /* static member */
    @JSImport("winjs", "Binding.List.supportedForProcessing")
    @js.native
    def supportedForProcessing: Boolean = js.native
    @scala.inline
    def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Provides a reusable declarative binding element.
    **/
  @JSImport("winjs", "Binding.Template")
  @js.native
  class Template protected ()
    extends typings.winjs.WinJS.Binding.Template {
    //#region Constructors
    /**
      * Creates a template that provides a reusable declarative binding element.
      * @constructor
      * @param element The DOM element to convert to a template.
      * @param options If this parameter is supplied, the template is loaded from the URI and the content of the element parameter is ignored. You can add the following options: href.
      **/
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: js.Any) = this()
  }
  object Template {
    
    @JSImport("winjs", "Binding.Template")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether the Template contains declarative controls that must be processed separately. This property is always true. The controls that belong to a Template object's children are instantiated when a Template instance is rendered.
      **/
    /* static member */
    @JSImport("winjs", "Binding.Template.isDeclarativeControlContainer")
    @js.native
    def isDeclarativeControlContainer: Boolean = js.native
    @scala.inline
    def isDeclarativeControlContainer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeclarativeControlContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Renders a template based on the specified URI (static method).
      * @param href The URI from which to load the template.
      * @param dataContext The object to use for default data binding.
      * @param container The element to which to add this rendered template. If this parameter is omitted, a new DIV is created.
      * @returns A promise that is completed after binding has finished. The value is either the object in the container parameter or the created DIV.
      **/
    /* static member */
    @JSImport("winjs", "Binding.Template.render")
    @js.native
    def render(href: String, dataContext: js.Any): typings.winjs.WinJS.Promise[HTMLElement] = js.native
    @JSImport("winjs", "Binding.Template.render")
    @js.native
    def render(href: String, dataContext: js.Any, container: HTMLElement): typings.winjs.WinJS.Promise[HTMLElement] = js.native
    
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    /* static member */
    @JSImport("winjs", "Binding.Template.supportedForProcessing")
    @js.native
    def supportedForProcessing: Boolean = js.native
    @scala.inline
    def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  }
  
  //#endregion Objects
  //#region Functions
  /**
    * Adds a CSS class from the specified path of the source object to a destination object.
    * @param source The source object that has the class to copy.
    * @param sourceProperties The path on the source object to the source class.
    * @param dest The destination object.
    **/
  @JSImport("winjs", "Binding.addClassOneTime")
  @js.native
  def addClassOneTime(source: js.Any, sourceProperties: js.Array[_], dest: HTMLElement): Unit = js.native
  
  /**
    * Returns an observable object. This may be an observable proxy for the specified object, an existing proxy, or the specified object itself if it directly supports observation.
    * @param data The object to observe.
    * @returns The observable object.
    **/
  @JSImport("winjs", "Binding.as")
  @js.native
  def as[U](data: U): U = js.native
  
  /**
    * Binds to one or more properties on the observable object or or on child values of that object.
    * @param observable The object to bind to.
    * @param bindingDescriptor An object literal containing the binding declarations. Binding declarations take the form: { propertyName: (function | bindingDeclaration), ... }.
    * @returns An object that contains at least a "cancel" field, which is a function that removes all bindings associated with this bind request.
    **/
  @JSImport("winjs", "Binding.bind")
  @js.native
  def bind(observable: js.Any, bindingDescriptor: js.Any): js.Any = js.native
  
  /**
    * Creates a default binding initializer for binding between a source property and a destination property with the specified converter function that is executed on the value of the source property.
    * @param convert The conversion function that takes the source property and produces a value that is set to the destination property. This function must be accessible from the global namespace.
    * @returns The binding initializer.
    **/
  @JSImport("winjs", "Binding.converter")
  @js.native
  def converter(convert: js.Function): js.Function = js.native
  
  /**
    * Creates a one-way binding between the source object and the destination object. Warning Do not attempt to bind data to the ID of an HTML element.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property.
    * @returns An object with a cancel method that is used to coalesce bindings.
    **/
  @JSImport("winjs", "Binding.defaultBind")
  @js.native
  def defaultBind(source: js.Any, sourceProperties: js.Any, dest: js.Any, destProperties: js.Any): js.Any = js.native
  
  /**
    * Creates a new constructor function that supports observability with the specified set of properties.
    * @param data The object to use as the pattern for defining the set of properties.
    * @returns A constructor function with 1 optional argument that is the initial state of the properties.
    **/
  @JSImport("winjs", "Binding.define")
  @js.native
  def define(data: js.Any): js.Function = js.native
  
  //#region Properties
  //#endregion Properties
  //#region Objects
  /**
    * Allows you to add bindable properties dynamically.
    **/
  object dynamicObservableMixin {
    
    //#region Methods
    /**
      * Adds a property with change notification to this object, including a ECMAScript5 property definition.
      * @param name The name of the property to add.
      * @param value This object is returned.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.addProperty")
    @js.native
    def addProperty(name: String, value: js.Any): Unit = js.native
    
    /**
      * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
      * @param name The name of the property to which to bind the action.
      * @param action The function to invoke asynchronously when the property may have changed.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.bind")
    @js.native
    def bind(name: String, action: js.Any): js.Function = js.native
    
    /**
      * Gets a property value by name.
      * @param name The name of the property to get.
      * @returns The value of the property as an observable object.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.getProperty")
    @js.native
    def getProperty(name: String): js.Any = js.native
    
    /**
      * Notifies listeners that a property value was updated.
      * @param name The name of the property that is being updated.
      * @param newValue The new value for the property.
      * @param oldValue The old value for the property.
      * @returns A promise that is completed when the notifications are complete.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.notify")
    @js.native
    def notify_(name: String, newValue: String, oldValue: String): typings.winjs.WinJS.Promise[_] = js.native
    
    /**
      * Removes a property value.
      * @param name The name of the property to remove.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.removeProperty")
    @js.native
    def removeProperty(name: String): js.Any = js.native
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.setProperty")
    @js.native
    def setProperty(name: String, value: js.Any): js.Any = js.native
    
    /**
      * Removes one or more listeners from the notification list for a given property.
      * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
      * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.unbind")
    @js.native
    def unbind(name: String, action: js.Function): js.Any = js.native
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
      **/
    @JSImport("winjs", "Binding.dynamicObservableMixin.updateProperty")
    @js.native
    def updateProperty(name: String, value: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  }
  
  /**
    * Wraps the specified object so that all its properties are instrumented for binding. This is meant to be used in conjunction with the binding mixin.
    * @param shape The specification for the bindable object.
    * @returns An object with a set of properties all of which are wired for binding.
    **/
  @JSImport("winjs", "Binding.expandProperties")
  @js.native
  def expandProperties(shape: js.Any): js.Any = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  @JSImport("winjs", "Binding.getValue")
  @js.native
  def getValue(obj: js.Any): js.Any = js.native
  @JSImport("winjs", "Binding.getValue")
  @js.native
  def getValue(obj: js.Any, path: js.Any): js.Any = js.native
  
  /**
    * Marks a custom initializer function as being compatible with declarative data binding.
    * @param customInitializer The custom initializer to be marked as compatible with declarative data binding.
    * @returns The input customInitializer.
    **/
  @JSImport("winjs", "Binding.initializer")
  @js.native
  def initializer(customInitializer: js.Function): js.Function = js.native
  
  /**
    * Provides a standard implementation of the bindable contract, as well as a basic storage mechanism that participates in change notification and an asynchronous notification implementation.
    **/
  object mixin {
    
    //#region Methods
    /**
      * Adds a property to the object. The property includes change notification and an ECMAScript 5 property definition .
      * @param name The name of the property to add.
      * @param value The value of the property.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.mixin.addProperty")
    @js.native
    def addProperty(name: String, value: js.Any): js.Any = js.native
    
    /**
      * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
      * @param name The name of the property to which to bind the action.
      * @param action The function to invoke asynchronously when the property may have changed.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.mixin.bind")
    @js.native
    def bind(name: String, action: js.Any): js.Function = js.native
    
    /**
      * Gets a property value by name.
      * @param name The name of the property to get.
      * @returns The value of the property as an observable object.
      **/
    @JSImport("winjs", "Binding.mixin.getProperty")
    @js.native
    def getProperty(name: String): js.Any = js.native
    
    /**
      * Notifies listeners that a property value was updated.
      * @param name The name of the property that is being updated.
      * @param newValue The new value for the property.
      * @param oldValue The old value for the property.
      * @returns A promise that is completed when the notifications are complete.
      **/
    @JSImport("winjs", "Binding.mixin.notify")
    @js.native
    def notify_(name: String, newValue: String, oldValue: String): typings.winjs.WinJS.Promise[_] = js.native
    
    /**
      * Removes a property value.
      * @param name The name of the property to remove.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.mixin.removeProperty")
    @js.native
    def removeProperty(name: String): js.Any = js.native
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.mixin.setProperty")
    @js.native
    def setProperty(name: String, value: js.Any): js.Any = js.native
    
    /**
      * Removes one or more listeners from the notification list for a given property.
      * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
      * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.mixin.unbind")
    @js.native
    def unbind(name: String, action: js.Function): js.Any = js.native
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
      **/
    @JSImport("winjs", "Binding.mixin.updateProperty")
    @js.native
    def updateProperty(name: String, value: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  }
  
  /**
    * Provides functions that can make an object observable.
    **/
  object observableMixin {
    
    //#region Methods
    /**
      * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
      * @param name The name of the property to which to bind the action.
      * @param action The function to invoke asynchronously when the property may have changed.
      * @returns A reference to this observableMixin object.
      **/
    @JSImport("winjs", "Binding.observableMixin.bind")
    @js.native
    def bind(name: String, action: js.Function): js.Any = js.native
    
    /**
      * Notifies listeners that a property value was updated.
      * @param name The name of the property that is being updated.
      * @param newValue The new value for the property.
      * @param oldValue The old value for the property.
      * @returns A promise that is completed when the notifications are complete.
      **/
    @JSImport("winjs", "Binding.observableMixin.notify")
    @js.native
    def notify_(name: String, newValue: js.Any, oldValue: js.Any): typings.winjs.WinJS.Promise[_] = js.native
    
    /**
      * Removes one or more listeners from the notification list for a given property.
      * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
      * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
      * @returns This object is returned.
      **/
    @JSImport("winjs", "Binding.observableMixin.unbind")
    @js.native
    def unbind(name: String, action: js.Function): js.Any = js.native
  }
  
  /**
    * Sets the destination property to the value of the source property.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property.
    * @returns An object with a cancel method that is used to coalesce bindings.
    **/
  @JSImport("winjs", "Binding.oneTime")
  @js.native
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
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: js.UndefOr[scala.Nothing], dataContext: js.UndefOr[scala.Nothing], skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: Boolean,
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: Boolean,
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: js.UndefOr[scala.Nothing], dataContext: js.Any): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.Any,
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.Any,
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.Any,
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: js.UndefOr[scala.Nothing], dataContext: js.Any, skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: js.UndefOr[scala.Nothing],
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: Element): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: Element, dataContext: js.UndefOr[scala.Nothing], skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: Boolean,
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: Boolean,
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.UndefOr[scala.Nothing],
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: Element, dataContext: js.Any): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: js.UndefOr[scala.Nothing],
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: Element, dataContext: js.Any, skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.UndefOr[scala.Nothing],
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(rootElement: Element, dataContext: js.Any, skipRoot: Boolean, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Binding.processAll")
  @js.native
  def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = js.native
  
  /**
    * Creates a one-way binding between the source object and an attribute on the destination element.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property. This must be a single name.
    * @returns An object with a cancel() method that is used to coalesce bindings.
    **/
  @JSImport("winjs", "Binding.setAttribute")
  @js.native
  def setAttribute(source: js.Any, sourceProperties: js.Array[_], dest: Element, destProperties: js.Array[_]): js.Any = js.native
  
  /**
    * Sets an attribute on the destination element to the value of the source property.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property. This must be a single name.
    **/
  @JSImport("winjs", "Binding.setAttributeOneTime")
  @js.native
  def setAttributeOneTime(source: js.Any, sourceProperties: js.Array[_], dest: Element, destProperties: js.Array[_]): Unit = js.native
  
  /**
    * Returns the original (non-observable) object is returned if the specified object is an observable proxy,
    * @param data The object for which to retrieve the original value.
    * @returns If the specified object is an observable proxy, the original object is returned, otherwise the same object is returned.
    **/
  @JSImport("winjs", "Binding.unwrap")
  @js.native
  def unwrap(data: js.Any): js.Any = js.native
}

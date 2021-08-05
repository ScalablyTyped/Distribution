package typings.winjs.mod

import typings.std.HTMLElement
import typings.winjs.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functionality for data and template binding.
**/
object Binding {
  
  @JSImport("winjs", "Binding")
  @js.native
  val ^ : js.Any = js.native
  
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
    extends StObject
       with typings.winjs.WinJS.Binding.List[T] {
    def this(list: js.Array[T]) = this()
    def this(list: js.Array[T], options: js.Any) = this()
    def this(list: Unit, options: js.Any) = this()
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
    inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Provides a reusable declarative binding element.
    **/
  @JSImport("winjs", "Binding.Template")
  @js.native
  class Template protected ()
    extends StObject
       with typings.winjs.WinJS.Binding.Template {
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
    inline def isDeclarativeControlContainer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeclarativeControlContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Renders a template based on the specified URI (static method).
      * @param href The URI from which to load the template.
      * @param dataContext The object to use for default data binding.
      * @param container The element to which to add this rendered template. If this parameter is omitted, a new DIV is created.
      * @returns A promise that is completed after binding has finished. The value is either the object in the container parameter or the created DIV.
      **/
    /* static member */
    inline def render(href: String, dataContext: js.Any): typings.winjs.WinJS.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(href.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[HTMLElement]]
    inline def render(href: String, dataContext: js.Any, container: HTMLElement): typings.winjs.WinJS.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(href.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[HTMLElement]]
    
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    /* static member */
    @JSImport("winjs", "Binding.Template.supportedForProcessing")
    @js.native
    def supportedForProcessing: Boolean = js.native
    inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  }
  
  //#endregion Objects
  //#region Functions
  /**
    * Adds a CSS class from the specified path of the source object to a destination object.
    * @param source The source object that has the class to copy.
    * @param sourceProperties The path on the source object to the source class.
    * @param dest The destination object.
    **/
  inline def addClassOneTime(source: js.Any, sourceProperties: js.Array[js.Any], dest: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassOneTime")(source.asInstanceOf[js.Any], sourceProperties.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns an observable object. This may be an observable proxy for the specified object, an existing proxy, or the specified object itself if it directly supports observation.
    * @param data The object to observe.
    * @returns The observable object.
    **/
  inline def as[U](data: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("as")(data.asInstanceOf[js.Any]).asInstanceOf[U]
  
  /**
    * Binds to one or more properties on the observable object or or on child values of that object.
    * @param observable The object to bind to.
    * @param bindingDescriptor An object literal containing the binding declarations. Binding declarations take the form: { propertyName: (function | bindingDeclaration), ... }.
    * @returns An object that contains at least a "cancel" field, which is a function that removes all bindings associated with this bind request.
    **/
  inline def bind(observable: js.Any, bindingDescriptor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(observable.asInstanceOf[js.Any], bindingDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Creates a default binding initializer for binding between a source property and a destination property with the specified converter function that is executed on the value of the source property.
    * @param convert The conversion function that takes the source property and produces a value that is set to the destination property. This function must be accessible from the global namespace.
    * @returns The binding initializer.
    **/
  inline def converter(convert: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("converter")(convert.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /**
    * Creates a one-way binding between the source object and the destination object. Warning Do not attempt to bind data to the ID of an HTML element.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property.
    * @returns An object with a cancel method that is used to coalesce bindings.
    **/
  inline def defaultBind(source: js.Any, sourceProperties: js.Any, dest: js.Any, destProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultBind")(source.asInstanceOf[js.Any], sourceProperties.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], destProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Creates a new constructor function that supports observability with the specified set of properties.
    * @param data The object to use as the pattern for defining the set of properties.
    * @returns A constructor function with 1 optional argument that is the initial state of the properties.
    **/
  inline def define(data: js.Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(data.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  //#region Properties
  //#endregion Properties
  //#region Objects
  /**
    * Allows you to add bindable properties dynamically.
    **/
  object dynamicObservableMixin {
    
    @JSImport("winjs", "Binding.dynamicObservableMixin")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Methods
    /**
      * Adds a property with change notification to this object, including a ECMAScript5 property definition.
      * @param name The name of the property to add.
      * @param value This object is returned.
      **/
    inline def addProperty(name: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
      * @param name The name of the property to which to bind the action.
      * @param action The function to invoke asynchronously when the property may have changed.
      * @returns This object is returned.
      **/
    inline def bind(name: String, action: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Gets a property value by name.
      * @param name The name of the property to get.
      * @returns The value of the property as an observable object.
      **/
    inline def getProperty(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Notifies listeners that a property value was updated.
      * @param name The name of the property that is being updated.
      * @param newValue The new value for the property.
      * @param oldValue The old value for the property.
      * @returns A promise that is completed when the notifications are complete.
      **/
    inline def notify_(name: String, newValue: String, oldValue: String): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(name.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    
    /**
      * Removes a property value.
      * @param name The name of the property to remove.
      * @returns This object is returned.
      **/
    inline def removeProperty(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProperty")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns This object is returned.
      **/
    inline def setProperty(name: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Removes one or more listeners from the notification list for a given property.
      * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
      * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
      * @returns This object is returned.
      **/
    inline def unbind(name: String, action: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
      **/
    inline def updateProperty(name: String, value: js.Any): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
  }
  
  /**
    * Wraps the specified object so that all its properties are instrumented for binding. This is meant to be used in conjunction with the binding mixin.
    * @param shape The specification for the bindable object.
    * @returns An object with a set of properties all of which are wired for binding.
    **/
  inline def expandProperties(shape: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expandProperties")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  inline def getValue(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getValue(obj: js.Any, path: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Marks a custom initializer function as being compatible with declarative data binding.
    * @param customInitializer The custom initializer to be marked as compatible with declarative data binding.
    * @returns The input customInitializer.
    **/
  inline def initializer(customInitializer: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("initializer")(customInitializer.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /**
    * Provides a standard implementation of the bindable contract, as well as a basic storage mechanism that participates in change notification and an asynchronous notification implementation.
    **/
  object mixin {
    
    @JSImport("winjs", "Binding.mixin")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Methods
    /**
      * Adds a property to the object. The property includes change notification and an ECMAScript 5 property definition .
      * @param name The name of the property to add.
      * @param value The value of the property.
      * @returns This object is returned.
      **/
    inline def addProperty(name: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
      * @param name The name of the property to which to bind the action.
      * @param action The function to invoke asynchronously when the property may have changed.
      * @returns This object is returned.
      **/
    inline def bind(name: String, action: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Gets a property value by name.
      * @param name The name of the property to get.
      * @returns The value of the property as an observable object.
      **/
    inline def getProperty(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Notifies listeners that a property value was updated.
      * @param name The name of the property that is being updated.
      * @param newValue The new value for the property.
      * @param oldValue The old value for the property.
      * @returns A promise that is completed when the notifications are complete.
      **/
    inline def notify_(name: String, newValue: String, oldValue: String): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(name.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    
    /**
      * Removes a property value.
      * @param name The name of the property to remove.
      * @returns This object is returned.
      **/
    inline def removeProperty(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProperty")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns This object is returned.
      **/
    inline def setProperty(name: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Removes one or more listeners from the notification list for a given property.
      * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
      * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
      * @returns This object is returned.
      **/
    inline def unbind(name: String, action: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Updates a property value and notifies any listeners.
      * @param name The name of the property to update.
      * @param value The new value of the property.
      * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
      **/
    inline def updateProperty(name: String, value: js.Any): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
  }
  
  /**
    * Provides functions that can make an object observable.
    **/
  object observableMixin {
    
    @JSImport("winjs", "Binding.observableMixin")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Methods
    /**
      * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
      * @param name The name of the property to which to bind the action.
      * @param action The function to invoke asynchronously when the property may have changed.
      * @returns A reference to this observableMixin object.
      **/
    inline def bind(name: String, action: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Notifies listeners that a property value was updated.
      * @param name The name of the property that is being updated.
      * @param newValue The new value for the property.
      * @param oldValue The old value for the property.
      * @returns A promise that is completed when the notifications are complete.
      **/
    inline def notify_(name: String, newValue: js.Any, oldValue: js.Any): typings.winjs.WinJS.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(name.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[js.Any]]
    
    /**
      * Removes one or more listeners from the notification list for a given property.
      * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
      * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
      * @returns This object is returned.
      **/
    inline def unbind(name: String, action: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  /**
    * Sets the destination property to the value of the source property.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property.
    * @returns An object with a cancel method that is used to coalesce bindings.
    **/
  inline def oneTime(source: js.Any, sourceProperties: js.Any, dest: js.Any, destProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("oneTime")(source.asInstanceOf[js.Any], sourceProperties.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], destProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
    * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
    * @param dataContext The object that contains the values to which the DOM element should be bound.
    * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
    * @param bindingCache The cached binding data.
    * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
    * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
    **/
  inline def processAll(): typings.winjs.WinJS.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processAll")().asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: js.Any, skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: js.Any, skipRoot: Boolean, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: js.Any, skipRoot: Unit, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: js.Any,
    skipRoot: Unit,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: js.Any,
    skipRoot: Unit,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: Unit, skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: Unit, skipRoot: Boolean, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: Unit,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: Unit,
    skipRoot: Boolean,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Unit, dataContext: Unit, skipRoot: Unit, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: Unit,
    skipRoot: Unit,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Unit,
    dataContext: Unit,
    skipRoot: Unit,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element): typings.winjs.WinJS.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: js.Any, skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: js.Any, skipRoot: Boolean, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: js.Any, skipRoot: Unit, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Unit,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Unit,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: Unit, skipRoot: Boolean): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: Unit, skipRoot: Boolean, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: Unit,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: Unit,
    skipRoot: Boolean,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: Element, dataContext: Unit, skipRoot: Unit, bindingCache: js.Any): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: Unit,
    skipRoot: Unit,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  inline def processAll(
    rootElement: Element,
    dataContext: Unit,
    skipRoot: Unit,
    bindingCache: Unit,
    defaultInitializer: js.Function
  ): typings.winjs.WinJS.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], dataContext.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any], bindingCache.asInstanceOf[js.Any], defaultInitializer.asInstanceOf[js.Any])).asInstanceOf[typings.winjs.WinJS.Promise[Unit]]
  
  /**
    * Creates a one-way binding between the source object and an attribute on the destination element.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property. This must be a single name.
    * @returns An object with a cancel() method that is used to coalesce bindings.
    **/
  inline def setAttribute(
    source: js.Any,
    sourceProperties: js.Array[js.Any],
    dest: Element,
    destProperties: js.Array[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(source.asInstanceOf[js.Any], sourceProperties.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], destProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Sets an attribute on the destination element to the value of the source property.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property. This must be a single name.
    **/
  inline def setAttributeOneTime(
    source: js.Any,
    sourceProperties: js.Array[js.Any],
    dest: Element,
    destProperties: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttributeOneTime")(source.asInstanceOf[js.Any], sourceProperties.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], destProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns the original (non-observable) object is returned if the specified object is an observable proxy,
    * @param data The object for which to retrieve the original value.
    * @returns If the specified object is an observable proxy, the original object is returned, otherwise the same object is returned.
    **/
  inline def unwrap(data: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}

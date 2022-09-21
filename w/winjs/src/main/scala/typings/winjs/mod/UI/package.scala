package typings.winjs.mod.UI

import typings.std.HTMLElement
import typings.winjs.Element
import typings.winjs.WinJS.Promise
import typings.winjs.WinJS.UI.IItem
import typings.winjs.WinJS.UI.IListDataSource
import typings.winjs.WinJS.UI.IListGroupDataSource
import typings.winjs.WinJS.UI.ISelectionRange
import typings.winjs.mod.UI.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//#endregion Objects
//#region Functions
/**
  * Returns a new IListDataSource that adds group information to the items of another IListDataSource.
  * @param listDataSource The data source for the individual items to group.
  * @param groupKey A callback function that accepts a single argument: an item in the IListDataSource. The function is called for each item in the list and must return the group key for that item as a string.
  * @param groupData A callback function that accepts a single argument: an item in the IListDataSource. The function is called on one IListDataSource item for each group and must return an object that represents the header of that group.
  * @param options An object that can contain properties that specify additional options: groupCountEstimate, batchSize.
  * @returns An IListGroupDataSource that contains the items in the original data source and provides additional group information in the form of a "groups" property. The "groups" property returns another IListDataSource that enumerates the different groups in the list.
  **/
inline def computeDataSourceGroups[T](listDataSource: IListDataSource[T], groupKey: js.Function, groupData: js.Function): IListGroupDataSource[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDataSourceGroups")(listDataSource.asInstanceOf[js.Any], groupKey.asInstanceOf[js.Any], groupData.asInstanceOf[js.Any])).asInstanceOf[IListGroupDataSource[T]]
inline def computeDataSourceGroups[T](listDataSource: IListDataSource[T], groupKey: js.Function, groupData: js.Function, options: Any): IListGroupDataSource[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDataSourceGroups")(listDataSource.asInstanceOf[js.Any], groupKey.asInstanceOf[js.Any], groupData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IListGroupDataSource[T]]

/**
  * Used to disables all Animations Library and ListView animations. Calling this function does not guarantee that the animations will be disabled, as the determination is made based on several factors.
  **/
inline def disableAnimations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAnimations")().asInstanceOf[Unit]

/**
  * Used to enable all Animations Library and ListView animations. Calling this function does not guarantee that the animations will be enabled, as the determination is made based on several factors.
  **/
inline def enableAnimations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAnimations")().asInstanceOf[Unit]

/**
  * Marks a event handler function as being compatible with declarative processing.
  * @param handler The handler to be marked as compatible with declarative processing.
  * @returns The handler, marked as compatible with declarative processing.
  **/
inline def eventHandler(handler: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("eventHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Any]

/**
  * Asynchronously executes a collection of CSS animations on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
  * @param element Element or elements to be animated. This parameter can be expressed in several ways: As the special value "undefined", which means that the animation has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
  * @param animation The animation description or an array of animation descriptions to apply to element. An animation description is a JavaScript object with specific properties, listed below. There are two types of animation descriptions: one for keyframe-based animations and one for explicit animations. These types are distinguished by whether the keyframe property has a defined value. The following properties are required for both types of animation descriptions: property (string), delay (number), duration (number), timing (string). If an animation has a keyframe property with a defined, non-null value, then the animation is a keyframe-based animation. A keyframe-based animation description requires the following property in addition to those mentioned above: keyframe (string). If an animation does not have a keyframe property, or if the value of the property is null or undefined, then the animation is an explicit animation. An explicit animation description requires the following properties in addition to the common properties mentioned above: from, to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
  * @returns Returns a Promise object that completes when the CSS animation is complete.
  **/
inline def executeAnimation(element: HTMLElement, animation: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAnimation")(element.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]

/**
  * Asynchronously executes a collection of CSS transitions on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
  * @param element Element or elements on which to perform the transition. This parameter can be expressed in several ways: As the special value "undefined", which means that the transition has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
  * @param transition The transition description or an array of transition descriptions to apply to element. A transition description is a JavaScript object with these properties: property (string), delay (number), duration (number), timing (string), from (optional), to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
  * @returns Returns a Promise that completes when the transition is finished.
  **/
inline def executeTransition(element: HTMLElement, transition: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeTransition")(element.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]

/**
  * Retrieves the items in the specified index range.
  * @param dataSource The data source that contains the items to retrieve.
  * @param ranges An array of ISelectionRange objects that have firstIndex and lastIndex values.
  * @returns A Promise that contains an array of the requested IItem objects.
  **/
inline def getItemsFromRanges[U](dataSource: IListDataSource[U], ranges: js.Array[ISelectionRange]): Promise[IItem[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFromRanges")(dataSource.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Promise[IItem[U]]]

/**
  * Determines whether the Animations Library and ListView animations will be performed if called.
  * @returns Returns true if animations will be performed; otherwise false.
  **/
inline def isAnimationEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimationEnabled")().asInstanceOf[Boolean]

/**
  * * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
  **/
inline def optionsParser(value: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsParser")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def optionsParser(value: String, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsParser")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def optionsParser(value: String, context: Any, functionContext: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsParser")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any], functionContext.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def optionsParser(value: String, context: Unit, functionContext: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsParser")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any], functionContext.asInstanceOf[js.Any])).asInstanceOf[Any]

/**
  * Applies declarative control binding to the specified element.
  * @param element The element to bind.
  * @returns A promise that is fulfilled after the control is activated. The value of the promise is the control that is attached to element.
  **/
inline def process(element: Element): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]

/**
  * Applies declarative control binding to all elements, starting at the specified root element.
  * @param rootElement The element at which to start applying the binding. If this parameter is not specified, the binding is applied to the entire document.
  * @param skipRoot If true, the elements to be bound skip the specified root element and include only the children.
  * @returns A promise that is fulfilled when binding has been applied to all the controls.
  **/
inline def processAll(): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("processAll")().asInstanceOf[Promise[Any]]
inline def processAll(rootElement: Unit, skipRoot: Boolean): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
inline def processAll(rootElement: Element): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
inline def processAll(rootElement: Element, skipRoot: Boolean): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any], skipRoot.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]

/**
  * Walks the DOM tree from the given element to the root of the document. Whenever a selector scope is encountered, this method performs a lookup within that scope for the specified selector string. The first matching element is returned.
  * @param selector The selector string.
  * @param element The element to begin walking to the root of the document from.
  * @returns The target element, if found.
  **/
inline def scopedSelect(selector: String, element: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("scopedSelect")(selector.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]

/**
  * Adds the set of declaratively specified options (properties and events) to the specified control. If name of the options property begins with "on", the property value is a function and the control supports addEventListener, setOptions calls addEventListener on the control.
  * @param control The control on which the properties and events are to be applied.
  * @param options The set of options that are specified declaratively.
  **/
inline def setOptions(control: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(control.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setOptions(control: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(control.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
  **/
inline def simpleItemRenderer(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleItemRenderer")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]

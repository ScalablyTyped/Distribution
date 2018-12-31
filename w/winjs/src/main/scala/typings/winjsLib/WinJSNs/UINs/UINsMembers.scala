package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI")
@js.native
object UINsMembers extends js.Object {
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
  def computeDataSourceGroups[T](listDataSource: IListDataSource[T], groupKey: js.Function, groupData: js.Function): IListGroupDataSource[T] = js.native
  def computeDataSourceGroups[T](listDataSource: IListDataSource[T], groupKey: js.Function, groupData: js.Function, options: js.Any): IListGroupDataSource[T] = js.native
  /**
    * Used to disables all Animations Library and ListView animations. Calling this function does not guarantee that the animations will be disabled, as the determination is made based on several factors.
    **/
  def disableAnimations(): scala.Unit = js.native
  /**
    * Used to enable all Animations Library and ListView animations. Calling this function does not guarantee that the animations will be enabled, as the determination is made based on several factors.
    **/
  def enableAnimations(): scala.Unit = js.native
  /**
    * Marks a event handler function as being compatible with declarative processing.
    * @param handler The handler to be marked as compatible with declarative processing.
    * @returns The handler, marked as compatible with declarative processing.
    **/
  def eventHandler(handler: js.Any): js.Any = js.native
  /**
    * Asynchronously executes a collection of CSS animations on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
    * @param element Element or elements to be animated. This parameter can be expressed in several ways: As the special value "undefined", which means that the animation has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
    * @param animation The animation description or an array of animation descriptions to apply to element. An animation description is a JavaScript object with specific properties, listed below. There are two types of animation descriptions: one for keyframe-based animations and one for explicit animations. These types are distinguished by whether the keyframe property has a defined value. The following properties are required for both types of animation descriptions: property (string), delay (number), duration (number), timing (string). If an animation has a keyframe property with a defined, non-null value, then the animation is a keyframe-based animation. A keyframe-based animation description requires the following property in addition to those mentioned above: keyframe (string). If an animation does not have a keyframe property, or if the value of the property is null or undefined, then the animation is an explicit animation. An explicit animation description requires the following properties in addition to the common properties mentioned above: from, to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
    * @returns Returns a Promise object that completes when the CSS animation is complete.
    **/
  def executeAnimation(element: stdLib.HTMLElement, animation: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Asynchronously executes a collection of CSS transitions on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
    * @param element Element or elements on which to perform the transition. This parameter can be expressed in several ways: As the special value "undefined", which means that the transition has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
    * @param transition The transition description or an array of transition descriptions to apply to element. A transition description is a JavaScript object with these properties: property (string), delay (number), duration (number), timing (string), from (optional), to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
    * @returns Returns a Promise that completes when the transition is finished.
    **/
  def executeTransition(element: stdLib.HTMLElement, transition: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Retrieves the items in the specified index range.
    * @param dataSource The data source that contains the items to retrieve.
    * @param ranges An array of ISelectionRange objects that have firstIndex and lastIndex values.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItemsFromRanges[U](dataSource: IListDataSource[U], ranges: js.Array[ISelectionRange]): winjsLib.WinJSNs.Promise[IItem[U]] = js.native
  /**
    * Determines whether the Animations Library and ListView animations will be performed if called.
    * @returns Returns true if animations will be performed; otherwise false.
    **/
  def isAnimationEnabled(): scala.Boolean = js.native
  /**
    * * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def optionsParser(value: java.lang.String): js.Any = js.native
  def optionsParser(value: java.lang.String, context: js.Any): js.Any = js.native
  def optionsParser(value: java.lang.String, context: js.Any, functionContext: js.Any): js.Any = js.native
  /**
    * Applies declarative control binding to the specified element.
    * @param element The element to bind.
    * @returns A promise that is fulfilled after the control is activated. The value of the promise is the control that is attached to element.
    **/
  def process(element: winjsLib.Element): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Applies declarative control binding to all elements, starting at the specified root element.
    * @param rootElement The element at which to start applying the binding. If this parameter is not specified, the binding is applied to the entire document.
    * @param skipRoot If true, the elements to be bound skip the specified root element and include only the children.
    * @returns A promise that is fulfilled when binding has been applied to all the controls.
    **/
  def processAll(): winjsLib.WinJSNs.Promise[_] = js.native
  def processAll(rootElement: winjsLib.Element): winjsLib.WinJSNs.Promise[_] = js.native
  def processAll(rootElement: winjsLib.Element, skipRoot: scala.Boolean): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Walks the DOM tree from the given element to the root of the document. Whenever a selector scope is encountered, this method performs a lookup within that scope for the specified selector string. The first matching element is returned.
    * @param selector The selector string.
    * @param element The element to begin walking to the root of the document from.
    * @returns The target element, if found.
    **/
  def scopedSelect(selector: java.lang.String, element: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  /**
    * Adds the set of declaratively specified options (properties and events) to the specified control. If name of the options property begins with "on", the property value is a function and the control supports addEventListener, setOptions calls addEventListener on the control.
    * @param control The control on which the properties and events are to be applied.
    * @param options The set of options that are specified declaratively.
    **/
  def setOptions(control: js.Any): scala.Unit = js.native
  def setOptions(control: js.Any, options: js.Any): scala.Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def simpleItemRenderer(fn: js.Function): js.Function = js.native
}


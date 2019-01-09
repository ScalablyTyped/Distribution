package typings
package winjsLib.WinJSNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities")
@js.native
object UtilitiesNsMembers extends js.Object {
  //#endregion Enumerations
  //#region Objects
  /**
    * A mixin that contains event-related functions.
    **/
  var eventMixin: winjsLib.Anon_AddEventListener = js.native
  //#endregion Functions
  //#region Properties
  /**
    * Gets whether the current script context has access to WinRT APIs.
    **/
  var hasWinRT: scala.Boolean = js.native
  /**
    * Determines if strict declarative processing is enabled in this script context.
    **/
  var strictProcessing: scala.Boolean = js.native
  //#endregion Objects
  //#region Functions
  /**
    * Adds the specified class to the specified element.
    * @param e The element to which to add the class.
    * @param name The name of the class to add.
    * @returns The element.
    **/
  def addClass[T /* <: stdLib.HTMLElement */](e: T, name: java.lang.String): T = js.native
  /**
    * Gets a collection of elements that are the direct children of the specified element.
    * @param element The parent element.
    * @returns The collection of children of the element.
    **/
  def children(element: stdLib.HTMLElement): QueryCollection[stdLib.HTMLElement] = js.native
  /**
    * Converts a CSS positioning string for the specified element to pixels.
    * @param element The element.
    * @param value The CSS positioning string.
    * @returns The number of pixels.
    **/
  def convertToPixels(element: stdLib.HTMLElement, value: java.lang.String): scala.Double = js.native
  /**
    * Creates an object that has one event for each name passed to the function.
    * @param events A variable list of property names.
    * @returns The object with the specified properties. The names of the properties are prefixed with 'on'.
    **/
  def createEventProperties(events: java.lang.String*): js.Any = js.native
  /**
    * Gets the data value associated with the specified element.
    * @param element The element.
    * @returns The value associated with the element.
    **/
  def data(element: stdLib.HTMLElement): js.Any = js.native
  /**
    * Disposes all first-generation disposable elements that are descendents of the specified element. The specified element itself is not disposed.
    * @param element The root element whose sub-tree is to be disposed.
    **/
  def disposeSubTree(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Removes all the child nodes from the specified element.
    * @param element The element.
    * @returns The element.
    **/
  def empty[T /* <: stdLib.HTMLElement */](element: T): T = js.native
  /**
    * Determines whether the specified event occurred within the specified element.
    * @param element The element.
    * @param event The event.
    * @returns true if the event occurred within the element; otherwise, false.
    **/
  def eventWithinElement(element: stdLib.HTMLElement, event: stdLib.Event): scala.Boolean = js.native
  /**
    * Adds tags and type to a logging message.
    * @param message The message to be formatted.
    * @param tag The tag(s) to be applied to the message. Multiple tags should be separated by spaces.
    * @param type The type of the message.
    * @returns The formatted message.
    **/
  def formatLog(message: java.lang.String, tag: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  /**
    * Gets the height of the content of the specified element. The content height does not include borders or padding.
    * @param element The element.
    * @returns The content height of the element.
    **/
  def getContentHeight(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the width of the content of the specified element. The content width does not include borders or padding.
    * @param element The element.
    * @returns The content width of the element.
    **/
  def getContentWidth(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the leaf-level type or namespace specified by the name parameter.
    * @param name The name of the member.
    * @param root The root to start in. Defaults to the global object.
    * @returns The leaf-level type or namespace in the specified parent namespace.
    **/
  def getMember(name: java.lang.String): js.Any = js.native
  def getMember(name: java.lang.String, root: js.Any): js.Any = js.native
  /**
    * Gets the position of the specified element.
    * @param element The element.
    * @returns An object that contains the left, top, width and height properties of the element.
    **/
  def getPosition(element: stdLib.HTMLElement): IPosition = js.native
  /**
    * Gets the left coordinate of the specified element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative left coordinate.
    **/
  def getRelativeLeft(): scala.Double = js.native
  def getRelativeLeft(element: stdLib.HTMLElement): scala.Double = js.native
  def getRelativeLeft(element: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the top coordinate of the element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative top coordinate.
    **/
  def getRelativeTop(): scala.Double = js.native
  def getRelativeTop(element: stdLib.HTMLElement): scala.Double = js.native
  def getRelativeTop(element: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the scrollLeft and scrollTop of the specified element, adjusting the scrollLeft to change from browser specific coordinates to logical coordinates when in RTL.
    * @param element The element.
    * @returns An object with two properties: scrollLeft and scrollTop
    **/
  def getScrollPosition(element: stdLib.HTMLElement): winjsLib.Anon_ScrollLeft = js.native
  /**
    * Gets the tab index of the specified element.
    * @param element The element
    * @returns The tabIndex of the element. Returns -1 if the element cannot be tabbed to.
    **/
  def getTabIndex(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the height of the element, including its margins.
    * @param element The element.
    * @returns The height of the element including margins.
    **/
  def getTotalHeight(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the width of the element, including margins.
    * @param element The element.
    * @returns The width of the element including margins.
    **/
  def getTotalWidth(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Determines whether the specified element has the specified class.
    * @param e The element.
    * @param name The name of the class.
    * @returns true if the element has the class, otherwise false.
    **/
  def hasClass(e: stdLib.HTMLElement, name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a collection with zero or one elements matching the specified id.
    * @param id The ID of the element (or elements).
    * @returns A collection of elements whose id matches the id parameter.
    **/
  def id(id: java.lang.String): QueryCollection[stdLib.HTMLElement] = js.native
  /**
    * Calls insertAdjacentHTML on the specified element.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text The text to insert.
    **/
  def insertAdjacentHTML(element: stdLib.HTMLElement, position: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
    * Calls insertAdjacentHTML on the specified element in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text Value to be provided to insertAdjacentHTML.
    **/
  def insertAdjacentHTMLUnsafe(element: stdLib.HTMLElement, position: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
    * Attaches the default dispose API wrapping the dispose implementation to the specified element.
    * @param element The element to mark as disposable.
    * @param disposeImpl The function containing the element-specific dispose logic, called by the dispose function that markDisposable attaches.
    **/
  def markDisposable(element: stdLib.HTMLElement): scala.Unit = js.native
  def markDisposable(element: stdLib.HTMLElement, disposeImpl: js.Function): scala.Unit = js.native
  /**
    * Marks a function as being compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll.
    * @param func The function to be marked as compatible with declarative processing.
    * @returns The input function, marked as compatible with declarative processing.
    **/
  def markSupportedForProcessing[U /* <: js.Function */](func: U): U = js.native
  /**
    * Returns a QueryCollection with zero or one elements matching the specified selector query.
    * @param query The CSS selector to use. See Selectors for more information.
    * @param element Optional. The root element at which to start the query. If this parameter is omitted, the scope of the query is the entire document.
    * @returns A QueryCollection with zero or one elements matching the specified selector query.
    **/
  def query(query: js.Any): QueryCollection[stdLib.HTMLElement] = js.native
  def query(query: js.Any, element: stdLib.HTMLElement): QueryCollection[stdLib.HTMLElement] = js.native
  /**
    * Ensures that the specified function executes only after the DOMContentLoaded event has fired for the current page. The DOMContentLoaded event occurs after the page has been parsed but before all the resources are loaded.
    * @param callback A function that executes after the DOMContentLoaded event has occurred.
    * @param async If true, the callback should be executed asynchronously.
    * @returns A promise that completes after the DOMContentLoaded event has occurred.
    **/
  def ready(): winjsLib.WinJSNs.Promise[_] = js.native
  def ready(callback: js.Function): winjsLib.WinJSNs.Promise[_] = js.native
  def ready(callback: js.Function, async: scala.Boolean): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Removes the specified class from the specified element.
    * @param e The element from which to remove the class.
    * @param name The name of the class to remove.
    * @returns The element.
    **/
  def removeClass[T /* <: stdLib.HTMLElement */](e: T, name: java.lang.String): T = js.native
  /**
    * Asserts that the value is compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll. If the value is not compatible, and strictProcessing is on, an exception is thrown. All functions that have been declared using WinJS.Class.define, WinJS.Class.derive, WinJS.UI.Pages.define, or WinJS.Binding.converter are automatically marked as supported for declarative processing. Any other function that you use from a declarative context (that is, a context in which an HTML element has a data-win-control or data-win-options attribute) must be marked manually by calling this function. When you mark a function as supported for declarative processing, you are guaranteeing that the code in the function is secure from injection of third-party content.
    * @param value The value to be tested for compatibility with declarative processing. If the value is a function it must be marked with a property supportedForProcessing with a value of true when strictProcessing is on. For more information, see WinJS.Utilities.markSupportedForProcessing.
    * @returns The input value.
    **/
  def requireSupportedForProcessing[T](value: T): T = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTML(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTMLUnsafe(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTML(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTMLUnsafe(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the scrollLeft and scrollTop of the specified element, changing the scrollLeft from logical coordinates to browser-specific coordinates when in RTL.
    * @param element The element.
    * @param position An object describing the position to set.
    **/
  def setScrollPosition(element: stdLib.HTMLElement, position: winjsLib.Anon_ScrollLeft): scala.Unit = js.native
  /**
    * Configures a logger that writes messages containing the specified tags to the JavaScript console.
    * @param options The tags for messages to log. Multiple tags should be separated by spaces. May contain type, tags, excludeTags and action properties.
    **/
  def startLog(): scala.Unit = js.native
  def startLog(options: ILogOptions): scala.Unit = js.native
  def startLog(tags: java.lang.String): scala.Unit = js.native
  /**
    * Removes the WinJS logger that had previously been set up.
    **/
  def stopLog(): scala.Unit = js.native
  /**
    * Toggles (adds or removes) the specified class on the specified element. If the class is present, it is removed; if it is absent, it is added.
    * @param e The element on which to toggle the class.
    * @param name The name of the class to toggle.
    * @returns The element.
    **/
  def toggleClass[T /* <: stdLib.HTMLElement */](e: T, name: java.lang.String): T = js.native
}


package typings.winjs.winjsMod

import typings.std.Event
import typings.std.HTMLElement
import typings.winjs.Anon_ScrollLeft
import typings.winjs.WinJSNs.UtilitiesNs.ILogOptions
import typings.winjs.WinJSNs.UtilitiesNs.IPosition
import typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.IJob
import typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.IJobInfo
import typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.IOwnerToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides helper functions, for example, functions to add and remove CSS classes.
**/
@JSImport("winjs", "Utilities")
@js.native
object UtilitiesNs extends js.Object {
  /**
    * Represents the result of a query selector, and provides various operations that perform actions over the elements of the collection.
    **/
  @js.native
  class QueryCollection[T] ()
    extends typings.winjs.WinJSNs.UtilitiesNs.QueryCollection[T]
  
  //#endregion Functions
  //#region Properties
  /**
    * Gets whether the current script context has access to WinRT APIs.
    **/
  var hasWinRT: Boolean = js.native
  /**
    * Determines if strict declarative processing is enabled in this script context.
    **/
  var strictProcessing: Boolean = js.native
  //#endregion Objects
  //#region Functions
  /**
    * Adds the specified class to the specified element.
    * @param e The element to which to add the class.
    * @param name The name of the class to add.
    * @returns The element.
    **/
  def addClass[T /* <: HTMLElement */](e: T, name: String): T = js.native
  /**
    * Gets a collection of elements that are the direct children of the specified element.
    * @param element The parent element.
    * @returns The collection of children of the element.
    **/
  def children(element: HTMLElement): typings.winjs.WinJSNs.UtilitiesNs.QueryCollection[HTMLElement] = js.native
  /**
    * Converts a CSS positioning string for the specified element to pixels.
    * @param element The element.
    * @param value The CSS positioning string.
    * @returns The number of pixels.
    **/
  def convertToPixels(element: HTMLElement, value: String): Double = js.native
  /**
    * Creates an object that has one event for each name passed to the function.
    * @param events A variable list of property names.
    * @returns The object with the specified properties. The names of the properties are prefixed with 'on'.
    **/
  def createEventProperties(events: String*): js.Any = js.native
  /**
    * Gets the data value associated with the specified element.
    * @param element The element.
    * @returns The value associated with the element.
    **/
  def data(element: HTMLElement): js.Any = js.native
  /**
    * Disposes all first-generation disposable elements that are descendents of the specified element. The specified element itself is not disposed.
    * @param element The root element whose sub-tree is to be disposed.
    **/
  def disposeSubTree(element: HTMLElement): Unit = js.native
  /**
    * Removes all the child nodes from the specified element.
    * @param element The element.
    * @returns The element.
    **/
  def empty[T /* <: HTMLElement */](element: T): T = js.native
  /**
    * Determines whether the specified event occurred within the specified element.
    * @param element The element.
    * @param event The event.
    * @returns true if the event occurred within the element; otherwise, false.
    **/
  def eventWithinElement(element: HTMLElement, event: Event): Boolean = js.native
  /**
    * Adds tags and type to a logging message.
    * @param message The message to be formatted.
    * @param tag The tag(s) to be applied to the message. Multiple tags should be separated by spaces.
    * @param type The type of the message.
    * @returns The formatted message.
    **/
  def formatLog(message: String, tag: String, `type`: String): String = js.native
  /**
    * Gets the height of the content of the specified element. The content height does not include borders or padding.
    * @param element The element.
    * @returns The content height of the element.
    **/
  def getContentHeight(element: HTMLElement): Double = js.native
  /**
    * Gets the width of the content of the specified element. The content width does not include borders or padding.
    * @param element The element.
    * @returns The content width of the element.
    **/
  def getContentWidth(element: HTMLElement): Double = js.native
  /**
    * Gets the leaf-level type or namespace specified by the name parameter.
    * @param name The name of the member.
    * @param root The root to start in. Defaults to the global object.
    * @returns The leaf-level type or namespace in the specified parent namespace.
    **/
  def getMember(name: String): js.Any = js.native
  def getMember(name: String, root: js.Any): js.Any = js.native
  /**
    * Gets the position of the specified element.
    * @param element The element.
    * @returns An object that contains the left, top, width and height properties of the element.
    **/
  def getPosition(element: HTMLElement): IPosition = js.native
  /**
    * Gets the left coordinate of the specified element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative left coordinate.
    **/
  def getRelativeLeft(): Double = js.native
  def getRelativeLeft(element: HTMLElement): Double = js.native
  def getRelativeLeft(element: HTMLElement, parent: HTMLElement): Double = js.native
  /**
    * Gets the top coordinate of the element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative top coordinate.
    **/
  def getRelativeTop(): Double = js.native
  def getRelativeTop(element: HTMLElement): Double = js.native
  def getRelativeTop(element: HTMLElement, parent: HTMLElement): Double = js.native
  /**
    * Gets the scrollLeft and scrollTop of the specified element, adjusting the scrollLeft to change from browser specific coordinates to logical coordinates when in RTL.
    * @param element The element.
    * @returns An object with two properties: scrollLeft and scrollTop
    **/
  def getScrollPosition(element: HTMLElement): Anon_ScrollLeft = js.native
  /**
    * Gets the tab index of the specified element.
    * @param element The element
    * @returns The tabIndex of the element. Returns -1 if the element cannot be tabbed to.
    **/
  def getTabIndex(element: HTMLElement): Double = js.native
  /**
    * Gets the height of the element, including its margins.
    * @param element The element.
    * @returns The height of the element including margins.
    **/
  def getTotalHeight(element: HTMLElement): Double = js.native
  /**
    * Gets the width of the element, including margins.
    * @param element The element.
    * @returns The width of the element including margins.
    **/
  def getTotalWidth(element: HTMLElement): Double = js.native
  /**
    * Determines whether the specified element has the specified class.
    * @param e The element.
    * @param name The name of the class.
    * @returns true if the element has the class, otherwise false.
    **/
  def hasClass(e: HTMLElement, name: String): Boolean = js.native
  /**
    * Returns a collection with zero or one elements matching the specified id.
    * @param id The ID of the element (or elements).
    * @returns A collection of elements whose id matches the id parameter.
    **/
  def id(id: String): typings.winjs.WinJSNs.UtilitiesNs.QueryCollection[HTMLElement] = js.native
  /**
    * Calls insertAdjacentHTML on the specified element.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text The text to insert.
    **/
  def insertAdjacentHTML(element: HTMLElement, position: String, text: String): Unit = js.native
  /**
    * Calls insertAdjacentHTML on the specified element in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text Value to be provided to insertAdjacentHTML.
    **/
  def insertAdjacentHTMLUnsafe(element: HTMLElement, position: String, text: String): Unit = js.native
  /**
    * Attaches the default dispose API wrapping the dispose implementation to the specified element.
    * @param element The element to mark as disposable.
    * @param disposeImpl The function containing the element-specific dispose logic, called by the dispose function that markDisposable attaches.
    **/
  def markDisposable(element: HTMLElement): Unit = js.native
  def markDisposable(element: HTMLElement, disposeImpl: js.Function): Unit = js.native
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
  def query(query: js.Any): typings.winjs.WinJSNs.UtilitiesNs.QueryCollection[HTMLElement] = js.native
  def query(query: js.Any, element: HTMLElement): typings.winjs.WinJSNs.UtilitiesNs.QueryCollection[HTMLElement] = js.native
  /**
    * Ensures that the specified function executes only after the DOMContentLoaded event has fired for the current page. The DOMContentLoaded event occurs after the page has been parsed but before all the resources are loaded.
    * @param callback A function that executes after the DOMContentLoaded event has occurred.
    * @param async If true, the callback should be executed asynchronously.
    * @returns A promise that completes after the DOMContentLoaded event has occurred.
    **/
  def ready(): typings.winjs.WinJSNs.Promise[_] = js.native
  def ready(callback: js.Function): typings.winjs.WinJSNs.Promise[_] = js.native
  def ready(callback: js.Function, async: Boolean): typings.winjs.WinJSNs.Promise[_] = js.native
  /**
    * Removes the specified class from the specified element.
    * @param e The element from which to remove the class.
    * @param name The name of the class to remove.
    * @returns The element.
    **/
  def removeClass[T /* <: HTMLElement */](e: T, name: String): T = js.native
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
  def setInnerHTML(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTMLUnsafe(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTML(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTMLUnsafe(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the scrollLeft and scrollTop of the specified element, changing the scrollLeft from logical coordinates to browser-specific coordinates when in RTL.
    * @param element The element.
    * @param position An object describing the position to set.
    **/
  def setScrollPosition(element: HTMLElement, position: Anon_ScrollLeft): Unit = js.native
  /**
    * Configures a logger that writes messages containing the specified tags to the JavaScript console.
    * @param options The tags for messages to log. Multiple tags should be separated by spaces. May contain type, tags, excludeTags and action properties.
    **/
  def startLog(): Unit = js.native
  def startLog(options: ILogOptions): Unit = js.native
  def startLog(tags: String): Unit = js.native
  /**
    * Removes the WinJS logger that had previously been set up.
    **/
  def stopLog(): Unit = js.native
  /**
    * Toggles (adds or removes) the specified class on the specified element. If the class is present, it is removed; if it is absent, it is added.
    * @param e The element on which to toggle the class.
    * @param name The name of the class to toggle.
    * @returns The element.
    **/
  def toggleClass[T /* <: HTMLElement */](e: T, name: String): T = js.native
  //#region Enumerations
  /**
    * Defines a set of keyboard values.
    **/
  @js.native
  object Key extends js.Object {
    /* 74 */ val F1: typings.winjs.WinJSNs.UtilitiesNs.Key.F1 with Double = js.native
    /* 83 */ val F10: typings.winjs.WinJSNs.UtilitiesNs.Key.F10 with Double = js.native
    /* 84 */ val F11: typings.winjs.WinJSNs.UtilitiesNs.Key.F11 with Double = js.native
    /* 85 */ val F12: typings.winjs.WinJSNs.UtilitiesNs.Key.F12 with Double = js.native
    /* 75 */ val F2: typings.winjs.WinJSNs.UtilitiesNs.Key.F2 with Double = js.native
    /* 76 */ val F3: typings.winjs.WinJSNs.UtilitiesNs.Key.F3 with Double = js.native
    /* 77 */ val F4: typings.winjs.WinJSNs.UtilitiesNs.Key.F4 with Double = js.native
    /* 78 */ val F5: typings.winjs.WinJSNs.UtilitiesNs.Key.F5 with Double = js.native
    /* 79 */ val F6: typings.winjs.WinJSNs.UtilitiesNs.Key.F6 with Double = js.native
    /* 80 */ val F7: typings.winjs.WinJSNs.UtilitiesNs.Key.F7 with Double = js.native
    /* 81 */ val F8: typings.winjs.WinJSNs.UtilitiesNs.Key.F8 with Double = js.native
    /* 82 */ val F9: typings.winjs.WinJSNs.UtilitiesNs.Key.F9 with Double = js.native
    /* 105 */ val GamepadA: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadA with Double = js.native
    /* 106 */ val GamepadB: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadB with Double = js.native
    /* 114 */ val GamepadDPadDown: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadDPadDown with Double = js.native
    /* 115 */ val GamepadDPadLeft: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadDPadLeft with Double = js.native
    /* 116 */ val GamepadDPadRight: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadDPadRight with Double = js.native
    /* 113 */ val GamepadDPadUp: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadDPadUp with Double = js.native
    /* 110 */ val GamepadLeftShoulder: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftShoulder with Double = js.native
    /* 119 */ val GamepadLeftThumbstick: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstick with Double = js.native
    /* 122 */ val GamepadLeftThumbstickDown: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickDown with Double = js.native
    /* 124 */ val GamepadLeftThumbstickLeft: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickLeft with Double = js.native
    /* 123 */ val GamepadLeftThumbstickRight: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickRight with Double = js.native
    /* 121 */ val GamepadLeftThumbstickUp: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickUp with Double = js.native
    /* 111 */ val GamepadLeftTrigger: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadLeftTrigger with Double = js.native
    /* 117 */ val GamepadMenu: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadMenu with Double = js.native
    /* 109 */ val GamepadRightShoulder: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightShoulder with Double = js.native
    /* 120 */ val GamepadRightThumbstick: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstick with Double = js.native
    /* 126 */ val GamepadRightThumbstickDown: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickDown with Double = js.native
    /* 128 */ val GamepadRightThumbstickLeft: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickLeft with Double = js.native
    /* 127 */ val GamepadRightThumbstickRight: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickRight with Double = js.native
    /* 125 */ val GamepadRightThumbstickUp: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickUp with Double = js.native
    /* 112 */ val GamepadRightTrigger: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadRightTrigger with Double = js.native
    /* 118 */ val GamepadView: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadView with Double = js.native
    /* 107 */ val GamepadX: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadX with Double = js.native
    /* 108 */ val GamepadY: typings.winjs.WinJSNs.UtilitiesNs.Key.GamepadY with Double = js.native
    /* 133 */ val IME: typings.winjs.WinJSNs.UtilitiesNs.Key.IME with Double = js.native
    /* 92 */ val NavigationAccept: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationAccept with Double = js.native
    /* 93 */ val NavigationCancel: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationCancel with Double = js.native
    /* 89 */ val NavigationDown: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationDown with Double = js.native
    /* 90 */ val NavigationLeft: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationLeft with Double = js.native
    /* 87 */ val NavigationMenu: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationMenu with Double = js.native
    /* 91 */ val NavigationRight: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationRight with Double = js.native
    /* 88 */ val NavigationUp: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationUp with Double = js.native
    /* 86 */ val NavigationView: typings.winjs.WinJSNs.UtilitiesNs.Key.NavigationView with Double = js.native
    /* 30 */ val a: typings.winjs.WinJSNs.UtilitiesNs.Key.a with Double = js.native
    /* 70 */ val add: typings.winjs.WinJSNs.UtilitiesNs.Key.add with Double = js.native
    /* 5 */ val alt: typings.winjs.WinJSNs.UtilitiesNs.Key.alt with Double = js.native
    /* 31 */ val b: typings.winjs.WinJSNs.UtilitiesNs.Key.b with Double = js.native
    /* 130 */ val backSlash: typings.winjs.WinJSNs.UtilitiesNs.Key.backSlash with Double = js.native
    /* 0 */ val backspace: typings.winjs.WinJSNs.UtilitiesNs.Key.backspace with Double = js.native
    /* 96 */ val browserBack: typings.winjs.WinJSNs.UtilitiesNs.Key.browserBack with Double = js.native
    /* 97 */ val browserForward: typings.winjs.WinJSNs.UtilitiesNs.Key.browserForward with Double = js.native
    /* 32 */ val c: typings.winjs.WinJSNs.UtilitiesNs.Key.c with Double = js.native
    /* 7 */ val capsLock: typings.winjs.WinJSNs.UtilitiesNs.Key.capsLock with Double = js.native
    /* 131 */ val closeBracket: typings.winjs.WinJSNs.UtilitiesNs.Key.closeBracket with Double = js.native
    /* 100 */ val comma: typings.winjs.WinJSNs.UtilitiesNs.Key.comma with Double = js.native
    /* 4 */ val ctrl: typings.winjs.WinJSNs.UtilitiesNs.Key.ctrl with Double = js.native
    /* 33 */ val d: typings.winjs.WinJSNs.UtilitiesNs.Key.d with Double = js.native
    /* 101 */ val dash: typings.winjs.WinJSNs.UtilitiesNs.Key.dash with Double = js.native
    /* 72 */ val decimalPoint: typings.winjs.WinJSNs.UtilitiesNs.Key.decimalPoint with Double = js.native
    /* 19 */ val deleteKey: typings.winjs.WinJSNs.UtilitiesNs.Key.deleteKey with Double = js.native
    /* 73 */ val divide: typings.winjs.WinJSNs.UtilitiesNs.Key.divide with Double = js.native
    /* 17 */ val downArrow: typings.winjs.WinJSNs.UtilitiesNs.Key.downArrow with Double = js.native
    /* 34 */ val e: typings.winjs.WinJSNs.UtilitiesNs.Key.e with Double = js.native
    /* 12 */ val end: typings.winjs.WinJSNs.UtilitiesNs.Key.end with Double = js.native
    /* 2 */ val enter: typings.winjs.WinJSNs.UtilitiesNs.Key.enter with Double = js.native
    /* 99 */ val equal: typings.winjs.WinJSNs.UtilitiesNs.Key.equal with Double = js.native
    /* 8 */ val escape: typings.winjs.WinJSNs.UtilitiesNs.Key.escape with Double = js.native
    /* 35 */ val f: typings.winjs.WinJSNs.UtilitiesNs.Key.f with Double = js.native
    /* 103 */ val forwardSlash: typings.winjs.WinJSNs.UtilitiesNs.Key.forwardSlash with Double = js.native
    /* 36 */ val g: typings.winjs.WinJSNs.UtilitiesNs.Key.g with Double = js.native
    /* 104 */ val graveAccent: typings.winjs.WinJSNs.UtilitiesNs.Key.graveAccent with Double = js.native
    /* 37 */ val h: typings.winjs.WinJSNs.UtilitiesNs.Key.h with Double = js.native
    /* 13 */ val home: typings.winjs.WinJSNs.UtilitiesNs.Key.home with Double = js.native
    /* 38 */ val i: typings.winjs.WinJSNs.UtilitiesNs.Key.i with Double = js.native
    /* 18 */ val insert: typings.winjs.WinJSNs.UtilitiesNs.Key.insert with Double = js.native
    /* 39 */ val j: typings.winjs.WinJSNs.UtilitiesNs.Key.j with Double = js.native
    /* 40 */ val k: typings.winjs.WinJSNs.UtilitiesNs.Key.k with Double = js.native
    /* 41 */ val l: typings.winjs.WinJSNs.UtilitiesNs.Key.l with Double = js.native
    /* 14 */ val leftArrow: typings.winjs.WinJSNs.UtilitiesNs.Key.leftArrow with Double = js.native
    /* 56 */ val leftWindows: typings.winjs.WinJSNs.UtilitiesNs.Key.leftWindows with Double = js.native
    /* 42 */ val m: typings.winjs.WinJSNs.UtilitiesNs.Key.m with Double = js.native
    /* 58 */ val menu: typings.winjs.WinJSNs.UtilitiesNs.Key.menu with Double = js.native
    /* 69 */ val multiply: typings.winjs.WinJSNs.UtilitiesNs.Key.multiply with Double = js.native
    /* 43 */ val n: typings.winjs.WinJSNs.UtilitiesNs.Key.n with Double = js.native
    /* 20 */ val num0: typings.winjs.WinJSNs.UtilitiesNs.Key.num0 with Double = js.native
    /* 21 */ val num1: typings.winjs.WinJSNs.UtilitiesNs.Key.num1 with Double = js.native
    /* 22 */ val num2: typings.winjs.WinJSNs.UtilitiesNs.Key.num2 with Double = js.native
    /* 23 */ val num3: typings.winjs.WinJSNs.UtilitiesNs.Key.num3 with Double = js.native
    /* 24 */ val num4: typings.winjs.WinJSNs.UtilitiesNs.Key.num4 with Double = js.native
    /* 25 */ val num5: typings.winjs.WinJSNs.UtilitiesNs.Key.num5 with Double = js.native
    /* 26 */ val num6: typings.winjs.WinJSNs.UtilitiesNs.Key.num6 with Double = js.native
    /* 27 */ val num7: typings.winjs.WinJSNs.UtilitiesNs.Key.num7 with Double = js.native
    /* 28 */ val num8: typings.winjs.WinJSNs.UtilitiesNs.Key.num8 with Double = js.native
    /* 29 */ val num9: typings.winjs.WinJSNs.UtilitiesNs.Key.num9 with Double = js.native
    /* 94 */ val numLock: typings.winjs.WinJSNs.UtilitiesNs.Key.numLock with Double = js.native
    /* 59 */ val numPad0: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad0 with Double = js.native
    /* 60 */ val numPad1: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad1 with Double = js.native
    /* 61 */ val numPad2: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad2 with Double = js.native
    /* 62 */ val numPad3: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad3 with Double = js.native
    /* 63 */ val numPad4: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad4 with Double = js.native
    /* 64 */ val numPad5: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad5 with Double = js.native
    /* 65 */ val numPad6: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad6 with Double = js.native
    /* 66 */ val numPad7: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad7 with Double = js.native
    /* 67 */ val numPad8: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad8 with Double = js.native
    /* 68 */ val numPad9: typings.winjs.WinJSNs.UtilitiesNs.Key.numPad9 with Double = js.native
    /* 44 */ val o: typings.winjs.WinJSNs.UtilitiesNs.Key.o with Double = js.native
    /* 129 */ val openBracket: typings.winjs.WinJSNs.UtilitiesNs.Key.openBracket with Double = js.native
    /* 45 */ val p: typings.winjs.WinJSNs.UtilitiesNs.Key.p with Double = js.native
    /* 11 */ val pageDown: typings.winjs.WinJSNs.UtilitiesNs.Key.pageDown with Double = js.native
    /* 10 */ val pageUp: typings.winjs.WinJSNs.UtilitiesNs.Key.pageUp with Double = js.native
    /* 6 */ val pause: typings.winjs.WinJSNs.UtilitiesNs.Key.pause with Double = js.native
    /* 102 */ val period: typings.winjs.WinJSNs.UtilitiesNs.Key.period with Double = js.native
    /* 46 */ val q: typings.winjs.WinJSNs.UtilitiesNs.Key.q with Double = js.native
    /* 47 */ val r: typings.winjs.WinJSNs.UtilitiesNs.Key.r with Double = js.native
    /* 16 */ val rightArrow: typings.winjs.WinJSNs.UtilitiesNs.Key.rightArrow with Double = js.native
    /* 57 */ val rightWindows: typings.winjs.WinJSNs.UtilitiesNs.Key.rightWindows with Double = js.native
    /* 48 */ val s: typings.winjs.WinJSNs.UtilitiesNs.Key.s with Double = js.native
    /* 95 */ val scrollLock: typings.winjs.WinJSNs.UtilitiesNs.Key.scrollLock with Double = js.native
    /* 98 */ val semicolon: typings.winjs.WinJSNs.UtilitiesNs.Key.semicolon with Double = js.native
    /* 3 */ val shift: typings.winjs.WinJSNs.UtilitiesNs.Key.shift with Double = js.native
    /* 132 */ val singleQuote: typings.winjs.WinJSNs.UtilitiesNs.Key.singleQuote with Double = js.native
    /* 9 */ val space: typings.winjs.WinJSNs.UtilitiesNs.Key.space with Double = js.native
    /* 71 */ val subtract: typings.winjs.WinJSNs.UtilitiesNs.Key.subtract with Double = js.native
    /* 49 */ val t: typings.winjs.WinJSNs.UtilitiesNs.Key.t with Double = js.native
    /* 1 */ val tab: typings.winjs.WinJSNs.UtilitiesNs.Key.tab with Double = js.native
    /* 50 */ val u: typings.winjs.WinJSNs.UtilitiesNs.Key.u with Double = js.native
    /* 15 */ val upArrow: typings.winjs.WinJSNs.UtilitiesNs.Key.upArrow with Double = js.native
    /* 51 */ val v: typings.winjs.WinJSNs.UtilitiesNs.Key.v with Double = js.native
    /* 52 */ val w: typings.winjs.WinJSNs.UtilitiesNs.Key.w with Double = js.native
    /* 53 */ val x: typings.winjs.WinJSNs.UtilitiesNs.Key.x with Double = js.native
    /* 54 */ val y: typings.winjs.WinJSNs.UtilitiesNs.Key.y with Double = js.native
    /* 55 */ val z: typings.winjs.WinJSNs.UtilitiesNs.Key.z with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winjs.WinJSNs.UtilitiesNs.Key with Double] = js.native
  }
  
  /* static members */
  @js.native
  object QueryCollection extends js.Object {
    //#endregion Methods
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: Boolean = js.native
  }
  
  /**
    * Provides functions and objects for scheduling and managing asynchronous tasks.
  **/
  @JSName("Scheduler")
  @js.native
  object SchedulerNs extends js.Object {
    //#endregion Interfaces
    //#region Properties
    /**
      * Gets the current priority at which the caller is executing.
      **/
    var currentPriority: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority = js.native
    //#endregion Properties
    //#region Functions
    /**
      * Creates and returns a new IOwnerToken which can be set to the owner property of one or more jobs.
      * @returns A new IOwnerToken which can be set to the owner property of one or more jobs.
      **/
    def createOwnerToken(): IOwnerToken = js.native
    /**
      * Runs the specified callback in a high priority context.
      * @param callback The callback to run in a high priority callback.
      * @returns The return value of the callback.
      **/
    def execHigh[U](callback: js.Function0[U]): U = js.native
    /**
      * Runs jobs in the scheduler without timeslicing until all jobs at the specified priority and higher have executed.
      * @param priority The priority to which the scheduler should drain. The default is -15.
      * @param name An optional description of the drain request for diagnostics.
      * @returns A Promise which completes when the drain has finished. Canceling this Promise cancels the drain request. This Promise will never enter an error state.
      **/
    def requestDrain(): typings.winjs.WinJSNs.Promise[_] = js.native
    def requestDrain(priority: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority): typings.winjs.WinJSNs.Promise[_] = js.native
    def requestDrain(priority: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority, name: String): typings.winjs.WinJSNs.Promise[_] = js.native
    /**
      * Returns a string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      * @returns A string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      **/
    def retrieveState(): String = js.native
    /**
      * Schedules the specified function to execute asynchronously.
      * @param work A function that represents the work item to be scheduled. When called the work item will receive as its first argument an object which allows the work item to ask the scheduler if it should yield cooperatively and if so allows the work item to either provide a function to be run as a continuation or a WinJS.Promise which will when complete provide a function to run as a continuation. Provide these fields for the object: shouldYield, setWork(work), setPromise(promise), job.
      * @param priority The priority of the work item. If you don't specify a priority, it defaults to WinJS.Utilities.Scheduler.Priority.normal.
      * @param thisArg A "this" instance to be bound to the work item. The default value is null.
      * @param name A description of the work item for diagnostics. The default value is an empty string.
      * @returns The job instance that represents this work item.
      **/
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _]): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority
    ): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority,
      thisArg: js.Any
    ): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority,
      thisArg: js.Any,
      name: String
    ): IJob = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.aboveNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of aboveNormal priority.
      **/
    def schedulePromiseAboveNormal[U](): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: U): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: U, jobName: String): typings.winjs.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.belowNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of belowNormal priority.
      **/
    def schedulePromiseBelowNormal[U](): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: U): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: U, jobName: String): typings.winjs.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.high priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of high priority.
      **/
    def schedulePromiseHigh[U](): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: U): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: U, jobName: String): typings.winjs.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.Idle priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of idle priority.
      **/
    def schedulePromiseIdle[U](): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: U): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: U, jobName: String): typings.winjs.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.normal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of normal priority.
      **/
    def schedulePromiseNormal[U](): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: U): typings.winjs.WinJSNs.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: U, jobName: String): typings.winjs.WinJSNs.Promise[U] = js.native
    //#region Enumerations
    /**
      * Represents a priority for a job managed by the Scheduler.
      **/
    @js.native
    object Priority extends js.Object {
      /* 0 */ val aboveNormal: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.aboveNormal with Double = js.native
      /* 1 */ val belowNormal: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.belowNormal with Double = js.native
      /* 2 */ val high: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.high with Double = js.native
      /* 3 */ val idle: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.idle with Double = js.native
      /* 4 */ val max: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.max with Double = js.native
      /* 5 */ val min: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.min with Double = js.native
      /* 6 */ val normal: typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority.normal with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs.Priority with Double] = js.native
    }
    
  }
  
  //#endregion Enumerations
  //#region Objects
  /**
    * A mixin that contains event-related functions.
    **/
  @js.native
  object eventMixin extends js.Object {
    //#region Methods
    /**
      * Adds an event listener to the control.
      * @param type The type (name) of the event.
      * @param listener The listener to invoke when the event gets raised.
      * @param useCapture If true, initiates capture, otherwise false.
      **/
    def addEventListener(`type`: String, listener: js.Function): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
    /**
      * Raises an event of the specified type and with the specified additional properties.
      * @param type The type (name) of the event.
      * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
      * @returns true if preventDefault was called on the event.
      **/
    def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
    /**
      * Removes an event listener from the control.
      * @param type The type (name) of the event.
      * @param listener The listener to remove.
      * @param useCapture true if capture is to be initiated, otherwise false.
      **/
    def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  }
  
}


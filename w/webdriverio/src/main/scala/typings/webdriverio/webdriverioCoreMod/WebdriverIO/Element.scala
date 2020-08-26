package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.node.Buffer
import typings.webdriverio.WebdriverIO.BrowserObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  /**
    * jsonwp
    */
  var ELEMENT: js.UndefOr[String] = js.native
  /**
    * w3c
    */
  var `element-6066-11e4-a52e-4f735466cecf`: js.UndefOr[String] = js.native
  var elementId: String = js.native
  /**
    * index in array of elements
    * only applicable if the element found with `$$` command
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * WebdriverIO.Element or WebdriverIO.BrowserObject
    */
  var parent: Element | BrowserObject = js.native
  var selector: String = js.native
  /**
    * The `$` command is a short way to call the [`findElement`](/docs/api/webdriver.html#findelement) command in order
    * to fetch a single element on the page similar to the `$` command from the browser scope. The difference when calling
    * it from an element scope is that the driver will look within the children of that element. You can also pass in an object as selector
    * where the object contains a property `element-6066-11e4-a52e-4f735466cecf` with the value of a reference
    * to an element. The command will then transform the reference to an extended WebdriverIO element.
    */
  @JSName("$")
  def $(selector: String): js.Promise[Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[Element] = js.native
  @JSName("$")
  def $(selector: Matcher): js.Promise[Element] = js.native
  /**
    * The `$$` command is a short way to call the [`findElements`](/docs/api/webdriver.html#findelements) command in order
    * to fetch multiple elements on the page similar to the `$$` command from the browser scope. The difference when calling
    * it from an element scope is that the driver will look within the children of that element.
    */
  @JSName("$$")
  def DollarDollar(selector: String): js.Promise[ElementArray] = js.native
  @JSName("$$")
  def DollarDollar(selector: js.Function): js.Promise[ElementArray] = js.native
  @JSName("$$")
  def DollarDollar(selector: Matcher): js.Promise[ElementArray] = js.native
  /**
    * add command to `element` scope
    */
  def addCommand(name: String, func: js.Function): Unit = js.native
  /**
    * Add a value to an object found by given selector. You can also use unicode
    * characters like Left arrow or Back space. WebdriverIO will take care of
    * translating them into unicode characters. You’ll find all supported characters
    * [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  def addValue(value: String): js.Promise[Unit] = js.native
  def addValue(value: js.Array[_]): js.Promise[Unit] = js.native
  def addValue(value: js.Object): js.Promise[Unit] = js.native
  def addValue(value: Boolean): js.Promise[Unit] = js.native
  def addValue(value: Double): js.Promise[Unit] = js.native
  /**
    * Clear a `<textarea>` or text `<input>` element’s value. Make sure you can interact with the
    * element before using this command. You can't clear an input element that is disabled or in
    * readonly mode.
    */
  def clearValue(): js.Promise[Unit] = js.native
  /**
    * Click on an element.
    */
  def click(): js.Promise[Unit] = js.native
  def click(options: ClickOptions): js.Promise[Unit] = js.native
  /**
    * The `custom$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$")
  def custom$(strategyName: String, strategyArguments: js.Any): js.Promise[Element] = js.native
  /**
    * The `customs$$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$$")
  def customDollarDollar(strategyName: String, strategyArguments: js.Any): js.Promise[ElementArray] = js.native
  /**
    * Double-click on an element.
    */
  def doubleClick(): js.Promise[Unit] = js.native
  def dragAndDrop(target: DragAndDropCoordinate): js.Promise[Unit] = js.native
  def dragAndDrop(target: DragAndDropCoordinate, options: DragAndDropOptions): js.Promise[Unit] = js.native
  /**
    * Drag an item to a destination element.
    */
  def dragAndDrop(target: Element): js.Promise[Unit] = js.native
  def dragAndDrop(target: Element, options: DragAndDropOptions): js.Promise[Unit] = js.native
  /**
    * Get an attribute from a DOM-element based on the attribute name.
    */
  def getAttribute(attributeName: String): js.Promise[String] = js.native
  /**
    * Get a css property from a DOM-element selected by given selector. The return value
    * is formatted to be testable. Colors gets parsed via [rgb2hex](https://www.npmjs.org/package/rgb2hex)
    * and all other properties get parsed via [css-value](https://www.npmjs.org/package/css-value).
    */
  def getCSSProperty(cssProperty: String): js.Promise[CSSProperty] = js.native
  /**
    * Get source code of specified DOM element by selector.
    */
  def getHTML(): js.Promise[String] = js.native
  def getHTML(includeSelectorTag: Boolean): js.Promise[String] = js.native
  /**
    * Determine an element’s location on the page.
    */
  def getLocation(): js.Promise[LocationReturn] = js.native
  /**
    * Determine an element’s location on the page.
    */
  def getLocation(prop: LocationParam): js.Promise[Double] = js.native
  /**
    * The Get Element Property command will return the result of getting a property of an element.
    */
  def getProperty(property: String): js.Promise[js.Object | String | Boolean | Double] = js.native
  /**
    * Get the width and height for an DOM-element.
    */
  def getSize(): js.Promise[SizeReturn] = js.native
  /**
    * Get the width and height for an DOM-element.
    */
  def getSize(prop: SizeParam): js.Promise[Double] = js.native
  /**
    * Get tag name of a DOM-element.
    */
  def getTagName(): js.Promise[String] = js.native
  /**
    * Get the text content from a DOM-element. Make sure the element
    * you want to request the text from [is interactable](http://www.w3.org/TR/webdriver/#interactable)
    * otherwise you will get an empty string as return value. If the element is disabled or not
    * visible and you still want to receive the text content use [getHTML](https://webdriver.io/docs/api/element/getHTML.html)
    * as a workaround.
    */
  def getText(): js.Promise[String] = js.native
  /**
    * Get the value of a `<textarea>`, `<select>` or text `<input>` found by given selector.
    * If multiple elements are found via the given selector, an array of values is returned instead.
    * For input with checkbox or radio type use isSelected.
    */
  def getValue(): js.Promise[String] = js.native
  /**
    * Return true if the selected DOM-element:
    * - exists;
    * - is visible;
    * - is within viewport (if not try scroll to it);
    * - its center is not overlapped with another element;
    * - is not disabled.
    */
  def isClickable(): js.Promise[Boolean] = js.native
  /**
    * Return true if the selected DOM-element is displayed.
    */
  def isDisplayed(): js.Promise[Boolean] = js.native
  /**
    * Return true if the selected DOM-element found by given selector is partially visible and within the viewport.
    */
  def isDisplayedInViewport(): js.Promise[Boolean] = js.native
  /**
    * Return true or false if the selected DOM-element is enabled.
    */
  def isEnabled(): js.Promise[Boolean] = js.native
  /**
    * Return true if the selected element matches with the provided one.
    */
  def isEqual(el: Element): js.Promise[Boolean] = js.native
  /**
    * Returns true if element exists in the DOM
    */
  def isExisting(): js.Promise[Boolean] = js.native
  /**
    * Return true or false if the selected DOM-element currently has focus. If the selector matches
    * multiple elements, it will return true if one of the elements has focus.
    */
  def isFocused(): js.Promise[Boolean] = js.native
  /**
    * Will return true or false whether or not an `<option>` or `<input>` element of type
    * checkbox or radio is currently selected.
    */
  def isSelected(): js.Promise[Boolean] = js.native
  /**
    * Move the mouse by an offset of the specified element. If no element is specified,
    * the move is relative to the current mouse cursor. If an element is provided but
    * no offset, the mouse will be moved to the center of the element. If the element
    * is not visible, it will be scrolled into view.
    */
  def moveTo(): js.Promise[Unit] = js.native
  def moveTo(options: MoveToOptions): js.Promise[Unit] = js.native
  /**
    * The `react$` command is a useful command to query React Components by their
    * actual name and filter them by props and state.
    */
  @JSName("react$")
  def react$(selector: String): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, options: ReactSelectorOptions): js.Promise[Element] = js.native
  /**
    * The `react$$` command is a useful command to query multiple React Components
    * by their actual name and filter them by props and state.
    */
  @JSName("react$$")
  def reactDollarDollar(selector: String): js.Promise[ElementArray] = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, options: ReactSelectorOptions): js.Promise[ElementArray] = js.native
  /**
    * Save a screenshot of an element to a PNG file on your OS.
    */
  def saveScreenshot(filename: String): js.Promise[Buffer] = js.native
  /**
    * Scroll element into viewport ([MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView)).
    */
  def scrollIntoView(): js.Promise[Unit] = js.native
  def scrollIntoView(scrollIntoViewOptions: js.Object): js.Promise[Unit] = js.native
  def scrollIntoView(scrollIntoViewOptions: Boolean): js.Promise[Unit] = js.native
  /**
    * Select option with a specific value.
    */
  def selectByAttribute(attribute: String, value: String): js.Promise[Unit] = js.native
  /**
    * Select option with a specific index.
    */
  def selectByIndex(index: Double): js.Promise[Unit] = js.native
  /**
    * Select option with displayed text matching the argument.
    */
  def selectByVisibleText(text: String): js.Promise[Unit] = js.native
  /**
    * Send a sequence of key strokes to an element (clears value before). If the element
    * doesn't need to be cleared first then use addValue. You can also use
    * unicode characters like Left arrow or Back space. WebdriverIO will take care of
    * translating them into unicode characters. You’ll find all supported characters
    * [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  def setValue(value: String): js.Promise[Unit] = js.native
  def setValue(value: js.Array[_]): js.Promise[Unit] = js.native
  def setValue(value: js.Object): js.Promise[Unit] = js.native
  def setValue(value: Boolean): js.Promise[Unit] = js.native
  def setValue(value: Double): js.Promise[Unit] = js.native
  /**
    * Access an element inside a given element's shadowRoot
    */
  @JSName("shadow$")
  def shadow$(selector: String): js.Promise[Element] = js.native
  @JSName("shadow$")
  def shadow$(selector: js.Function): js.Promise[Element] = js.native
  /**
    * Access elements inside a given element's shadowRoot
    */
  @JSName("shadow$$")
  def shadowDollarDollar(selector: String): js.Promise[ElementArray] = js.native
  @JSName("shadow$$")
  def shadowDollarDollar(selector: js.Function): js.Promise[ElementArray] = js.native
  /**
    * The Touch Action API provides the basis of all gestures that can be automated in Appium.
    * It is currently only available to native apps and can not be used to interact with webapps.
    * At its core is the ability to chain together _ad hoc_ individual actions, which will then be
    * applied to an element in the application on the device. The basic actions that can be used are:
    */
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be clickable or not clickable.
    */
  def waitForClickable(): js.Promise[Boolean] = js.native
  def waitForClickable(options: WaitForOptions): js.Promise[Boolean] = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be displayed or not displayed.
    */
  def waitForDisplayed(): js.Promise[Boolean] = js.native
  def waitForDisplayed(options: WaitForOptions): js.Promise[Boolean] = js.native
  /**
    * Wait for an element (selected by css selector) for the provided amount of
    * milliseconds to be (dis/en)abled. If multiple elements get queried by given
    * selector, it returns true if at least one element is (dis/en)abled.
    */
  def waitForEnabled(): js.Promise[Boolean] = js.native
  def waitForEnabled(options: WaitForOptions): js.Promise[Boolean] = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be present within the DOM. Returns true if the selector
    * matches at least one element that exists in the DOM, otherwise throws an
    * error. If the reverse flag is true, the command will instead return true
    * if the selector does not match any elements.
    */
  def waitForExist(): js.Promise[Boolean] = js.native
  def waitForExist(options: WaitForOptions): js.Promise[Boolean] = js.native
  /**
    * This wait command is your universal weapon if you want to wait on something. It expects a condition
    * and waits until that condition is fulfilled with a truthy value. If you use the WDIO testrunner the
    * commands within the condition are getting executed synchronously like in your test.
    */
  def waitUntil(condition: js.Function0[js.Promise[Boolean]]): js.Promise[Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]], options: WaitUntilOptions): js.Promise[Boolean] = js.native
}


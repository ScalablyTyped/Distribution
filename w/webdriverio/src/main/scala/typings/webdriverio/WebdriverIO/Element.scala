package typings.webdriverio.WebdriverIO

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var ELEMENT: js.UndefOr[String] = js.native
  var `element-6066-11e4-a52e-4f735466cecf`: js.UndefOr[String] = js.native
  var elementId: String = js.native
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
  /**
    * The `$$` command is a short way to call the [`findElements`](/docs/api/webdriver.html#findelements) command in order
    * to fetch multiple elements on the page similar to the `$$` command from the browser scope. The difference when calling
    * it from an element scope is that the driver will look within the children of that element.
    */
  @JSName("$$")
  def $$(selector: String): js.Array[Element] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Array[Element] = js.native
  /**
    * The `$$` command is a short way to call the [`findElements`](/docs/api/webdriver.html#findelements) command in order
    * to fetch multiple elements on the page similar to the `$$` command from the browser scope. The difference when calling
    * it from an element scope is that the driver will look within the children of that element.
    */
  @JSName("$$")
  def $$_Promise(selector: String): js.Promise[js.Array[Element]] = js.native
  @JSName("$$")
  def $$_Promise(selector: js.Function): js.Promise[js.Array[Element]] = js.native
  /**
    * The `$` command is a short way to call the [`findElement`](/docs/api/webdriver.html#findelement) command in order
    * to fetch a single element on the page similar to the `$` command from the browser scope. The difference when calling
    * it from an element scope is that the driver will look within the children of that element. You can also pass in an object as selector
    * where the object contains a property `element-6066-11e4-a52e-4f735466cecf` with the value of a reference
    * to an element. The command will then transform the reference to an extended WebdriverIO element.
    */
  @JSName("$")
  def $_Element(selector: String): Element = js.native
  @JSName("$")
  def $_Element(selector: js.Function): Element = js.native
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
    * Add a value to an object found by given selector. You can also use unicode
    * characters like Left arrow or Back space. WebdriverIO will take care of
    * translating them into unicode characters. You’ll find all supported characters
    * [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  @JSName("addValue")
  def addValue_Unit(value: String): Unit = js.native
  @JSName("addValue")
  def addValue_Unit(value: js.Array[_]): Unit = js.native
  @JSName("addValue")
  def addValue_Unit(value: js.Object): Unit = js.native
  @JSName("addValue")
  def addValue_Unit(value: Boolean): Unit = js.native
  @JSName("addValue")
  def addValue_Unit(value: Double): Unit = js.native
  /**
    * Clear a `<textarea>` or text `<input>` element’s value. Make sure you can interact with the
    * element before using this command. You can't clear an input element that is disabled or in
    * readonly mode.
    */
  def clearValue(): js.Promise[Unit] = js.native
  /**
    * Clear a `<textarea>` or text `<input>` element’s value. Make sure you can interact with the
    * element before using this command. You can't clear an input element that is disabled or in
    * readonly mode.
    */
  @JSName("clearValue")
  def clearValue_Unit(): Unit = js.native
  /**
    * Click on an element.
    */
  def click(): js.Promise[Unit] = js.native
  def click(options: js.Object): js.Promise[Unit] = js.native
  /**
    * Click on an element.
    */
  @JSName("click")
  def click_Unit(): Unit = js.native
  @JSName("click")
  def click_Unit(options: js.Object): Unit = js.native
  /**
    * The `custom$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$")
  def custom$(strategyName: String, strategyArguments: js.Any): js.Promise[Element] = js.native
  /**
    * The `customs$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$$")
  def custom$$(strategyName: String, strategyArguments: js.Any): js.Promise[Element] = js.native
  /**
    * The `customs$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$$")
  def custom$$_Element(strategyName: String, strategyArguments: js.Any): Element = js.native
  /**
    * The `custom$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$")
  def custom$_Element(strategyName: String, strategyArguments: js.Any): Element = js.native
  /**
    * Double-click on an element.
    */
  def doubleClick(): js.Promise[Unit] = js.native
  /**
    * Double-click on an element.
    */
  @JSName("doubleClick")
  def doubleClick_Unit(): Unit = js.native
  /**
    * Drag an item to a destination element.
    */
  def dragAndDrop(target: Element): js.Promise[Unit] = js.native
  def dragAndDrop(target: Element, duration: Double): js.Promise[Unit] = js.native
  /**
    * Drag an item to a destination element.
    */
  @JSName("dragAndDrop")
  def dragAndDrop_Unit(target: Element): Unit = js.native
  @JSName("dragAndDrop")
  def dragAndDrop_Unit(target: Element, duration: Double): Unit = js.native
  /**
    * Get an attribute from a DOM-element based on the attribute name.
    */
  def getAttribute(attributeName: String): js.Promise[String] = js.native
  /**
    * Get an attribute from a DOM-element based on the attribute name.
    */
  @JSName("getAttribute")
  def getAttribute_String(attributeName: String): String = js.native
  /**
    * Get a css property from a DOM-element selected by given selector.
    */
  def getCSSProperty(cssProperty: String): js.Promise[CSSProperty] = js.native
  /**
    * Get a css property from a DOM-element selected by given selector.
    */
  @JSName("getCSSProperty")
  def getCSSProperty_CSSProperty(cssProperty: String): CSSProperty = js.native
  /**
    * Get source code of specified DOM element by selector.
    */
  def getHTML(): js.Promise[String] = js.native
  def getHTML(includeSelectorTag: Boolean): js.Promise[String] = js.native
  /**
    * Get source code of specified DOM element by selector.
    */
  @JSName("getHTML")
  def getHTML_String(): String = js.native
  @JSName("getHTML")
  def getHTML_String(includeSelectorTag: Boolean): String = js.native
  /**
    * Determine an element’s location on the page.
    */
  def getLocation(): LocationReturn = js.native
  /**
    * Determine an element’s location on the page.
    */
  def getLocation(prop: LocationParam): Double = js.native
  /**
    * Determine an element’s location on the page.
    */
  @JSName("getLocation")
  def getLocation_Promise(): js.Promise[LocationReturn] = js.native
  /**
    * Determine an element’s location on the page.
    */
  @JSName("getLocation")
  def getLocation_Promise(prop: LocationParam): js.Promise[Double] = js.native
  /**
    * The Get Element Property command will return the result of getting a property of an element.
    */
  def getProperty(property: String): js.Object | String | Boolean | Double = js.native
  /**
    * The Get Element Property command will return the result of getting a property of an element.
    */
  @JSName("getProperty")
  def getProperty_Promise(property: String): js.Promise[js.Object | String | Boolean | Double] = js.native
  /**
    * Get the width and height for an DOM-element.
    */
  def getSize(): SizeReturn = js.native
  /**
    * Get the width and height for an DOM-element.
    */
  def getSize(prop: SizeParam): Double = js.native
  /**
    * Get the width and height for an DOM-element.
    */
  @JSName("getSize")
  def getSize_Promise(): js.Promise[SizeReturn] = js.native
  /**
    * Get the width and height for an DOM-element.
    */
  @JSName("getSize")
  def getSize_Promise(prop: SizeParam): js.Promise[Double] = js.native
  /**
    * Get tag name of a DOM-element.
    */
  def getTagName(): js.Promise[String] = js.native
  /**
    * Get tag name of a DOM-element.
    */
  @JSName("getTagName")
  def getTagName_String(): String = js.native
  /**
    * Get the text content from a DOM-element. Make sure the element
    * you want to request the text from [is interactable](http://www.w3.org/TR/webdriver/#interactable)
    * otherwise you will get an empty string as return value. If the element is disabled or not
    * visible and you still want to receive the text content use [getHTML](https://webdriver.io/docs/api/element/getHTML.html)
    * as a workaround.
    */
  def getText(): js.Promise[String] = js.native
  /**
    * Get the text content from a DOM-element. Make sure the element
    * you want to request the text from [is interactable](http://www.w3.org/TR/webdriver/#interactable)
    * otherwise you will get an empty string as return value. If the element is disabled or not
    * visible and you still want to receive the text content use [getHTML](https://webdriver.io/docs/api/element/getHTML.html)
    * as a workaround.
    */
  @JSName("getText")
  def getText_String(): String = js.native
  /**
    * Get the value of a `<textarea>`, `<select>` or text `<input>` found by given selector.
    * If multiple elements are found via the given selector, an array of values is returned instead.
    * For input with checkbox or radio type use isSelected.
    */
  def getValue(): js.Promise[String] = js.native
  /**
    * Get the value of a `<textarea>`, `<select>` or text `<input>` found by given selector.
    * If multiple elements are found via the given selector, an array of values is returned instead.
    * For input with checkbox or radio type use isSelected.
    */
  @JSName("getValue")
  def getValue_String(): String = js.native
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
    * Return true if the selected DOM-element:
    * - exists;
    * - is visible;
    * - is within viewport (if not try scroll to it);
    * - its center is not overlapped with another element;
    * - is not disabled.
    */
  @JSName("isClickable")
  def isClickable_Boolean(): Boolean = js.native
  /**
    * Return true if the selected DOM-element is displayed.
    */
  def isDisplayed(): js.Promise[Boolean] = js.native
  /**
    * Return true if the selected DOM-element found by given selector is partially visible and within the viewport.
    */
  def isDisplayedInViewport(): js.Promise[Boolean] = js.native
  /**
    * Return true if the selected DOM-element found by given selector is partially visible and within the viewport.
    */
  @JSName("isDisplayedInViewport")
  def isDisplayedInViewport_Boolean(): Boolean = js.native
  /**
    * Return true if the selected DOM-element is displayed.
    */
  @JSName("isDisplayed")
  def isDisplayed_Boolean(): Boolean = js.native
  /**
    * Return true or false if the selected DOM-element is enabled.
    */
  def isEnabled(): js.Promise[Boolean] = js.native
  /**
    * Return true or false if the selected DOM-element is enabled.
    */
  @JSName("isEnabled")
  def isEnabled_Boolean(): Boolean = js.native
  /**
    * Returns true if element exists in the DOM
    */
  def isExisting(): js.Promise[Boolean] = js.native
  /**
    * Returns true if element exists in the DOM
    */
  @JSName("isExisting")
  def isExisting_Boolean(): Boolean = js.native
  /**
    * Return true or false if the selected DOM-element currently has focus. If the selector matches
    * multiple elements, it will return true if one of the elements has focus.
    */
  def isFocused(): js.Promise[Boolean] = js.native
  /**
    * Return true or false if the selected DOM-element currently has focus. If the selector matches
    * multiple elements, it will return true if one of the elements has focus.
    */
  @JSName("isFocused")
  def isFocused_Boolean(): Boolean = js.native
  /**
    * Will return true or false whether or not an `<option>` or `<input>` element of type
    * checkbox or radio is currently selected.
    */
  def isSelected(): js.Promise[Boolean] = js.native
  /**
    * Will return true or false whether or not an `<option>` or `<input>` element of type
    * checkbox or radio is currently selected.
    */
  @JSName("isSelected")
  def isSelected_Boolean(): Boolean = js.native
  /**
    * Move the mouse by an offset of the specified element. If no element is specified,
    * the move is relative to the current mouse cursor. If an element is provided but
    * no offset, the mouse will be moved to the center of the element. If the element
    * is not visible, it will be scrolled into view.
    */
  def moveTo(): js.Promise[Unit] = js.native
  def moveTo(xoffset: Double): js.Promise[Unit] = js.native
  def moveTo(xoffset: Double, yoffset: Double): js.Promise[Unit] = js.native
  /**
    * Move the mouse by an offset of the specified element. If no element is specified,
    * the move is relative to the current mouse cursor. If an element is provided but
    * no offset, the mouse will be moved to the center of the element. If the element
    * is not visible, it will be scrolled into view.
    */
  @JSName("moveTo")
  def moveTo_Unit(): Unit = js.native
  @JSName("moveTo")
  def moveTo_Unit(xoffset: Double): Unit = js.native
  @JSName("moveTo")
  def moveTo_Unit(xoffset: Double, yoffset: Double): Unit = js.native
  /**
    * The `react$` command is a useful command to query React Components by their
    * actual name and filter them by props and state.
    */
  @JSName("react$")
  def react$(selector: String): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: String): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Array[_]): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Object): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Boolean): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Double): js.Promise[Element] = js.native
  /**
    * The `react$$` command is a useful command to query multiple React Components
    * by their actual name and filter them by props and state.
    */
  @JSName("react$$")
  def react$$(selector: String): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: String): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: js.Array[_]): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: js.Object): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: Boolean): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: Double): js.Array[Element] = js.native
  /**
    * The `react$$` command is a useful command to query multiple React Components
    * by their actual name and filter them by props and state.
    */
  @JSName("react$$")
  def react$$_Promise(selector: String): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: String): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: js.Array[_]): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: js.Object): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: Boolean): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: Double): js.Promise[js.Array[Element]] = js.native
  /**
    * The `react$` command is a useful command to query React Components by their
    * actual name and filter them by props and state.
    */
  @JSName("react$")
  def react$_Element(selector: String): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: String): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: js.Array[_]): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: js.Object): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: Boolean): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: Double): Element = js.native
  /**
    * Save a screenshot of an element to a PNG file on your OS.
    */
  def saveScreenshot(filename: String): Buffer = js.native
  /**
    * Save a screenshot of an element to a PNG file on your OS.
    */
  @JSName("saveScreenshot")
  def saveScreenshot_Promise(filename: String): js.Promise[Buffer] = js.native
  /**
    * Scroll element into viewport.
    * https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView
    */
  def scrollIntoView(): js.Promise[Unit] = js.native
  def scrollIntoView(scrollIntoViewOptions: js.Object): js.Promise[Unit] = js.native
  def scrollIntoView(scrollIntoViewOptions: Boolean): js.Promise[Unit] = js.native
  /**
    * Scroll element into viewport.
    * https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView
    */
  @JSName("scrollIntoView")
  def scrollIntoView_Unit(): Unit = js.native
  @JSName("scrollIntoView")
  def scrollIntoView_Unit(scrollIntoViewOptions: js.Object): Unit = js.native
  @JSName("scrollIntoView")
  def scrollIntoView_Unit(scrollIntoViewOptions: Boolean): Unit = js.native
  /**
    * Select option with a specific value.
    */
  def selectByAttribute(attribute: String, value: String): js.Promise[Unit] = js.native
  /**
    * Select option with a specific value.
    */
  @JSName("selectByAttribute")
  def selectByAttribute_Unit(attribute: String, value: String): Unit = js.native
  /**
    * Select option with a specific index.
    */
  def selectByIndex(index: Double): js.Promise[Unit] = js.native
  /**
    * Select option with a specific index.
    */
  @JSName("selectByIndex")
  def selectByIndex_Unit(index: Double): Unit = js.native
  /**
    * Select option with displayed text matching the argument.
    */
  def selectByVisibleText(text: String): js.Promise[Unit] = js.native
  /**
    * Select option with displayed text matching the argument.
    */
  @JSName("selectByVisibleText")
  def selectByVisibleText_Unit(text: String): Unit = js.native
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
    * Send a sequence of key strokes to an element (clears value before). If the element
    * doesn't need to be cleared first then use addValue. You can also use
    * unicode characters like Left arrow or Back space. WebdriverIO will take care of
    * translating them into unicode characters. You’ll find all supported characters
    * [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  @JSName("setValue")
  def setValue_Unit(value: String): Unit = js.native
  @JSName("setValue")
  def setValue_Unit(value: js.Array[_]): Unit = js.native
  @JSName("setValue")
  def setValue_Unit(value: js.Object): Unit = js.native
  @JSName("setValue")
  def setValue_Unit(value: Boolean): Unit = js.native
  @JSName("setValue")
  def setValue_Unit(value: Double): Unit = js.native
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
  def shadow$$(selector: String): js.Array[Element] = js.native
  @JSName("shadow$$")
  def shadow$$(selector: js.Function): js.Array[Element] = js.native
  /**
    * Access elements inside a given element's shadowRoot
    */
  @JSName("shadow$$")
  def shadow$$_Promise(selector: String): js.Promise[js.Array[Element]] = js.native
  @JSName("shadow$$")
  def shadow$$_Promise(selector: js.Function): js.Promise[js.Array[Element]] = js.native
  /**
    * Access an element inside a given element's shadowRoot
    */
  @JSName("shadow$")
  def shadow$_Element(selector: String): Element = js.native
  @JSName("shadow$")
  def shadow$_Element(selector: js.Function): Element = js.native
  /**
    * [appium] The Touch Action API provides the basis of all gestures that can be automated in Appium.
    */
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
  /**
    * [appium] The Touch Action API provides the basis of all gestures that can be automated in Appium.
    */
  @JSName("touchAction")
  def touchAction_Unit(action: TouchActions): Unit = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be clickable or not clickable.
    */
  def waitForClickable(): js.Promise[Boolean] = js.native
  def waitForClickable(options: WaitForOptions): js.Promise[Boolean] = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be clickable or not clickable.
    */
  @JSName("waitForClickable")
  def waitForClickable_Boolean(): Boolean = js.native
  @JSName("waitForClickable")
  def waitForClickable_Boolean(options: WaitForOptions): Boolean = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be displayed or not displayed.
    */
  def waitForDisplayed(): js.Promise[Boolean] = js.native
  def waitForDisplayed(ms: Double): js.Promise[Boolean] = js.native
  def waitForDisplayed(ms: Double, reverse: Boolean): js.Promise[Boolean] = js.native
  def waitForDisplayed(ms: Double, reverse: Boolean, error: String): js.Promise[Boolean] = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be displayed or not displayed.
    */
  @JSName("waitForDisplayed")
  def waitForDisplayed_Boolean(): Boolean = js.native
  @JSName("waitForDisplayed")
  def waitForDisplayed_Boolean(ms: Double): Boolean = js.native
  @JSName("waitForDisplayed")
  def waitForDisplayed_Boolean(ms: Double, reverse: Boolean): Boolean = js.native
  @JSName("waitForDisplayed")
  def waitForDisplayed_Boolean(ms: Double, reverse: Boolean, error: String): Boolean = js.native
  /**
    * Wait for an element (selected by css selector) for the provided amount of
    * milliseconds to be (dis/en)abled. If multiple elements get queried by given
    * selector, it returns true if at least one element is (dis/en)abled.
    */
  def waitForEnabled(): js.Promise[Boolean] = js.native
  def waitForEnabled(ms: Double): js.Promise[Boolean] = js.native
  def waitForEnabled(ms: Double, reverse: Boolean): js.Promise[Boolean] = js.native
  def waitForEnabled(ms: Double, reverse: Boolean, error: String): js.Promise[Boolean] = js.native
  /**
    * Wait for an element (selected by css selector) for the provided amount of
    * milliseconds to be (dis/en)abled. If multiple elements get queried by given
    * selector, it returns true if at least one element is (dis/en)abled.
    */
  @JSName("waitForEnabled")
  def waitForEnabled_Boolean(): Boolean = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_Boolean(ms: Double): Boolean = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_Boolean(ms: Double, reverse: Boolean): Boolean = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_Boolean(ms: Double, reverse: Boolean, error: String): Boolean = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be present within the DOM. Returns true if the selector
    * matches at least one element that exists in the DOM, otherwise throws an
    * error. If the reverse flag is true, the command will instead return true
    * if the selector does not match any elements.
    */
  def waitForExist(): js.Promise[Boolean] = js.native
  def waitForExist(ms: Double): js.Promise[Boolean] = js.native
  def waitForExist(ms: Double, reverse: Boolean): js.Promise[Boolean] = js.native
  def waitForExist(ms: Double, reverse: Boolean, error: String): js.Promise[Boolean] = js.native
  /**
    * Wait for an element for the provided amount of
    * milliseconds to be present within the DOM. Returns true if the selector
    * matches at least one element that exists in the DOM, otherwise throws an
    * error. If the reverse flag is true, the command will instead return true
    * if the selector does not match any elements.
    */
  @JSName("waitForExist")
  def waitForExist_Boolean(): Boolean = js.native
  @JSName("waitForExist")
  def waitForExist_Boolean(ms: Double): Boolean = js.native
  @JSName("waitForExist")
  def waitForExist_Boolean(ms: Double, reverse: Boolean): Boolean = js.native
  @JSName("waitForExist")
  def waitForExist_Boolean(ms: Double, reverse: Boolean, error: String): Boolean = js.native
}


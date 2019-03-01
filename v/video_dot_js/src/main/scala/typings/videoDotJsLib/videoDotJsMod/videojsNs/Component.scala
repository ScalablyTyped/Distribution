package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base class for all UI Components.
	 * Components are UI objects which represent both a javascript object and an element
	 * in the DOM. They can be children of other components, and can have
	 * children themselves.
	 *
	 * Components can also use methods from {@link EventTarget}
	 */
@js.native
trait Component extends EventedMixin {
  var `children_`: js.Array[Component] = js.native
  var `options_`: ComponentOptions = js.native
  var `player_`: Player = js.native
  /**
  		 * Find a single DOM element matching a `selector`. This can be within the `Component`s
  		 * `contentEl()` or another custom context.
  		 *
  		 * @param selector
  		 *        A valid CSS selector, which will be passed to `querySelector`.
  		 *
  		 * @param [context=this.contentEl()]
  		 *        A DOM element within which to query. Can also be a selector string in
  		 *        which case the first matching element will get used as context. If
  		 *        missing `this.contentEl()` gets used. If  `this.contentEl()` returns
  		 *        nothing it falls back to `document`.
  		 *
  		 * @return the dom element that was found, or null
  		 *
  		 * @see [Information on CSS Selectors](https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Getting_Started/Selectors)
  		 */
  @JSName("$")
  def $(selector: java.lang.String): stdLib.Element = js.native
  @JSName("$")
  def $(selector: java.lang.String, context: java.lang.String): stdLib.Element = js.native
  @JSName("$")
  def $(selector: java.lang.String, context: stdLib.Element): stdLib.Element = js.native
  /**
  		 * Finds all DOM element matching a `selector`. This can be within the `Component`s
  		 * `contentEl()` or another custom context.
  		 *
  		 * @param selector
  		 *        A valid CSS selector, which will be passed to `querySelectorAll`.
  		 *
  		 * @param [context=this.contentEl()]
  		 *        A DOM element within which to query. Can also be a selector string in
  		 *        which case the first matching element will get used as context. If
  		 *        missing `this.contentEl()` gets used. If  `this.contentEl()` returns
  		 *        nothing it falls back to `document`.
  		 *
  		 * @return a list of dom elements that were found
  		 *
  		 * @see [Information on CSS Selectors](https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Getting_Started/Selectors)
  		 */
  @JSName("$$")
  def $$(selector: java.lang.String): stdLib.NodeList = js.native
  @JSName("$$")
  def $$(selector: java.lang.String, context: java.lang.String): stdLib.NodeList = js.native
  @JSName("$$")
  def $$(selector: java.lang.String, context: stdLib.Element): stdLib.NodeList = js.native
  /**
  		 * Add a child `Component` inside the current `Component`.
  		 *
  		 *
  		 * @param child
  		 *        The name or instance of a child to add.
  		 *
  		 * @param [options={}]
  		 *        The key/value store of options that will get passed to children of
  		 *        the child.
  		 *
  		 * @param [index=this.children_.length]
  		 *        The index to attempt to add a child into.
  		 *
  		 * @return The `Component` that gets added as a child. When using a string the
  		 *         `Component` will get created by this process.
  		 */
  def addChild(component: java.lang.String): Component = js.native
  def addChild(component: java.lang.String, optionsopt: js.Any): Component = js.native
  def addChild(component: java.lang.String, optionsopt: js.Any, indexopt: scala.Double): Component = js.native
  def addChild(component: stdLib.Element): stdLib.Element = js.native
  def addChild(component: stdLib.Element, optionsopt: js.Any): stdLib.Element = js.native
  def addChild(component: stdLib.Element, optionsopt: js.Any, indexopt: scala.Double): stdLib.Element = js.native
  def addChild[T /* <: Component */](child: T): T = js.native
  def addChild[T /* <: Component */](child: T, options: js.Any): T = js.native
  def addChild[T /* <: Component */](child: T, options: js.Any, index: scala.Double): T = js.native
  @JSName("addChild")
  def addChild_TComponentT[T /* <: Component */](child: java.lang.String): T = js.native
  @JSName("addChild")
  def addChild_TComponentT[T /* <: Component */](child: java.lang.String, options: js.Any): T = js.native
  @JSName("addChild")
  def addChild_TComponentT[T /* <: Component */](child: java.lang.String, options: js.Any, index: scala.Double): T = js.native
  /**
  		 * Add a CSS class name to the `Component`s element.
  		 *
  		 * @param classToAdd
  		 *        CSS class name to add
  		 */
  def addClass(classToAdd: java.lang.String): scala.Unit = js.native
  /**
  		 * Remove the focus from this component
  		 */
  def blur(): scala.Unit = js.native
  /**
  		 * Builds the default DOM class name. Should be overriden by sub-components.
  		 *
  		 * @return The DOM class name for this object.
  		 */
  def buildCSSClass(): java.lang.String = js.native
  /**
  		 * Cancels a queued callback passed to {@link Component#requestAnimationFrame}
  		 * (rAF).
  		 *
  		 * If you queue an rAF callback via {@link Component#requestAnimationFrame},
  		 * use this function instead of `window.cancelAnimationFrame`. If you don't,
  		 * your dispose listener will not get cleaned up until {@link Component#dispose}!
  		 *
  		 * @param id
  		 *        The rAF ID to clear. The return value of {@link Component#requestAnimationFrame}.
  		 *
  		 * @return Returns the rAF ID that was cleared.
  		 *
  		 * @see [Similar to]{@link https://developer.mozilla.org/en-US/docs/Web/API/window/cancelAnimationFrame}
  		 */
  def cancelAnimationFrame(id: scala.Double): scala.Double = js.native
  /**
  		 * Get an array of all child components
  		 *
  		 * @return The children
  		 */
  def children(): js.Array[Component] = js.native
  /**
  		 * Clears an interval that gets created via `window.setInterval` or
  		 * {@link Component#setInterval}. If you set an inteval via {@link Component#setInterval}
  		 * use this function instead of `window.clearInterval`. If you don't your dispose
  		 * listener will not get cleaned up until {@link Component#dispose}!
  		 *
  		 * @param intervalId
  		 *        The id of the interval to clear. The return value of
  		 *        {@link Component#setInterval} or `window.setInterval`.
  		 *
  		 * @return Returns the interval id that was cleared.
  		 *
  		 * @see [Similar to]{@link https://developer.mozilla.org/en-US/docs/Web/API/WindowTimers/clearInterval}
  		 */
  def clearInterval(intervalId: scala.Double): scala.Double = js.native
  /**
  		 * Clears a timeout that gets created via `window.setTimeout` or
  		 * {@link Component#setTimeout}. If you set a timeout via {@link Component#setTimeout}
  		 * use this function instead of `window.clearTimout`. If you don't your dispose
  		 * listener will not get cleaned up until {@link Component#dispose}!
  		 *
  		 * @param timeoutId
  		 *        The id of the timeout to clear. The return value of
  		 *        {@link Component#setTimeout} or `window.setTimeout`.
  		 *
  		 * @return Returns the timeout id that was cleared.
  		 *
  		 * @see [Similar to]{@link https://developer.mozilla.org/en-US/docs/Web/API/WindowTimers/clearTimeout}
  		 */
  def clearTimeout(timeoutId: scala.Double): scala.Double = js.native
  /**
  		 * Return the `Component`s DOM element. This is where children get inserted.
  		 * This will usually be the the same as the element returned in {@link Component#el}.
  		 *
  		 * @return The content element for this `Component`.
  		 */
  def contentEl(): stdLib.Element = js.native
  def controlText(key: java.lang.String): java.lang.String = js.native
  /**
  		 * Create the `Component`s DOM element.
  		 *
  		 * @param [tagName]
  		 *        Element's DOM node type. e.g. 'div'
  		 *
  		 * @param [properties]
  		 *        An object of properties that should be set.
  		 *
  		 * @param [attributes]
  		 *        An object of attributes that should be set.
  		 *
  		 * @return The element that gets created.
  		 */
  def createEl(): stdLib.Element = js.native
  def createEl(tagName: java.lang.String): stdLib.Element = js.native
  def createEl(tagName: java.lang.String, properties: js.Any): stdLib.Element = js.native
  def createEl(tagName: java.lang.String, properties: js.Any, attributes: js.Any): stdLib.Element = js.native
  @JSName("currentDimension")
  def currentDimension_height(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.height): scala.Double = js.native
  /**
  		 * Get the width or the height of the `Component` elements computed style. Uses
  		 * `window.getComputedStyle`.
  		 *
  		 * @param widthOrHeight
  		 *        A string containing 'width' or 'height'. Whichever one you want to get.
  		 *
  		 * @return The dimension that gets asked for or 0 if nothing was set
  		 *         for that dimension.
  		 */
  @JSName("currentDimension")
  def currentDimension_width(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.width): scala.Double = js.native
  /**
  		 * Get an object that contains width and height values of the `Component`s
  		 * computed style.
  		 *
  		 * @return The dimensions of the components element
  		 */
  def currentDimensions(): videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.DimensionObject = js.native
  /**
  		 * Get the height of the `Component`s computed style. Uses `window.getComputedStyle`.
  		 *
  		 * @return height
  		 *           The height of the `Component`s computed style.
  		 */
  def currentHeight(): scala.Double = js.native
  /**
  		 * Get the width of the `Component`s computed style. Uses `window.getComputedStyle`.
  		 *
  		 * @return width
  		 *           The width of the `Component`s computed style.
  		 */
  def currentWidth(): scala.Double = js.native
  @JSName("dimension")
  def dimension_height(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.height): scala.Double = js.native
  @JSName("dimension")
  def dimension_height(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.height, num: java.lang.String): scala.Unit = js.native
  @JSName("dimension")
  def dimension_height(
    widthOrHeight: videoDotJsLib.videoDotJsLibStrings.height,
    num: java.lang.String,
    skipListeners: scala.Boolean
  ): scala.Unit = js.native
  @JSName("dimension")
  def dimension_height(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.height, num: scala.Double): scala.Unit = js.native
  @JSName("dimension")
  def dimension_height(
    widthOrHeight: videoDotJsLib.videoDotJsLibStrings.height,
    num: scala.Double,
    skipListeners: scala.Boolean
  ): scala.Unit = js.native
  @JSName("dimension")
  def dimension_width(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.width): scala.Double = js.native
  /**
  		 * Get or set width or height of the `Component` element. This is the shared code
  		 * for the {@link Component#width} and {@link Component#height}.
  		 *
  		 * Things to know:
  		 * - If the width or height in an number this will return the number postfixed with 'px'.
  		 * - If the width/height is a percent this will return the percent postfixed with '%'
  		 * - Hidden elements have a width of 0 with `window.getComputedStyle`. This function
  		 *   defaults to the `Component`s `style.width` and falls back to `window.getComputedStyle`.
  		 *   See [this]{@link http://www.foliotek.com/devblog/getting-the-width-of-a-hidden-element-with-jquery-using-width/}
  		 *   for more information
  		 * - If you want the computed style of the component, use {@link Component#currentWidth}
  		 *   and {@link {Component#currentHeight}
  		 *
  		 * @fires Component#componentresize
  		 *
  		 * @param widthOrHeight
  		 *        'width' or 'height'
  		 *
  		 * @param [num]
  		 *         New dimension
  		 *
  		 * @param [skipListeners]
  		 *         Skip componentresize event trigger
  		 *
  		 * @return The dimension when getting or 0 if unset
  		 */
  @JSName("dimension")
  def dimension_width(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.width, num: java.lang.String): scala.Unit = js.native
  @JSName("dimension")
  def dimension_width(
    widthOrHeight: videoDotJsLib.videoDotJsLibStrings.width,
    num: java.lang.String,
    skipListeners: scala.Boolean
  ): scala.Unit = js.native
  @JSName("dimension")
  def dimension_width(widthOrHeight: videoDotJsLib.videoDotJsLibStrings.width, num: scala.Double): scala.Unit = js.native
  @JSName("dimension")
  def dimension_width(
    widthOrHeight: videoDotJsLib.videoDotJsLibStrings.width,
    num: scala.Double,
    skipListeners: scala.Boolean
  ): scala.Unit = js.native
  /**
  		 * Set both the width and height of the `Component` element at the same time.
  		 *
  		 * @param width
  		 *         Width to set the `Component`s element to.
  		 *
  		 * @param height
  		 *         Height to set the `Component`s element to.
  		 */
  def dimensions(width: java.lang.String, height: java.lang.String): scala.Unit = js.native
  def dimensions(width: java.lang.String, height: scala.Double): scala.Unit = js.native
  def dimensions(width: scala.Double, height: java.lang.String): scala.Unit = js.native
  def dimensions(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
  		 * Dispose of the `Component` and all child components.
  		 *
  		 * @fires Component#dispose
  		 */
  def dispose(): scala.Unit = js.native
  /**
  		 * Get the `Component`s DOM element
  		 *
  		 * @return The DOM element for this `Component`.
  		 */
  def el(): stdLib.Element = js.native
  /**
  		 * Emit a 'tap' events when touch event support gets detected. This gets used to
  		 * support toggling the controls through a tap on the video. They get enabled
  		 * because every sub-component would have extra overhead otherwise.
  		 *
  		 * @fires Component#tap
  		 * @listens Component#touchstart
  		 * @listens Component#touchmove
  		 * @listens Component#touchleave
  		 * @listens Component#touchcancel
  		 * @listens Component#touchend
  		 */
  def emitTapEvents(): scala.Unit = js.native
  /**
  		 * This function reports user activity whenever touch events happen. This can get
  		 * turned off by any sub-components that wants touch events to act another way.
  		 *
  		 * Report user touch activity when touch events occur. User activity gets used to
  		 * determine when controls should show/hide. It is simple when it comes to mouse
  		 * events, because any mouse event should show the controls. So we capture mouse
  		 * events that bubble up to the player and report activity when that happens.
  		 * With touch events it isn't as easy as `touchstart` and `touchend` toggle player
  		 * controls. So touch events can't help us at the player level either.
  		 *
  		 * User activity gets checked asynchronously. So what could happen is a tap event
  		 * on the video turns the controls off. Then the `touchend` event bubbles up to
  		 * the player. Which, if it reported user activity, would turn the controls right
  		 * back on. We also don't want to completely block touch events from bubbling up.
  		 * Furthermore a `touchmove` event and anything other than a tap, should not turn
  		 * controls back on.
  		 *
  		 * @listens Component#touchstart
  		 * @listens Component#touchmove
  		 * @listens Component#touchend
  		 * @listens Component#touchcancel
  		 */
  def enableTouchActivity(): scala.Unit = js.native
  /**
  		 * Set the focus to this component
  		 */
  def focus(): scala.Unit = js.native
  /**
  		 * Get the value of an attribute on the `Component`s element.
  		 *
  		 * @param attribute
  		 *        Name of the attribute to get the value from.
  		 *
  		 * @return - The value of the attribute that was asked for.
  		 *         - Can be an empty string on some browsers if the attribute does not exist
  		 *           or has no value
  		 *         - Most browsers will return null if the attibute does not exist or has
  		 *           no value.
  		 *
  		 * @see [DOM API]{@link https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute}
  		 */
  def getAttribute(attribute: java.lang.String): java.lang.String | scala.Null = js.native
  /**
  		 * Returns the child `Component` with the given `name`.
  		 *
  		 * @param name
  		 *        The name of the child `Component` to get.
  		 *
  		 * @return The child `Component` with the given `name` or undefined.
  		 */
  def getChild(name: java.lang.String): js.UndefOr[Component] = js.native
  /**
  		 * Returns the child `Component` with the given `id`.
  		 *
  		 * @param id
  		 *        The id of the child `Component` to get.
  		 *
  		 * @return The child `Component` with the given `id` or undefined.
  		 */
  def getChildById(id: java.lang.String): js.UndefOr[Component] = js.native
  /**
  		 * Check if a component's element has a CSS class name.
  		 *
  		 * @param classToCheck
  		 *        CSS class name to check.
  		 *
  		 * @return - True if the `Component` has the class.
  		 *         - False if the `Component` does not have the class`
  		 */
  def hasClass(classToCheck: java.lang.String): scala.Boolean = js.native
  def height(): scala.Double | java.lang.String = js.native
  def height(num: java.lang.String): scala.Unit = js.native
  def height(num: java.lang.String, skipListeners: scala.Boolean): scala.Unit = js.native
  /**
  		 * Get or set the height of the component based upon the CSS styles.
  		 * See {@link Component#dimension} for more detailed information.
  		 *
  		 * @param [num]
  		 *        The height that you want to set postfixed with '%', 'px' or nothing.
  		 *
  		 * @param [skipListeners]
  		 *        Skip the componentresize event trigger
  		 *
  		 * @return The width when getting, zero if there is no width. Can be a string
  		 *         postpixed with '%' or 'px'.
  		 */
  def height(num: scala.Double): scala.Unit = js.native
  def height(num: scala.Double, skipListeners: scala.Boolean): scala.Unit = js.native
  /**
  		 * Hide the `Component`s element if it is currently showing by adding the
  		 * 'vjs-hidden` class name to it.
  		 */
  def hide(): scala.Unit = js.native
  /**
  		 * Get this `Component`s ID
  		 *
  		 * @return The id of this `Component`
  		 */
  def id(): java.lang.String = js.native
  /**
  		 * Add and initialize default child `Component`s based upon options.
  		 */
  def initChildren(): scala.Unit = js.native
  /**
  		 * Localize a string given the string in english.
  		 *
  		 * If tokens are provided, it'll try and run a simple token replacement on the provided string.
  		 * The tokens it looks for look like `{1}` with the index being 1-indexed into the tokens array.
  		 *
  		 * If a `defaultValue` is provided, it'll use that over `string`,
  		 * if a value isn't found in provided language files.
  		 * This is useful if you want to have a descriptive key for token replacement
  		 * but have a succinct localized string and not require `en.json` to be included.
  		 *
  		 * Currently, it is used for the progress bar timing.
  		 * ```js
  		 * {
  		 *   "progress bar timing: currentTime={1} duration={2}": "{1} of {2}"
  		 * }
  		 * ```
  		 * It is then used like so:
  		 * ```js
  		 * this.localize('progress bar timing: currentTime={1} duration{2}',
  		 *               [this.player_.currentTime(), this.player_.duration()],
  		 *               '{1} of {2}');
  		 * ```
  		 *
  		 * Which outputs something like: `01:23 of 24:56`.
  		 *
  		 *
  		 * @param string
  		 *        The string to localize and the key to lookup in the language files.
  		 * @param [tokens]
  		 *        If the current item has token replacements, provide the tokens here.
  		 * @param [defaultValue]
  		 *        Defaults to `string`. Can be a default value to use for token replacement
  		 *        if the lookup key is needed to be separate.
  		 *
  		 * @return The localized string or if no localization exists the english string.
  		 */
  def localize(string: java.lang.String): java.lang.String = js.native
  def localize(string: java.lang.String, tokens: js.Array[java.lang.String]): java.lang.String = js.native
  def localize(string: java.lang.String, tokens: js.Array[java.lang.String], defaultValue: java.lang.String): java.lang.String = js.native
  /**
  		 * Lock a `Component`s element in its visible state by adding the 'vjs-lock-showing'
  		 * class name to it. Used during fadeIn/fadeOut.
  		 *
  		 */
  def lockShowing(): scala.Unit = js.native
  /**
  		 * Get the `Component`s name. The name gets used to reference the `Component`
  		 * and is set during registration.
  		 *
  		 * @return The name of this `Component`.
  		 */
  def name(): java.lang.String = js.native
  /**
  		 * Deep merge of options objects with new options.
  		 * > Note: When both `obj` and `options` contain properties whose values are objects.
  		 *         The two properties get merged using {@link module:mergeOptions}
  		 *
  		 * @param obj
  		 *        The object that contains new options.
  		 *
  		 * @return A new object of `this.options_` and `obj` merged together.
  		 *
  		 * @deprecated since version 5
  		 */
  def options(obj: js.Any): js.Any = js.native
  def played(): stdLib.TimeRanges = js.native
  /**
  		 * Return the {@link Player} that the `Component` has attached to.
  		 *
  		 * @return The player that this `Component` has attached to.
  		 */
  def player(): Player = js.native
  /**
  		 * Bind a listener to the component's ready state.
  		 * Different from event listeners in that if the ready event has already happened
  		 * it will trigger the function immediately.
  		 *
  		 * @return Returns itself; method can be chained.
  		 */
  def ready(callback: js.ThisFunction0[/* this */ Player, scala.Unit]): this.type = js.native
  /**
  		 * Remove an attribute from the `Component`s element.
  		 *
  		 * @param attribute
  		 *        Name of the attribute to remove.
  		 *
  		 * @see [DOM API]{@link https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute}
  		 */
  def removeAttribute(attribute: java.lang.String): scala.Unit = js.native
  /**
  		 * Remove a child `Component` from this `Component`s list of children. Also removes
  		 * the child `Component`s element from this `Component`s element.
  		 *
  		 * @param component
  		 *        The child `Component` to remove.
  		 */
  def removeChild(component: Component): scala.Unit = js.native
  /**
  		 * Remove a CSS class name from the `Component`s element.
  		 *
  		 * @param classToRemove
  		 *        CSS class name to remove
  		 */
  def removeClass(classToRemove: java.lang.String): scala.Unit = js.native
  /**
  		 * Queues up a callback to be passed to requestAnimationFrame (rAF), but
  		 * with a few extra bonuses:
  		 *
  		 * - Supports browsers that do not support rAF by falling back to
  		 *   {@link Component#setTimeout}.
  		 *
  		 * - The callback is turned into a {@link Component~GenericCallback} (i.e.
  		 *   bound to the component).
  		 *
  		 * - Automatic cancellation of the rAF callback is handled if the component
  		 *   is disposed before it is called.
  		 *
  		 * @param fn
  		 *         A function that will be bound to this component and executed just
  		 *         before the browser's next repaint.
  		 *
  		 * @return Returns an rAF ID that gets used to identify the timeout. It can
  		 *         also be used in {@link Component#cancelAnimationFrame} to cancel
  		 *         the animation frame callback.
  		 *
  		 * @listens Component#dispose
  		 * @see [Similar to]{@link https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame}
  		 */
  def requestAnimationFrame(fn: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.GenericCallback): scala.Double = js.native
  /**
  		 * Set the value of an attribute on the `Component`'s element
  		 *
  		 * @param attribute
  		 *        Name of the attribute to set.
  		 *
  		 * @param value
  		 *        Value to set the attribute to.
  		 *
  		 * @see [DOM API]{@link https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute}
  		 */
  def setAttribute(attribute: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
  		 * Creates a function that gets run every `x` milliseconds. This function is a wrapper
  		 * around `window.setInterval`. There are a few reasons to use this one instead though.
  		 * 1. It gets cleared via  {@link Component#clearInterval} when
  		 *    {@link Component#dispose} gets called.
  		 * 2. The function callback will be a {@link Component~GenericCallback}
  		 *
  		 * @param fn
  		 *        The function to run every `x` seconds.
  		 *
  		 * @param interval
  		 *        Execute the specified function every `x` milliseconds.
  		 *
  		 * @return Returns an id that can be used to identify the interval. It can also be be used in
  		 *         {@link Component#clearInterval} to clear the interval.
  		 *
  		 * @listens Component#dispose
  		 * @see [Similar to]{@link https://developer.mozilla.org/en-US/docs/Web/API/WindowTimers/setInterval}
  		 */
  def setInterval(fn: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.GenericCallback, interval: scala.Double): scala.Double = js.native
  /**
  		 * Creates a function that runs after an `x` millisecond timeout. This function is a
  		 * wrapper around `window.setTimeout`. There are a few reasons to use this one
  		 * instead though:
  		 * 1. It gets cleared via  {@link Component#clearTimeout} when
  		 *    {@link Component#dispose} gets called.
  		 * 2. The function callback will gets turned into a {@link Component~GenericCallback}
  		 *
  		 * > Note: You can't use `window.clearTimeout` on the id returned by this function. This
  		 *         will cause its dispose listener not to get cleaned up! Please use
  		 *         {@link Component#clearTimeout} or {@link Component#dispose} instead.
  		 *
  		 * @param fn
  		 *        The function that will be run after `timeout`.
  		 *
  		 * @param timeout
  		 *        Timeout in milliseconds to delay before executing the specified function.
  		 *
  		 * @return Returns a timeout ID that gets used to identify the timeout. It can also
  		 *         get used in {@link Component#clearTimeout} to clear the timeout that
  		 *         was set.
  		 *
  		 * @listens Component#dispose
  		 * @see [Similar to]{@link https://developer.mozilla.org/en-US/docs/Web/API/WindowTimers/setTimeout}
  		 */
  def setTimeout(fn: videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.GenericCallback, timeout: scala.Double): scala.Double = js.native
  /**
  		 * Show the `Component`s element if it is hidden by removing the
  		 * 'vjs-hidden' class name from it.
  		 */
  def show(): scala.Unit = js.native
  /**
  		 * Add or remove a CSS class name from the component's element.
  		 * - `classToToggle` gets added when {@link Component#hasClass} would return false.
  		 * - `classToToggle` gets removed when {@link Component#hasClass} would return true.
  		 *
  		 * @param classToToggle
  		 *         The class to add or remove based on (@link Component#hasClass}
  		 *
  		 * @param [predicate]
  		 *         An {@link Dom~predicate} function or a boolean
  		 */
  def toggleClass(classToToggle: java.lang.String): scala.Unit = js.native
  def toggleClass(classToToggle: java.lang.String, predicate: scala.Boolean): scala.Unit = js.native
  def toggleClass(classToToggle: java.lang.String, predicate: videoDotJsLib.videoDotJsMod.videojsNs.DomNs.Predicate): scala.Unit = js.native
  /**
  		 * Trigger all the ready listeners for this `Component`.
  		 *
  		 * @fires Component#ready
  		 */
  def triggerReady(): scala.Unit = js.native
  /**
  		 * Unlock a `Component`s element from its visible state by removing the 'vjs-lock-showing'
  		 * class name from it. Used during fadeIn/fadeOut.
  		 *
  		 */
  def unlockShowing(): scala.Unit = js.native
  def width(): java.lang.String | scala.Double = js.native
  /**
  		 * Get or set the width of the component based upon the CSS styles.
  		 * See {@link Component#dimension} for more detailed information.
  		 *
  		 * @param [num]
  		 *        The width that you want to set postfixed with '%', 'px' or nothing.
  		 *
  		 * @param [skipListeners]
  		 *        Skip the componentresize event trigger
  		 *
  		 * @return The width when getting, zero if there is no width. Can be a string
  		 *           postpixed with '%' or 'px'.
  		 */
  def width(num: scala.Double): scala.Unit = js.native
  def width(num: scala.Double, skipListeners: scala.Double): scala.Unit = js.native
}


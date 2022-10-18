package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.testcafe.anon.ReturnDOMNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorAPI extends StObject {
  
  /**
    *  Adds custom selector properties.
    *
    * @param props - Property descriptors.
    * @param props `prop` - Property name.
    * @param props `[prop]` - The function that calculate property values. Executed on the client side in the browser.
    * @param props `node` - The matching DOM node for which custom property is calculated.
    */
  def addCustomDOMProperties(props: StringDictionary[js.Function1[/* node */ Element, Any]]): Selector = js.native
  
  /**
    * Adds custom selector methods.
    *
    * @param methods - Method descriptors.
    * @param methods `method` - The method name.
    * @param methods `[method]` - The function that contains method code. Executed on the client side in the browser.
    * @param methods `node` - The matching DOM node for which custom method is executed.
    * @param methods `methodParams` - Custom method parameters.
    */
  def addCustomMethods(methods: StringDictionary[js.Function2[/* node */ Element, /* repeated */ Any, Any]]): Selector = js.native
  def addCustomMethods(
    methods: StringDictionary[js.Function2[/* node */ Element, /* repeated */ Any, Any]],
    opts: ReturnDOMNodes
  ): Selector = js.native
  
  /**
    * Attributes of the element.
    */
  var attributes: js.Promise[StringDictionary[String]] = js.native
  
  /**
    * The size of the element and its position relative to the viewport.
    */
  var boundingClientRect: js.Promise[TextRectangle] = js.native
  
  /**
    * For checkbox and radio input elements, their current state. For other elements, `undefined`.
    */
  var checked: js.Promise[js.UndefOr[Boolean]] = js.native
  
  /**
    * Finds all child elements (not nodes) of all nodes in the matching set.
    */
  def child(): Selector = js.native
  /**
    * Finds all child elements (not nodes) of all nodes in the matching set and filters them by `cssSelector`.
    *
    * @param cssSelector - A CSS selector string.
    */
  def child(cssSelector: String): Selector = js.native
  /**
    * Finds all child elements (not nodes) of all nodes in the matching set and filters them by the `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current child node.
    * @param filterFn `idx` - A zero-based index of `node` among other child nodes.
    * @param filterFn `originNode` - A node from the left-hand selector's matching set children parents are being iterated.
    * @param dependencies - Predicate dependencies.
    */
  def child(filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean]): Selector = js.native
  def child(
    filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  /**
    * Finds all child elements (not nodes) of all nodes in the matching set and filters them by `index`.
    *
    * @param index - A zero-based index of the child. If negative, then counted from the end of the matching set.
    */
  def child(index: Double): Selector = js.native
  
  /**
    * The number of child HTML elements.
    */
  var childElementCount: js.Promise[Double] = js.native
  
  /**
    * The number of child nodes.
    */
  var childNodeCount: js.Promise[Double] = js.native
  
  /**
    * The list of element's classes.
    */
  var classNames: js.Promise[js.Array[String]] = js.native
  
  /**
    * The inner height of the element, including padding but not the horizontal scrollbar height, border, or margin.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientHeight
    */
  var clientHeight: js.Promise[Double] = js.native
  
  /**
    * The width of the left border of the element.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientLeft
    */
  var clientLeft: js.Promise[Double] = js.native
  
  /**
    * The width of the top border of the element.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientTop
    */
  var clientTop: js.Promise[Double] = js.native
  
  /**
    * The inner width of the element, including padding but not the vertical scrollbar width, border, or margin.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientWidth
    */
  var clientWidth: js.Promise[Double] = js.native
  
  /**
    * The number of matching elements.
    */
  var count: js.Promise[Double] = js.native
  
  /**
    * `true if` at least one matching element exists.
    */
  var exists: js.Promise[Boolean] = js.native
  
  /**
    * Creates a selector that filters a matching set by cssSelector.
    *
    * @param cssSelector - A CSS selector string.
    */
  def filter(cssSelector: String): Selector = js.native
  /**
    * Creates a selector that filters a matching set by the `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current DOM node.
    * @param filterFn `idx` - Index of the current node among other nodes in the matching set.
    * @param dependencies - Predicate dependencies.
    */
  def filter(filterFn: js.Function2[/* node */ Element, /* idx */ Double, Boolean]): Selector = js.native
  def filter(
    filterFn: js.Function2[/* node */ Element, /* idx */ Double, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  
  /**
    * Creates a selector that filters a matching set leaving only hidden elements.
    */
  def filterHidden(): Selector = js.native
  
  /**
    * Creates a selector that filters a matching set leaving only visible elements.
    */
  def filterVisible(): Selector = js.native
  
  /**
    * Finds all descendants of all nodes in the matching set and filters them by `cssSelector`.
    *
    * @param cssSelector - A CSS selector string.
    */
  def find(cssSelector: String): Selector = js.native
  /**
    * Finds all descendants of all nodes in the matching set and filters them using `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current descendant node.
    * @param filterFn `idx` - A zero-based index of `node` among other descendant nodes.
    * @param filterFn `originNode` - A node from the left-hand selector's matching set whose descendants are being iterated.
    * @param dependencies - Predicate dependencies.
    */
  def find(filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean]): Selector = js.native
  def find(
    filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  
  /**
    * `true` if the element is focused.
    */
  var focused: js.Promise[Boolean] = js.native
  
  /**
    *    Returns the value of the attribute.
    *
    * @param attributeName - The name of the attribute.
    */
  def getAttribute(attributeName: String): js.Promise[String | Null] = js.native
  
  /**
    * Returns the value of the property from the `boundingClientRect` object.
    *
    * @param propertyName - The name of the property.
    */
  def getBoundingClientRectProperty(propertyName: String): js.Promise[Double] = js.native
  
  /**
    * Returns the computed value of the CSS property.
    *
    * @param propertyName - The name of the CSS property.
    */
  def getStyleProperty(propertyName: String): js.Promise[String] = js.native
  
  /**
    * `true` if the element has the attribute.
    *
    * @param attributeName - The name of the attribute.
    */
  def hasAttribute(attributeName: String): js.Promise[Boolean] = js.native
  
  /**
    * `true` if this node has child HTML elements.
    */
  var hasChildElements: js.Promise[Boolean] = js.native
  
  /**
    * `true` if this node has child nodes.
    */
  var hasChildNodes: js.Promise[Boolean] = js.native
  
  /**
    * `true` if the element has the specified class name.
    *
    * @param className - The name of the class.
    */
  def hasClass(className: String): js.Promise[Boolean] = js.native
  
  /**
    * The element's identifier.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/id
    */
  var id: js.Promise[String] = js.native
  
  /**
    * The element's text content "as rendered".
    * See https://html.spec.whatwg.org/multipage/dom.html#the-innertext-idl-attribute
    */
  var innerText: js.Promise[String] = js.native
  
  /**
    *    The namespace URI of the element. If the element does not have a namespace, this property is set to null.
    *    See https://developer.mozilla.org/en-US/docs/Web/API/Element/namespaceURI
    */
  var namespaceURI: js.Promise[String | Null] = js.native
  
  /**
    * Finds all succeeding sibling elements (not nodes) of all nodes in the matching set.
    */
  def nextSibling(): Selector = js.native
  /**
    * Finds all succeeding sibling elements (not nodes) of all nodes in the matching set and filters them by `cssSelector`.
    *
    * @param cssSelector - A CSS selector string.
    */
  def nextSibling(cssSelector: String): Selector = js.native
  /**
    * Finds all succeeding sibling elements (not nodes) of all nodes in the matching set and filters them by the `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current succeeding sibling node.
    * @param filterFn `idx` - A zero-based index of `node` among other succeeding sibling nodes.
    * @param filterFn `originNode` - A node from the left-hand selector's matching set whose succeeding siblings are being iterated.
    * @param dependencies - Predicate dependencies.
    */
  def nextSibling(filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean]): Selector = js.native
  def nextSibling(
    filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  /**
    * Finds all succeeding sibling elements (not nodes) of all nodes in the matching set and filters them by `index`.
    *
    * @param index - A zero-based index of the succeeding sibling. If negative, then counted from the end of the matching set.
    */
  def nextSibling(index: Double): Selector = js.native
  
  /**
    * The type of the node.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType
    */
  var nodeType: js.Promise[Double] = js.native
  
  /**
    * Creates a selector that returns an element by its index in the matching set.
    *
    * @param index - A zero-based index of the element. If negative, then counted from the end of the matching set.
    */
  def nth(index: Double): Selector = js.native
  
  /**
    * The height of the element including vertical padding and borders.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetHeight
    */
  var offsetHeight: js.Promise[Double] = js.native
  
  /**
    * The number of pixels that the upper left corner of the element is offset by to the left within the `offsetParent` node.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetLeft
    */
  var offsetLeft: js.Promise[Double] = js.native
  
  /**
    * The number of pixels that the upper left corner of the element is offset by to the top within the offsetParent node.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetTop
    */
  var offsetTop: js.Promise[Double] = js.native
  
  /**
    * The width of the element including vertical padding and borders.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetWidth
    */
  var offsetWidth: js.Promise[Double] = js.native
  
  /**
    * Finds all parents of all nodes in the matching set (first element in the set will be the closest parent).
    */
  def parent(): Selector = js.native
  /**
    * Finds all parents of all nodes in the matching set and filters them by `cssSelector`.
    *
    * @param cssSelector - A CSS selector string.
    */
  def parent(cssSelector: String): Selector = js.native
  /**
    * Finds all parents of all nodes in the matching set and filters them by the `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current parent node.
    * @param filterFn `idx` - A zero-based index of `node` among other parent nodes.
    * @param filterFn `originNode` - A node from the left-hand selector's matching set whose parents are being iterated.
    * @param dependencies - Predicate dependencies.
    */
  def parent(filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean]): Selector = js.native
  def parent(
    filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  /**
    * Finds all parents of all nodes in the matching set and filters them by `index`.
    *
    * @param index - A zero-based index of the parent (0 is the closest). If negative, then counted from the end of the matching set.
    */
  def parent(index: Double): Selector = js.native
  
  /**
    * Finds all preceding sibling elements (not nodes) of all nodes in the matching set.
    */
  def prevSibling(): Selector = js.native
  /**
    * Finds all preceding sibling elements (not nodes) of all nodes in the matching set and filters them by `cssSelector`.
    *
    * @param cssSelector - A CSS selector string.
    */
  def prevSibling(cssSelector: String): Selector = js.native
  /**
    * Finds all preceding sibling elements (not nodes) of all nodes in the matching set and filters them by the `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current preceding sibling node.
    * @param filterFn `idx` - A zero-based index of `node` among other preceding sibling nodes.
    * @param filterFn `originNode` - A node from the left-hand selector's matching set whose preceding siblings are being iterated.
    * @param dependencies - Predicate dependencies.
    */
  def prevSibling(filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean]): Selector = js.native
  def prevSibling(
    filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  /**
    *  Finds all preceding sibling elements (not nodes) of all nodes in the matching set and filters them by `index`.
    *
    * @param index - A zero-based index of the preceding sibling. If negative, then counted from the end of the matching set.
    */
  def prevSibling(index: Double): Selector = js.native
  
  /**
    * The height of the element's content, including content not visible on the screen due to overflow.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollHeight
    */
  var scrollHeight: js.Promise[Double] = js.native
  
  /**
    * The number of pixels that the element's content is scrolled to the left.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollLeft
    */
  var scrollLeft: js.Promise[Double] = js.native
  
  /**
    * The number of pixels that the element's content is scrolled upward.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollTop
    */
  var scrollTop: js.Promise[Double] = js.native
  
  /**
    * Either the width in pixels of the element's content or the width of the element itself, whichever is greater.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollWidth
    */
  var scrollWidth: js.Promise[Double] = js.native
  
  /**
    * Indicates that `<option>` element is currently selected. For other elements, `undefined`.
    */
  var selected: js.Promise[js.UndefOr[Boolean]] = js.native
  
  /**
    *    For `<select>` element, the index of the first selected `<option>` element. For other elements, `undefined`.
    */
  var selectedIndex: js.Promise[js.UndefOr[Double]] = js.native
  
  /**
    * Creates a selector that returns an element's `shadowRoot`.
    */
  def shadowRoot(): Selector = js.native
  
  /**
    * Finds all sibling elements (not nodes) of all nodes in the matching set.
    */
  def sibling(): Selector = js.native
  /**
    * nds all sibling elements (not nodes) of all nodes in the matching set and filters them by `cssSelector`.
    *
    * @param cssSelector - A CSS selector string.
    */
  def sibling(cssSelector: String): Selector = js.native
  /**
    * Finds all sibling elements (not nodes) of all nodes in the matching set and filters them by the `filterFn` predicate.
    *
    * @param filterFn - The predicate.
    * @param filterFn `node` - The current sibling node.
    * @param filterFn `idx` - A zero-based index of `node` among other sibling nodes.
    * @param filterFn `originNode` - A node from the left-hand selector's matching set whose siblings are being iterated.
    * @param dependencies - Predicate dependencies.
    */
  def sibling(filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean]): Selector = js.native
  def sibling(
    filterFn: js.Function3[/* node */ Element, /* idx */ Double, /* originNode */ Element, Boolean],
    dependencies: StringDictionary[Any]
  ): Selector = js.native
  /**
    * Finds all sibling elements (not nodes) of all nodes in the matching set and filters them by `index`.
    *
    * @param index -  a zero-based index of the sibling. If negative, then counted from the end of the matching set.
    */
  def sibling(index: Double): Selector = js.native
  
  /**
    * The computed values of element's CSS properties.
    */
  var style: js.Promise[StringDictionary[String]] = js.native
  
  /**
    * The name of the element.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName
    */
  var tagName: js.Promise[String] = js.native
  
  /**
    * The text content of the node and its descendants.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent
    */
  var textContent: js.Promise[String] = js.native
  
  /**
    * For input elements, the current value in the control. For other elements, `undefined`.
    */
  var value: js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * `true` if the element is visible.
    */
  var visible: js.Promise[Boolean] = js.native
  
  /**
    * Returns a new selector with a different set of options that includes options from the
    * original selector and new `options` that overwrite the original ones.
    *
    * @param options - New options.
    */
  def `with`(): Selector = js.native
  def `with`(options: SelectorOptions): Selector = js.native
  
  /**
    * Creates a selector that filters a matching set by the specified attribute and, optionally, attribute value.
    *
    * @param attrName - The attribute name.
    * @param attrValue - The attribute value.You can omit this parameter to select elements that have
    * the `attrName` attribute regardless of the value.
    */
  def withAttribute(attrName: String): Selector = js.native
  def withAttribute(attrName: String, attrValue: String): Selector = js.native
  def withAttribute(attrName: String, attrValue: js.RegExp): Selector = js.native
  def withAttribute(attrName: js.RegExp): Selector = js.native
  def withAttribute(attrName: js.RegExp, attrValue: String): Selector = js.native
  def withAttribute(attrName: js.RegExp, attrValue: js.RegExp): Selector = js.native
  
  /**
    * Creates a selector that filters a matching set by the specified text. Selects elements whose text content *strictly matches* this text.
    *
    * @param text - The text in the element.
    */
  def withExactText(text: String): Selector = js.native
  
  /**
    * Creates a selector that filters a matching set using the specified regular expression.
    *
    * @param re - The regular expression for the text in the element.
    */
  def withText(re: js.RegExp): Selector = js.native
  /**
    * Creates a selector that filters a matching set by the specified text.
    *
    * @param text - The text in the element.
    */
  def withText(text: String): Selector = js.native
}

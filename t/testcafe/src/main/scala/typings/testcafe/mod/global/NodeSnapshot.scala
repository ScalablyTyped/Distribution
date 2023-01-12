package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSnapshot extends StObject {
  
  /**
    * Attributes of the element.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The size of the element and its position relative to the viewport.
    */
  var boundingClientRect: js.UndefOr[TextRectangle] = js.undefined
  
  /**
    * For checkbox and radio input elements, their current state. For other elements, `undefined`.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of child HTML elements.
    */
  var childElementCount: Double
  
  /**
    * The number of child nodes.
    */
  var childNodeCount: Double
  
  /**
    * The list of element's classes.
    */
  var classNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The inner height of the element, including padding but not the horizontal scrollbar height, border, or margin.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientHeight
    */
  var clientHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the left border of the element.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientLeft
    */
  var clientLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the top border of the element.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientTop
    */
  var clientTop: js.UndefOr[Double] = js.undefined
  
  /**
    * The inner width of the element, including padding but not the vertical scrollbar width, border, or margin.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/clientWidth
    */
  var clientWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` if the element is focused.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Returns the value of the attribute.
    *
    * @param attributeName - The name of the attribute.
    */
  var getAttribute: js.UndefOr[js.Function1[/* attributeName */ String, String | Null]] = js.undefined
  
  /**
    * Returns the value of the property from the `boundingClientRect` object.
    *
    * @param propertyName - The name of the property.
    */
  var getBoundingClientRectProperty: js.UndefOr[js.Function1[/* propertyName */ String, Double]] = js.undefined
  
  /**
    * Returns the computed value of the CSS property.
    *
    * @param propertyName - The name of the CSS property.
    */
  var getStyleProperty: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.undefined
  
  /**
    * `true` if the element has the attribute.
    *
    * @param attributeName - The name of the attribute.
    */
  var hasAttribute: js.UndefOr[js.Function1[/* attributeName */ String, Boolean]] = js.undefined
  
  /**
    * `true` if this node has child HTML elements.
    */
  var hasChildElements: Boolean
  
  /**
    * `true` if this node has child nodes.
    */
  var hasChildNodes: Boolean
  
  /**
    * `true` if the element has the specified class name.
    *
    * @param className - Name of the class.
    */
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  
  /**
    * The element's identifier.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/id
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The element's text content "as rendered".
    * See https://html.spec.whatwg.org/multipage/dom.html#the-innertext-idl-attribute
    */
  var innerText: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace URI of the element. If the element does not have a namespace, this property is set to null.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/namespaceURI
    */
  var namespaceURI: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the node.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType
    */
  var nodeType: Double
  
  /**
    * The height of the element including vertical padding and borders.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetHeight
    */
  var offsetHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of pixels that the upper left corner of the element is offset by to the left within the `offsetParent` node.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetLeft
    */
  var offsetLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of pixels that the upper left corner of the element is offset by to the top within the offsetParent node.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetTop
    */
  var offsetTop: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the element including vertical padding and borders.
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetWidth
    */
  var offsetWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the element's content, including content not visible on the screen due to overflow.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollHeight
    */
  var scrollHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of pixels that the element's content is scrolled to the left.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollLeft
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of pixels that the element's content is scrolled upward.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollTop
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Either the width in pixels of the element's content or the width of the element itself, whichever is greater.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollWidth
    */
  var scrollWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates that `<option>` element is currently selected. For other elements, `undefined`.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    For `<select>` element, the index of the first selected `<option>` element. For other elements, `undefined`.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The computed values of element's CSS properties.
    */
  var style: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The name of the element.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName
    */
  var tagName: js.UndefOr[String] = js.undefined
  
  /**
    * The text content of the node and its descendants.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent
    */
  var textContent: String
  
  /**
    * For input elements, the current value in the control. For other elements, `undefined`.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * `true` if the element is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object NodeSnapshot {
  
  inline def apply(
    childElementCount: Double,
    childNodeCount: Double,
    hasChildElements: Boolean,
    hasChildNodes: Boolean,
    nodeType: Double,
    textContent: String
  ): NodeSnapshot = {
    val __obj = js.Dynamic.literal(childElementCount = childElementCount.asInstanceOf[js.Any], childNodeCount = childNodeCount.asInstanceOf[js.Any], hasChildElements = hasChildElements.asInstanceOf[js.Any], hasChildNodes = hasChildNodes.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeSnapshot] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBoundingClientRect(value: TextRectangle): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    inline def setBoundingClientRectUndefined: Self = StObject.set(x, "boundingClientRect", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
    
    inline def setChildNodeCount(value: Double): Self = StObject.set(x, "childNodeCount", value.asInstanceOf[js.Any])
    
    inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientHeightUndefined: Self = StObject.set(x, "clientHeight", js.undefined)
    
    inline def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
    
    inline def setClientLeftUndefined: Self = StObject.set(x, "clientLeft", js.undefined)
    
    inline def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
    
    inline def setClientTopUndefined: Self = StObject.set(x, "clientTop", js.undefined)
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setClientWidthUndefined: Self = StObject.set(x, "clientWidth", js.undefined)
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setGetAttribute(value: /* attributeName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
    
    inline def setGetBoundingClientRectProperty(value: /* propertyName */ String => Double): Self = StObject.set(x, "getBoundingClientRectProperty", js.Any.fromFunction1(value))
    
    inline def setGetBoundingClientRectPropertyUndefined: Self = StObject.set(x, "getBoundingClientRectProperty", js.undefined)
    
    inline def setGetStyleProperty(value: /* propertyName */ String => String): Self = StObject.set(x, "getStyleProperty", js.Any.fromFunction1(value))
    
    inline def setGetStylePropertyUndefined: Self = StObject.set(x, "getStyleProperty", js.undefined)
    
    inline def setHasAttribute(value: /* attributeName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
    
    inline def setHasAttributeUndefined: Self = StObject.set(x, "hasAttribute", js.undefined)
    
    inline def setHasChildElements(value: Boolean): Self = StObject.set(x, "hasChildElements", value.asInstanceOf[js.Any])
    
    inline def setHasChildNodes(value: Boolean): Self = StObject.set(x, "hasChildNodes", value.asInstanceOf[js.Any])
    
    inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    
    inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
    
    inline def setInnerTextUndefined: Self = StObject.set(x, "innerText", js.undefined)
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
    
    inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
    
    inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    inline def setOffsetHeightUndefined: Self = StObject.set(x, "offsetHeight", js.undefined)
    
    inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    inline def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
    
    inline def setOffsetWidthUndefined: Self = StObject.set(x, "offsetWidth", js.undefined)
    
    inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    inline def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

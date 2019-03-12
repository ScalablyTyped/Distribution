package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An attributed string proxy manages character strings and associated sets of attributes (for example,
		 * font and foregroundcolor) that apply to individual characters or ranges of characters in the string.
		 */
trait AttributedString
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * An array of attributes to add.
  			 */
  var attributes: js.Array[titaniumLib.Attribute]
  /**
  			 * The text applied to the attributed string.
  			 */
  var text: java.lang.String
  /**
  			 * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
  			 */
  def addAttribute(attribute: titaniumLib.Attribute): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def getAttributes(): js.Array[titaniumLib.Attribute]
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def getText(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def setAttributes(attributes: js.Array[titaniumLib.Attribute]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def setText(text: java.lang.String): scala.Unit
}

object AttributedString {
  @scala.inline
  def apply(
    addAttribute: titaniumLib.Attribute => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    attributes: js.Array[titaniumLib.Attribute],
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getAttributes: () => js.Array[titaniumLib.Attribute],
    getBubbleParent: () => scala.Boolean,
    getText: () => java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setAttributes: js.Array[titaniumLib.Attribute] => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setText: java.lang.String => scala.Unit,
    text: java.lang.String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): AttributedString = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction1(addAttribute), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes, bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getAttributes = js.Any.fromFunction0(getAttributes), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getText = js.Any.fromFunction0(getText), removeEventListener = js.Any.fromFunction2(removeEventListener), setAttributes = js.Any.fromFunction1(setAttributes), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setText = js.Any.fromFunction1(setText), text = text)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AttributedString]
  }
}


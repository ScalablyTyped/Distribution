package typings.titanium.Titanium.UI

import typings.titanium.Attribute
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An attributed string proxy manages character strings and associated sets of attributes (for example,
		 * font and foregroundcolor) that apply to individual characters or ranges of characters in the string.
		 */
trait AttributedString extends Proxy {
  /**
  			 * An array of attributes to add.
  			 */
  var attributes: js.Array[Attribute]
  /**
  			 * The text applied to the attributed string.
  			 */
  var text: String
  /**
  			 * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
  			 */
  def addAttribute(attribute: Attribute): Unit
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def getAttributes(): js.Array[Attribute]
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def getText(): String
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def setAttributes(attributes: js.Array[Attribute]): Unit
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def setText(text: String): Unit
}

object AttributedString {
  @scala.inline
  def apply(
    addAttribute: Attribute => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    attributes: js.Array[Attribute],
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getAttributes: () => js.Array[Attribute],
    getBubbleParent: () => Boolean,
    getText: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAttributes: js.Array[Attribute] => Unit,
    setBubbleParent: Boolean => Unit,
    setText: String => Unit,
    text: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AttributedString = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction1(addAttribute), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getAttributes = js.Any.fromFunction0(getAttributes), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getText = js.Any.fromFunction0(getText), removeEventListener = js.Any.fromFunction2(removeEventListener), setAttributes = js.Any.fromFunction1(setAttributes), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setText = js.Any.fromFunction1(setText), text = text.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributedString]
  }
}


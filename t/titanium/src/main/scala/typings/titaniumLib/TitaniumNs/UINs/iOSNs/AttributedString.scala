package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An attributed string proxy manages character strings and associated sets of attributes (for example,
			 * font and kerning) that apply to individual characters or ranges of characters in the string.
			 */
trait AttributedString
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * An array of attributes to add.
  				 */
  var attributes: js.Array[Attribute]
  /**
  				 * The text applied to the attributed string.
  				 */
  var text: java.lang.String
  /**
  				 * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
  				 */
  def addAttribute(attribute: Attribute): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AttributedString.attributes> property.
  				 */
  def getAttributes(): js.Array[Attribute]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AttributedString.text> property.
  				 */
  def getText(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AttributedString.attributes> property.
  				 */
  def setAttributes(attributes: js.Array[Attribute]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AttributedString.text> property.
  				 */
  def setText(text: java.lang.String): scala.Unit
}

object AttributedString {
  @scala.inline
  def apply(
    addAttribute: js.Function1[Attribute, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    attributes: js.Array[Attribute],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getAttributes: js.Function0[js.Array[Attribute]],
    getBubbleParent: js.Function0[scala.Boolean],
    getText: js.Function0[java.lang.String],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setAttributes: js.Function1[js.Array[Attribute], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit],
    text: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): AttributedString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAttribute")(addAttribute)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setAttributes")(setAttributes)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("text")(text)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AttributedString]
  }
}


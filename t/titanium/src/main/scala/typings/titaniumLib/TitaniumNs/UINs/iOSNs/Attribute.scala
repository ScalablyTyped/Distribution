package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An abstract datatype for specifying an attributed string attribute.
			 */
trait Attribute
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Attribute range.
  				 */
  var range: js.Array[scala.Double]
  /**
  				 * Attribute to apply to the text.
  				 */
  var `type`: scala.Double
  /**
  				 * Attribute value.
  				 */
  var value: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def getRange(): js.Array[scala.Double]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def getType(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def getValue(): scala.Double
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def setRange(range: js.Array[scala.Double]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def setValue(value: scala.Double): scala.Unit
}

object Attribute {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getRange: () => js.Array[scala.Double],
    getType: () => scala.Double,
    getValue: () => scala.Double,
    range: js.Array[scala.Double],
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setRange: js.Array[scala.Double] => scala.Unit,
    setType: scala.Double => scala.Unit,
    setValue: scala.Double => scala.Unit,
    `type`: scala.Double,
    value: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getRange = js.Any.fromFunction0(getRange), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), range = range, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setRange = js.Any.fromFunction1(setRange), setType = js.Any.fromFunction1(setType), setValue = js.Any.fromFunction1(setValue), value = value)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Attribute]
  }
}


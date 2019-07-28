package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An abstract datatype for specifying an attributed string attribute.
			 */
trait Attribute extends Proxy {
  /**
  				 * Attribute range.
  				 */
  var range: js.Array[Double]
  /**
  				 * Attribute to apply to the text.
  				 */
  var `type`: Double
  /**
  				 * Attribute value.
  				 */
  var value: Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def getRange(): js.Array[Double]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def getType(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def getValue(): Double
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def setRange(range: js.Array[Double]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def setType(`type`: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def setValue(value: Double): Unit
}

object Attribute {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getRange: () => js.Array[Double],
    getType: () => Double,
    getValue: () => Double,
    range: js.Array[Double],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setRange: js.Array[Double] => Unit,
    setType: Double => Unit,
    setValue: Double => Unit,
    `type`: Double,
    value: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getRange = js.Any.fromFunction0(getRange), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), range = range, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setRange = js.Any.fromFunction1(setRange), setType = js.Any.fromFunction1(setType), setValue = js.Any.fromFunction1(setValue), value = value)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Attribute]
  }
}


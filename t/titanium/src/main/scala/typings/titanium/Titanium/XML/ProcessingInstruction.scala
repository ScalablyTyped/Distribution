package typings.titanium.Titanium.XML

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A way to keep processor-specific information in the text of the document. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1004215813) on Android and iOS.
		 */
trait ProcessingInstruction extends Proxy {
  /**
  			 * Retrieve the content of this processing instruction. This from the first non white space character after the target to the character immediatly preceding the ?>. When setting a processing instruction, a DOMException may be thrown on an invalid instruction.
  			 */
  var data: String
  /**
  			 * Retrieve the target of this processing instruction. XML defines this as being the first token following the markup that begins the processing instruction.
  			 */
  val target: String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def getData(): String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.target> property.
  			 */
  def getTarget(): String
  /**
  			 * Sets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def setData(data: String): Unit
}

object ProcessingInstruction {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    data: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getData: () => String,
    getTarget: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setData: String => Unit,
    target: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, data = data, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getData = js.Any.fromFunction0(getData), getTarget = js.Any.fromFunction0(getTarget), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setData = js.Any.fromFunction1(setData), target = target)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ProcessingInstruction]
  }
}


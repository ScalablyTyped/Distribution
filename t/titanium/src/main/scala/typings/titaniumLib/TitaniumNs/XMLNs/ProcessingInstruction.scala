package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A way to keep processor-specific information in the text of the document. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1004215813) on Android and iOS.
		 */
trait ProcessingInstruction
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Retrieve the content of this processing instruction. This from the first non white space character after the target to the character immediatly preceding the ?>. When setting a processing instruction, a DOMException may be thrown on an invalid instruction.
  			 */
  var data: java.lang.String
  /**
  			 * Retrieve the target of this processing instruction. XML defines this as being the first token following the markup that begins the processing instruction.
  			 */
  val target: java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def getData(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.target> property.
  			 */
  def getTarget(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def setData(data: java.lang.String): scala.Unit
}

object ProcessingInstruction {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    data: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getData: js.Function0[java.lang.String],
    getTarget: js.Function0[java.lang.String],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setData: js.Function1[java.lang.String, scala.Unit],
    target: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getTarget")(getTarget)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setData")(setData)
    __obj.updateDynamic("target")(target)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ProcessingInstruction]
  }
}


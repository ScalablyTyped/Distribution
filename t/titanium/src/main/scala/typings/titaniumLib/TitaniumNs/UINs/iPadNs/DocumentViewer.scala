package typings
package titaniumLib.TitaniumNs.UINs.iPadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A DocumentViewer provides in-app support for managing user interactions with files on the
			 * local system.
			 */
trait DocumentViewer
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Sets the url of the document viewer.
  				 */
  def setUrl(url: java.lang.String): scala.Unit
  /**
  				 * Displays the document viewer over the current view.
  				 */
  def show(animated: scala.Boolean, view: js.Any): scala.Unit
}

object DocumentViewer {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setUrl: js.Function1[java.lang.String, scala.Unit],
    show: js.Function2[scala.Boolean, js.Any, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DocumentViewer = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setUrl = setUrl, show = show)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DocumentViewer]
  }
}


package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A module used for accessing clipboard data.
		 */
@JSGlobal("Titanium.UI.Clipboard")
@js.native
object ClipboardNs extends js.Object {
  /**
  			 * Create a clipboard identified by name if it doesn't exist.
  			 */
  var allowCreation: scala.Boolean = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Create a new named clipboard.
  			 */
  var name: java.lang.String = js.native
  /**
  			 * Create a new clipboard identified by a unique system-generated name.
  			 */
  var unique: scala.Boolean = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Deletes data of the specified MIME type stored in the clipboard. If MIME type omitted, all
  			 * data is deleted.
  			 */
  def clearData(): scala.Unit = js.native
  def clearData(`type`: java.lang.String): scala.Unit = js.native
  /**
  			 * Deletes all text data stored in the clipboard.
  			 */
  def clearText(): scala.Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.allowCreation> property.
  			 */
  def getAllowCreation(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets data of the specified MIME type stored in the clipboard.
  			 */
  def getData(`type`: java.lang.String): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the items that have been specified earlier using <Titanium.UI.Clipboard.setItems>.
  			 */
  def getItems(): js.Array[_] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.name> property.
  			 */
  def getName(): java.lang.String = js.native
  /**
  			 * Gets text data stored in the clipboard.
  			 */
  def getText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.unique> property.
  			 */
  def getUnique(): scala.Boolean = js.native
  /**
  			 * Indicates whether any colors are stored in the clipboard.
  			 */
  def hasColors(): scala.Boolean = js.native
  /**
  			 * Indicates whether any data of the specified MIME type is stored in the clipboard.
  			 */
  def hasData(`type`: java.lang.String): scala.Boolean = js.native
  /**
  			 * Indicates whether any images are stored in the clipboard.
  			 */
  def hasImages(): scala.Boolean = js.native
  /**
  			 * Indicates whether any text data is stored in the clipboard.
  			 */
  def hasText(): scala.Boolean = js.native
  /**
  			 * Indicates whether any URLs are stored in the clipboard.
  			 */
  def hasURLs(): scala.Boolean = js.native
  /**
  			 * Removes the clipboard.
  			 */
  def remove(): scala.Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.allowCreation> property.
  			 */
  def setAllowCreation(allowCreation: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Stores data of the specified MIME type in the clipboard.
  			 */
  def setData(`type`: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
  			 * Adds an array of items to a clipboard, and sets privacy options for all included items.
  			 */
  def setItems(items: titaniumLib.ClipboardItemsType): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.name> property.
  			 */
  def setName(name: java.lang.String): scala.Unit = js.native
  /**
  			 * Stores text data in the clipboard.
  			 */
  def setText(text: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.unique> property.
  			 */
  def setUnique(unique: scala.Boolean): scala.Unit = js.native
}


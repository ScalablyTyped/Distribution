package typings.titanium.Titanium.UI

import typings.titanium.ClipboardItemsType
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A module used for accessing clipboard data.
		 */
@JSGlobal("Titanium.UI.Clipboard")
@js.native
class Clipboard () extends Module

/* static members */
@JSGlobal("Titanium.UI.Clipboard")
@js.native
object Clipboard extends js.Object {
  /**
  			 * Create a clipboard identified by name if it doesn't exist.
  			 */
  var allowCreation: Boolean = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Create a new named clipboard.
  			 */
  var name: String = js.native
  /**
  			 * Create a new clipboard identified by a unique system-generated name.
  			 */
  var unique: Boolean = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Deletes data of the specified MIME type stored in the clipboard. If MIME type omitted, all
  			 * data is deleted.
  			 */
  def clearData(): Unit = js.native
  def clearData(`type`: String): Unit = js.native
  /**
  			 * Deletes all text data stored in the clipboard.
  			 */
  def clearText(): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.allowCreation> property.
  			 * @deprecated Access <Titanium.UI.Clipboard.allowCreation> instead.
  			 */
  def getAllowCreation(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.apiName> property.
  			 * @deprecated Access <Titanium.UI.Clipboard.apiName> instead.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.bubbleParent> property.
  			 * @deprecated Access <Titanium.UI.Clipboard.bubbleParent> instead.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets data of the specified MIME type stored in the clipboard. Returns null if non-text mimetype on Android.
  			 */
  def getData(`type`: String): String | Blob = js.native
  /**
  			 * Gets the items that have been specified earlier using <Titanium.UI.Clipboard.setItems>.
  			 */
  def getItems(): js.Array[_] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.lifecycleContainer> property.
  			 * @deprecated Access <Titanium.UI.Clipboard.lifecycleContainer> instead.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.name> property.
  			 * @deprecated Access <Titanium.UI.Clipboard.name> instead.
  			 */
  def getName(): String = js.native
  /**
  			 * Gets text data stored in the clipboard.
  			 */
  def getText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Clipboard.unique> property.
  			 * @deprecated Access <Titanium.UI.Clipboard.unique> instead.
  			 */
  def getUnique(): Boolean = js.native
  /**
  			 * Indicates whether any colors are stored in the clipboard.
  			 */
  def hasColors(): Boolean = js.native
  /**
  			 * Indicates whether any data of the specified MIME type is stored in the clipboard.
  			 */
  def hasData(): Boolean = js.native
  def hasData(`type`: String): Boolean = js.native
  /**
  			 * Indicates whether any images are stored in the clipboard.
  			 */
  def hasImages(): Boolean = js.native
  /**
  			 * Indicates whether any text data is stored in the clipboard.
  			 */
  def hasText(): Boolean = js.native
  /**
  			 * Indicates whether any URLs are stored in the clipboard.
  			 */
  def hasURLs(): Boolean = js.native
  /**
  			 * Removes the clipboard.
  			 */
  def remove(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.allowCreation> property.
  			 * @deprecated Set the value using <Titanium.UI.Clipboard.allowCreation> instead.
  			 */
  def setAllowCreation(allowCreation: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.bubbleParent> property.
  			 * @deprecated Set the value using <Titanium.UI.Clipboard.bubbleParent> instead.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Stores data of the specified MIME type in the clipboard.
  			 */
  def setData(`type`: String, data: js.Any): Unit = js.native
  /**
  			 * Adds an array of items to a clipboard, and sets privacy options for all included items.
  			 */
  def setItems(items: ClipboardItemsType): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.lifecycleContainer> property.
  			 * @deprecated Set the value using <Titanium.UI.Clipboard.lifecycleContainer> instead.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.name> property.
  			 * @deprecated Set the value using <Titanium.UI.Clipboard.name> instead.
  			 */
  def setName(name: String): Unit = js.native
  /**
  			 * Stores text data in the clipboard.
  			 */
  def setText(text: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Clipboard.unique> property.
  			 * @deprecated Set the value using <Titanium.UI.Clipboard.unique> instead.
  			 */
  def setUnique(unique: Boolean): Unit = js.native
}


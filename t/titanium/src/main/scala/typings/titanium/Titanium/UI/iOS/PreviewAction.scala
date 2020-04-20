package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewAction provides options to configure actions used by the iOS 9 3D-Touch "Peek and Pop"
			 * feature.
			 */
@JSGlobal("Titanium.UI.iOS.PreviewAction")
@js.native
class PreviewAction () extends Proxy {
  /**
  				 * The style of the action.
  				 */
  var style: Double = js.native
  /**
  				 * The title of the action.
  				 */
  var title: String = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  @JSName("addEventListener")
  def addEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PreviewActionClickEvent, Unit]
  ): Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  @JSName("fireEvent")
  def fireEvent_click(name: click): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: PreviewActionClickEvent): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewAction.style> property.
  				 * @deprecated Access <Titanium.UI.iOS.PreviewAction.style> instead.
  				 */
  def getStyle(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewAction.title> property.
  				 * @deprecated Access <Titanium.UI.iOS.PreviewAction.title> instead.
  				 */
  def getTitle(): String = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  @JSName("removeEventListener")
  def removeEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PreviewActionClickEvent, Unit]
  ): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewAction.style> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.PreviewAction.style> instead.
  				 */
  def setStyle(style: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewAction.title> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.PreviewAction.title> instead.
  				 */
  def setTitle(title: String): Unit = js.native
}


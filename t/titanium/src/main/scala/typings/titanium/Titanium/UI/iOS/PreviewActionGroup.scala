package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewActionGroup provides options to configure a group of actions used by the iOS9 3D-Touch
			 * feature "Peek and Pop".
			 */
@JSGlobal("Titanium.UI.iOS.PreviewActionGroup")
@js.native
class PreviewActionGroup () extends Proxy {
  /**
  				 * The preview actions assigned to this preview action group.
  				 */
  var actions: js.Array[PreviewAction] = js.native
  /**
  				 * The style of the action group.
  				 */
  var style: Double = js.native
  /**
  				 * The title of the action group.
  				 */
  var title: String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 * @deprecated Access <Titanium.UI.iOS.PreviewActionGroup.actions> instead.
  				 */
  def getActions(): js.Array[PreviewAction] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 * @deprecated Access <Titanium.UI.iOS.PreviewActionGroup.style> instead.
  				 */
  def getStyle(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 * @deprecated Access <Titanium.UI.iOS.PreviewActionGroup.title> instead.
  				 */
  def getTitle(): String = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.PreviewActionGroup.actions> instead.
  				 */
  def setActions(actions: js.Array[PreviewAction]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.PreviewActionGroup.style> instead.
  				 */
  def setStyle(style: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.PreviewActionGroup.title> instead.
  				 */
  def setTitle(title: String): Unit = js.native
}


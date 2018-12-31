package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewActionGroup provides options to configure a group of actions used by the iOS9 3D-Touch
			 * feature "Peek and Pop".
			 */
trait PreviewActionGroup
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The preview actions assigned to this preview action group.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The style of the action group.
  				 */
  var style: scala.Double
  /**
  				 * The title of the action group.
  				 */
  var title: java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def getStyle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def getTitle(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def setStyle(style: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit
}


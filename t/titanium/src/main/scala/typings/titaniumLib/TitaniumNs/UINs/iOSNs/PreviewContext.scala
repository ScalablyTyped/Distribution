package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewContext provides options to configure the iOS 9 3D-Touch "Peek and Pop" feature.
			 */

trait PreviewContext
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The preview actions and preview action groups.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The height of the preview.
  				 */
  var contentHeight: scala.Double
  /**
  				 * The preview view.
  				 */
  var preview: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def getContentHeight(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def getPreview(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def setContentHeight(contentHeight: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def setPreview(preview: js.Any): scala.Unit
}


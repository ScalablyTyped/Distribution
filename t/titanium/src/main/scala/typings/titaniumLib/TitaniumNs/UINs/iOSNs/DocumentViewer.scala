package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A DocumentViewer provides in-app support for managing user interactions with files on the
			 * local system.
			 */
@js.native
trait DocumentViewer
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Name of the file (without the path).
  				 */
  val name: java.lang.String = js.native
  /**
  				 * URL of the document being previewed.
  				 */
  var url: java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DocumentViewer.name> property.
  				 */
  def getName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DocumentViewer.url> property.
  				 */
  def getUrl(): java.lang.String = js.native
  /**
  				 * Dismisses the document viewer.
  				 */
  def hide(): scala.Unit = js.native
  def hide(options: titaniumLib.DocumentViewerOptions): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DocumentViewer.url> property.
  				 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  				 * Displays the document viewer over the current view.
  				 */
  def show(): scala.Unit = js.native
  def show(options: titaniumLib.DocumentViewerOptions): scala.Unit = js.native
}


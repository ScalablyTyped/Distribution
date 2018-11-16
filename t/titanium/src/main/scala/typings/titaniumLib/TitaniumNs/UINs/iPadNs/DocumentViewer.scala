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


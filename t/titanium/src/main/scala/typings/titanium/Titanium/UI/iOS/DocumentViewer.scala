package typings.titanium.Titanium.UI.iOS

import typings.titanium.DocumentViewerOptions
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A DocumentViewer provides in-app support for managing user interactions with files on the
			 * local system.
			 */
@js.native
trait DocumentViewer extends Proxy {
  /**
  				 * Name of the file (without the path).
  				 */
  val name: String = js.native
  /**
  				 * URL of the document being previewed.
  				 */
  var url: String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DocumentViewer.name> property.
  				 */
  def getName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DocumentViewer.url> property.
  				 */
  def getUrl(): String = js.native
  /**
  				 * Dismisses the document viewer.
  				 */
  def hide(): Unit = js.native
  def hide(options: DocumentViewerOptions): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DocumentViewer.url> property.
  				 */
  def setUrl(url: String): Unit = js.native
  /**
  				 * Displays the document viewer over the current view.
  				 */
  def show(): Unit = js.native
  def show(options: DocumentViewerOptions): Unit = js.native
}


package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying options when showing or dismissing a <Titanium.UI.iOS.DocumentViewer>.
  */
trait DocumentViewerOptions extends js.Object {
  /**
  	 * Indicates whether to animate the transition.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Anchors the options menu to the specified view.
  	 */
  var view: js.UndefOr[titaniumLib.TitaniumNs.UINs.View] = js.undefined
}


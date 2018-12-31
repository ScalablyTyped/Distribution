package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setContentInsets](Titanium.UI.TableView.setContentInsets) method.
  */
trait TableViewContentInsetOption extends js.Object {
  /**
  	 * Determines whether the table view's content inset change is animated.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The duration in `milleseconds` for animation while the content inset is  being changed.
  	 */
  var duration: js.UndefOr[scala.Double] = js.undefined
}


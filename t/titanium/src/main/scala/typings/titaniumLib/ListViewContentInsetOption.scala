package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setContentInsets](Titanium.UI.ListView.setContentInsets) method.
  */
trait ListViewContentInsetOption extends js.Object {
  /**
  	 * Determines whether the list view's content inset change is animated.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The duration in `milliseconds` for animation while the content inset is  being changed.
  	 */
  var duration: js.UndefOr[scala.Double] = js.undefined
}


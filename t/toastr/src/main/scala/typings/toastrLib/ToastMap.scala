package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastMap extends js.Object {
  /**
  	 * The toast icon class.
  	 */
  var iconClass: java.lang.String
  /**
  	 * The toast message.
  	 */
  var message: java.lang.String
  /**
  	 * Any override options specified when the toast was created.
  	 */
  var optionsOverride: js.UndefOr[ToastrOptions] = js.undefined
  /**
  	 * The toast title.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The toast type.
  	 */
  var `type`: ToastrType
}


package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPickItem extends js.Object {
  /**
  		 * A human readable string which is rendered less prominent.
  		 */
  var description: java.lang.String
  /**
  		 * A human readable string which is rendered less prominent.
  		 */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * A human readable string which is rendered prominent.
  		 */
  var label: java.lang.String
}

object QuickPickItem {
  @scala.inline
  def apply(description: java.lang.String, label: java.lang.String, detail: java.lang.String = null): QuickPickItem = {
    val __obj = js.Dynamic.literal(description = description, label = label)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    __obj.asInstanceOf[QuickPickItem]
  }
}


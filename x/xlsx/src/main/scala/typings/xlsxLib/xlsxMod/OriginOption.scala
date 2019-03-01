package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginOption extends js.Object {
  /** Top-Left cell for operation (CellAddress or A1 string or row) */
  var origin: js.UndefOr[scala.Double | java.lang.String | CellAddress] = js.undefined
}

object OriginOption {
  @scala.inline
  def apply(origin: scala.Double | java.lang.String | CellAddress = null): OriginOption = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginOption]
  }
}


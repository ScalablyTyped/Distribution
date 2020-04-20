package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFilterInfo extends _WSKeys {
  /** Range of the AutoFilter table */
  var ref: String
}

object AutoFilterInfo {
  @scala.inline
  def apply(ref: String): AutoFilterInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilterInfo]
  }
}


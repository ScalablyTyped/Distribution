package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFilterInfo extends _WSKeys {
  /** Range of the AutoFilter table */
  var ref: java.lang.String
}

object AutoFilterInfo {
  @scala.inline
  def apply(ref: java.lang.String): AutoFilterInfo = {
    val __obj = js.Dynamic.literal(ref = ref)
  
    __obj.asInstanceOf[AutoFilterInfo]
  }
}


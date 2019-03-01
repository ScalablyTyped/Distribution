package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataArray extends js.Object {
  var data: js.Array[wegameDashApiLib.wxNs.typesNs.UserInfo]
}

object Anon_DataArray {
  @scala.inline
  def apply(data: js.Array[wegameDashApiLib.wxNs.typesNs.UserInfo]): Anon_DataArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_DataArray]
  }
}


package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedfileList extends js.Object {
  var fileList: wegameDashApiLib.Anon_CreateTime
}

object SavedfileList {
  @scala.inline
  def apply(fileList: wegameDashApiLib.Anon_CreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileList")(fileList)
    __obj.asInstanceOf[SavedfileList]
  }
}


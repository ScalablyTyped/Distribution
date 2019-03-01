package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgFileList extends js.Object {
  var errMsg: java.lang.String
  var fileList: js.Array[js.Object]
}

object Anon_ErrMsgFileList {
  @scala.inline
  def apply(errMsg: java.lang.String, fileList: js.Array[js.Object]): Anon_ErrMsgFileList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("fileList")(fileList)
    __obj.asInstanceOf[Anon_ErrMsgFileList]
  }
}

